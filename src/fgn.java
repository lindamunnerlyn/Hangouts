// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class fgn
{

    final int a;
    final byte b[];

    fgn(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    int a()
    {
        return fgg.e(a) + 0 + b.length;
    }

    void a(fgg fgg1)
    {
        fgg1.d(a);
        fgg1.b(b);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof fgn))
            {
                return false;
            }
            obj = (fgn)obj;
            if (a != ((fgn) (obj)).a || !Arrays.equals(b, ((fgn) (obj)).b))
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
