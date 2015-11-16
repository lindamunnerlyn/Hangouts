// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class hhr
    implements hhq
{

    private static final int a = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);
    private final Context b;
    private final ExecutorService c;
    private final Handler d = new Handler(Looper.getMainLooper(), new hhs(this));
    private final hhv e = new hhv(this);
    private final HashMap f = new HashMap();
    private hhx g;

    public hhr(Context context)
    {
        b = context;
        c = Executors.newFixedThreadPool(a, new hht(this));
    }

    static void a(hhr hhr1, hhm hhm1)
    {
        hho hho = hhm1.w();
        if (hhm1.A())
        {
            String s = String.valueOf(hho);
            (new StringBuilder(String.valueOf(s).length() + 30)).append("Finished preloading resource: ").append(s);
        }
        hhr1.f.remove(hho);
        hhr1.d.sendMessage(hhr1.d.obtainMessage(4, hhm1));
    }

    public void a(hhm hhm1, int i)
    {
        d.sendMessage(d.obtainMessage(0, i, 0, hhm1));
    }

    public void a(hhm hhm1, int i, int j)
    {
        d.sendMessage(d.obtainMessage(2, i, j, hhm1));
    }

    public void a(hhm hhm1, int i, Object obj)
    {
        d.sendMessage(d.obtainMessage(1, i, 0, new hhw(hhm1, obj)));
    }

    public void a(hhm hhm1, Object obj)
    {
        c.execute(new hhu(this, hhm1, obj));
    }

    boolean a(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 42
    //                   1 96
    //                   2 65
    //                   3 132
    //                   4 155;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return true;
_L2:
        hhm hhm1 = (hhm)message.obj;
        hhm1.e = message.arg1;
        hhm1.C();
        continue; /* Loop/switch isn't completed */
_L4:
        hhm hhm2 = (hhm)message.obj;
        hhm2.e = message.arg1;
        hhm2.g = message.arg2;
        hhm2.C();
        continue; /* Loop/switch isn't completed */
_L3:
        hhw hhw1 = (hhw)message.obj;
        hhm hhm4 = hhw1.a;
        hhm4.d = hhw1.b;
        hhm4.e = message.arg1;
        hhm4.C();
        continue; /* Loop/switch isn't completed */
_L5:
        hhm hhm3 = (hhm)message.obj;
        hhm3.h = message.arg1;
        hhm3.C();
        continue; /* Loop/switch isn't completed */
_L6:
        ((hhm)message.obj).d(e);
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void b(hhm hhm1, int i)
    {
        d.sendMessage(d.obtainMessage(3, i, 0, hhm1));
    }

    public void c(hhm hhm1)
    {
        m().a(hhm1);
    }

    public Context l()
    {
        return b;
    }

    hhx m()
    {
        if (g == null)
        {
            g = new hhx();
            g.start();
        }
        return g;
    }

}
