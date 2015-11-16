// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayInputStream;

final class ead extends ByteArrayInputStream
{

    final eab a;

    ead(eab eab, byte abyte0[])
    {
        a = eab;
        super(abyte0);
    }

    public int a()
    {
        return pos;
    }
}
