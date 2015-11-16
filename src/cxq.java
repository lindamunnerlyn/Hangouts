// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class cxq
    implements Serializable
{

    private static final long serialVersionUID = 2L;
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private long e;

    public cxq(int i, int j, int k, String s)
    {
        a = i;
        b = j;
        c = k;
        d = s;
        e = 0L;
    }

    private static jzf a(int i)
    {
        jzf jzf1 = new jzf();
        jzf1.a = "bbl";
        jzf1.b = Integer.valueOf(i);
        return jzf1;
    }

    public String a()
    {
        return d;
    }

    public void a(long l)
    {
        e = l;
    }

    public long b()
    {
        return e;
    }

    public jam c()
    {
        jam jam1 = new jam();
        Object obj = new jzd();
        obj.e = a(b);
        obj.f = a(a);
        jam1.a = ((jzd) (obj));
        obj = new jan();
        jet jet1 = new jet();
        jet1.a = Integer.valueOf(c);
        jet1.b = Long.valueOf(e);
        obj.d = jet1;
        jam1.b = ((jan) (obj));
        return jam1;
    }
}
