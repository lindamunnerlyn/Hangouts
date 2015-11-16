// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dco extends djb
{

    final String a;
    final long b;
    final String c[];

    public dco(cyy cyy1)
    {
        a = cyy1.a;
        b = cyy1.b;
        c = cyy1.c;
    }

    public dco(String s, long l, String as[])
    {
        a = s;
        b = l;
        c = as;
    }

    public void a(aoe aoe1)
    {
        if (c == null)
        {
            aoe1.d(a, b);
            any.d(aoe1);
        } else
        {
            String as[] = c;
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = as[i];
                obj = aoe1.g(a, ((String) (obj)));
                if (obj != null)
                {
                    any.a(aoe1, g.a(((Long) (obj)), 0L));
                }
                i++;
            }
        }
        any.d(aoe1, a);
    }

    public void a(dfb dfb1)
    {
        dfb1.a(new ctx(a, b, c));
    }
}
