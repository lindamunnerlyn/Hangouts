// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iis extends kwm
{

    private static volatile iis e[];
    public iiv a;
    public iiw b;
    public iit c[];
    public iiu d[];

    public iis()
    {
        a = null;
        b = null;
        c = iit.a();
        d = iiu.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iis[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new iis[0];
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
                    iit iit1 = c[k];
                    int i1 = i;
                    if (iit1 != null)
                    {
                        i1 = i + kwk.d(3, iit1);
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
                    iiu iiu1 = d[l];
                    j1 = i;
                    if (iiu1 != null)
                    {
                        j1 = i + kwk.d(4, iiu1);
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
                    a = new iiv();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iiw();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                int l = kwx.a(kwj1, 26);
                iit aiit[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aiit = new iit[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aiit, 0, j);
                    l = j;
                }
                for (; l < aiit.length - 1; l++)
                {
                    aiit[l] = new iit();
                    kwj1.a(aiit[l]);
                    kwj1.a();
                }

                aiit[l] = new iit();
                kwj1.a(aiit[l]);
                c = aiit;
                break;

            case 34: // '"'
                int i1 = kwx.a(kwj1, 34);
                iiu aiiu[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                aiiu = new iiu[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, aiiu, 0, k);
                    i1 = k;
                }
                for (; i1 < aiiu.length - 1; i1++)
                {
                    aiiu[i1] = new iiu();
                    kwj1.a(aiiu[i1]);
                    kwj1.a();
                }

                aiiu[i1] = new iiu();
                kwj1.a(aiiu[i1]);
                d = aiiu;
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
                iit iit1 = c[i];
                if (iit1 != null)
                {
                    kwk1.b(3, iit1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                iiu iiu1 = d[j];
                if (iiu1 != null)
                {
                    kwk1.b(4, iiu1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
