// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxa extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxa(jeh jeh1)
    {
        if (cvn.a)
        {
            jeh1 = String.valueOf(jeh1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(jeh1).length() + 37)).append("HangoutInvitationModifyResponse from:").append(jeh1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jeh)kop.mergeFrom(new jeh(), abyte0);
        if (a(((jeh) (abyte0)).responseHeader))
        {
            return new cvz(((jeh) (abyte0)).responseHeader);
        } else
        {
            return new cxa(abyte0);
        }
    }
}
