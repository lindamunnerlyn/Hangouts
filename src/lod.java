// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class lod
    implements loa
{

    public lod()
    {
    }

    public int a(loa loa1)
    {
        if (this != loa1)
        {
            long l = loa1.a();
            long l1 = a();
            if (l1 != l)
            {
                return l1 >= l ? 1 : -1;
            }
        }
        return 0;
    }

    public int compareTo(Object obj)
    {
        return a((loa)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof loa))
            {
                return false;
            }
            obj = (loa)obj;
            if (a() != ((loa) (obj)).a() || !h.a(b(), ((loa) (obj)).b()))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (int)(a() ^ a() >>> 32) + b().hashCode();
    }

    public String toString()
    {
        return lqu.a().a(this);
    }
}
