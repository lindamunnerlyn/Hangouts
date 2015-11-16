// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kbu extends kwm
{

    private static volatile kbu k[];
    public Float a;
    public kbr b;
    public kbr c;
    public kbr d;
    public kbv e;
    public kbv f;
    public kbv g;
    public kbt h;
    public kbt i;
    public kbt j;

    public kbu()
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

    public static kbu[] a()
    {
        if (k == null)
        {
            synchronized (kwq.a)
            {
                if (k == null)
                {
                    k = new kbu[0];
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
            a.floatValue();
            l = i1 + (kwk.f(1) + 4);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + kwk.d(2, b);
        }
        l = i1;
        if (c != null)
        {
            l = i1 + kwk.d(3, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + kwk.d(4, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + kwk.d(5, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + kwk.d(6, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + kwk.d(7, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + kwk.d(8, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + kwk.d(9, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + kwk.d(10, j);
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

            case 13: // '\r'
                a = Float.valueOf(kwj1.c());
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kbr();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kbr();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kbr();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new kbv();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new kbv();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new kbv();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new kbt();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new kbt();
                }
                kwj1.a(i);
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new kbt();
                }
                kwj1.a(j);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.floatValue());
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        if (i != null)
        {
            kwk1.b(9, i);
        }
        if (j != null)
        {
            kwk1.b(10, j);
        }
        super.writeTo(kwk1);
    }
}
