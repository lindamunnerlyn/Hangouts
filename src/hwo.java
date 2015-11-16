// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwo extends kwm
{

    private static volatile hwo p[];
    public hwx a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;

    public hwo()
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
        l = null;
        m = null;
        n = null;
        o = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hwo[] a()
    {
        if (p == null)
        {
            synchronized (kwq.a)
            {
                if (p == null)
                {
                    p = new hwo[0];
                }
            }
        }
        return p;
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
            i1 = j1 + kwk.d(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.b(2, b);
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
            i1 = j1 + kwk.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(7, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(8, i);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.b(10, l);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.b(11, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.b(12, o);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(13, c);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(14, j);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.b(15, m);
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
                if (a == null)
                {
                    a = new hwx();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                d = kwj1.j();
                break;

            case 34: // '"'
                e = kwj1.j();
                break;

            case 42: // '*'
                f = kwj1.j();
                break;

            case 50: // '2'
                g = kwj1.j();
                break;

            case 58: // ':'
                h = kwj1.j();
                break;

            case 66: // 'B'
                i = kwj1.j();
                break;

            case 74: // 'J'
                k = kwj1.j();
                break;

            case 82: // 'R'
                l = kwj1.j();
                break;

            case 90: // 'Z'
                n = kwj1.j();
                break;

            case 98: // 'b'
                o = kwj1.j();
                break;

            case 106: // 'j'
                c = kwj1.j();
                break;

            case 114: // 'r'
                j = kwj1.j();
                break;

            case 122: // 'z'
                m = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
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
            kwk1.a(5, f);
        }
        if (g != null)
        {
            kwk1.a(6, g);
        }
        if (h != null)
        {
            kwk1.a(7, h);
        }
        if (i != null)
        {
            kwk1.a(8, i);
        }
        if (k != null)
        {
            kwk1.a(9, k);
        }
        if (l != null)
        {
            kwk1.a(10, l);
        }
        if (n != null)
        {
            kwk1.a(11, n);
        }
        if (o != null)
        {
            kwk1.a(12, o);
        }
        if (c != null)
        {
            kwk1.a(13, c);
        }
        if (j != null)
        {
            kwk1.a(14, j);
        }
        if (m != null)
        {
            kwk1.a(15, m);
        }
        super.writeTo(kwk1);
    }
}
