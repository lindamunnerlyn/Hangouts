// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class hiz extends hiy
{

    private boolean a;
    public final kws q;

    public hiz(Context context, hio hio, String s, kws kws1, kws kws2, String s1, String s2)
    {
        super(context, hio, "POST", s, kws2, s1, s2);
        q = kws1;
    }

    private void e()
    {
        if (a)
        {
            return;
        } else
        {
            b(q);
            a = true;
            return;
        }
    }

    public void b(kws kws1)
    {
    }

    public byte[] b()
    {
        e();
        return kws.toByteArray(q);
    }

    public String l()
    {
        e();
        return g.a(q);
    }
}
