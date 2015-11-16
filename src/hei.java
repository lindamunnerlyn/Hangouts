// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class hei extends heh
{

    private boolean a;
    public final kop q;

    public hei(Context context, hdx hdx, String s, kop kop1, kop kop2, String s1, String s2)
    {
        super(context, hdx, "POST", s, kop2, s1, s2);
        q = kop1;
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

    public void b(kop kop1)
    {
    }

    public byte[] b()
    {
        e();
        return kop.toByteArray(q);
    }

    public String l()
    {
        e();
        return g.a(q);
    }
}
