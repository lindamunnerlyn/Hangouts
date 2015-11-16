// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class djm
    implements dmf
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
    private final String j = eev.a(new Throwable());
    private String k;

    djm(djn djn1)
    {
        i = 0;
        a = djn1.a;
        b = djn1.b;
        c = djn1.c;
        d = djn1.d;
        e = djn1.e;
        f = djn1.f;
        g = djn1.g;
        h = djn1.h;
    }

    public long a()
    {
        return a;
    }

    public void a(int l)
    {
        i = l;
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

    public int k()
    {
        return i;
    }

    public cdl m()
    {
        return new djl(this);
    }

    public String toString()
    {
        long l1 = a;
        String s = b;
        String s1 = c;
        String s2 = d;
        String s3 = String.valueOf(eev.b(e));
        long l2 = f;
        String s4 = g;
        long l3 = h;
        int l = i;
        String s5 = j;
        String s6 = k;
        return (new StringBuilder(String.valueOf(s).length() + 242 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length())).append("SendSmsRequest [timestampMicro=").append(l1).append(", clientGeneratedId=").append(s).append(", conversationId=").append(s1).append(", phone=").append(s2).append(", text=").append(s3).append(", smsThreadId=").append(l2).append(", serviceCenter=").append(s4).append(", messageRowId=").append(l3).append(", requestId=").append(l).append(", creationStack=").append(s5).append(", originStack=").append(s6).append("]").toString();
    }
}
