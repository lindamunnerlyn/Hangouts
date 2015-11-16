// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eah extends kws
{

    private static volatile eah j[];
    public eaf a;
    public String b;
    public long c;
    public long d;
    public String e;
    public String f;
    public int g;
    public eag h;
    public boolean i;

    public eah()
    {
        a = null;
        b = "";
        c = 0L;
        d = 0L;
        e = "";
        f = "";
        g = 0;
        h = null;
        i = false;
        cachedSize = -1;
    }

    public static eah[] a()
    {
        if (j == null)
        {
            synchronized (kwq.a)
            {
                if (j == null)
                {
                    j = new eah[0];
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
            k = l + kwk.d(1, a);
        }
        l = k;
        if (!b.equals(""))
        {
            l = k + kwk.b(2, b);
        }
        k = l;
        if (c != 0L)
        {
            k = l + kwk.e(3, c);
        }
        l = k;
        if (d != 0L)
        {
            l = k + kwk.e(4, d);
        }
        k = l;
        if (!e.equals(""))
        {
            k = l + kwk.b(5, e);
        }
        l = k;
        if (!f.equals(""))
        {
            l = k + kwk.b(6, f);
        }
        k = l;
        if (g != 0)
        {
            k = l + kwk.e(7, g);
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.d(8, h);
        }
        k = l;
        if (i)
        {
            k = l + (kwk.f(9) + 1);
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
                if (kwj1.b(k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new eaf();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 24: // '\030'
                c = kwj1.e();
                break;

            case 32: // ' '
                d = kwj1.e();
                break;

            case 42: // '*'
                e = kwj1.j();
                break;

            case 50: // '2'
                f = kwj1.j();
                break;

            case 56: // '8'
                g = kwj1.f();
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new eag();
                }
                kwj1.a(h);
                break;

            case 72: // 'H'
                i = kwj1.i();
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
        if (!b.equals(""))
        {
            kwk1.a(2, b);
        }
        if (c != 0L)
        {
            kwk1.b(3, c);
        }
        if (d != 0L)
        {
            kwk1.b(4, d);
        }
        if (!e.equals(""))
        {
            kwk1.a(5, e);
        }
        if (!f.equals(""))
        {
            kwk1.a(6, f);
        }
        if (g != 0)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        if (i)
        {
            kwk1.a(9, i);
        }
        super.writeTo(kwk1);
    }
}
