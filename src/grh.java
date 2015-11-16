// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class grh
{

    private final String a;
    private final int b;
    private final boolean c;

    grh(gri gri1)
    {
        a = gri1.a;
        b = gri1.b;
        c = gri1.c;
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
            obj = (grh)obj;
            if (c != ((grh) (obj)).c || !g.c(a, ((grh) (obj)).a))
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
