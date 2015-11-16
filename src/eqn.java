// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

final class eqn extends eqm
    implements android.os.Handler.Callback
{

    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final erk d = erk.a();
    private final long e = 5000L;

    eqn(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(eqn eqn1)
    {
        return eqn1.a;
    }

    private void a(eqo eqo1, ServiceConnection serviceconnection)
    {
        g.b(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        eqp eqp1 = (eqp)a.get(eqo1);
        if (eqp1 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service config: ")).append(eqo1).toString());
        eqo1;
        hashmap;
        JVM INSTR monitorexit ;
        throw eqo1;
        if (!eqp1.b(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  config=")).append(eqo1).toString());
        }
        eqp1.a(serviceconnection);
        if (eqp1.d())
        {
            eqo1 = c.obtainMessage(0, eqp1);
            c.sendMessageDelayed(eqo1, e);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    private boolean a(eqo eqo1, ServiceConnection serviceconnection, String s)
    {
        g.b(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        eqp eqp1 = (eqp)a.get(eqo1);
        if (eqp1 != null) goto _L2; else goto _L1
_L1:
        eqp1 = new eqp(this, eqo1);
        eqp1.a(serviceconnection, s);
        eqp1.a(s);
        a.put(eqo1, eqp1);
        eqo1 = eqp1;
_L7:
        boolean flag = eqo1.b();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, eqp1);
        if (eqp1.b(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  config=")).append(eqo1).toString());
        }
        break MISSING_BLOCK_LABEL_133;
        eqo1;
        hashmap;
        JVM INSTR monitorexit ;
        throw eqo1;
        eqp1.a(serviceconnection, s);
        eqp1.c();
        JVM INSTR tableswitch 1 2: default 202
    //                   1 168
    //                   2 190;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(eqp1.f(), eqp1.e());
        eqo1 = eqp1;
        continue; /* Loop/switch isn't completed */
_L5:
        eqp1.a(s);
        eqo1 = eqp1;
        continue; /* Loop/switch isn't completed */
_L3:
        eqo1 = eqp1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(eqn eqn1)
    {
        return eqn1.b;
    }

    static erk c(eqn eqn1)
    {
        return eqn1.d;
    }

    public boolean a(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        return a(new eqo(componentname), serviceconnection, s);
    }

    public boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new eqo(s), serviceconnection, s1);
    }

    public void b(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        a(new eqo(componentname), serviceconnection);
    }

    public void b(String s, ServiceConnection serviceconnection, String s1)
    {
        a(new eqo(s), serviceconnection);
    }

    public boolean handleMessage(Message message)
    {
        eqp eqp1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            eqp1 = (eqp)message.obj;
            break;
        }
        synchronized (a)
        {
            if (eqp1.d())
            {
                if (eqp1.b())
                {
                    eqp1.a();
                }
                a.remove(eqp1.d);
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
