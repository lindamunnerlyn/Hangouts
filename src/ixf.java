// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixf extends koj
{

    public iqw a;
    public iqt b;
    public iqu c;
    public String d;
    public Boolean e;
    public Integer f;
    public kuf g;
    public String h;
    public iqm i;

    public ixf()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + koh.d(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + koh.d(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + koh.d(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + koh.b(4, d);
        }
        j = k;
        if (e != null)
        {
            e.booleanValue();
            j = k + (koh.f(5) + 1);
        }
        k = j;
        if (f != null)
        {
            k = j + koh.f(6, f.intValue());
        }
        j = k;
        if (g != null)
        {
            j = k + koh.d(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + koh.b(8, h);
        }
        j = k;
        if (i != null)
        {
            j = k + koh.d(9, i);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int j = kog1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kog1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new iqw();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iqt();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new iqu();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 40: // '('
                e = Boolean.valueOf(kog1.i());
                break;

            case 48: // '0'
                f = Integer.valueOf(kog1.l());
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new kuf();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                h = kog1.j();
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new iqm();
                }
                kog1.a(i);
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
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e.booleanValue());
        }
        if (f != null)
        {
            koh1.c(6, f.intValue());
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (i != null)
        {
            koh1.b(9, i);
        }
        super.writeTo(koh1);
    }
}
