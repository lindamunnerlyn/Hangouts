// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxo extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxo(jco jco1)
    {
        if (cvn.a)
        {
            jco1 = String.valueOf(jco1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(jco1).length() + 33)).append("ReportCallPerfStatsResponse from:").append(jco1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jco)kop.mergeFrom(new jco(), abyte0);
        if (a(((jco) (abyte0)).responseHeader))
        {
            g.b(2017);
            return new cvz(((jco) (abyte0)).responseHeader);
        } else
        {
            g.b(2016);
            return new cxo(abyte0);
        }
    }
}
