// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class cnr extends cnp
{

    final CharSequence d;
    final boolean e;
    int f;

    protected cnr(cnl cnl1, CharSequence charsequence)
    {
        f = 0;
        e = cnl1.a;
        d = charsequence;
    }

    abstract int a(int i);

    protected Object a()
    {
        return c();
    }

    abstract int b(int i);

    protected String c()
    {
        while (f != -1) 
        {
            int j = f;
            int i = a(f);
            if (i == -1)
            {
                i = d.length();
                f = -1;
            } else
            {
                f = b(i);
            }
            if (!e || j != i)
            {
                return d.subSequence(j, i).toString();
            }
        }
        super.b = cnq.c;
        return null;
    }
}
