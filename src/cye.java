// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cye extends cxr
{

    private static final long serialVersionUID = 1L;
    private final cvd g;

    private cye(lez lez1)
    {
        boolean flag1 = false;
        super();
        String s;
        String s1;
        long l;
        long l1;
        boolean flag;
        if (lez1.a != null && lez1.a.a != null && lez1.a.a.a != null)
        {
            s = lez1.a.a.a.a;
        } else
        {
            s = null;
        }
        if (lez1.b != null)
        {
            s1 = lez1.b.a;
        } else
        {
            s1 = null;
        }
        l1 = g.a(lez1.c, 0L);
        l = l1;
        if (l1 != 0L)
        {
            l = l1 + System.currentTimeMillis();
        }
        flag = flag1;
        if (l != 0L)
        {
            flag = flag1;
            if (g.a(lez1.d, false))
            {
                flag = true;
            }
        }
        g = new cvd(s, s1, l, flag);
    }

    public static cxr parseFrom(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (lez)kws.mergeFrom(new lez(), abyte0);
            if (abyte0 != null)
            {
                return new cye(abyte0);
            }
        }
        return null;
    }

    public cvd k()
    {
        return g;
    }
}
