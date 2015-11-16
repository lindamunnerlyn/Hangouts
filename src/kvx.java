// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kvx extends koj
{

    private static volatile kvx t[];
    public Long a;
    public Long b;
    public Boolean c;
    public String d;
    public String e;
    public kwa f;
    public Integer g;
    public String h;
    public String i;
    public String j;
    public String k;
    public kwj l[];
    public String m;
    public byte n[];
    public kve o;
    public String p;
    public kvy q;
    public kvj r;
    public kvz s;

    public kvx()
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
        l = kwj.a();
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

    public static kvx[] a()
    {
        if (t == null)
        {
            synchronized (kon.a)
            {
                if (t == null)
                {
                    t = new kvx[0];
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
            i1 = j1 + koh.e(1, a.longValue());
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.e(2, b.longValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.d(5, f);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(6, h);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.b(7, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.d(8, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.b(9, p);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                for (j1 = 0; j1 < l.length;)
                {
                    kwj kwj1 = l[j1];
                    int k1 = i1;
                    if (kwj1 != null)
                    {
                        k1 = i1 + koh.d(10, kwj1);
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
            i1 = j1 + koh.d(11, q);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.b(12, m);
        }
        i1 = j1;
        if (g != null)
        {
            g.intValue();
            i1 = j1 + (koh.f(13) + 4);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.b(14, k);
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (koh.f(15) + 1);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.d(16, r);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(17, i);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.d(18, s);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.b(19, j);
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

            case 8: // '\b'
                a = Long.valueOf(kog1.e());
                break;

            case 16: // '\020'
                b = Long.valueOf(kog1.e());
                break;

            case 26: // '\032'
                d = kog1.j();
                break;

            case 34: // '"'
                e = kog1.j();
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new kwa();
                }
                kog1.a(f);
                break;

            case 50: // '2'
                h = kog1.j();
                break;

            case 58: // ':'
                n = kog1.k();
                break;

            case 66: // 'B'
                if (o == null)
                {
                    o = new kve();
                }
                kog1.a(o);
                break;

            case 74: // 'J'
                p = kog1.j();
                break;

            case 82: // 'R'
                int k1 = kou.b(kog1, 82);
                kwj akwj[];
                int j1;
                if (l == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = l.length;
                }
                akwj = new kwj[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(l, 0, akwj, 0, j1);
                    k1 = j1;
                }
                for (; k1 < akwj.length - 1; k1++)
                {
                    akwj[k1] = new kwj();
                    kog1.a(akwj[k1]);
                    kog1.a();
                }

                akwj[k1] = new kwj();
                kog1.a(akwj[k1]);
                l = akwj;
                break;

            case 90: // 'Z'
                if (q == null)
                {
                    q = new kvy();
                }
                kog1.a(q);
                break;

            case 98: // 'b'
                m = kog1.j();
                break;

            case 109: // 'm'
                g = Integer.valueOf(kog1.h());
                break;

            case 114: // 'r'
                k = kog1.j();
                break;

            case 120: // 'x'
                c = Boolean.valueOf(kog1.i());
                break;

            case 130: 
                if (r == null)
                {
                    r = new kvj();
                }
                kog1.a(r);
                break;

            case 138: 
                i = kog1.j();
                break;

            case 146: 
                if (s == null)
                {
                    s = new kvz();
                }
                kog1.a(s);
                break;

            case 154: 
                j = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a.longValue());
        }
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (f != null)
        {
            koh1.b(5, f);
        }
        if (h != null)
        {
            koh1.a(6, h);
        }
        if (n != null)
        {
            koh1.a(7, n);
        }
        if (o != null)
        {
            koh1.b(8, o);
        }
        if (p != null)
        {
            koh1.a(9, p);
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                kwj kwj1 = l[i1];
                if (kwj1 != null)
                {
                    koh1.b(10, kwj1);
                }
            }

        }
        if (q != null)
        {
            koh1.b(11, q);
        }
        if (m != null)
        {
            koh1.a(12, m);
        }
        if (g != null)
        {
            koh1.b(13, g.intValue());
        }
        if (k != null)
        {
            koh1.a(14, k);
        }
        if (c != null)
        {
            koh1.a(15, c.booleanValue());
        }
        if (r != null)
        {
            koh1.b(16, r);
        }
        if (i != null)
        {
            koh1.a(17, i);
        }
        if (s != null)
        {
            koh1.b(18, s);
        }
        if (j != null)
        {
            koh1.a(19, j);
        }
        super.writeTo(koh1);
    }
}
