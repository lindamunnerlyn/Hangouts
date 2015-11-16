// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class cvm
    implements Serializable
{

    private static final long serialVersionUID = 2L;
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private long e;

    public cvm(int i, int j, int k, String s)
    {
        a = i;
        b = j;
        c = k;
        d = s;
        e = 0L;
    }

    private static jrj a(int i)
    {
        jrj jrj1 = new jrj();
        jrj1.a = "bbl";
        jrj1.b = Integer.valueOf(i);
        return jrj1;
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

    public iuh c()
    {
        iuh iuh1 = new iuh();
        Object obj = new jrh();
        obj.e = a(b);
        obj.f = a(a);
        iuh1.a = ((jrh) (obj));
        obj = new iui();
        iyo iyo1 = new iyo();
        iyo1.a = Integer.valueOf(c);
        iyo1.b = Long.valueOf(e);
        obj.d = iyo1;
        iuh1.b = ((iui) (obj));
        return iuh1;
    }
}
