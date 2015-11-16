// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljo extends kwm
{

    private static volatile ljo l[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public lhc f;
    public String g;
    public String h;
    public String i;
    public lhc j;
    public ljq k[];

    public ljo()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = ljq.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ljo[] a()
    {
        if (l == null)
        {
            synchronized (kwq.a)
            {
                if (l == null)
                {
                    l = new ljo[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.b(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(2, c);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.d(4, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(5, g);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(6, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.d(7, j);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(8, h);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    ljq ljq1 = k[j1];
                    int k1 = i1;
                    if (ljq1 != null)
                    {
                        k1 = i1 + kwk.d(9, ljq1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.b(10, a);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(11, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(12, e);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i1 = kwj1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kwj1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = kwj1.j();
                break;

            case 18: // '\022'
                c = kwj1.j();
                break;

            case 34: // '"'
                if (f == null)
                {
                    f = new lhc();
                }
                kwj1.a(f);
                break;

            case 42: // '*'
                g = kwj1.j();
                break;

            case 50: // '2'
                i = kwj1.j();
                break;

            case 58: // ':'
                if (j == null)
                {
                    j = new lhc();
                }
                kwj1.a(j);
                break;

            case 66: // 'B'
                h = kwj1.j();
                break;

            case 74: // 'J'
                int k1 = kwx.a(kwj1, 74);
                ljq aljq[];
                int j1;
                if (k == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = k.length;
                }
                aljq = new ljq[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(k, 0, aljq, 0, j1);
                    k1 = j1;
                }
                for (; k1 < aljq.length - 1; k1++)
                {
                    aljq[k1] = new ljq();
                    kwj1.a(aljq[k1]);
                    kwj1.a();
                }

                aljq[k1] = new ljq();
                kwj1.a(aljq[k1]);
                k = aljq;
                break;

            case 82: // 'R'
                a = kwj1.j();
                break;

            case 90: // 'Z'
                d = kwj1.j();
                break;

            case 98: // 'b'
                e = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b);
        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (f != null)
        {
            kwk1.b(4, f);
        }
        if (g != null)
        {
            kwk1.a(5, g);
        }
        if (i != null)
        {
            kwk1.a(6, i);
        }
        if (j != null)
        {
            kwk1.b(7, j);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (k != null && k.length > 0)
        {
            for (int i1 = 0; i1 < k.length; i1++)
            {
                ljq ljq1 = k[i1];
                if (ljq1 != null)
                {
                    kwk1.b(9, ljq1);
                }
            }

        }
        if (a != null)
        {
            kwk1.a(10, a);
        }
        if (d != null)
        {
            kwk1.a(11, d);
        }
        if (e != null)
        {
            kwk1.a(12, e);
        }
        super.writeTo(kwk1);
    }
}
