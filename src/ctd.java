// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ctd extends ctc
{

    private static final long serialVersionUID = 1L;
    private final byte a[];

    public ctd(byte abyte0[])
    {
        a = abyte0;
    }

    public kop a(String s, int i, int j)
    {
        jah jah1 = new jah();
        jah1.requestHeader = ctq.a(s, i, j, h);
        try
        {
            jah1.a = (izx)kop.mergeFrom(new izx(), a);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel", "Parse failed", s);
            return null;
        }
        return jah1;
    }

    public long b()
    {
        return bpd.G();
    }

    public String g()
    {
        return "broadcasts/add";
    }
}
