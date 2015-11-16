// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iue extends kwm
{

    private static volatile iue e[];
    public String a;
    public String b;
    public int c[];
    public int d[];

    public iue()
    {
        a = null;
        b = null;
        c = kwx.a;
        d = kwx.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iue[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new iue[0];
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
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j + c.length * 4 + c.length * 1;
            }
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                j = i + d.length * 4 + d.length * 1;
            }
        }
        return j;
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
                b = kwj1.j();
                break;

            case 29: // '\035'
                int j1 = kwx.a(kwj1, 29);
                int ai[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ai = new int[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ai, 0, j);
                    j1 = j;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = kwj1.h();
                    kwj1.a();
                }

                ai[j1] = kwj1.h();
                c = ai;
                break;

            case 26: // '\032'
                int k = kwj1.p();
                int j2 = kwj1.c(k);
                int k1 = k / 4;
                int ai1[];
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ai1 = new int[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, k);
                    k1 = k;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = kwj1.h();
                }

                c = ai1;
                kwj1.d(j2);
                break;

            case 37: // '%'
                int l1 = kwx.a(kwj1, 37);
                int ai2[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                ai2 = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, ai2, 0, l);
                    l1 = l;
                }
                for (; l1 < ai2.length - 1; l1++)
                {
                    ai2[l1] = kwj1.h();
                    kwj1.a();
                }

                ai2[l1] = kwj1.h();
                d = ai2;
                break;

            case 34: // '"'
                int i1 = kwj1.p();
                int k2 = kwj1.c(i1);
                int i2 = i1 / 4;
                int ai3[];
                if (d == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = d.length;
                }
                ai3 = new int[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(d, 0, ai3, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ai3.length; i2++)
                {
                    ai3[i2] = kwj1.h();
                }

                d = ai3;
                kwj1.d(k2);
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
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kwk1.b(3, c[i]);
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                kwk1.b(4, d[j]);
            }

        }
        super.writeTo(kwk1);
    }
}
