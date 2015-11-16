// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kgn extends koj
{

    public Boolean a;
    public kfj b;
    public jww c;
    public jwy d;
    public jxh e;
    public jxo f;
    public kgh g;
    public kfe h;
    public kik i;
    public kgp j;
    public kgj k;
    public kgs l;
    public kho m;

    public kgn()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.d(1, b);
        }
        j1 = i1;
        if (a != null)
        {
            a.booleanValue();
            j1 = i1 + (koh.f(2) + 1);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.d(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.d(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.d(15, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.d(16, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.d(17, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(19, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(20, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(21, m);
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
                if (b == null)
                {
                    b = new kfj();
                }
                kog1.a(b);
                break;

            case 16: // '\020'
                a = Boolean.valueOf(kog1.i());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new jww();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jwy();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new jxh();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new jxo();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new kgh();
                }
                kog1.a(g);
                break;

            case 122: // 'z'
                if (h == null)
                {
                    h = new kfe();
                }
                kog1.a(h);
                break;

            case 130: 
                if (i == null)
                {
                    i = new kik();
                }
                kog1.a(i);
                break;

            case 138: 
                if (j == null)
                {
                    j = new kgp();
                }
                kog1.a(j);
                break;

            case 154: 
                if (k == null)
                {
                    k = new kgj();
                }
                kog1.a(k);
                break;

            case 162: 
                if (l == null)
                {
                    l = new kgs();
                }
                kog1.a(l);
                break;

            case 170: 
                if (m == null)
                {
                    m = new kho();
                }
                kog1.a(m);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.b(1, b);
        }
        if (a != null)
        {
            koh1.a(2, a.booleanValue());
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.b(15, h);
        }
        if (i != null)
        {
            koh1.b(16, i);
        }
        if (j != null)
        {
            koh1.b(17, j);
        }
        if (k != null)
        {
            koh1.b(19, k);
        }
        if (l != null)
        {
            koh1.b(20, l);
        }
        if (m != null)
        {
            koh1.b(21, m);
        }
        super.writeTo(koh1);
    }
}
