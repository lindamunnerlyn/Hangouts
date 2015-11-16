// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class dhv
    implements dko
{

    public final long a;
    private final String b;
    private final String c;
    private final String d[];
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final int i;
    private final int j;
    private final int k;
    private final String l;
    private final int m;
    private final long n;
    private int o;
    private final String p = ebw.a(new Throwable());
    private String q;

    dhv(dhw dhw1)
    {
        o = 0;
        a = dhw1.a;
        b = dhw1.b;
        c = dhw1.c;
        d = dhw1.d;
        e = dhw1.e;
        f = dhw1.f;
        g = dhw1.g;
        h = dhw1.h;
        i = dhw1.i;
        j = dhw1.j;
        k = dhw1.k;
        l = dhw1.l;
        m = dhw1.m;
        n = dhw1.n;
    }

    public long a()
    {
        return a;
    }

    public void a(int i1)
    {
        o = i1;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        q = s;
    }

    public String c()
    {
        return c;
    }

    public String[] d()
    {
        return d;
    }

    public String e()
    {
        return e;
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public int i()
    {
        return i;
    }

    public int j()
    {
        return j;
    }

    public int k()
    {
        return k;
    }

    public int l()
    {
        return o;
    }

    public String m()
    {
        return l;
    }

    public ccg n()
    {
        return new dht(this);
    }

    public long o()
    {
        return n;
    }

    public String toString()
    {
        long l2 = a;
        String s = b;
        String s1 = c;
        String s2 = String.valueOf(Arrays.toString(d));
        String s3 = String.valueOf(ebw.b(e));
        String s4 = String.valueOf(ebw.b(f));
        String s5 = g;
        String s6 = h;
        int i1 = i;
        int j1 = j;
        int k1 = k;
        String s7 = l;
        int l1 = m;
        long l3 = n;
        int i2 = o;
        String s8 = p;
        String s9 = q;
        return (new StringBuilder(String.valueOf(s).length() + 343 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length())).append("SendMmsRequest [timestampMicro=").append(l2).append(", clientGeneratedId=").append(s).append(", conversationId=").append(s1).append(", recipients=").append(s2).append(", subject=").append(s3).append(", text=").append(s4).append(", attachmentUri=").append(s5).append(", contentType=").append(s6).append(", width=").append(i1).append(", height=").append(j1).append(", rotation=").append(k1).append(", forwardPduUri=").append(s7).append(", attachmentCount=").append(l1).append(", messageRowId=").append(l3).append(", requestId=").append(i2).append(", creationStack=").append(s8).append(", originStack=").append(s9).append("]").toString();
    }
}
