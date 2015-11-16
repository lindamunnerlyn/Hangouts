// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipi extends kwm
{

    private static volatile ipi k[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Integer i;
    public String j;

    public ipi()
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
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ipi[] a()
    {
        if (k == null)
        {
            synchronized (kwq.a)
            {
                if (k == null)
                {
                    k = new ipi[0];
                }
            }
        }
        return k;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + kwk.b(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + kwk.b(2, b);
        }
        l = i1;
        if (c != null)
        {
            l = i1 + kwk.b(3, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + kwk.b(4, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + kwk.b(5, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + kwk.b(6, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + kwk.b(7, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + kwk.b(8, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + kwk.e(9, i.intValue());
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + kwk.b(10, j);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int l = kwj1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kwj1, l))
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

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
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
                h = kwj1.j();
                break;

            case 72: // 'H'
                i = Integer.valueOf(kwj1.f());
                break;

            case 82: // 'R'
                j = kwj1.j();
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
            kwk1.a(2, b);
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
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(10, j);
        }
        super.writeTo(kwk1);
    }
}
