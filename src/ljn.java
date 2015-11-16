// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljn extends kwm
{

    public String a;
    public Boolean b;
    public Boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public ljn()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + kwk.b(1, a);
        }
        l = k;
        if (b != null)
        {
            b.booleanValue();
            l = k + (kwk.f(2) + 1);
        }
        k = l;
        if (c != null)
        {
            c.booleanValue();
            k = l + (kwk.f(3) + 1);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.b(4, d);
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.b(5, e);
        }
        l = k;
        if (f != null)
        {
            l = k + kwk.b(6, f);
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.b(8, g);
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.b(9, h);
        }
        k = l;
        if (i != null)
        {
            k = l + kwk.b(10, i);
        }
        l = k;
        if (j != null)
        {
            l = k + kwk.b(11, j);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int k = kwj1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(kwj1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kwj1.j();
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                e = kwj1.j();
                break;

            case 50: // '2'
                f = kwj1.j();
                break;

            case 66: // 'B'
                g = kwj1.j();
                break;

            case 74: // 'J'
                h = kwj1.j();
                break;

            case 82: // 'R'
                i = kwj1.j();
                break;

            case 90: // 'Z'
                j = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(8, g);
        }
        if (h != null)
        {
            kwk1.a(9, h);
        }
        if (i != null)
        {
            kwk1.a(10, i);
        }
        if (j != null)
        {
            kwk1.a(11, j);
        }
        super.writeTo(kwk1);
    }
}
