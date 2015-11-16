// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czg extends cyc
{

    private static final long serialVersionUID = 1L;
    private final int g;
    private final cgd j;

    private czg(jbv jbv1)
    {
        super(jbv1.responseHeader, g.a(jbv1.a.c, 0L), g.a(jbv1.a.n, 0L), jbv1.a.d);
        if (cxr.a)
        {
            String s = String.valueOf(jbv1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 29)).append("ModifyOtrStatusResponse from:").append(s).toString());
        }
        j = new cgd(jbv1.a.b.b, jbv1.a.b.a);
        g = g.a(jbv1.a.k.b, 0);
    }

    public static cxr parseFrom(jbv jbv1)
    {
        if (a(jbv1.responseHeader))
        {
            return new cyd(jbv1.responseHeader);
        } else
        {
            return new czg(jbv1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        return parseFrom((jbv)kws.mergeFrom(new jbv(), abyte0));
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
        dgk = ((cwo)b).k;
        String s = ((cwe)b).j;
        (new dkt(dgk, j, d, i, h, s, g, dsu.e)).c(aow);
    }
}
