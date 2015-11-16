// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterInputStream;
import java.io.InputStream;

final class hlt extends FilterInputStream
{

    final hls a;

    hlt(hls hls, InputStream inputstream)
    {
        a = hls;
        super(inputstream);
    }

    public void close()
    {
    }
}
