// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hfp
    implements Comparable
{

    private int a;
    private int b;
    private String c;

    hfp()
    {
    }

    static int a(hfp hfp1, int i)
    {
        hfp1.a = i;
        return i;
    }

    static String a(hfp hfp1, String s)
    {
        hfp1.c = s;
        return s;
    }

    static int b(hfp hfp1, int i)
    {
        hfp1.b = i;
        return i;
    }

    public int compareTo(Object obj)
    {
label0:
        {
label1:
            {
                obj = (hfp)obj;
                int j = c.compareTo(((hfp) (obj)).c);
                int i = j;
                if (j == 0)
                {
                    if (a != ((hfp) (obj)).a)
                    {
                        break label0;
                    }
                    if (b != ((hfp) (obj)).b)
                    {
                        break label1;
                    }
                    i = 0;
                }
                return i;
            }
            return b - ((hfp) (obj)).b;
        }
        return a - ((hfp) (obj)).a;
    }
}
