// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dah extends cxr
{

    private static final long serialVersionUID = 1L;

    private dah(jek jek1)
    {
        if (cxr.a)
        {
            jek1 = String.valueOf(jek1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jek1).length() + 42)).append("SetHangoutNotificationStatusResponse from:").append(jek1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jek)kws.mergeFrom(new jek(), abyte0);
        if (a(((jek) (abyte0)).responseHeader))
        {
            return new cyd(((jek) (abyte0)).responseHeader);
        } else
        {
            return new dah(abyte0);
        }
    }
}
