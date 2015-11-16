// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyc extends cvn
{

    private static final long serialVersionUID = 1L;

    private cyc(iyd iyd1)
    {
        super(iyd1.responseHeader, g.a(iyd1.a, 0L));
    }

    public static cvn parseFrom(iyd iyd1)
    {
        if (a(iyd1.responseHeader))
        {
            return new cvz(iyd1.responseHeader);
        } else
        {
            return new cyc(iyd1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        return parseFrom((iyd)kop.mergeFrom(new iyd(), abyte0));
    }
}
