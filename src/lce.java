// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lce extends kwm
{

    private static volatile lce d[];
    public String a;
    public String b[];
    public lcd c[];

    public lce()
    {
        a = null;
        b = kwx.f;
        c = lcd.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lce[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new lce[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l1 = super.computeSerializedSize() + kwk.b(1, a);
        int i;
        int i1;
        if (b != null && b.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int j1;
            for (l = 0; i < b.length; l = j1)
            {
                String s = b[i];
                int k1 = j;
                j1 = l;
                if (s != null)
                {
                    j1 = l + 1;
                    k1 = j + kwk.a(s);
                }
                i++;
                j = k1;
            }

            i = l1 + j + l * 1;
        } else
        {
            i = l1;
        }
        i1 = i;
        if (c != null)
        {
            i1 = i;
            if (c.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= c.length)
                    {
                        break;
                    }
                    lcd lcd1 = c[k];
                    i1 = i;
                    if (lcd1 != null)
                    {
                        i1 = i + kwk.d(3, lcd1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                String as[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kwj1.j();
                    kwj1.a();
                }

                as[l] = kwj1.j();
                b = as;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                lcd alcd[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                alcd = new lcd[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, alcd, 0, k);
                    i1 = k;
                }
                for (; i1 < alcd.length - 1; i1++)
                {
                    alcd[i1] = new lcd();
                    kwj1.a(alcd[i1]);
                    kwj1.a();
                }

                alcd[i1] = new lcd();
                kwj1.a(alcd[i1]);
                c = alcd;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(1, a);
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    kwk1.a(2, s);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                lcd lcd1 = c[j];
                if (lcd1 != null)
                {
                    kwk1.b(3, lcd1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
