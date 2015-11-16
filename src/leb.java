// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class leb extends kwm
{

    private static volatile leb t[];
    public Long a;
    public Long b;
    public Boolean c;
    public String d;
    public String e;
    public lee f;
    public Integer g;
    public String h;
    public String i;
    public String j;
    public String k;
    public lem l[];
    public String m;
    public byte n[];
    public ldi o;
    public String p;
    public lec q;
    public ldn r;
    public led s;

    public leb()
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
        k = null;
        l = lem.a();
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static leb[] a()
    {
        if (t == null)
        {
            synchronized (kwq.a)
            {
                if (t == null)
                {
                    t = new leb[0];
                }
            }
        }
        return t;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.e(1, a.longValue());
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.e(2, b.longValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.d(5, f);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(6, h);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.b(7, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.d(8, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.b(9, p);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                for (j1 = 0; j1 < l.length;)
                {
                    lem lem1 = l[j1];
                    int k1 = i1;
                    if (lem1 != null)
                    {
                        k1 = i1 + kwk.d(10, lem1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.d(11, q);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.b(12, m);
        }
        i1 = j1;
        if (g != null)
        {
            g.intValue();
            i1 = j1 + (kwk.f(13) + 4);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.b(14, k);
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (kwk.f(15) + 1);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + kwk.d(16, r);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(17, i);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.d(18, s);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.b(19, j);
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

            case 8: // '\b'
                a = Long.valueOf(kwj1.e());
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.e());
                break;

            case 26: // '\032'
                d = kwj1.j();
                break;

            case 34: // '"'
                e = kwj1.j();
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new lee();
                }
                kwj1.a(f);
                break;

            case 50: // '2'
                h = kwj1.j();
                break;

            case 58: // ':'
                n = kwj1.k();
                break;

            case 66: // 'B'
                if (o == null)
                {
                    o = new ldi();
                }
                kwj1.a(o);
                break;

            case 74: // 'J'
                p = kwj1.j();
                break;

            case 82: // 'R'
                int k1 = kwx.a(kwj1, 82);
                lem alem[];
                int j1;
                if (l == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = l.length;
                }
                alem = new lem[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(l, 0, alem, 0, j1);
                    k1 = j1;
                }
                for (; k1 < alem.length - 1; k1++)
                {
                    alem[k1] = new lem();
                    kwj1.a(alem[k1]);
                    kwj1.a();
                }

                alem[k1] = new lem();
                kwj1.a(alem[k1]);
                l = alem;
                break;

            case 90: // 'Z'
                if (q == null)
                {
                    q = new lec();
                }
                kwj1.a(q);
                break;

            case 98: // 'b'
                m = kwj1.j();
                break;

            case 109: // 'm'
                g = Integer.valueOf(kwj1.h());
                break;

            case 114: // 'r'
                k = kwj1.j();
                break;

            case 120: // 'x'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 130: 
                if (r == null)
                {
                    r = new ldn();
                }
                kwj1.a(r);
                break;

            case 138: 
                i = kwj1.j();
                break;

            case 146: 
                if (s == null)
                {
                    s = new led();
                }
                kwj1.a(s);
                break;

            case 154: 
                j = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a.longValue());
        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.b(5, f);
        }
        if (h != null)
        {
            kwk1.a(6, h);
        }
        if (n != null)
        {
            kwk1.a(7, n);
        }
        if (o != null)
        {
            kwk1.b(8, o);
        }
        if (p != null)
        {
            kwk1.a(9, p);
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                lem lem1 = l[i1];
                if (lem1 != null)
                {
                    kwk1.b(10, lem1);
                }
            }

        }
        if (q != null)
        {
            kwk1.b(11, q);
        }
        if (m != null)
        {
            kwk1.a(12, m);
        }
        if (g != null)
        {
            kwk1.b(13, g.intValue());
        }
        if (k != null)
        {
            kwk1.a(14, k);
        }
        if (c != null)
        {
            kwk1.a(15, c.booleanValue());
        }
        if (r != null)
        {
            kwk1.b(16, r);
        }
        if (i != null)
        {
            kwk1.a(17, i);
        }
        if (s != null)
        {
            kwk1.b(18, s);
        }
        if (j != null)
        {
            kwk1.a(19, j);
        }
        super.writeTo(kwk1);
    }
}
