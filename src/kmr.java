// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class kmr extends IOException
{

    private static final long serialVersionUID = 0xe9924688c2f20054L;
    private kmy a;

    public kmr(String s)
    {
        super(s);
        a = null;
    }

    static kmr b()
    {
        return new kmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static kmr c()
    {
        return new kmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static kmr d()
    {
        return new kmr("CodedInputStream encountered a malformed varint.");
    }

    static kmr e()
    {
        return new kmr("Protocol message contained an invalid tag (zero).");
    }

    static kmr f()
    {
        return new kmr("Protocol message end-group tag did not match expected tag.");
    }

    static kmr g()
    {
        return new kmr("Protocol message tag had invalid wire type.");
    }

    static kmr h()
    {
        return new kmr("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static kmr i()
    {
        return new kmr("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static kmr j()
    {
        return new kmr("Protocol message had invalid UTF-8.");
    }

    public kmr a(kmy kmy)
    {
        a = kmy;
        return this;
    }

    public kmy a()
    {
        return a;
    }
}
