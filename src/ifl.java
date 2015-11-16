// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifl extends kwm
{

    private static volatile ifl f[];
    public Double a;
    public Double b;
    public String c;
    public String d;
    public String e;

    public ifl()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ifl[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new ifl[0];
                }
            }
        }
        return f;
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
            a.doubleValue();
            i = j + (kwk.f(1) + 8);
        }
        j = i;
        if (b != null)
        {
            b.doubleValue();
            j = i + (kwk.f(2) + 8);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(3, c);
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

            case 9: // '\t'
                a = Double.valueOf(kwj1.b());
                break;

            case 17: // '\021'
                b = Double.valueOf(kwj1.b());
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
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.doubleValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.doubleValue());
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
        super.writeTo(kwk1);
    }
}
