// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxv extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxv(ixq ixq1)
    {
        super(ixq1.responseHeader, -1L);
        if (cvn.a)
        {
            ixq1 = String.valueOf(ixq1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(ixq1).length() + 38)).append("SendOffnetworkInvitationResponse from:").append(ixq1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ixq)kop.mergeFrom(new ixq(), abyte0);
        if (a(((ixq) (abyte0)).responseHeader))
        {
            return new cvz(((ixq) (abyte0)).responseHeader);
        } else
        {
            return new cxv(abyte0);
        }
    }
}
