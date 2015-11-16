// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxb extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxb(jak jak1)
    {
        super(jak1.responseHeader, -1L);
        if (cvn.a)
        {
            jak1 = String.valueOf(jak1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(jak1).length() + 33)).append("ModifyBroadcastInfoResponse from:").append(jak1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jak)kop.mergeFrom(new jak(), abyte0);
        if (g.a(((jak) (abyte0)).responseHeader.a, 0) != 9 && a(((jak) (abyte0)).responseHeader))
        {
            return new cvz(((jak) (abyte0)).responseHeader);
        } else
        {
            return new cxb(abyte0);
        }
    }

    public boolean k()
    {
        return c.b == 9;
    }
}
