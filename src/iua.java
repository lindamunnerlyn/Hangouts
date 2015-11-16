// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iua extends kwm
{

    private static volatile iua n[];
    public Integer a;
    public Integer b;
    public Integer c;
    public Long d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Long h;
    public Integer i;
    public itw j;
    public itw k;
    public Integer l;
    public iub m;

    public iua()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iua[] a()
    {
        if (n == null)
        {
            synchronized (kwq.a)
            {
                if (n == null)
                {
                    n = new iua[0];
                }
            }
        }
        return n;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize() + kwk.e(19, a.intValue()) + kwk.e(20, b.intValue()) + kwk.e(21, c.intValue()) + kwk.e(22, d.longValue()) + kwk.e(23, e.intValue()) + kwk.e(24, h.longValue()) + kwk.e(25, i.intValue());
        int i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(26, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.d(27, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.e(73, l.intValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.d(74, m);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.e(108, f.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.e(109, g.intValue());
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i1 = kwj1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kwj1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 152: 
                a = Integer.valueOf(kwj1.f());
                break;

            case 160: 
                b = Integer.valueOf(kwj1.f());
                break;

            case 168: 
                c = Integer.valueOf(kwj1.f());
                break;

            case 176: 
                d = Long.valueOf(kwj1.e());
                break;

            case 184: 
                e = Integer.valueOf(kwj1.f());
                break;

            case 192: 
                h = Long.valueOf(kwj1.e());
                break;

            case 200: 
                i = Integer.valueOf(kwj1.f());
                break;

            case 210: 
                if (j == null)
                {
                    j = new itw();
                }
                kwj1.a(j);
                break;

            case 218: 
                if (k == null)
                {
                    k = new itw();
                }
                kwj1.a(k);
                break;

            case 584: 
                l = Integer.valueOf(kwj1.f());
                break;

            case 594: 
                if (m == null)
                {
                    m = new iub();
                }
                kwj1.a(m);
                break;

            case 864: 
                f = Integer.valueOf(kwj1.f());
                break;

            case 872: 
                g = Integer.valueOf(kwj1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(19, a.intValue());
        kwk1.a(20, b.intValue());
        kwk1.a(21, c.intValue());
        kwk1.b(22, d.longValue());
        kwk1.a(23, e.intValue());
        kwk1.b(24, h.longValue());
        kwk1.a(25, i.intValue());
        if (j != null)
        {
            kwk1.b(26, j);
        }
        if (k != null)
        {
            kwk1.b(27, k);
        }
        if (l != null)
        {
            kwk1.a(73, l.intValue());
        }
        if (m != null)
        {
            kwk1.b(74, m);
        }
        if (f != null)
        {
            kwk1.a(108, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(109, g.intValue());
        }
        super.writeTo(kwk1);
    }
}
