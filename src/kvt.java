// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class kvt extends RuntimeException
{

    private static final long serialVersionUID = 0x986022c4d65db14dL;
    private final List a = null;

    public kvt()
    {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public kuu a()
    {
        return new kuu(getMessage());
    }
}
