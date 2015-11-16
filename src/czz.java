// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class czz extends cxr
{

    private static final long serialVersionUID = 1L;

    private czz(jdv jdv1)
    {
        super(jdv1.responseHeader, -1L);
        if (cxr.a)
        {
            jdv1 = String.valueOf(jdv1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jdv1).length() + 38)).append("SendOffnetworkInvitationResponse from:").append(jdv1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jdv)kws.mergeFrom(new jdv(), abyte0);
        if (a(((jdv) (abyte0)).responseHeader))
        {
            return new cyd(((jdv) (abyte0)).responseHeader);
        } else
        {
            return new czz(abyte0);
        }
    }
}
