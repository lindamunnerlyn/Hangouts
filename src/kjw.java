// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kjw extends kwm
{

    private static volatile kjw j[];
    public kkk a;
    public String b;
    public String c;
    public String d;
    public String e;
    public kjb f;
    public kki g;
    public kkj h;
    public kkh i;

    public kjw()
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

    public static kjw[] a()
    {
        if (j == null)
        {
            synchronized (kwq.a)
            {
                if (j == null)
                {
                    j = new kjw[0];
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
        if (b != null)
        {
            k = l + kwk.b(1, b);
        }
        l = k;
        if (c != null)
        {
            l = k + kwk.b(2, c);
        }
        k = l;
        if (d != null)
        {
            k = l + kwk.b(3, d);
        }
        l = k;
        if (e != null)
        {
            l = k + kwk.b(4, e);
        }
        k = l;
        if (f != null)
        {
            k = l + kwk.d(5, f);
        }
        l = k;
        if (a != null)
        {
            l = k + kwk.d(6, a);
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.d(8, g);
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.d(10, h);
        }
        k = l;
        if (i != null)
        {
            k = l + kwk.d(11, i);
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

            case 10: // '\n'
                b = kwj1.j();
                break;

            case 18: // '\022'
                c = kwj1.j();
                break;

            case 26: // '\032'
                d = kwj1.j();
                break;

            case 34: // '"'
                e = kwj1.j();
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new kjb();
                }
                kwj1.a(f);
                break;

            case 50: // '2'
                if (a == null)
                {
                    a = new kkk();
                }
                kwj1.a(a);
                break;

            case 66: // 'B'
                if (g == null)
                {
                    g = new kki();
                }
                kwj1.a(g);
                break;

            case 82: // 'R'
                if (h == null)
                {
                    h = new kkj();
                }
                kwj1.a(h);
                break;

            case 90: // 'Z'
                if (i == null)
                {
                    i = new kkh();
                }
                kwj1.a(i);
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
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.b(5, f);
        }
        if (a != null)
        {
            kwk1.b(6, a);
        }
        if (g != null)
        {
            kwk1.b(8, g);
        }
        if (h != null)
        {
            kwk1.b(10, h);
        }
        if (i != null)
        {
            kwk1.b(11, i);
        }
        super.writeTo(kwk1);
    }
}
