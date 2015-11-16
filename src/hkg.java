// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hkg
    implements Comparable
{

    int a;
    int b;
    String c;

    hkg()
    {
    }

    public int compareTo(Object obj)
    {
label0:
        {
label1:
            {
                obj = (hkg)obj;
                int j = c.compareTo(((hkg) (obj)).c);
                int i = j;
                if (j == 0)
                {
                    if (a != ((hkg) (obj)).a)
                    {
                        break label0;
                    }
                    if (b != ((hkg) (obj)).b)
                    {
                        break label1;
                    }
                    i = 0;
                }
                return i;
            }
            return b - ((hkg) (obj)).b;
        }
        return a - ((hkg) (obj)).a;
    }
}
