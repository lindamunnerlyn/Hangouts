// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bdx
{

    public ehk a;
    public eef b;
    final bdv c;

    bdx(bdv bdv)
    {
        c = bdv;
        super();
        a = null;
        b = null;
    }

    public void a()
    {
        if (b != null)
        {
            b.b();
            b = null;
        }
        if (a != null)
        {
            a.c();
            a = null;
        }
    }
}
