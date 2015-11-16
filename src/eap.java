// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class eap
    implements ServiceConnection
{

    static final Intent a = (new Intent("com.google.android.dialer.incallui.IInCallUiControllerService")).setPackage("com.google.android.dialer");
    private final Context b;
    private final List c = new ArrayList();
    private ekz d;
    private boolean e;
    private final Set f = new HashSet();
    private final Handler g = new Handler();

    public eap(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            b = context;
            return;
        }
    }

    static Handler a(eap eap1)
    {
        return eap1.g;
    }

    private void a(PendingIntent pendingintent, eaq eaq1)
    {
        try
        {
            d.a(pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            eev.e("Babel_telephony", "TeleInCallUiController.performShowDialog", pendingintent);
        }
        eaq1.a();
    }

    static void a(eap eap1, PendingIntent pendingintent, eaq eaq1)
    {
        eap1.a(pendingintent, eaq1);
    }

    private boolean a()
    {
        return d != null;
    }

    static List b(eap eap1)
    {
        return eap1.c;
    }

    private void b()
    {
        e = false;
        d = null;
        Object obj = new ArrayList(c);
        c.clear();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ear)((Iterator) (obj)).next()).b()) { }
    }

    public eat a(Intent intent, eaq eaq1)
    {
        Object obj = String.valueOf(intent);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(obj).length() + 35)).append("TeleInCallUiController.showDialog, ").append(((String) (obj))).toString());
        intent = PendingIntent.getActivity(b, 0, intent, 0x48000000);
        obj = new eas(this, intent, eaq1);
        if (a())
        {
            a(((PendingIntent) (intent)), eaq1);
            return ((eat) (obj));
        } else
        {
            eev.e("Babel_telephony", "TeleInCallUiController.showDialog, not connected; queueing showDialog");
            c.add(obj);
            long l = g.a(b, "babel_in_call_ui_visible_timeout_ms", 5000L);
            eev.e("Babel_telephony", (new StringBuilder(75)).append("TeleInCallUiController.showDialog, scheduling timeout: ").append(l).toString());
            g.postDelayed(((Runnable) (obj)), l);
            return ((eat) (obj));
        }
    }

    public void a(PrintWriter printwriter)
    {
        printwriter.append("TeleInCallUiController\n");
        printwriter.append("  connections: {\n");
        Object obj;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); printwriter.append("    ").append(String.valueOf(obj)).append("\n"))
        {
            obj = iterator.next();
        }

        printwriter.append("  }\n");
        printwriter.append("  queuedActions: {\n");
        ear ear1;
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); printwriter.append("    ").append(String.valueOf(ear1)))
        {
            ear1 = (ear)iterator1.next();
        }

        printwriter.append("  }\n");
    }

    public boolean a(Object obj)
    {
        f.add(obj);
        if (a() || e)
        {
            eev.e("Babel_telephony", "TeleInCallUiController.connect, bind already in progress; skipping.");
            return true;
        }
        e = b.bindService(a, this, 1);
        if (e)
        {
            eev.e("Babel_telephony", "TeleInCallUiController.connect, bound to service");
        } else
        {
            eev.e("Babel_telephony", "TeleInCallUiController.connect, unable to bind to service");
        }
        return e;
    }

    public void b(Object obj)
    {
        f.remove(obj);
        if (!f.isEmpty())
        {
            int i = f.size();
            eev.e("Babel_telephony", (new StringBuilder(83)).append("TeleInCallUiController.disconnect, ignoring disconnect (").append(i).append(" remaining uses)").toString());
            return;
        }
        if (!a() && !e)
        {
            eev.e("Babel_telephony", "TeleInCallUiController.disconnect, service not bound, ignoring");
            return;
        } else
        {
            eev.e("Babel_telephony", "TeleInCallUiController.disconnect, disconnecting");
            b.unbindService(this);
            b();
            return;
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = String.valueOf(componentname);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(componentname).length() + 56)).append("TeleInCallUiController.onServiceConnected, connected to ").append(componentname).toString());
        e = false;
        if (ibinder == null)
        {
            componentname = null;
        } else
        {
            componentname = ibinder.queryLocalInterface("com.google.android.dialer.incallui.IInCallUiControllerService");
            if (componentname != null && (componentname instanceof ekz))
            {
                componentname = (ekz)componentname;
            } else
            {
                componentname = new elb(ibinder);
            }
        }
        d = componentname;
        componentname = new ArrayList(c);
        c.clear();
        for (componentname = componentname.iterator(); componentname.hasNext(); ((ear)componentname.next()).a()) { }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        componentname = String.valueOf(componentname);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(componentname).length() + 64)).append("TeleInCallUiController.onServiceDisconnected, disconnected from ").append(componentname).toString());
        b();
    }

}
