// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyo extends cvn
{

    private static final long serialVersionUID = 1L;

    private cyo(izp izp1)
    {
        super(izp1.responseHeader, -1L);
    }

    public static cvn parseFrom(izp izp1)
    {
        if (a(izp1.responseHeader))
        {
            return new cvz(izp1.responseHeader);
        } else
        {
            return new cyo(izp1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        return parseFrom((izp)kop.mergeFrom(new izp(), abyte0));
    }
}
