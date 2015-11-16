// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihc extends koj
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

    public ihc()
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

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            a.booleanValue();
            k = l + (koh.f(1) + 1);
        }
        l = k;
        if (b != null)
        {
            b.booleanValue();
            l = k + (koh.f(2) + 1);
        }
        k = l;
        if (c != null)
        {
            c.booleanValue();
            k = l + (koh.f(3) + 1);
        }
        l = k;
        if (d != null)
        {
            d.booleanValue();
            l = k + (koh.f(4) + 1);
        }
        k = l;
        if (e != null)
        {
            e.booleanValue();
            k = l + (koh.f(5) + 1);
        }
        l = k;
        if (f != null)
        {
            f.booleanValue();
            l = k + (koh.f(6) + 1);
        }
        k = l;
        if (g != null)
        {
            g.booleanValue();
            k = l + (koh.f(7) + 1);
        }
        l = k;
        if (h != null)
        {
            h.booleanValue();
            l = k + (koh.f(8) + 1);
        }
        k = l;
        if (i != null)
        {
            i.booleanValue();
            k = l + (koh.f(9) + 1);
        }
        l = k;
        if (j != null)
        {
            j.booleanValue();
            l = k + (koh.f(10) + 1);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int k = kog1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(kog1, k))
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

            case 32: // ' '
                d = Boolean.valueOf(kog1.i());
                break;

            case 40: // '('
                e = Boolean.valueOf(kog1.i());
                break;

            case 48: // '0'
                f = Boolean.valueOf(kog1.i());
                break;

            case 56: // '8'
                g = Boolean.valueOf(kog1.i());
                break;

            case 64: // '@'
                h = Boolean.valueOf(kog1.i());
                break;

            case 72: // 'H'
                i = Boolean.valueOf(kog1.i());
                break;

            case 80: // 'P'
                j = Boolean.valueOf(kog1.i());
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
            koh1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            koh1.a(5, e.booleanValue());
        }
        if (f != null)
        {
            koh1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            koh1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            koh1.a(8, h.booleanValue());
        }
        if (i != null)
        {
            koh1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            koh1.a(10, j.booleanValue());
        }
        super.writeTo(koh1);
    }
}
