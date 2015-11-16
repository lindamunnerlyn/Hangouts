// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class kuu extends IOException
{

    private static final long serialVersionUID = 0xe9924688c2f20054L;
    private kvb a;

    public kuu(String s)
    {
        super(s);
        a = null;
    }

    static kuu b()
    {
        return new kuu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static kuu c()
    {
        return new kuu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static kuu d()
    {
        return new kuu("Protocol message tag had invalid wire type.");
    }

    static kuu e()
    {
        return new kuu("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public kuu a(kvb kvb)
    {
        a = kvb;
        return this;
    }

    public kvb a()
    {
        return a;
    }
}
