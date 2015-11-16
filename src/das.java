// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class das extends cxr
{

    private static final long serialVersionUID = 1L;

    private das(jfu jfu1)
    {
        super(jfu1.responseHeader, -1L);
    }

    public static cxr parseFrom(jfu jfu1)
    {
        if (a(jfu1.responseHeader))
        {
            return new cyd(jfu1.responseHeader);
        } else
        {
            return new das(jfu1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        return parseFrom((jfu)kws.mergeFrom(new jfu(), abyte0));
    }
}
