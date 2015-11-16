// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvx extends cwy
{

    private static final long serialVersionUID = 1L;

    private cvx(kwm kwm1)
    {
        super(kwm1);
    }

    public static cvn parseFrom(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (kwm)kop.mergeFrom(new kwm(), abyte0);
            if (abyte0 != null)
            {
                return new cvx(abyte0);
            }
        }
        return null;
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
    }
}
