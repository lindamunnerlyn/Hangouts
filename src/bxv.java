// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

public final class bxv
    implements eia
{

    private static final eem a;
    private long b;
    private final Context c;
    private final bid d;
    private final Resources e;
    private final csw f;

    public bxv(Context context, int i, bid bid1, Resources resources)
    {
        c = context;
        d = bid1;
        e = resources;
        f = new bxw(this, context, (hof)hlp.b(context).a(hnn), i);
    }

    static eem a()
    {
        return a;
    }

    static void a(bxv bxv1)
    {
        bxv1.b();
    }

    static void a(bxv bxv1, long l)
    {
        if (bxv1.b != l)
        {
            bxv1.b = l;
            bxv1.b();
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
        obj1 = e.getString(g.mK, new Object[] {
            obj1
        });
        obj = g.a(c, b, l, 0);
        obj = e.getString(g.mK, new Object[] {
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
        a = eem.a;
    }
}
