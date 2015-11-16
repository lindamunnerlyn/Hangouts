// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ldt
    implements ldq
{

    public ldt()
    {
    }

    public int a(ldq ldq1)
    {
        if (this != ldq1)
        {
            long l = ldq1.b();
            long l1 = b();
            if (l1 != l)
            {
                return l1 >= l ? 1 : -1;
            }
        }
        return 0;
    }

    public boolean b(long l)
    {
        return b() < l;
    }

    public boolean b(ldq ldq1)
    {
        return b(ldb.a(ldq1));
    }

    public int compareTo(Object obj)
    {
        return a((ldq)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ldq))
            {
                return false;
            }
            obj = (ldq)obj;
            if (b() != ((ldq) (obj)).b() || !h.c(c(), ((ldq) (obj)).c()))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (int)(b() ^ b() >>> 32) + c().hashCode();
    }

    public String toString()
    {
        return lgk.a().a(this);
    }
}
