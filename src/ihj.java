// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihj extends koj
{

    private static volatile ihj A[];
    public String a;
    public String b;
    public String c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public String h;
    public String i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public String n;
    public String o;
    public Boolean p;
    public Double q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public kpk z;

    public ihj()
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
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ihj[] a()
    {
        if (A == null)
        {
            synchronized (kon.a)
            {
                if (A == null)
                {
                    A = new ihj[0];
                }
            }
        }
        return A;
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
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.e(4, d.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.e(5, e.intValue());
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.e(6, f.intValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.e(7, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(10, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.e(11, k.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.e(12, l.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.e(13, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.b(14, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.b(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            p.booleanValue();
            j1 = i1 + (koh.f(16) + 1);
        }
        i1 = j1;
        if (q != null)
        {
            q.doubleValue();
            i1 = j1 + (koh.f(17) + 8);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.b(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + koh.b(19, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + koh.b(20, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + koh.b(21, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + koh.b(22, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + koh.b(23, w);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + koh.b(24, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + koh.b(25, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1 + koh.d(27, z);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i1 = kog1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kog1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kog1.j();
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 32: // ' '
                d = Integer.valueOf(kog1.f());
                break;

            case 40: // '('
                e = Integer.valueOf(kog1.f());
                break;

            case 48: // '0'
                f = Integer.valueOf(kog1.f());
                break;

            case 56: // '8'
                g = Integer.valueOf(kog1.f());
                break;

            case 66: // 'B'
                h = kog1.j();
                break;

            case 74: // 'J'
                i = kog1.j();
                break;

            case 80: // 'P'
                j = Integer.valueOf(kog1.f());
                break;

            case 88: // 'X'
                k = Integer.valueOf(kog1.f());
                break;

            case 96: // '`'
                l = Integer.valueOf(kog1.f());
                break;

            case 104: // 'h'
                m = Integer.valueOf(kog1.f());
                break;

            case 114: // 'r'
                n = kog1.j();
                break;

            case 122: // 'z'
                o = kog1.j();
                break;

            case 128: 
                p = Boolean.valueOf(kog1.i());
                break;

            case 137: 
                q = Double.valueOf(kog1.b());
                break;

            case 146: 
                r = kog1.j();
                break;

            case 154: 
                s = kog1.j();
                break;

            case 162: 
                t = kog1.j();
                break;

            case 170: 
                u = kog1.j();
                break;

            case 178: 
                v = kog1.j();
                break;

            case 186: 
                w = kog1.j();
                break;

            case 194: 
                x = kog1.j();
                break;

            case 202: 
                y = kog1.j();
                break;

            case 218: 
                if (z == null)
                {
                    z = new kpk();
                }
                kog1.a(z);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        if (f != null)
        {
            koh1.a(6, f.intValue());
        }
        if (g != null)
        {
            koh1.a(7, g.intValue());
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i);
        }
        if (j != null)
        {
            koh1.a(10, j.intValue());
        }
        if (k != null)
        {
            koh1.a(11, k.intValue());
        }
        if (l != null)
        {
            koh1.a(12, l.intValue());
        }
        if (m != null)
        {
            koh1.a(13, m.intValue());
        }
        if (n != null)
        {
            koh1.a(14, n);
        }
        if (o != null)
        {
            koh1.a(15, o);
        }
        if (p != null)
        {
            koh1.a(16, p.booleanValue());
        }
        if (q != null)
        {
            koh1.a(17, q.doubleValue());
        }
        if (r != null)
        {
            koh1.a(18, r);
        }
        if (s != null)
        {
            koh1.a(19, s);
        }
        if (t != null)
        {
            koh1.a(20, t);
        }
        if (u != null)
        {
            koh1.a(21, u);
        }
        if (v != null)
        {
            koh1.a(22, v);
        }
        if (w != null)
        {
            koh1.a(23, w);
        }
        if (x != null)
        {
            koh1.a(24, x);
        }
        if (y != null)
        {
            koh1.a(25, y);
        }
        if (z != null)
        {
            koh1.b(27, z);
        }
        super.writeTo(koh1);
    }
}
