// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iid extends kwm
{

    private static volatile iid e[];
    public iii a;
    public iij b;
    public iig c[];
    public iih d[];

    public iid()
    {
        a = null;
        b = null;
        c = iig.a();
        d = iih.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iid[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new iid[0];
                }
            }
        }
        return e;
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
            j = i + kwk.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    iig iig1 = c[k];
                    int i1 = i;
                    if (iig1 != null)
                    {
                        i1 = i + kwk.d(3, iig1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (d != null)
        {
            j1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    iih iih1 = d[l];
                    j1 = i;
                    if (iih1 != null)
                    {
                        j1 = i + kwk.d(4, iih1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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
                    a = new iii();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iij();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                int l = kwx.a(kwj1, 26);
                iig aiig[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aiig = new iig[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aiig, 0, j);
                    l = j;
                }
                for (; l < aiig.length - 1; l++)
                {
                    aiig[l] = new iig();
                    kwj1.a(aiig[l]);
                    kwj1.a();
                }

                aiig[l] = new iig();
                kwj1.a(aiig[l]);
                c = aiig;
                break;

            case 34: // '"'
                int i1 = kwx.a(kwj1, 34);
                iih aiih[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                aiih = new iih[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, aiih, 0, k);
                    i1 = k;
                }
                for (; i1 < aiih.length - 1; i1++)
                {
                    aiih[i1] = new iih();
                    kwj1.a(aiih[i1]);
                    kwj1.a();
                }

                aiih[i1] = new iih();
                kwj1.a(aiih[i1]);
                d = aiih;
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
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                iig iig1 = c[i];
                if (iig1 != null)
                {
                    kwk1.b(3, iig1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                iih iih1 = d[j];
                if (iih1 != null)
                {
                    kwk1.b(4, iih1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
