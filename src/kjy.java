// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kjy extends kwm
{

    public String a;
    public String b;
    public String c;
    public Float d;
    public Float e;
    public Integer f;
    public Float g;

    public kjy()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
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
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(3, c);
        }
        j = i;
        if (d != null)
        {
            d.floatValue();
            j = i + (kwk.f(4) + 4);
        }
        i = j;
        if (e != null)
        {
            e.floatValue();
            i = j + (kwk.f(5) + 4);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.e(6, f.intValue());
        }
        i = j;
        if (g != null)
        {
            g.floatValue();
            i = j + (kwk.f(7) + 4);
        }
        return i;
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
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 37: // '%'
                d = Float.valueOf(kwj1.c());
                break;

            case 45: // '-'
                e = Float.valueOf(kwj1.c());
                break;

            case 48: // '0'
                f = Integer.valueOf(kwj1.f());
                break;

            case 61: // '='
                g = Float.valueOf(kwj1.c());
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
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d.floatValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.floatValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(7, g.floatValue());
        }
        super.writeTo(kwk1);
    }
}
