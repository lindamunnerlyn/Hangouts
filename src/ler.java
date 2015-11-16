// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ler extends kwm
{

    private static volatile ler g[];
    public String a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public les e;
    public leu f;

    public ler()
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

    public static ler[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new ler[0];
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (kwk.f(8) + 1);
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (kwk.f(10) + 1);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(12) + 1);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(13, e);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.d(101, f);
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

            case 64: // '@'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 80: // 'P'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 96: // '`'
                d = Boolean.valueOf(kwj1.i());
                break;

            case 106: // 'j'
                if (e == null)
                {
                    e = new les();
                }
                kwj1.a(e);
                break;

            case 810: 
                if (f == null)
                {
                    f = new leu();
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
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(8, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(10, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(12, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.b(13, e);
        }
        if (f != null)
        {
            kwk1.b(101, f);
        }
        super.writeTo(kwk1);
    }
}
