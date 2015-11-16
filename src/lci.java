// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lci extends koj
{

    private static volatile lci f[];
    public String a[];
    public String b;
    public lch c[];
    public Boolean d;
    public Boolean e;

    public lci()
    {
        a = kou.f;
        b = null;
        c = lch.a();
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lci[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new lci[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l1 = super.computeSerializedSize();
        int j;
        int k;
        if (a != null && a.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int j1;
            for (l = 0; i < a.length; l = j1)
            {
                String s = a[i];
                int k1 = k;
                j1 = l;
                if (s != null)
                {
                    j1 = l + 1;
                    k1 = k + koh.a(s);
                }
                i++;
                k = k1;
            }

            k = l1 + k + l * 1;
        } else
        {
            k = l1;
        }
        j = k;
        if (b != null)
        {
            j = k + koh.b(2, b);
        }
        k = j;
        if (c != null)
        {
            k = j;
            if (c.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k = j;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    lch lch1 = c[i1];
                    k = j;
                    if (lch1 != null)
                    {
                        k = j + koh.d(3, lch1);
                    }
                    i1++;
                    j = k;
                } while (true);
            }
        }
        j = k;
        if (d != null)
        {
            d.booleanValue();
            j = k + (koh.f(4) + 1);
        }
        k = j;
        if (e != null)
        {
            e.booleanValue();
            k = j + (koh.f(5) + 1);
        }
        return k;
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
                int l = kou.b(kog1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kog1.j();
                    kog1.a();
                }

                as[l] = kog1.j();
                a = as;
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                lch alch[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                alch = new lch[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, alch, 0, k);
                    i1 = k;
                }
                for (; i1 < alch.length - 1; i1++)
                {
                    alch[i1] = new lch();
                    kog1.a(alch[i1]);
                    kog1.a();
                }

                alch[i1] = new lch();
                kog1.a(alch[i1]);
                c = alch;
                break;

            case 32: // ' '
                d = Boolean.valueOf(kog1.i());
                break;

            case 40: // '('
                e = Boolean.valueOf(kog1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    koh1.a(1, s);
                }
            }

        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                lch lch1 = c[j];
                if (lch1 != null)
                {
                    koh1.b(3, lch1);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            koh1.a(5, e.booleanValue());
        }
        super.writeTo(koh1);
    }
}
