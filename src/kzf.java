// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzf extends koj
{

    public kyo a;
    public kzg b;
    public Long c;
    public Long d;
    public Integer e;
    public kzg f[];
    public kyo g;

    public kzf()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = kzg.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i + koh.e(4, d.longValue());
        }
        i = j;
        if (e != null)
        {
            i = j + koh.f(5, e.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    kzg kzg1 = f[j];
                    int k = i;
                    if (kzg1 != null)
                    {
                        k = i + koh.d(6, kzg1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (g != null)
        {
            i = j + koh.d(7, g);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new kyo();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kzg();
                }
                kog1.a(b);
                break;

            case 24: // '\030'
                c = Long.valueOf(kog1.e());
                break;

            case 32: // ' '
                d = Long.valueOf(kog1.e());
                break;

            case 40: // '('
                e = Integer.valueOf(kog1.l());
                break;

            case 50: // '2'
                int k = kou.b(kog1, 50);
                kzg akzg[];
                int j;
                if (f == null)
                {
                    j = 0;
                } else
                {
                    j = f.length;
                }
                akzg = new kzg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(f, 0, akzg, 0, j);
                    k = j;
                }
                for (; k < akzg.length - 1; k++)
                {
                    akzg[k] = new kzg();
                    kog1.a(akzg[k]);
                    kog1.a();
                }

                akzg[k] = new kzg();
                kog1.a(akzg[k]);
                f = akzg;
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new kyo();
                }
                kog1.a(g);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c.longValue());
        }
        if (d != null)
        {
            koh1.b(4, d.longValue());
        }
        if (e != null)
        {
            koh1.c(5, e.intValue());
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                kzg kzg1 = f[i];
                if (kzg1 != null)
                {
                    koh1.b(6, kzg1);
                }
            }

        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        super.writeTo(koh1);
    }
}
