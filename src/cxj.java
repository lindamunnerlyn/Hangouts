// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxj extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxj(jao jao1)
    {
        super(jao1.responseHeader, -1L);
        if (cvn.a)
        {
            jao1 = String.valueOf(jao1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(jao1).length() + 29)).append("RemoveBroadcastResponse from:").append(jao1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jao)kop.mergeFrom(new jao(), abyte0);
        if (a(((jao) (abyte0)).responseHeader))
        {
            return new cvz(((jao) (abyte0)).responseHeader);
        } else
        {
            return new cxj(abyte0);
        }
    }
}
