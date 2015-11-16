// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gna
{

    private final String a;
    private final int b;
    private final boolean c;

    gna(gnb gnb1)
    {
        a = gnb1.a;
        b = gnb1.b;
        c = gnb1.c;
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public boolean c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (gna)obj;
            if (c != ((gna) (obj)).c || !g.b(a, ((gna) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = a.hashCode();
        int i;
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j * 31;
    }
}
