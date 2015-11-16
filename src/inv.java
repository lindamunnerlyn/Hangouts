// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class inv extends koj
{

    private static volatile inv n[];
    public Integer a;
    public Integer b;
    public Integer c;
    public Long d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Long h;
    public Integer i;
    public inr j;
    public inr k;
    public Integer l;
    public inw m;

    public inv()
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

    public static inv[] a()
    {
        if (n == null)
        {
            synchronized (kon.a)
            {
                if (n == null)
                {
                    n = new inv[0];
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
        int j1 = super.computeSerializedSize() + koh.e(19, a.intValue()) + koh.e(20, b.intValue()) + koh.e(21, c.intValue()) + koh.e(22, d.longValue()) + koh.e(23, e.intValue()) + koh.e(24, h.longValue()) + koh.e(25, i.intValue());
        int i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(26, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.d(27, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.e(73, l.intValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.d(74, m);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.e(108, f.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.e(109, g.intValue());
        }
        return j1;
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

            case 152: 
                a = Integer.valueOf(kog1.f());
                break;

            case 160: 
                b = Integer.valueOf(kog1.f());
                break;

            case 168: 
                c = Integer.valueOf(kog1.f());
                break;

            case 176: 
                d = Long.valueOf(kog1.e());
                break;

            case 184: 
                e = Integer.valueOf(kog1.f());
                break;

            case 192: 
                h = Long.valueOf(kog1.e());
                break;

            case 200: 
                i = Integer.valueOf(kog1.f());
                break;

            case 210: 
                if (j == null)
                {
                    j = new inr();
                }
                kog1.a(j);
                break;

            case 218: 
                if (k == null)
                {
                    k = new inr();
                }
                kog1.a(k);
                break;

            case 584: 
                l = Integer.valueOf(kog1.f());
                break;

            case 594: 
                if (m == null)
                {
                    m = new inw();
                }
                kog1.a(m);
                break;

            case 864: 
                f = Integer.valueOf(kog1.f());
                break;

            case 872: 
                g = Integer.valueOf(kog1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(19, a.intValue());
        koh1.a(20, b.intValue());
        koh1.a(21, c.intValue());
        koh1.b(22, d.longValue());
        koh1.a(23, e.intValue());
        koh1.b(24, h.longValue());
        koh1.a(25, i.intValue());
        if (j != null)
        {
            koh1.b(26, j);
        }
        if (k != null)
        {
            koh1.b(27, k);
        }
        if (l != null)
        {
            koh1.a(73, l.intValue());
        }
        if (m != null)
        {
            koh1.b(74, m);
        }
        if (f != null)
        {
            koh1.a(108, f.intValue());
        }
        if (g != null)
        {
            koh1.a(109, g.intValue());
        }
        super.writeTo(koh1);
    }
}
