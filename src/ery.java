// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class ery extends eox
{

    private final byte a[];

    ery(byte abyte0[])
    {
        super(Arrays.copyOfRange(abyte0, 0, 25));
        a = abyte0;
    }

    byte[] a()
    {
        return a;
    }
}
