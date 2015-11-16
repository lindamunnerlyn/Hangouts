// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayInputStream;

final class kxz extends ByteArrayInputStream
{

    final kxy a;

    kxz(kxy kxy, byte abyte0[])
    {
        a = kxy;
        super(abyte0);
    }

    public int a()
    {
        return pos;
    }
}
