// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cye extends cvn
{

    private static final long serialVersionUID = 1L;

    private cye(iyh iyh1)
    {
        super(iyh1.responseHeader, 0L);
        if (cvn.a)
        {
            iyh1 = String.valueOf(iyh1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iyh1).length() + 31)).append("SetInCallPresenceResponse from:").append(iyh1).toString());
        }
    }

    public static cvn parseFrom(iyh iyh1)
    {
        if (a(iyh1.responseHeader))
        {
            return new cvz(iyh1.responseHeader);
        } else
        {
            return new cye(iyh1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        return parseFrom((iyh)kop.mergeFrom(new iyh(), abyte0));
    }
}
