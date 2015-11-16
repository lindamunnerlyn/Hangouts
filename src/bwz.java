// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

public final class bwz
    implements eey
{

    private static final ebo a;
    private long b;
    private final Context c;
    private final bhr d;
    private final Resources e;
    private final ebd f;

    public bwz(Context context, int i, bhr bhr1, Resources resources)
    {
        c = context;
        d = bhr1;
        e = resources;
        f = new bxa(this, (hjm)hgx.b(context).a(hiv), i);
    }

    static ebo a()
    {
        return a;
    }

    static void a(bwz bwz1)
    {
        bwz1.b();
    }

    static void a(bwz bwz1, long l)
    {
        if (bwz1.b != l)
        {
            bwz1.b = l;
            bwz1.b();
        }
    }

    private void b()
    {
        Object obj = null;
        if (b <= 0L) goto _L2; else goto _L1
_L1:
        Object obj1;
        long l;
        l = System.currentTimeMillis();
        obj1 = g.a(c, b, l, 0x40000);
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj1 = e.getString(g.mJ, new Object[] {
            obj1
        });
        obj = g.a(c, b, l, 0);
        obj = e.getString(g.mJ, new Object[] {
            obj
        });
_L5:
        d.a(((String) (obj1)), ((String) (obj)));
        return;
_L2:
        obj1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(String s)
    {
        f.a(s);
    }

    static 
    {
        a = ebo.a;
    }
}
