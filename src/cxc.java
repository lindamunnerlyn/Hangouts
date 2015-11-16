// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxc extends cvy
{

    private static final long serialVersionUID = 1L;
    private final int g;
    private final cey j;

    private cxc(ivq ivq1)
    {
        super(ivq1.responseHeader, g.a(ivq1.a.c, 0L), g.a(ivq1.a.n, 0L), ivq1.a.d);
        if (cvn.a)
        {
            String s = String.valueOf(ivq1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(s).length() + 29)).append("ModifyOtrStatusResponse from:").append(s).toString());
        }
        j = new cey(ivq1.a.b.b, ivq1.a.b.a);
        g = g.a(ivq1.a.k.b, 0);
    }

    public static cvn parseFrom(ivq ivq1)
    {
        if (a(ivq1.responseHeader))
        {
            return new cvz(ivq1.responseHeader);
        } else
        {
            return new cxc(ivq1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        return parseFrom((ivq)kop.mergeFrom(new ivq(), abyte0));
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
        dfb = ((cuk)b).k;
        String s = ((cua)b).j;
        (new djg(dfb, j, d, i, h, s, g, dqb.e)).c(aoe);
    }
}
