// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dag extends cxr
{

    private static final long serialVersionUID = 1L;

    private dag(jei jei1)
    {
        super(jei1.responseHeader, g.a(jei1.a, 0L));
    }

    public static cxr parseFrom(jei jei1)
    {
        if (a(jei1.responseHeader))
        {
            return new cyd(jei1.responseHeader);
        } else
        {
            return new dag(jei1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        return parseFrom((jei)kws.mergeFrom(new jei(), abyte0));
    }
}
