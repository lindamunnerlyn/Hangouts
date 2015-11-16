// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kdz extends koj
{

    private static volatile kdz q[];
    public String a;
    public kcr b;
    public kdt c;
    public kdx d;
    public kdm e;
    public kby f;
    public kbm g;
    public kdv h;
    public kdp i[];
    public kax j;
    public kdo k;
    public kdq l;
    public keb m;
    public kbs n;
    public kdy o;
    public kca p;

    public kdz()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = kdp.a();
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kdz[] a()
    {
        if (q == null)
        {
            synchronized (kon.a)
            {
                if (q == null)
                {
                    q = new kdz[0];
                }
            }
        }
        return q;
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
        if (c != null)
        {
            j1 = i1 + koh.d(2, c);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.d(3, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.d(4, g);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.d(5, d);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.d(6, b);
        }
        int k1 = j1;
        if (h != null)
        {
            k1 = j1 + koh.d(7, h);
        }
        i1 = k1;
        if (e != null)
        {
            i1 = k1 + koh.d(8, e);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    kdp kdp1 = i[j1];
                    int l1 = i1;
                    if (kdp1 != null)
                    {
                        l1 = i1 + koh.d(9, kdp1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.d(11, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.d(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.d(13, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.d(14, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.d(15, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.d(16, p);
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

            case 18: // '\022'
                if (c == null)
                {
                    c = new kdt();
                }
                kog1.a(c);
                break;

            case 26: // '\032'
                if (f == null)
                {
                    f = new kby();
                }
                kog1.a(f);
                break;

            case 34: // '"'
                if (g == null)
                {
                    g = new kbm();
                }
                kog1.a(g);
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new kdx();
                }
                kog1.a(d);
                break;

            case 50: // '2'
                if (b == null)
                {
                    b = new kcr();
                }
                kog1.a(b);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new kdv();
                }
                kog1.a(h);
                break;

            case 66: // 'B'
                if (e == null)
                {
                    e = new kdm();
                }
                kog1.a(e);
                break;

            case 74: // 'J'
                int k1 = kou.b(kog1, 74);
                kdp akdp[];
                int j1;
                if (i == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = i.length;
                }
                akdp = new kdp[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(i, 0, akdp, 0, j1);
                    k1 = j1;
                }
                for (; k1 < akdp.length - 1; k1++)
                {
                    akdp[k1] = new kdp();
                    kog1.a(akdp[k1]);
                    kog1.a();
                }

                akdp[k1] = new kdp();
                kog1.a(akdp[k1]);
                i = akdp;
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new kax();
                }
                kog1.a(j);
                break;

            case 90: // 'Z'
                if (k == null)
                {
                    k = new kdo();
                }
                kog1.a(k);
                break;

            case 98: // 'b'
                if (l == null)
                {
                    l = new kdq();
                }
                kog1.a(l);
                break;

            case 106: // 'j'
                if (m == null)
                {
                    m = new keb();
                }
                kog1.a(m);
                break;

            case 114: // 'r'
                if (n == null)
                {
                    n = new kbs();
                }
                kog1.a(n);
                break;

            case 122: // 'z'
                if (o == null)
                {
                    o = new kdy();
                }
                kog1.a(o);
                break;

            case 130: 
                if (p == null)
                {
                    p = new kca();
                }
                kog1.a(p);
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
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (f != null)
        {
            koh1.b(3, f);
        }
        if (g != null)
        {
            koh1.b(4, g);
        }
        if (d != null)
        {
            koh1.b(5, d);
        }
        if (b != null)
        {
            koh1.b(6, b);
        }
        if (h != null)
        {
            koh1.b(7, h);
        }
        if (e != null)
        {
            koh1.b(8, e);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                kdp kdp1 = i[i1];
                if (kdp1 != null)
                {
                    koh1.b(9, kdp1);
                }
            }

        }
        if (j != null)
        {
            koh1.b(10, j);
        }
        if (k != null)
        {
            koh1.b(11, k);
        }
        if (l != null)
        {
            koh1.b(12, l);
        }
        if (m != null)
        {
            koh1.b(13, m);
        }
        if (n != null)
        {
            koh1.b(14, n);
        }
        if (o != null)
        {
            koh1.b(15, o);
        }
        if (p != null)
        {
            koh1.b(16, p);
        }
        super.writeTo(koh1);
    }
}
