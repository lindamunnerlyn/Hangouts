// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dmy extends dmw
{

    private static final long serialVersionUID = 1L;
    public String c;
    public cgd d;
    public long e;

    public dmy()
    {
    }

    public dmy(ixl ixl1, cgd cgd)
    {
        if (ixl1 != null)
        {
            ixl1 = ixl1.a;
        } else
        {
            ixl1 = null;
        }
        this(((String) (ixl1)), cgd, -1L);
    }

    public dmy(String s, cgd cgd, long l)
    {
        c = s;
        d = cgd;
        e = l;
    }
}
