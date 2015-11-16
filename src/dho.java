// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dho
    implements dko
{

    private final String a;
    private final byte b[];
    private final long c;
    private final boolean d;
    private int e;
    private final String f = ebw.a(new Throwable());
    private String g;

    public dho(String s, byte abyte0[], long l1, boolean flag)
    {
        e = 0;
        a = s;
        b = abyte0;
        c = l1;
        d = flag;
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        e = i;
    }

    public void b(String s)
    {
        g = s;
    }

    public byte[] b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public int l()
    {
        return e;
    }

    public ccg n()
    {
        return new dhm(this);
    }

    public String toString()
    {
        String s = a;
        int i = b.length;
        long l1 = c;
        boolean flag = d;
        String s1 = f;
        String s2 = g;
        return (new StringBuilder(String.valueOf(s).length() + 159 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("retrive mms request: content location=").append(s).append(" len(transactionId)=").append(i).append(" notificationRowId=").append(l1).append(" autoRetrieve=").append(flag).append("\nCreation stack:\n").append(s1).append("\nOrigin stack:\n").append(s2).toString();
    }
}
