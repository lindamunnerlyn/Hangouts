// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jwo extends koj
{

    private static volatile jwo p[];
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Float e;
    public Float f;
    public Float g;
    public Float h;
    public Float i;
    public Float j;
    public Float k;
    public Integer l;
    public Float m;
    public Float n;
    public Float o;

    public jwo()
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
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jwo[] a()
    {
        if (p == null)
        {
            synchronized (kon.a)
            {
                if (p == null)
                {
                    p = new jwo[0];
                }
            }
        }
        return p;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + koh.e(1, a.intValue());
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.e(2, b.intValue());
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.e(3, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.e(4, d.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            e.floatValue();
            i1 = j1 + (koh.f(5) + 4);
        }
        j1 = i1;
        if (f != null)
        {
            f.floatValue();
            j1 = i1 + (koh.f(6) + 4);
        }
        i1 = j1;
        if (g != null)
        {
            g.floatValue();
            i1 = j1 + (koh.f(7) + 4);
        }
        j1 = i1;
        if (h != null)
        {
            h.floatValue();
            j1 = i1 + (koh.f(8) + 4);
        }
        i1 = j1;
        if (i != null)
        {
            i.floatValue();
            i1 = j1 + (koh.f(9) + 4);
        }
        j1 = i1;
        if (j != null)
        {
            j.floatValue();
            j1 = i1 + (koh.f(10) + 4);
        }
        i1 = j1;
        if (k != null)
        {
            k.floatValue();
            i1 = j1 + (koh.f(11) + 4);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.e(12, l.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            m.floatValue();
            i1 = j1 + (koh.f(13) + 4);
        }
        j1 = i1;
        if (n != null)
        {
            n.floatValue();
            j1 = i1 + (koh.f(14) + 4);
        }
        i1 = j1;
        if (o != null)
        {
            o.floatValue();
            i1 = j1 + (koh.f(15) + 4);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i1 = kog1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kog1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = Integer.valueOf(kog1.f());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kog1.f());
                break;

            case 45: // '-'
                e = Float.valueOf(kog1.c());
                break;

            case 53: // '5'
                f = Float.valueOf(kog1.c());
                break;

            case 61: // '='
                g = Float.valueOf(kog1.c());
                break;

            case 69: // 'E'
                h = Float.valueOf(kog1.c());
                break;

            case 77: // 'M'
                i = Float.valueOf(kog1.c());
                break;

            case 85: // 'U'
                j = Float.valueOf(kog1.c());
                break;

            case 93: // ']'
                k = Float.valueOf(kog1.c());
                break;

            case 96: // '`'
                l = Integer.valueOf(kog1.f());
                break;

            case 109: // 'm'
                m = Float.valueOf(kog1.c());
                break;

            case 117: // 'u'
                n = Float.valueOf(kog1.c());
                break;

            case 125: // '}'
                o = Float.valueOf(kog1.c());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.a(5, e.floatValue());
        }
        if (f != null)
        {
            koh1.a(6, f.floatValue());
        }
        if (g != null)
        {
            koh1.a(7, g.floatValue());
        }
        if (h != null)
        {
            koh1.a(8, h.floatValue());
        }
        if (i != null)
        {
            koh1.a(9, i.floatValue());
        }
        if (j != null)
        {
            koh1.a(10, j.floatValue());
        }
        if (k != null)
        {
            koh1.a(11, k.floatValue());
        }
        if (l != null)
        {
            koh1.a(12, l.intValue());
        }
        if (m != null)
        {
            koh1.a(13, m.floatValue());
        }
        if (n != null)
        {
            koh1.a(14, n.floatValue());
        }
        if (o != null)
        {
            koh1.a(15, o.floatValue());
        }
        super.writeTo(koh1);
    }
}
