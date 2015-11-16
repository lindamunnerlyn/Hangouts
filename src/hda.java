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

public abstract class hda
    implements hcz
{

    private static final int a = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);
    private final Context b;
    private final ExecutorService c;
    private final Handler d = new Handler(Looper.getMainLooper(), new hdb(this));
    private final hde e = new hde(this);
    private final HashMap f = new HashMap();
    private hdg g;

    public hda(Context context)
    {
        b = context;
        c = Executors.newFixedThreadPool(a, new hdc(this));
    }

    static void a(hda hda1, hcv hcv1)
    {
        hcx hcx = hcv1.v();
        if (hcv1.z())
        {
            String s = String.valueOf(hcx);
            (new StringBuilder(String.valueOf(s).length() + 30)).append("Finished preloading resource: ").append(s);
        }
        hda1.f.remove(hcx);
        hda1.d.sendMessage(hda1.d.obtainMessage(4, hcv1));
    }

    public void a(hcv hcv1, int i)
    {
        d.sendMessage(d.obtainMessage(0, i, 0, hcv1));
    }

    public void a(hcv hcv1, int i, int l)
    {
        d.sendMessage(d.obtainMessage(2, i, l, hcv1));
    }

    public void a(hcv hcv1, int i, Object obj)
    {
        d.sendMessage(d.obtainMessage(1, i, 0, new hdf(hcv1, obj)));
    }

    public void a(hcv hcv1, Object obj)
    {
        c.execute(new hdd(this, hcv1, obj));
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
        hcv hcv1 = (hcv)message.obj;
        hcv1.e = message.arg1;
        hcv1.B();
        continue; /* Loop/switch isn't completed */
_L4:
        hcv hcv2 = (hcv)message.obj;
        hcv2.e = message.arg1;
        hcv2.g = message.arg2;
        hcv2.B();
        continue; /* Loop/switch isn't completed */
_L3:
        hdf hdf1 = (hdf)message.obj;
        hcv hcv4 = hdf1.a;
        hcv4.d = hdf1.b;
        hcv4.e = message.arg1;
        hcv4.B();
        continue; /* Loop/switch isn't completed */
_L5:
        hcv hcv3 = (hcv)message.obj;
        hcv3.h = message.arg1;
        hcv3.B();
        continue; /* Loop/switch isn't completed */
_L6:
        ((hcv)message.obj).d(e);
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void b(hcv hcv1, int i)
    {
        d.sendMessage(d.obtainMessage(3, i, 0, hcv1));
    }

    public void c(hcv hcv1)
    {
        k().a(hcv1);
    }

    public Context j()
    {
        return b;
    }

    hdg k()
    {
        if (g == null)
        {
            g = new hdg();
            g.start();
        }
        return g;
    }

}
