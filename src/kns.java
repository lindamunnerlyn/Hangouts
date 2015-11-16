// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class kns
{

    private int a;
    private int b[];
    private Object c[];
    private boolean d;

    kns()
    {
        a = 0;
        b = knr.c();
        c = knr.d();
    }

    private void a(int i, Object obj)
    {
        if (a == b.length)
        {
            int j;
            if (a < 4)
            {
                j = 8;
            } else
            {
                j = a >> 1;
            }
            j += a;
            b = Arrays.copyOf(b, j);
            c = Arrays.copyOf(c, j);
        }
        b[a] = i;
        c[a] = obj;
        a = a + 1;
    }

    private void b()
    {
        if (d)
        {
            throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
        } else
        {
            return;
        }
    }

    public knr a()
    {
        if (d)
        {
            throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
        }
        d = true;
        if (a == 0)
        {
            return knr.e();
        } else
        {
            return new knr(a, b, c);
        }
    }

    public kns a(int i, int j)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        } else
        {
            b();
            a(knu.a(i, 0), Long.valueOf(j));
            return this;
        }
    }

    public boolean a(int i, klr klr1)
    {
        b();
        int j = knu.b(i);
        switch (knu.a(i))
        {
        default:
            throw kmr.g();

        case 0: // '\0'
            a(i, Long.valueOf(klr1.e()));
            return true;

        case 5: // '\005'
            a(i, Integer.valueOf(klr1.h()));
            return true;

        case 1: // '\001'
            a(i, Long.valueOf(klr1.g()));
            return true;

        case 2: // '\002'
            a(i, klr1.l());
            return true;

        case 3: // '\003'
            kns kns1 = knr.newBuilder();
            int k;
            do
            {
                k = klr1.a();
            } while (k != 0 && kns1.a(k, klr1));
            klr1.a(knu.a(j, 4));
            a(i, kns1.a());
            return true;

        case 4: // '\004'
            return false;
        }
    }
}
