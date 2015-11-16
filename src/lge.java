// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lge extends kwm
{

    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;

    public lge()
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
            j = k + kwk.e(1, a.intValue());
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.e(2, b.intValue());
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.e(3, c.intValue());
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.e(4, d.intValue());
        }
        j = k;
        if (e != null)
        {
            j = k + kwk.e(5, e.intValue());
        }
        k = j;
        if (f != null)
        {
            k = j + kwk.e(6, f.intValue());
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.e(7, g.intValue());
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.e(8, h.intValue());
        }
        j = k;
        if (i != null)
        {
            j = k + kwk.e(9, i.intValue());
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

            case 8: // '\b'
                a = Integer.valueOf(kwj1.f());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.f());
                break;

            case 40: // '('
                e = Integer.valueOf(kwj1.f());
                break;

            case 48: // '0'
                f = Integer.valueOf(kwj1.f());
                break;

            case 56: // '8'
                g = Integer.valueOf(kwj1.f());
                break;

            case 64: // '@'
                h = Integer.valueOf(kwj1.f());
                break;

            case 72: // 'H'
                i = Integer.valueOf(kwj1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(7, g.intValue());
        }
        if (h != null)
        {
            kwk1.a(8, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.intValue());
        }
        super.writeTo(kwk1);
    }
}
