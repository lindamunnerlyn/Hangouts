// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwe extends kwm
{

    private static volatile hwe g[];
    public hwx a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public hwe()
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

    public static hwe[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new hwe[0];
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
            i = j + kwk.d(1, a);
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
        if (e != null)
        {
            j = i + kwk.b(4, e);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(5, d);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.b(6, f);
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
                if (a == null)
                {
                    a = new hwx();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                e = kwj1.j();
                break;

            case 42: // '*'
                d = kwj1.j();
                break;

            case 50: // '2'
                f = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (d != null)
        {
            kwk1.a(5, d);
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        super.writeTo(kwk1);
    }
}
