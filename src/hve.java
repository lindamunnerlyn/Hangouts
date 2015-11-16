// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hve extends koj
{

    public hwd a;
    public hwf b;
    public hvi c;
    public hww d;
    public hww e;
    public String f;
    public Boolean g;
    public hvw h;
    public hwp i;
    public hwn j;

    public hve()
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
        if (b != null)
        {
            k = l + koh.d(1, b);
        }
        l = k;
        if (c != null)
        {
            l = k + koh.d(2, c);
        }
        k = l;
        if (d != null)
        {
            k = l + koh.d(3, d);
        }
        l = k;
        if (e != null)
        {
            l = k + koh.d(4, e);
        }
        k = l;
        if (f != null)
        {
            k = l + koh.b(5, f);
        }
        l = k;
        if (h != null)
        {
            l = k + koh.d(6, h);
        }
        k = l;
        if (i != null)
        {
            k = l + koh.d(7, i);
        }
        l = k;
        if (j != null)
        {
            l = k + koh.d(8, j);
        }
        k = l;
        if (a != null)
        {
            k = l + koh.d(9, a);
        }
        l = k;
        if (g != null)
        {
            g.booleanValue();
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

            case 10: // '\n'
                if (b == null)
                {
                    b = new hwf();
                }
                kog1.a(b);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new hvi();
                }
                kog1.a(c);
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new hww();
                }
                kog1.a(d);
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new hww();
                }
                kog1.a(e);
                break;

            case 42: // '*'
                f = kog1.j();
                break;

            case 50: // '2'
                if (h == null)
                {
                    h = new hvw();
                }
                kog1.a(h);
                break;

            case 58: // ':'
                if (i == null)
                {
                    i = new hwp();
                }
                kog1.a(i);
                break;

            case 66: // 'B'
                if (j == null)
                {
                    j = new hwn();
                }
                kog1.a(j);
                break;

            case 74: // 'J'
                if (a == null)
                {
                    a = new hwd();
                }
                kog1.a(a);
                break;

            case 80: // 'P'
                g = Boolean.valueOf(kog1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.b(1, b);
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (d != null)
        {
            koh1.b(3, d);
        }
        if (e != null)
        {
            koh1.b(4, e);
        }
        if (f != null)
        {
            koh1.a(5, f);
        }
        if (h != null)
        {
            koh1.b(6, h);
        }
        if (i != null)
        {
            koh1.b(7, i);
        }
        if (j != null)
        {
            koh1.b(8, j);
        }
        if (a != null)
        {
            koh1.b(9, a);
        }
        if (g != null)
        {
            koh1.a(10, g.booleanValue());
        }
        super.writeTo(koh1);
    }
}
