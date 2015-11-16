// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljt extends kwm
{

    private static volatile ljt g[];
    public lhc a;
    public lkw b[];
    public String c;
    public String d;
    public Long e;
    public Long f;

    public ljt()
    {
        a = null;
        b = lkw.a();
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ljt[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new ljt[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lkw lkw1 = b[j];
                    int k = i;
                    if (lkw1 != null)
                    {
                        k = i + kwk.d(2, lkw1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        j += kwk.b(3, c);
        i = j;
        if (d != null)
        {
            i = j + kwk.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.e(5, e.longValue());
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.e(6, f.longValue());
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new lhc();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                lkw alkw[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alkw = new lkw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alkw, 0, j);
                    k = j;
                }
                for (; k < alkw.length - 1; k++)
                {
                    alkw[k] = new lkw();
                    kwj1.a(alkw[k]);
                    kwj1.a();
                }

                alkw[k] = new lkw();
                kwj1.a(alkw[k]);
                b = alkw;
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 40: // '('
                e = Long.valueOf(kwj1.e());
                break;

            case 48: // '0'
                f = Long.valueOf(kwj1.e());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lkw lkw1 = b[i];
                if (lkw1 != null)
                {
                    kwk1.b(2, lkw1);
                }
            }

        }
        kwk1.a(3, c);
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e.longValue());
        }
        if (f != null)
        {
            kwk1.b(6, f.longValue());
        }
        super.writeTo(kwk1);
    }
}
