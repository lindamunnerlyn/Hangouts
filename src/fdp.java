// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class fdp
{

    final int a;
    final byte b[];

    fdp(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    int a()
    {
        return fdi.e(a) + 0 + b.length;
    }

    void a(fdi fdi1)
    {
        fdi1.d(a);
        fdi1.b(b);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof fdp))
            {
                return false;
            }
            obj = (fdp)obj;
            if (a != ((fdp) (obj)).a || !Arrays.equals(b, ((fdp) (obj)).b))
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
