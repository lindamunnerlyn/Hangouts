// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwl extends cvn
{

    private static final long serialVersionUID = 1L;
    private final String g;

    private cwl(jbo jbo1)
    {
        g = jbo1.a;
        if (cvn.a)
        {
            jbo1 = String.valueOf(jbo1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(jbo1).length() + 26)).append("GetHangoutIdResponse from:").append(jbo1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jbo)kop.mergeFrom(new jbo(), abyte0);
        if (a(((jbo) (abyte0)).responseHeader))
        {
            return new cvz(((jbo) (abyte0)).responseHeader);
        } else
        {
            return new cwl(abyte0);
        }
    }

    public String k()
    {
        return g;
    }

    public String l()
    {
        return ((ctg)b).a;
    }
}
