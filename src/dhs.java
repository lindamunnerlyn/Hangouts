// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dhs extends dhr
{

    private dbn a;
    private int d;
    private dkb e;
    private boolean f;

    public dhs(Context context, ani ani, String s, String s1, String s2, int i, String s3, 
            int j, int k, String s4, String s5, boolean flag, ffo ffo, long l, int i1, dbn dbn, int j1, dkb dkb)
    {
        super(context, ani, s, s1, s2, i, s3, j, k, s4, s5, flag, ffo, l, i1);
        a = dbn;
        d = j1;
        e = dkb;
        f = false;
    }

    public boolean a(dbn dbn, int i, dkb dkb)
    {
        return f;
    }

    protected Long b(aoe aoe, long l, String s, boolean flag, int i, String s1, 
            aoh aoh)
    {
        a(aoe, l, s, flag, i, s1, aoh);
        f = super.a(a, d, e);
        return Long.valueOf(a(aoe, l, s, flag, i, s1));
    }
}
