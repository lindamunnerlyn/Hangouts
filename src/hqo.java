// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterInputStream;
import java.io.InputStream;

final class hqo extends FilterInputStream
{

    final hqn a;

    hqo(hqn hqn, InputStream inputstream)
    {
        a = hqn;
        super(inputstream);
    }

    public void close()
    {
    }
}
