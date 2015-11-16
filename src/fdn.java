// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class fdn extends IOException
{

    private fdn(String s)
    {
        super(s);
    }

    static fdn a()
    {
        return new fdn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static fdn b()
    {
        return new fdn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static fdn c()
    {
        return new fdn("CodedInputStream encountered a malformed varint.");
    }

    static fdn d()
    {
        return new fdn("Protocol message contained an invalid tag (zero).");
    }

    static fdn e()
    {
        return new fdn("Protocol message end-group tag did not match expected tag.");
    }

    static fdn f()
    {
        return new fdn("Protocol message tag had invalid wire type.");
    }

    static fdn g()
    {
        return new fdn("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
