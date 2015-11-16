// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyd extends cvn
{

    private static final long serialVersionUID = 1L;

    private cyd(iyf iyf1)
    {
        if (cvn.a)
        {
            iyf1 = String.valueOf(iyf1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iyf1).length() + 42)).append("SetHangoutNotificationStatusResponse from:").append(iyf1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iyf)kop.mergeFrom(new iyf(), abyte0);
        if (a(((iyf) (abyte0)).responseHeader))
        {
            return new cvz(((iyf) (abyte0)).responseHeader);
        } else
        {
            return new cyd(abyte0);
        }
    }
}
