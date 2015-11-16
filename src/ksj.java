// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksj extends kwm
{

    private static volatile ksj d[];
    public ksg a[];
    public ksl b[];
    public ksi c[];

    public ksj()
    {
        a = ksg.a();
        b = ksl.a();
        c = ksi.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ksj[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new ksj[0];
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
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    ksg ksg1 = a[j];
                    int i1 = i;
                    if (ksg1 != null)
                    {
                        i1 = i + kwk.d(1, ksg1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (int k = 0; k < b.length;)
                {
                    ksl ksl1 = b[k];
                    int j1 = i;
                    if (ksl1 != null)
                    {
                        j1 = i + kwk.d(2, ksl1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (c != null)
        {
            k1 = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    ksi ksi1 = c[l];
                    k1 = i;
                    if (ksi1 != null)
                    {
                        k1 = i + kwk.d(3, ksi1);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
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
                int i1 = kwx.a(kwj1, 10);
                ksg aksg[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aksg = new ksg[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aksg, 0, j);
                    i1 = j;
                }
                for (; i1 < aksg.length - 1; i1++)
                {
                    aksg[i1] = new ksg();
                    kwj1.a(aksg[i1]);
                    kwj1.a();
                }

                aksg[i1] = new ksg();
                kwj1.a(aksg[i1]);
                a = aksg;
                break;

            case 18: // '\022'
                int j1 = kwx.a(kwj1, 18);
                ksl aksl[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aksl = new ksl[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aksl, 0, k);
                    j1 = k;
                }
                for (; j1 < aksl.length - 1; j1++)
                {
                    aksl[j1] = new ksl();
                    kwj1.a(aksl[j1]);
                    kwj1.a();
                }

                aksl[j1] = new ksl();
                kwj1.a(aksl[j1]);
                b = aksl;
                break;

            case 26: // '\032'
                int k1 = kwx.a(kwj1, 26);
                ksi aksi[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aksi = new ksi[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aksi, 0, l);
                    k1 = l;
                }
                for (; k1 < aksi.length - 1; k1++)
                {
                    aksi[k1] = new ksi();
                    kwj1.a(aksi[k1]);
                    kwj1.a();
                }

                aksi[k1] = new ksi();
                kwj1.a(aksi[k1]);
                c = aksi;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                ksg ksg1 = a[i];
                if (ksg1 != null)
                {
                    kwk1.b(1, ksg1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                ksl ksl1 = b[j];
                if (ksl1 != null)
                {
                    kwk1.b(2, ksl1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                ksi ksi1 = c[k];
                if (ksi1 != null)
                {
                    kwk1.b(3, ksi1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
