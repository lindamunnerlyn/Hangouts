// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class ktw extends IOException
{

    private static final long serialVersionUID = 0x9f95917c52ce6e25L;

    ktw()
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    ktw(Throwable throwable)
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
    }
}
