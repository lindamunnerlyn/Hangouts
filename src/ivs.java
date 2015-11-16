// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivs extends kwm
{

    private static volatile ivs i[];
    public Integer a;
    public String b;
    public Integer c;
    public String d;
    public Integer e;
    public Boolean f;
    public Boolean g;
    public Boolean h;

    public ivs()
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

    public static ivs[] a()
    {
        if (i == null)
        {
            synchronized (kwq.a)
            {
                if (i == null)
                {
                    i = new ivs[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
            k = j + kwk.b(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.e(3, c.intValue());
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.b(4, d);
        }
        j = k;
        if (e != null)
        {
            j = k + kwk.e(5, e.intValue());
        }
        k = j;
        if (f != null)
        {
            f.booleanValue();
            k = j + (kwk.f(6) + 1);
        }
        j = k;
        if (g != null)
        {
            g.booleanValue();
            j = k + (kwk.f(7) + 1);
        }
        k = j;
        if (h != null)
        {
            h.booleanValue();
            k = j + (kwk.f(8) + 1);
        }
        return k;
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

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 40: // '('
                e = Integer.valueOf(kwj1.f());
                break;

            case 48: // '0'
                f = Boolean.valueOf(kwj1.i());
                break;

            case 56: // '8'
                g = Boolean.valueOf(kwj1.i());
                break;

            case 64: // '@'
                h = Boolean.valueOf(kwj1.i());
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
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            kwk1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            kwk1.a(8, h.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
