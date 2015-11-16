// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class kos
{

    final int a;
    final byte b[];

    kos(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    int a()
    {
        return koh.h(a) + 0 + b.length;
    }

    void a(koh koh1)
    {
        koh1.g(a);
        koh1.b(b);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof kos))
            {
                return false;
            }
            obj = (kos)obj;
            if (a != ((kos) (obj)).a || !Arrays.equals(b, ((kos) (obj)).b))
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
