// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class koo extends IOException
{

    private static final long serialVersionUID = 0xe9924688c2f20054L;

    private koo(String s)
    {
        super(s);
    }

    static koo a()
    {
        return new koo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static koo b()
    {
        return new koo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static koo c()
    {
        return new koo("CodedInputStream encountered a malformed varint.");
    }

    static koo d()
    {
        return new koo("Protocol message contained an invalid tag (zero).");
    }

    static koo e()
    {
        return new koo("Protocol message end-group tag did not match expected tag.");
    }

    static koo f()
    {
        return new koo("Protocol message tag had invalid wire type.");
    }

    static koo g()
    {
        return new koo("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
