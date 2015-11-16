// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksu extends kwm
{

    public String a;
    public Boolean b;
    public String c;
    public Long d;
    public Long e;
    public Boolean f;
    public Long g;
    public String h;

    public ksu()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.b(2, c);
        }
        i = j;
        if (d != null)
        {
            d.longValue();
            i = j + (kwk.f(3) + 8);
        }
        j = i;
        if (e != null)
        {
            e.longValue();
            j = i + (kwk.f(4) + 8);
        }
        i = j;
        if (f != null)
        {
            f.booleanValue();
            i = j + (kwk.f(5) + 1);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (kwk.f(6) + 1);
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.e(7, g.longValue());
        }
        j = i;
        if (h != null)
        {
            j = i + kwk.b(8, h);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kwj1.j();
                break;

            case 18: // '\022'
                c = kwj1.j();
                break;

            case 25: // '\031'
                d = Long.valueOf(kwj1.g());
                break;

            case 33: // '!'
                e = Long.valueOf(kwj1.g());
                break;

            case 40: // '('
                f = Boolean.valueOf(kwj1.i());
                break;

            case 48: // '0'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 56: // '8'
                g = Long.valueOf(kwj1.e());
                break;

            case 66: // 'B'
                h = kwj1.j();
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
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (d != null)
        {
            kwk1.c(3, d.longValue());
        }
        if (e != null)
        {
            kwk1.c(4, e.longValue());
        }
        if (f != null)
        {
            kwk1.a(5, f.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(6, b.booleanValue());
        }
        if (g != null)
        {
            kwk1.b(7, g.longValue());
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        super.writeTo(kwk1);
    }
}
