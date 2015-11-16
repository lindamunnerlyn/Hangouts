// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ctk extends ctc
{

    private static final long serialVersionUID = 1L;
    private final byte a[];
    private final byte b[];

    public ctk(byte abyte0[], byte abyte1[])
    {
        a = abyte0;
        b = abyte1;
    }

    public kop a(String s, int i, int j)
    {
        jaj jaj1 = new jaj();
        jaj1.requestHeader = ctq.a(s, i, j, h);
        try
        {
            jaj1.a = (izx)kop.mergeFrom(new izx(), a);
            jaj1.b = (jbw)kop.mergeFrom(new jbw(), b);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel", "Parse failed", s);
            return null;
        }
        return jaj1;
    }

    public long b()
    {
        return bpd.G();
    }

    public String g()
    {
        return "broadcasts/modify";
    }
}
