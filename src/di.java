// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class di
    implements ServiceConnection, android.os.Handler.Callback
{

    private final Context a;
    private final HandlerThread b = new HandlerThread("NotificationManagerCompat");
    private final Handler c;
    private final Map d = new HashMap();
    private Set e;

    public di(Context context)
    {
        e = new HashSet();
        a = context;
        b.start();
        c = new Handler(b.getLooper(), this);
    }

    private void a(dj dj1)
    {
        if (dj1.b)
        {
            a.unbindService(this);
            dj1.b = false;
        }
        dj1.c = null;
    }

    private void b(dj dj1)
    {
        if (c.hasMessages(3, dj1.a))
        {
            return;
        }
        dj1.e = dj1.e + 1;
        if (dj1.e > 6)
        {
            (new StringBuilder("Giving up on delivering ")).append(dj1.d.size()).append(" tasks to ").append(dj1.a).append(" after ").append(dj1.e).append(" retries");
            dj1.d.clear();
            return;
        }
        int i = (1 << dj1.e - 1) * 1000;
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Scheduling retry for ")).append(i).append(" ms");
        }
        dj1 = c.obtainMessage(3, dj1.a);
        c.sendMessageDelayed(dj1, i);
    }

    private void c(dj dj1)
    {
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Processing component ")).append(dj1.a).append(", ").append(dj1.d.size()).append(" queued tasks");
        }
        if (!dj1.d.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        if (dj1.b)
        {
            flag = true;
        } else
        {
            Intent intent = (new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL")).setComponent(dj1.a);
            dj1.b = a.bindService(intent, this, db.a());
            if (dj1.b)
            {
                dj1.e = 0;
            } else
            {
                (new StringBuilder("Unable to bind to listener ")).append(dj1.a);
                a.unbindService(this);
            }
            flag = dj1.b;
        }
        if (!flag || dj1.c == null)
        {
            b(dj1);
            return;
        }
_L4:
        dk dk1;
        dk1 = (dk)dj1.d.peek();
        if (dk1 == null)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Sending task ")).append(dk1);
        }
        dk1.a(dj1.c);
        dj1.d.remove();
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Remote service has died: ")).append(dj1.a);
        }
_L5:
        if (!dj1.d.isEmpty())
        {
            b(dj1);
            return;
        }
          goto _L1
        obj;
        (new StringBuilder("RemoteException communicating with ")).append(dj1.a);
          goto _L5
    }

    public void a(dk dk1)
    {
        c.obtainMessage(0, dk1).sendToTarget();
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            message = (dk)message.obj;
            Object obj1 = db.b(a);
            if (!((Set) (obj1)).equals(e))
            {
                e = ((Set) (obj1));
                Object obj2 = a.getPackageManager().queryIntentServices((new Intent()).setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4);
                HashSet hashset = new HashSet();
                obj2 = ((List) (obj2)).iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj2)).next();
                    if (((Set) (obj1)).contains(resolveinfo.serviceInfo.packageName))
                    {
                        ComponentName componentname1 = new ComponentName(resolveinfo.serviceInfo.packageName, resolveinfo.serviceInfo.name);
                        if (resolveinfo.serviceInfo.permission != null)
                        {
                            (new StringBuilder("Permission present on component ")).append(componentname1).append(", not adding listener record.");
                        } else
                        {
                            hashset.add(componentname1);
                        }
                    }
                } while (true);
                obj1 = hashset.iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    ComponentName componentname = (ComponentName)((Iterator) (obj1)).next();
                    if (!d.containsKey(componentname))
                    {
                        if (Log.isLoggable("NotifManCompat", 3))
                        {
                            (new StringBuilder("Adding listener record for ")).append(componentname);
                        }
                        d.put(componentname, new dj(componentname));
                    }
                } while (true);
                obj1 = d.entrySet().iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                    if (!hashset.contains(entry.getKey()))
                    {
                        if (Log.isLoggable("NotifManCompat", 3))
                        {
                            (new StringBuilder("Removing listener record for ")).append(entry.getKey());
                        }
                        a((dj)entry.getValue());
                        ((Iterator) (obj1)).remove();
                    }
                } while (true);
            }
            dj dj1;
            for (Iterator iterator = d.values().iterator(); iterator.hasNext(); c(dj1))
            {
                dj1 = (dj)iterator.next();
                dj1.d.add(message);
            }

            return true;

        case 1: // '\001'
            message = (dh)message.obj;
            Object obj = ((dh) (message)).a;
            message = ((dh) (message)).b;
            obj = (dj)d.get(obj);
            if (obj != null)
            {
                if (message == null)
                {
                    message = null;
                } else
                {
                    android.os.IInterface iinterface = message.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    if (iinterface != null && (iinterface instanceof bn))
                    {
                        message = (bn)iinterface;
                    } else
                    {
                        message = new bp(message);
                    }
                }
                obj.c = message;
                obj.e = 0;
                c(((dj) (obj)));
            }
            return true;

        case 2: // '\002'
            message = (ComponentName)message.obj;
            message = (dj)d.get(message);
            if (message != null)
            {
                a(message);
            }
            return true;

        case 3: // '\003'
            message = (ComponentName)message.obj;
            message = (dj)d.get(message);
            break;
        }
        if (message != null)
        {
            c(message);
        }
        return true;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Connected to service ")).append(componentname);
        }
        c.obtainMessage(1, new dh(componentname, ibinder)).sendToTarget();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Disconnected from service ")).append(componentname);
        }
        c.obtainMessage(2, componentname).sendToTarget();
    }
}
