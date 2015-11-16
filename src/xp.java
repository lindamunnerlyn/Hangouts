// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class xp
{

    public zq a;
    public zq b;
    public int c;
    public int d;
    public int e;
    public int f;

    private xp(zq zq, zq zq1)
    {
        a = zq;
        b = zq1;
    }

    xp(zq zq, zq zq1, int i, int j, int k, int l)
    {
        this(zq, zq1);
        c = i;
        d = j;
        e = k;
        f = l;
    }

    public String toString()
    {
        return (new StringBuilder("ChangeInfo{oldHolder=")).append(a).append(", newHolder=").append(b).append(", fromX=").append(c).append(", fromY=").append(d).append(", toX=").append(e).append(", toY=").append(f).append('}').toString();
    }
}
