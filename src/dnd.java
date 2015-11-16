// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dnd
{

    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public String g;
    public String h;

    dnd()
    {
    }

    public String toString()
    {
        long l = a;
        long l1 = b;
        long l2 = c;
        long l3 = d;
        long l4 = e;
        long l5 = f;
        String s = g;
        String s1 = h;
        return (new StringBuilder(String.valueOf(s).length() + 224 + String.valueOf(s1).length())).append("loadTimeMs=").append(l).append(" loadTimeNs=").append(l1).append(" waitStartTimeNs=").append(l2).append(" activeStartTimeNs=").append(l3).append(" decodeStartTimeNs=").append(l4).append(" deliverTimeNs=").append(l5).append(" key").append(s).append(" extra=").append(s1).toString();
    }
}
