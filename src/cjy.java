// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Random;

public final class cjy extends em
    implements abh, aqb
{

    private static final Random a = new Random();
    private final ani b;
    private final int c;
    private eam d;
    private apw e;
    private final Context f;

    public cjy(Context context, String s, int j, ani ani1)
    {
        super(context);
        f = context;
        b = ani1;
        c = j;
        a(s, c);
    }

    public static eam a(Context context, String s, int j, ani ani1)
    {
        int k = -1;
        j;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 73
    //                   2 81
    //                   3 96;
           goto _L1 _L2 _L3 _L4
_L1:
        context = (new eam(s, ani1.a())).a(k, k).a(false).d(false);
        if (j == 1)
        {
            context.b(true);
        }
        return context;
_L2:
        k = anv.a();
        continue; /* Loop/switch isn't completed */
_L3:
        k = context.getResources().getDimensionPixelSize(g.dZ);
        continue; /* Loop/switch isn't completed */
_L4:
        k = g.a(Integer.valueOf(aam.b), 0);
        int l = ((alw)hgx.a(context, alw)).a("babel_pull_image_resolution_var_range", 50);
        if (l > 0)
        {
            k = a.nextInt(l) + k;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(abi abi1)
    {
        if (!r() && p())
        {
            super.b(abi1);
        }
    }

    private void a(String s, int j)
    {
        d = a(f, s, j, b);
        e = new apw(d, this, true, null);
    }

    public void a(ebh ebh1, eab eab1, boolean flag, apw apw1, boolean flag1)
    {
        if (apw1 != e) goto _L2; else goto _L1
_L1:
        e = null;
        apw1 = new abi();
        if (!flag) goto _L4; else goto _L3
_L3:
        apw1.c = 0;
        if (eab1 == null) goto _L6; else goto _L5
_L5:
        if (eab1.f()) goto _L4; else goto _L7
_L7:
        apw1.a = new eei(eab1);
_L11:
        a(((abi) (apw1)));
_L9:
        return;
_L6:
        gbh.b(ebh1);
        ebh1 = ebh1.d();
        gbh.b(ebh1);
        ebh1.setDensity(160);
        apw1.a = new BitmapDrawable(f.getResources(), ebh1);
        continue; /* Loop/switch isn't completed */
_L4:
        apw1.c = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        if (ebh1 == null) goto _L9; else goto _L8
_L8:
        ebh1.b();
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void a(String s)
    {
        a(s, c);
    }

    public void b(Object obj)
    {
        a((abi)obj);
    }

    protected void i()
    {
        ((dmt)hgx.a(n(), dmt)).a(e);
    }

}
