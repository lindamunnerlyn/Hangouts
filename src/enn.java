// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

final class enn extends enm
    implements android.os.Handler.Callback
{

    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final eom d = eom.a();
    private final long e = 5000L;

    enn(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(enn enn1)
    {
        return enn1.a;
    }

    private void a(eno eno1, ServiceConnection serviceconnection)
    {
        h.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        enp enp1 = (enp)a.get(eno1);
        if (enp1 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service config: ")).append(eno1).toString());
        eno1;
        hashmap;
        JVM INSTR monitorexit ;
        throw eno1;
        if (!enp1.b(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  config=")).append(eno1).toString());
        }
        enp1.a(serviceconnection);
        if (enp1.d())
        {
            eno1 = c.obtainMessage(0, enp1);
            c.sendMessageDelayed(eno1, e);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    private boolean a(eno eno1, ServiceConnection serviceconnection, String s)
    {
        h.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        enp enp1 = (enp)a.get(eno1);
        if (enp1 != null) goto _L2; else goto _L1
_L1:
        enp1 = new enp(this, eno1);
        enp1.a(serviceconnection, s);
        enp1.a(s);
        a.put(eno1, enp1);
        eno1 = enp1;
_L7:
        boolean flag = eno1.b();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, enp1);
        if (enp1.b(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  config=")).append(eno1).toString());
        }
        break MISSING_BLOCK_LABEL_133;
        eno1;
        hashmap;
        JVM INSTR monitorexit ;
        throw eno1;
        enp1.a(serviceconnection, s);
        enp1.c();
        JVM INSTR tableswitch 1 2: default 202
    //                   1 168
    //                   2 190;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(enp1.f(), enp1.e());
        eno1 = enp1;
        continue; /* Loop/switch isn't completed */
_L5:
        enp1.a(s);
        eno1 = enp1;
        continue; /* Loop/switch isn't completed */
_L3:
        eno1 = enp1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(enn enn1)
    {
        return enn1.b;
    }

    static eom c(enn enn1)
    {
        return enn1.d;
    }

    public boolean a(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        return a(new eno(componentname), serviceconnection, s);
    }

    public boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new eno(s), serviceconnection, s1);
    }

    public void b(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        a(new eno(componentname), serviceconnection);
    }

    public void b(String s, ServiceConnection serviceconnection, String s1)
    {
        a(new eno(s), serviceconnection);
    }

    public boolean handleMessage(Message message)
    {
        enp enp1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            enp1 = (enp)message.obj;
            break;
        }
        synchronized (a)
        {
            if (enp1.d())
            {
                if (enp1.b())
                {
                    enp1.a();
                }
                a.remove(enp1.d);
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
