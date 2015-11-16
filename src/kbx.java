// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kbx extends kwm
{

    private static volatile kbx k[];
    public Float a;
    public kbp b;
    public kbp c;
    public kbp d;
    public kby e;
    public kby f;
    public kby g;
    public kbw h;
    public kbw i;
    public kbw j;

    public kbx()
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

    public static kbx[] a()
    {
        if (k == null)
        {
            synchronized (kwq.a)
            {
                if (k == null)
                {
                    k = new kbx[0];
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
                    b = new kbp();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kbp();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kbp();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new kby();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new kby();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new kby();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new kbw();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new kbw();
                }
                kwj1.a(i);
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new kbw();
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
