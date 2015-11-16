// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czs extends cxr
{

    private static final long serialVersionUID = 1L;

    private czs(jiy jiy1)
    {
        if (cxr.a)
        {
            jiy1 = String.valueOf(jiy1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jiy1).length() + 33)).append("ReportCallPerfStatsResponse from:").append(jiy1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jiy)kws.mergeFrom(new jiy(), abyte0);
        if (a(((jiy) (abyte0)).responseHeader))
        {
            g.b(2017);
            return new cyd(((jiy) (abyte0)).responseHeader);
        } else
        {
            g.b(2016);
            return new czs(abyte0);
        }
    }
}
