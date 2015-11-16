// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvt extends cvn
{

    private static final long serialVersionUID = 1L;

    private cvt(iru iru1)
    {
        super(iru1.responseHeader, -1L);
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iru)kop.mergeFrom(new iru(), abyte0);
        if (a(((iru) (abyte0)).responseHeader))
        {
            return new cvz(((iru) (abyte0)).responseHeader);
        } else
        {
            return new cvt(abyte0);
        }
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
        any.d(aoe);
    }
}
