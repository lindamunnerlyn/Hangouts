// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwx extends koj
{

    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;

    public hwx()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            a.booleanValue();
            l = i1 + (koh.f(1) + 1);
        }
        i1 = l;
        if (b != null)
        {
            b.booleanValue();
            i1 = l + (koh.f(2) + 1);
        }
        l = i1;
        if (c != null)
        {
            c.booleanValue();
            l = i1 + (koh.f(3) + 1);
        }
        i1 = l;
        if (d != null)
        {
            d.booleanValue();
            i1 = l + (koh.f(5) + 1);
        }
        l = i1;
        if (e != null)
        {
            e.booleanValue();
            l = i1 + (koh.f(6) + 1);
        }
        i1 = l;
        if (f != null)
        {
            f.booleanValue();
            i1 = l + (koh.f(7) + 1);
        }
        l = i1;
        if (g != null)
        {
            g.booleanValue();
            l = i1 + (koh.f(8) + 1);
        }
        i1 = l;
        if (h != null)
        {
            h.booleanValue();
            i1 = l + (koh.f(9) + 1);
        }
        l = i1;
        if (i != null)
        {
            i.booleanValue();
            l = i1 + (koh.f(10) + 1);
        }
        i1 = l;
        if (j != null)
        {
            j.booleanValue();
            i1 = l + (koh.f(11) + 1);
        }
        l = i1;
        if (k != null)
        {
            k.booleanValue();
            l = i1 + (koh.f(12) + 1);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int l = kog1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kog1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = Boolean.valueOf(kog1.i());
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kog1.i());
                break;

            case 40: // '('
                d = Boolean.valueOf(kog1.i());
                break;

            case 48: // '0'
                e = Boolean.valueOf(kog1.i());
                break;

            case 56: // '8'
                f = Boolean.valueOf(kog1.i());
                break;

            case 64: // '@'
                g = Boolean.valueOf(kog1.i());
                break;

            case 72: // 'H'
                h = Boolean.valueOf(kog1.i());
                break;

            case 80: // 'P'
                i = Boolean.valueOf(kog1.i());
                break;

            case 88: // 'X'
                j = Boolean.valueOf(kog1.i());
                break;

            case 96: // '`'
                k = Boolean.valueOf(kog1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(5, d.booleanValue());
        }
        if (e != null)
        {
            koh1.a(6, e.booleanValue());
        }
        if (f != null)
        {
            koh1.a(7, f.booleanValue());
        }
        if (g != null)
        {
            koh1.a(8, g.booleanValue());
        }
        if (h != null)
        {
            koh1.a(9, h.booleanValue());
        }
        if (i != null)
        {
            koh1.a(10, i.booleanValue());
        }
        if (j != null)
        {
            koh1.a(11, j.booleanValue());
        }
        if (k != null)
        {
            koh1.a(12, k.booleanValue());
        }
        super.writeTo(koh1);
    }
}
