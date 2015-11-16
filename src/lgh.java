// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lgh
{

    final ldd a;
    final Integer b;
    final lgg c[];
    final int d;
    final lgf e;

    lgh(lgf lgf1)
    {
        e = lgf1;
        super();
        a = lgf1.a;
        b = lgf1.b;
        c = lgf1.c;
        d = lgf1.d;
    }

    boolean a(lgf lgf1)
    {
        if (lgf1 != e)
        {
            return false;
        }
        lgf1.a = a;
        lgf1.b = b;
        lgf1.c = c;
        if (d < lgf1.d)
        {
            lgf1.e = true;
        }
        lgf1.d = d;
        return true;
    }
}
