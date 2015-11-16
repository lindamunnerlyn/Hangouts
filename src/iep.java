// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iep extends kwm
{

    private static volatile iep e[];
    public String a;
    public ifb b[];
    public iff c[];
    public ifu d[];

    public iep()
    {
        a = null;
        b = ifb.a();
        c = iff.a();
        d = ifu.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iep[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new iep[0];
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ifb ifb1 = b[j];
                    int i1 = i;
                    if (ifb1 != null)
                    {
                        i1 = i + kwk.d(2, ifb1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
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
                    iff iff1 = c[k];
                    int j1 = i;
                    if (iff1 != null)
                    {
                        j1 = i + kwk.d(3, iff1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (d != null)
        {
            k1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    ifu ifu1 = d[l];
                    k1 = i;
                    if (ifu1 != null)
                    {
                        k1 = i + kwk.d(4, ifu1);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                int i1 = kwx.a(kwj1, 18);
                ifb aifb[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aifb = new ifb[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aifb, 0, j);
                    i1 = j;
                }
                for (; i1 < aifb.length - 1; i1++)
                {
                    aifb[i1] = new ifb();
                    kwj1.a(aifb[i1]);
                    kwj1.a();
                }

                aifb[i1] = new ifb();
                kwj1.a(aifb[i1]);
                b = aifb;
                break;

            case 26: // '\032'
                int j1 = kwx.a(kwj1, 26);
                iff aiff[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aiff = new iff[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aiff, 0, k);
                    j1 = k;
                }
                for (; j1 < aiff.length - 1; j1++)
                {
                    aiff[j1] = new iff();
                    kwj1.a(aiff[j1]);
                    kwj1.a();
                }

                aiff[j1] = new iff();
                kwj1.a(aiff[j1]);
                c = aiff;
                break;

            case 34: // '"'
                int k1 = kwx.a(kwj1, 34);
                ifu aifu[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                aifu = new ifu[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, aifu, 0, l);
                    k1 = l;
                }
                for (; k1 < aifu.length - 1; k1++)
                {
                    aifu[k1] = new ifu();
                    kwj1.a(aifu[k1]);
                    kwj1.a();
                }

                aifu[k1] = new ifu();
                kwj1.a(aifu[k1]);
                d = aifu;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ifb ifb1 = b[i];
                if (ifb1 != null)
                {
                    kwk1.b(2, ifb1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                iff iff1 = c[j];
                if (iff1 != null)
                {
                    kwk1.b(3, iff1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < d.length; k++)
            {
                ifu ifu1 = d[k];
                if (ifu1 != null)
                {
                    kwk1.b(4, ifu1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
