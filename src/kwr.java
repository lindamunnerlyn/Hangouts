// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class kwr extends IOException
{

    private static final long serialVersionUID = 0xe9924688c2f20054L;

    public kwr(String s)
    {
        super(s);
    }

    static kwr a()
    {
        return new kwr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static kwr b()
    {
        return new kwr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static kwr c()
    {
        return new kwr("CodedInputStream encountered a malformed varint.");
    }

    static kwr d()
    {
        return new kwr("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
