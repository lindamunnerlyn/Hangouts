// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lky extends kwm
{

    private static volatile lky i[];
    public Boolean a;
    public Boolean b;
    public String c;
    public lgs d;
    public String e;
    public String f;
    public String g;
    public lhc h;

    public lky()
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

    public static lky[] a()
    {
        if (i == null)
        {
            synchronized (kwq.a)
            {
                if (i == null)
                {
                    i = new lky[0];
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
            a.booleanValue();
            j = k + (kwk.f(1) + 1);
        }
        k = j;
        if (b != null)
        {
            b.booleanValue();
            k = j + (kwk.f(2) + 1);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.b(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.d(4, d);
        }
        j = k;
        if (e != null)
        {
            j = k + kwk.b(5, e);
        }
        k = j;
        if (f != null)
        {
            k = j + kwk.b(6, f);
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.b(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.d(9, h);
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
                a = Boolean.valueOf(kwj1.i());
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new lgs();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                e = kwj1.j();
                break;

            case 50: // '2'
                f = kwj1.j();
                break;

            case 58: // ':'
                g = kwj1.j();
                break;

            case 74: // 'J'
                if (h == null)
                {
                    h = new lhc();
                }
                kwj1.a(h);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
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
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.b(9, h);
        }
        super.writeTo(kwk1);
    }
}
