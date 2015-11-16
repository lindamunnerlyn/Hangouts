// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihg extends kwm
{

    public ihk a;
    public ihq b;
    public ihp c;
    public ihn d;
    public ihi e;
    public ihh f;
    public ihn g;
    public ihm h;
    public iho i;

    public ihg()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + kwk.d(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.d(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.d(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.d(4, d);
        }
        j = k;
        if (e != null)
        {
            j = k + kwk.d(5, e);
        }
        k = j;
        if (g != null)
        {
            k = j + kwk.d(6, g);
        }
        j = k;
        if (h != null)
        {
            j = k + kwk.d(7, h);
        }
        k = j;
        if (i != null)
        {
            k = j + kwk.d(9, i);
        }
        j = k;
        if (f != null)
        {
            j = k + kwk.d(10, f);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int j = kwj1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kwj1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new ihk();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ihq();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ihp();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new ihn();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new ihi();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new ihn();
                }
                kwj1.a(g);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new ihm();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new iho();
                }
                kwj1.a(i);
                break;

            case 82: // 'R'
                if (f == null)
                {
                    f = new ihh();
                }
                kwj1.a(f);
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
        if (g != null)
        {
            kwk1.b(6, g);
        }
        if (h != null)
        {
            kwk1.b(7, h);
        }
        if (i != null)
        {
            kwk1.b(9, i);
        }
        if (f != null)
        {
            kwk1.b(10, f);
        }
        super.writeTo(kwk1);
    }
}
