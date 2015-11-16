// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbr extends kwm
{

    private static volatile jbr c[];
    public lcv a[];
    public lcn b[];

    public jbr()
    {
        a = lcv.a();
        b = lcn.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jbr[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new jbr[0];
                }
            }
        }
        return c;
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (int k = 0; k < a.length;)
                {
                    lcv lcv1 = a[k];
                    int i1 = i;
                    if (lcv1 != null)
                    {
                        i1 = i + kwk.d(1, lcv1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (b != null)
        {
            j1 = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    lcn lcn1 = b[l];
                    j1 = i;
                    if (lcn1 != null)
                    {
                        j1 = i + kwk.d(2, lcn1);
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
                int l = kwx.a(kwj1, 10);
                lcv alcv[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alcv = new lcv[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alcv, 0, j);
                    l = j;
                }
                for (; l < alcv.length - 1; l++)
                {
                    alcv[l] = new lcv();
                    kwj1.a(alcv[l]);
                    kwj1.a();
                }

                alcv[l] = new lcv();
                kwj1.a(alcv[l]);
                a = alcv;
                break;

            case 18: // '\022'
                int i1 = kwx.a(kwj1, 18);
                lcn alcn[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                alcn = new lcn[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, alcn, 0, k);
                    i1 = k;
                }
                for (; i1 < alcn.length - 1; i1++)
                {
                    alcn[i1] = new lcn();
                    kwj1.a(alcn[i1]);
                    kwj1.a();
                }

                alcn[i1] = new lcn();
                kwj1.a(alcn[i1]);
                b = alcn;
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
                lcv lcv1 = a[i];
                if (lcv1 != null)
                {
                    kwk1.b(1, lcv1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                lcn lcn1 = b[j];
                if (lcn1 != null)
                {
                    kwk1.b(2, lcn1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
