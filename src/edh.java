// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayInputStream;

final class edh extends ByteArrayInputStream
{

    final edf a;

    edh(edf edf, byte abyte0[])
    {
        a = edf;
        super(abyte0);
    }

    public int a()
    {
        return pos;
    }
}
