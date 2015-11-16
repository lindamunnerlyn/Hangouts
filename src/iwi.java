// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwi extends kwm
{

    private static volatile iwi g[];
    public Integer a;
    public Integer b;
    public Integer c;
    public String d;
    public byte e[];
    public Integer f;

    public iwi()
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

    public static iwi[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new iwi[0];
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
        if (a != null)
        {
            i = j + kwk.f(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.f(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.f(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.b(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.f(6, f.intValue());
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

            case 8: // '\b'
                a = Integer.valueOf(kwj1.l());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.l());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.l());
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                e = kwj1.k();
                break;

            case 48: // '0'
                f = Integer.valueOf(kwj1.l());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.c(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.c(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.c(3, c.intValue());
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
            kwk1.c(6, f.intValue());
        }
        super.writeTo(kwk1);
    }
}
