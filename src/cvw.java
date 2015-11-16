// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvw extends cvn
{

    private static final long serialVersionUID = 1L;

    private cvw(isq isq1)
    {
        super(isq1.responseHeader, g.a(isq1.a, 0L));
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (isq)kop.mergeFrom(new isq(), abyte0);
        if (a(((isq) (abyte0)).responseHeader))
        {
            return new cvz(((isq) (abyte0)).responseHeader);
        } else
        {
            return new cvw(abyte0);
        }
    }
}
