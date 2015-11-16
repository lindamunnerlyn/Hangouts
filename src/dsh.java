// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dsh
{

    long a;
    long b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    long i;

    public dsh()
    {
        a();
    }

    public void a()
    {
        a = 0L;
        b = 0L;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0x7fffffffffffffffL;
    }

    public void a(long l)
    {
        if (l < i)
        {
            i = l;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Sync batch stats: ");
        stringbuilder.append("duration = ").append(a).append(", ");
        stringbuilder.append("txnlen = ").append(b).append(", ");
        stringbuilder.append("count = ").append(d).append("/").append(c).append(", ");
        stringbuilder.append("added = ").append(f).append("/").append(e).append(", ");
        stringbuilder.append("deleted = ").append(h).append("/").append(g).append(", ");
        stringbuilder.append("timestamp = ").append(i / 1000L).append(".");
        return stringbuilder.toString();
    }
}
