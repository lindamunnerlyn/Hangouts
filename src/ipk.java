// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipk extends kwm
{

    private static volatile ipk f[];
    public ipg a;
    public ipg b[];
    public iph c;
    public ipv d[];
    public ipm e;

    public ipk()
    {
        a = null;
        b = ipg.a();
        c = null;
        d = ipv.a();
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ipk[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new ipk[0];
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
                    ipg ipg1 = b[j];
                    int k = i;
                    if (ipg1 != null)
                    {
                        k = i + kwk.d(2, ipg1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    ipv ipv1 = d[l];
                    j = i;
                    if (ipv1 != null)
                    {
                        j = i + kwk.d(4, ipv1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(5, e);
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
                    a = new ipg();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                ipg aipg[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aipg = new ipg[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aipg, 0, j);
                    l = j;
                }
                for (; l < aipg.length - 1; l++)
                {
                    aipg[l] = new ipg();
                    kwj1.a(aipg[l]);
                    kwj1.a();
                }

                aipg[l] = new ipg();
                kwj1.a(aipg[l]);
                b = aipg;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new iph();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                int i1 = kwx.a(kwj1, 34);
                ipv aipv[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                aipv = new ipv[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, aipv, 0, k);
                    i1 = k;
                }
                for (; i1 < aipv.length - 1; i1++)
                {
                    aipv[i1] = new ipv();
                    kwj1.a(aipv[i1]);
                    kwj1.a();
                }

                aipv[i1] = new ipv();
                kwj1.a(aipv[i1]);
                d = aipv;
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new ipm();
                }
                kwj1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ipg ipg1 = b[i];
                if (ipg1 != null)
                {
                    kwk1.b(2, ipg1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                ipv ipv1 = d[j];
                if (ipv1 != null)
                {
                    kwk1.b(4, ipv1);
                }
            }

        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        super.writeTo(kwk1);
    }
}
