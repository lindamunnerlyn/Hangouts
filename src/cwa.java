// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwa extends cvn
{

    private static final long serialVersionUID = 1L;
    private final cta g;

    private cwa(kww kww1)
    {
        boolean flag1 = false;
        super();
        String s;
        String s1;
        long l;
        long l1;
        boolean flag;
        if (kww1.a != null && kww1.a.a != null && kww1.a.a.a != null)
        {
            s = kww1.a.a.a.a;
        } else
        {
            s = null;
        }
        if (kww1.b != null)
        {
            s1 = kww1.b.a;
        } else
        {
            s1 = null;
        }
        l1 = g.a(kww1.c, 0L);
        l = l1;
        if (l1 != 0L)
        {
            l = l1 + System.currentTimeMillis();
        }
        flag = flag1;
        if (l != 0L)
        {
            flag = flag1;
            if (g.a(kww1.d, false))
            {
                flag = true;
            }
        }
        g = new cta(s, s1, l, flag);
    }

    public static cvn parseFrom(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (kww)kop.mergeFrom(new kww(), abyte0);
            if (abyte0 != null)
            {
                return new cwa(abyte0);
            }
        }
        return null;
    }

    public cta k()
    {
        return g;
    }
}
