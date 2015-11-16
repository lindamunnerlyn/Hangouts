// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class idy extends kwm
{

    private static volatile idy k[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Integer i;
    public idz j;

    public idy()
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

    public static idy[] a()
    {
        if (k == null)
        {
            synchronized (kwq.a)
            {
                if (k == null)
                {
                    k = new idy[0];
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
        int i1 = super.computeSerializedSize() + kwk.b(1, b);
        int l = i1;
        if (c != null)
        {
            l = i1 + kwk.b(2, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + kwk.b(3, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + kwk.b(4, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + kwk.b(5, f);
        }
        l = i1;
        if (h != null)
        {
            l = i1 + kwk.b(6, h);
        }
        i1 = l;
        if (i != null)
        {
            i1 = l + kwk.e(7, i.intValue());
        }
        l = i1;
        if (g != null)
        {
            l = i1 + kwk.b(8, g);
        }
        i1 = l;
        if (a != null)
        {
            i1 = l + kwk.b(9, a);
        }
        l = i1;
        if (j != null)
        {
            l = i1 + kwk.d(10, j);
        }
        return l;
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
                f = kwj1.j();
                break;

            case 50: // '2'
                h = kwj1.j();
                break;

            case 56: // '8'
                i = Integer.valueOf(kwj1.f());
                break;

            case 66: // 'B'
                g = kwj1.j();
                break;

            case 74: // 'J'
                a = kwj1.j();
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new idz();
                }
                kwj1.a(j);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, b);
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
            kwk1.a(5, f);
        }
        if (h != null)
        {
            kwk1.a(6, h);
        }
        if (i != null)
        {
            kwk1.a(7, i.intValue());
        }
        if (g != null)
        {
            kwk1.a(8, g);
        }
        if (a != null)
        {
            kwk1.a(9, a);
        }
        if (j != null)
        {
            kwk1.b(10, j);
        }
        super.writeTo(kwk1);
    }
}
