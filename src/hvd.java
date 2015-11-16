// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvd extends koj
{

    public hxj a;
    public hvu b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public hvf f;
    public hwx g;
    public hxg h;
    public String i;
    public hwv j;
    public Boolean k;

    public hvd()
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
            l = i1 + koh.d(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + koh.d(2, b);
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
            i1 = l + (koh.f(4) + 1);
        }
        l = i1;
        if (e != null)
        {
            e.booleanValue();
            l = i1 + (koh.f(5) + 1);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + koh.d(6, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + koh.d(7, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + koh.d(8, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + koh.b(9, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + koh.d(10, j);
        }
        l = i1;
        if (k != null)
        {
            k.booleanValue();
            l = i1 + (koh.f(11) + 1);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new hxj();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new hvu();
                }
                kog1.a(b);
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

            case 50: // '2'
                if (f == null)
                {
                    f = new hvf();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new hwx();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new hxg();
                }
                kog1.a(h);
                break;

            case 74: // 'J'
                i = kog1.j();
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new hwv();
                }
                kog1.a(j);
                break;

            case 88: // 'X'
                k = Boolean.valueOf(kog1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.b(2, b);
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
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i);
        }
        if (j != null)
        {
            koh1.b(10, j);
        }
        if (k != null)
        {
            koh1.a(11, k.booleanValue());
        }
        super.writeTo(koh1);
    }
}
