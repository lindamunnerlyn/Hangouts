// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class imq extends kwm
{

    private static volatile imq i[];
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public String e;
    public String f;
    public String g;
    public ijm h;

    public imq()
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

    public static imq[] a()
    {
        if (i == null)
        {
            synchronized (kwq.a)
            {
                if (i == null)
                {
                    i = new imq[0];
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
        int j = super.computeSerializedSize();
        int k = kwk.b(1, a);
        int l = kwk.b(2, b);
        c.booleanValue();
        int i1 = kwk.f(3);
        d.booleanValue();
        k = j + k + l + (i1 + 1) + (kwk.f(4) + 1);
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
            k = j + kwk.d(8, h);
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

            case 10: // '\n'
                a = kwj1.j();
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
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

            case 66: // 'B'
                if (h == null)
                {
                    h = new ijm();
                }
                kwj1.a(h);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a);
        kwk1.a(2, b);
        kwk1.a(3, c.booleanValue());
        kwk1.a(4, d.booleanValue());
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
            kwk1.b(8, h);
        }
        super.writeTo(kwk1);
    }
}
