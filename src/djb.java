// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class djb extends dja
{

    private dcw a;
    private int e;
    private dls f;
    private boolean g;

    public djb(Context context, aoa aoa, String s, String s1, String s2, String s3, int i, 
            String s4, int j, int k, String s5, String s6, boolean flag, fik fik, 
            long l, int i1, dcw dcw, int j1, dls dls)
    {
        super(context, aoa, s, s1, s2, s3, i, s4, j, k, s5, s6, flag, fik, l, i1);
        a = dcw;
        e = j1;
        f = dls;
        g = false;
    }

    public boolean a(dcw dcw, int i, dls dls)
    {
        return g;
    }

    protected Long b(aow aow, long l, String s, boolean flag, int i, String s1, 
            aoz aoz)
    {
        a(aow, l, s, flag, i, s1, aoz);
        g = super.a(a, e, f);
        return Long.valueOf(a(aow, l, s, flag, i, s1));
    }
}
