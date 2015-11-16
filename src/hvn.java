// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvn extends kwm
{

    private static volatile hvn g[];
    public hwx a;
    public String b;
    public String c;
    public Integer d;
    public Integer e;
    public Boolean f;

    public hvn()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hvn[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new hvn[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + kwk.b(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.b(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(3, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.e(4, e.intValue());
        }
        i = j;
        if (f != null)
        {
            f.booleanValue();
            i = j + (kwk.f(5) + 1);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(6, a);
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
                b = kwj1.j();
                break;

            case 18: // '\022'
                c = kwj1.j();
                break;

            case 24: // '\030'
                d = Integer.valueOf(kwj1.f());
                break;

            case 32: // ' '
                e = Integer.valueOf(kwj1.f());
                break;

            case 40: // '('
                f = Boolean.valueOf(kwj1.i());
                break;

            case 50: // '2'
                if (a == null)
                {
                    a = new hwx();
                }
                kwj1.a(a);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b);
        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (d != null)
        {
            kwk1.a(3, d.intValue());
        }
        if (e != null)
        {
            kwk1.a(4, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(5, f.booleanValue());
        }
        if (a != null)
        {
            kwk1.b(6, a);
        }
        super.writeTo(kwk1);
    }
}
