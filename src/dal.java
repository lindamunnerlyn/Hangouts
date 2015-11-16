// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dal extends cxr
{

    private static final long serialVersionUID = 1L;

    private dal(jer jer1)
    {
        super(jer1.responseHeader, g.a(jer1.a, 0L));
        if (cxr.a)
        {
            jer1 = String.valueOf(jer1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jer1).length() + 23)).append("SetTypingResponse from:").append(jer1).toString());
        }
    }

    public static cxr parseFrom(jer jer1)
    {
        if (a(jer1.responseHeader))
        {
            return new cyd(jer1.responseHeader);
        } else
        {
            return new dal(jer1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        return parseFrom((jer)kws.mergeFrom(new jer(), abyte0));
    }
}
