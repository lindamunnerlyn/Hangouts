// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class fgl extends IOException
{

    public fgl(String s)
    {
        super(s);
    }

    static fgl a()
    {
        return new fgl("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static fgl b()
    {
        return new fgl("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static fgl c()
    {
        return new fgl("CodedInputStream encountered a malformed varint.");
    }
}
