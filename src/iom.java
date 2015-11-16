// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iom extends koj
{

    public String a;
    public Integer b;
    public Integer c;
    public Integer d;
    public String e;
    public Integer f;
    public Integer g;
    public String h;
    public Integer i;
    public Integer j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public Integer q;
    public Integer r;
    public String s;
    public String t;
    public ion u;
    public String v;
    public ioo w;

    public iom()
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
        unknownFieldData = null;
        cachedSize = -1;
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
            j1 = i1 + koh.e(2, b.intValue());
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.e(3, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.e(4, d.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(5, e);
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
            i1 = j1 + koh.e(9, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(10, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.b(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.b(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.b(13, m);
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
            j1 = i1 + koh.b(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.e(17, q.intValue());
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.e(18, r.intValue());
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
            i1 = j1 + koh.d(21, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + koh.b(22, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + koh.d(23, w);
        }
        return i1;
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

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kog1.f());
                break;

            case 42: // '*'
                e = kog1.j();
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

            case 72: // 'H'
                i = Integer.valueOf(kog1.f());
                break;

            case 80: // 'P'
                j = Integer.valueOf(kog1.f());
                break;

            case 90: // 'Z'
                k = kog1.j();
                break;

            case 98: // 'b'
                l = kog1.j();
                break;

            case 106: // 'j'
                m = kog1.j();
                break;

            case 114: // 'r'
                n = kog1.j();
                break;

            case 122: // 'z'
                o = kog1.j();
                break;

            case 130: 
                p = kog1.j();
                break;

            case 136: 
                q = Integer.valueOf(kog1.f());
                break;

            case 144: 
                r = Integer.valueOf(kog1.f());
                break;

            case 154: 
                s = kog1.j();
                break;

            case 162: 
                t = kog1.j();
                break;

            case 170: 
                if (u == null)
                {
                    u = new ion();
                }
                kog1.a(u);
                break;

            case 178: 
                v = kog1.j();
                break;

            case 186: 
                if (w == null)
                {
                    w = new ioo();
                }
                kog1.a(w);
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
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.a(5, e);
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
            koh1.a(9, i.intValue());
        }
        if (j != null)
        {
            koh1.a(10, j.intValue());
        }
        if (k != null)
        {
            koh1.a(11, k);
        }
        if (l != null)
        {
            koh1.a(12, l);
        }
        if (m != null)
        {
            koh1.a(13, m);
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
            koh1.a(16, p);
        }
        if (q != null)
        {
            koh1.a(17, q.intValue());
        }
        if (r != null)
        {
            koh1.a(18, r.intValue());
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
            koh1.b(21, u);
        }
        if (v != null)
        {
            koh1.a(22, v);
        }
        if (w != null)
        {
            koh1.b(23, w);
        }
        super.writeTo(koh1);
    }
}
