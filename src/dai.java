// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dai extends cxr
{

    private static final long serialVersionUID = 1L;

    private dai(jem jem1)
    {
        super(jem1.responseHeader, 0L);
        if (cxr.a)
        {
            jem1 = String.valueOf(jem1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jem1).length() + 31)).append("SetInCallPresenceResponse from:").append(jem1).toString());
        }
    }

    public static cxr parseFrom(jem jem1)
    {
        if (a(jem1.responseHeader))
        {
            return new cyd(jem1.responseHeader);
        } else
        {
            return new dai(jem1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        return parseFrom((jem)kws.mergeFrom(new jem(), abyte0));
    }
}
