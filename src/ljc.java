// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljc extends kwm
{

    private static volatile ljc j[];
    public Float a;
    public Float b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Boolean i;

    public ljc()
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

    public static ljc[] a()
    {
        if (j == null)
        {
            synchronized (kwq.a)
            {
                if (j == null)
                {
                    j = new ljc[0];
                }
            }
        }
        return j;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            a.floatValue();
            k = l + (kwk.f(1) + 4);
        }
        l = k;
        if (b != null)
        {
            b.floatValue();
            l = k + (kwk.f(2) + 4);
        }
        k = l;
        if (c != null)
        {
            k = l + kwk.b(3, c);
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
            l = k + kwk.b(7, f);
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
            i.booleanValue();
            k = l + (kwk.f(10) + 1);
        }
        return k;
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

            case 13: // '\r'
                a = Float.valueOf(kwj1.c());
                break;

            case 21: // '\025'
                b = Float.valueOf(kwj1.c());
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                e = kwj1.j();
                break;

            case 58: // ':'
                f = kwj1.j();
                break;

            case 66: // 'B'
                g = kwj1.j();
                break;

            case 74: // 'J'
                h = kwj1.j();
                break;

            case 80: // 'P'
                i = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.floatValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.floatValue());
        }
        if (c != null)
        {
            kwk1.a(3, c);
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
            kwk1.a(7, f);
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
            kwk1.a(10, i.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
