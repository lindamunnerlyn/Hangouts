// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jko extends kwm
{

    public jkd a;
    public jkk b;
    public jkn c;
    public jjz d;
    public jkl e;
    public jki f;
    public jju g;
    public jkf h;
    public jjy i;
    public jke j;
    public jjw k;

    public jko()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + kwk.d(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + kwk.d(2, b);
        }
        l = i1;
        if (c != null)
        {
            l = i1 + kwk.d(3, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + kwk.d(4, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + kwk.d(5, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + kwk.d(6, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + kwk.d(7, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + kwk.d(8, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + kwk.d(9, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + kwk.d(10, j);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + kwk.d(11, k);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int l = kwj1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kwj1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new jkd();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new jkk();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new jkn();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jjz();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new jkl();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new jki();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new jju();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new jkf();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new jjy();
                }
                kwj1.a(i);
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new jke();
                }
                kwj1.a(j);
                break;

            case 90: // 'Z'
                if (k == null)
                {
                    k = new jjw();
                }
                kwj1.a(k);
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
            kwk1.b(2, b);
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
            kwk1.b(8, h);
        }
        if (i != null)
        {
            kwk1.b(9, i);
        }
        if (j != null)
        {
            kwk1.b(10, j);
        }
        if (k != null)
        {
            kwk1.b(11, k);
        }
        super.writeTo(kwk1);
    }
}
