// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Random;

public final class cld extends em
    implements abj, aqs
{

    private static final Random a = new Random();
    private final aoa b;
    private final int c;
    private edq d;
    private aqn e;
    private final Context f;

    public cld(Context context, String s, int j, aoa aoa1)
    {
        super(context);
        f = context;
        b = aoa1;
        c = j;
        a(s, c);
    }

    public static edq a(Context context, String s, int j, aoa aoa1)
    {
        int k = -1;
        j;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 73
    //                   2 81
    //                   3 96;
           goto _L1 _L2 _L3 _L4
_L1:
        context = (new edq(s, aoa1.a())).a(k, k).a(false).d(false);
        if (j == 1)
        {
            context.b(true);
        }
        return context;
_L2:
        k = aon.a();
        continue; /* Loop/switch isn't completed */
_L3:
        k = context.getResources().getDimensionPixelSize(g.dX);
        continue; /* Loop/switch isn't completed */
_L4:
        k = g.a(Integer.valueOf(aao.b), 0);
        int l = ((amo)hlp.a(context, amo)).a("babel_pull_image_resolution_var_range", 50);
        if (l > 0)
        {
            k = a.nextInt(l) + k;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(abk abk1)
    {
        if (!r() && p())
        {
            super.b(abk1);
        }
    }

    private void a(String s, int j)
    {
        d = a(f, s, j, b);
        e = new aqn(d, this, true, null);
    }

    public void a(eef eef1, edf edf1, boolean flag, aqn aqn1, boolean flag1)
    {
        if (aqn1 != e) goto _L2; else goto _L1
_L1:
        e = null;
        aqn1 = new abk();
        if (!flag) goto _L4; else goto _L3
_L3:
        aqn1.c = 0;
        if (edf1 == null) goto _L6; else goto _L5
_L5:
        if (edf1.f()) goto _L4; else goto _L7
_L7:
        aqn1.a = new ehk(edf1);
_L11:
        a(((abk) (aqn1)));
_L9:
        return;
_L6:
        gdv.b("Expected non-null", eef1);
        eef1 = eef1.d();
        gdv.b("Expected non-null", eef1);
        eef1.setDensity(160);
        aqn1.a = new BitmapDrawable(f.getResources(), eef1);
        continue; /* Loop/switch isn't completed */
_L4:
        aqn1.c = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        if (eef1 == null) goto _L9; else goto _L8
_L8:
        eef1.b();
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
        a((abk)obj);
    }

    protected void i()
    {
        ((dpn)hlp.a(n(), dpn)).a(e);
    }

}
