// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class koq extends kwm
{

    public Boolean a;
    public knm b;
    public kez c;
    public kfb d;
    public kfk e;
    public kfr f;
    public kok g;
    public knh h;
    public kqn i;
    public kos j;
    public kom k;
    public kov l;
    public kpr m;

    public koq()
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
            i1 = j1 + kwk.d(1, b);
        }
        j1 = i1;
        if (a != null)
        {
            a.booleanValue();
            j1 = i1 + (kwk.f(2) + 1);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.d(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.d(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.d(15, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.d(16, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.d(17, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(19, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(20, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.d(21, m);
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
                if (b == null)
                {
                    b = new knm();
                }
                kwj1.a(b);
                break;

            case 16: // '\020'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kez();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kfb();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new kfk();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new kfr();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new kok();
                }
                kwj1.a(g);
                break;

            case 122: // 'z'
                if (h == null)
                {
                    h = new knh();
                }
                kwj1.a(h);
                break;

            case 130: 
                if (i == null)
                {
                    i = new kqn();
                }
                kwj1.a(i);
                break;

            case 138: 
                if (j == null)
                {
                    j = new kos();
                }
                kwj1.a(j);
                break;

            case 154: 
                if (k == null)
                {
                    k = new kom();
                }
                kwj1.a(k);
                break;

            case 162: 
                if (l == null)
                {
                    l = new kov();
                }
                kwj1.a(l);
                break;

            case 170: 
                if (m == null)
                {
                    m = new kpr();
                }
                kwj1.a(m);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.b(1, b);
        }
        if (a != null)
        {
            kwk1.a(2, a.booleanValue());
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.b(15, h);
        }
        if (i != null)
        {
            kwk1.b(16, i);
        }
        if (j != null)
        {
            kwk1.b(17, j);
        }
        if (k != null)
        {
            kwk1.b(19, k);
        }
        if (l != null)
        {
            kwk1.b(20, l);
        }
        if (m != null)
        {
            kwk1.b(21, m);
        }
        super.writeTo(kwk1);
    }
}
