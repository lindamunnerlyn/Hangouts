// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cze extends cxr
{

    private static final long serialVersionUID = 1L;

    private cze(jkt jkt1)
    {
        if (cxr.a)
        {
            jkt1 = String.valueOf(jkt1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jkt1).length() + 37)).append("HangoutInvitationModifyResponse from:").append(jkt1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jkt)kws.mergeFrom(new jkt(), abyte0);
        if (a(((jkt) (abyte0)).responseHeader))
        {
            return new cyd(((jkt) (abyte0)).responseHeader);
        } else
        {
            return new cze(abyte0);
        }
    }
}
