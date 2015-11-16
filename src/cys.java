// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cys extends cyq
{

    private static final long serialVersionUID = 1L;
    public String c;
    public cey d;
    public long e;

    public cys()
    {
    }

    public cys(irg irg1, cey cey)
    {
        if (irg1 != null)
        {
            irg1 = irg1.a;
        } else
        {
            irg1 = null;
        }
        this(((String) (irg1)), cey, -1L);
    }

    public cys(String s, cey cey, long l)
    {
        c = s;
        d = cey;
        e = l;
    }
}
