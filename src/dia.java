// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dia
    implements dko
{

    public final long a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final String g;
    private final long h;
    private int i;
    private final String j = ebw.a(new Throwable());
    private String k;

    dia(dib dib1)
    {
        i = 0;
        a = dib1.a;
        b = dib1.b;
        c = dib1.c;
        d = dib1.d;
        e = dib1.e;
        f = dib1.f;
        g = dib1.g;
        h = dib1.h;
    }

    public long a()
    {
        return a;
    }

    public void a(int i1)
    {
        i = i1;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        k = s;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public String e()
    {
        return e;
    }

    public long f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public long h()
    {
        return h;
    }

    public int l()
    {
        return i;
    }

    public ccg n()
    {
        return new dhz(this);
    }

    public String toString()
    {
        long l1 = a;
        String s = b;
        String s1 = c;
        String s2 = d;
        String s3 = String.valueOf(ebw.b(e));
        long l2 = f;
        String s4 = g;
        long l3 = h;
        int i1 = i;
        String s5 = j;
        String s6 = k;
        return (new StringBuilder(String.valueOf(s).length() + 242 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length())).append("SendSmsRequest [timestampMicro=").append(l1).append(", clientGeneratedId=").append(s).append(", conversationId=").append(s1).append(", phone=").append(s2).append(", text=").append(s3).append(", smsThreadId=").append(l2).append(", serviceCenter=").append(s4).append(", messageRowId=").append(l3).append(", requestId=").append(i1).append(", creationStack=").append(s5).append(", originStack=").append(s6).append("]").toString();
    }
}
