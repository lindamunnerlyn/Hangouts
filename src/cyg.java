// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyg extends cvn
{

    private static final long serialVersionUID = 1L;

    private cyg(iyh iyh1)
    {
        super(iyh1.responseHeader, 0L);
        if (cvn.a)
        {
            iyh1 = String.valueOf(iyh1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iyh1).length() + 30)).append("SetStatusMessageResponse from:").append(iyh1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iyh)kop.mergeFrom(new iyh(), abyte0);
        if (a(((iyh) (abyte0)).responseHeader))
        {
            return new cvz(((iyh) (abyte0)).responseHeader);
        } else
        {
            return new cyg(abyte0);
        }
    }
}
