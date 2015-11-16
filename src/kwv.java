// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class kwv
{

    final int a;
    final byte b[];

    kwv(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    int a()
    {
        return kwk.h(a) + 0 + b.length;
    }

    void a(kwk kwk1)
    {
        kwk1.g(a);
        kwk1.b(b);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof kwv))
            {
                return false;
            }
            obj = (kwv)obj;
            if (a != ((kwv) (obj)).a || !Arrays.equals(b, ((kwv) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (a + 527) * 31 + Arrays.hashCode(b);
    }
}
