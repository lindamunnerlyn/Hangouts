// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddw
{

    final String a;
    final long b;
    final String c[];

    public ddw(dne dne1)
    {
        a = dne1.a;
        b = dne1.b;
        c = dne1.c;
    }

    public ddw(String s, long l, String as[])
    {
        a = s;
        b = l;
        c = as;
    }

    public void a(aow aow1)
    {
        if (c == null)
        {
            aow1.d(a, b);
            aoq.d(aow1);
        } else
        {
            String as[] = c;
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = as[i];
                obj = aow1.g(a, ((String) (obj)));
                if (obj != null)
                {
                    aoq.a(aow1, g.a(((Long) (obj)), 0L));
                }
                i++;
            }
        }
        aoq.d(aow1, a);
    }

    public void a(dgj dgj1)
    {
        dgj1.a(new cwb(a, b, c));
    }
}
