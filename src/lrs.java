// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lrs extends kwm
{

    private static volatile lrs k[];
    public Float a;
    public Float b;
    public Float c;
    public Boolean d;
    public Float e;
    public Float f;
    public Float g;
    public Float h;
    public Float i;
    public Float j;

    public lrs()
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

    public static lrs[] a()
    {
        if (k == null)
        {
            synchronized (kwq.a)
            {
                if (k == null)
                {
                    k = new lrs[0];
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
            b.floatValue();
            i1 = l + (kwk.f(2) + 4);
        }
        l = i1;
        if (c != null)
        {
            c.floatValue();
            l = i1 + (kwk.f(3) + 4);
        }
        i1 = l;
        if (d != null)
        {
            d.booleanValue();
            i1 = l + (kwk.f(4) + 1);
        }
        l = i1;
        if (e != null)
        {
            e.floatValue();
            l = i1 + (kwk.f(5) + 4);
        }
        i1 = l;
        if (f != null)
        {
            f.floatValue();
            i1 = l + (kwk.f(6) + 4);
        }
        l = i1;
        if (g != null)
        {
            g.floatValue();
            l = i1 + (kwk.f(7) + 4);
        }
        i1 = l;
        if (h != null)
        {
            h.floatValue();
            i1 = l + (kwk.f(8) + 4);
        }
        l = i1;
        if (i != null)
        {
            i.floatValue();
            l = i1 + (kwk.f(9) + 4);
        }
        i1 = l;
        if (j != null)
        {
            j.floatValue();
            i1 = l + (kwk.f(10) + 4);
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

            case 21: // '\025'
                b = Float.valueOf(kwj1.c());
                break;

            case 29: // '\035'
                c = Float.valueOf(kwj1.c());
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
                break;

            case 45: // '-'
                e = Float.valueOf(kwj1.c());
                break;

            case 53: // '5'
                f = Float.valueOf(kwj1.c());
                break;

            case 61: // '='
                g = Float.valueOf(kwj1.c());
                break;

            case 69: // 'E'
                h = Float.valueOf(kwj1.c());
                break;

            case 77: // 'M'
                i = Float.valueOf(kwj1.c());
                break;

            case 85: // 'U'
                j = Float.valueOf(kwj1.c());
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
            kwk1.a(2, b.floatValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.floatValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.floatValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.floatValue());
        }
        if (g != null)
        {
            kwk1.a(7, g.floatValue());
        }
        if (h != null)
        {
            kwk1.a(8, h.floatValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.floatValue());
        }
        if (j != null)
        {
            kwk1.a(10, j.floatValue());
        }
        super.writeTo(kwk1);
    }
}
