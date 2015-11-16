// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icc extends koj
{

    public icg a;
    public icm b;
    public icl c;
    public icj d;
    public ice e;
    public icd f;
    public icj g;
    public ici h;
    public ick i;

    public icc()
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
            k = j + koh.d(4, d);
        }
        j = k;
        if (e != null)
        {
            j = k + koh.d(5, e);
        }
        k = j;
        if (g != null)
        {
            k = j + koh.d(6, g);
        }
        j = k;
        if (h != null)
        {
            j = k + koh.d(7, h);
        }
        k = j;
        if (i != null)
        {
            k = j + koh.d(9, i);
        }
        j = k;
        if (f != null)
        {
            j = k + koh.d(10, f);
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
                    a = new icg();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new icm();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new icl();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new icj();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new ice();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new icj();
                }
                kog1.a(g);
                break;

            case 58: // ':'
                if (h == null)
                {
                    h = new ici();
                }
                kog1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new ick();
                }
                kog1.a(i);
                break;

            case 82: // 'R'
                if (f == null)
                {
                    f = new icd();
                }
                kog1.a(f);
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
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (g != null)
        {
            koh1.b(6, g);
        }
        if (h != null)
        {
            koh1.b(7, h);
        }
        if (i != null)
        {
            koh1.b(9, i);
        }
        if (f != null)
        {
            koh1.b(10, f);
        }
        super.writeTo(koh1);
    }
}
