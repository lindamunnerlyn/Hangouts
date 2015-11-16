// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iud extends koj
{

    public iss a[];
    public Boolean b;
    public iuf c;
    public iuf d;
    public iuf e;
    public iuf f;
    public iuf g;
    public iuf h;
    public ixg responseHeader;

    public iud()
    {
        responseHeader = null;
        a = iss.a();
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    iss iss1 = a[j];
                    int k = i;
                    if (iss1 != null)
                    {
                        k = i + koh.d(2, iss1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (koh.f(3) + 1);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.d(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + koh.d(7, g);
        }
        j = i;
        if (h != null)
        {
            j = i + koh.d(8, h);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(9, c);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                iss aiss[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiss = new iss[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiss, 0, j);
                    k = j;
                }
                for (; k < aiss.length - 1; k++)
                {
                    aiss[k] = new iss();
                    kog1.a(aiss[k]);
                    kog1.a();
                }

                aiss[k] = new iss();
                kog1.a(aiss[k]);
                a = aiss;
                break;

            case 24: // '\030'
                b = Boolean.valueOf(kog1.i());
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new iuf();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new iuf();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new iuf();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new iuf();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new iuf();
                }
                kog1.a(h);
                break;

            case 74: // 'J'
                if (c == null)
                {
                    c = new iuf();
                }
                kog1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iss iss1 = a[i];
                if (iss1 != null)
                {
                    koh1.b(2, iss1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(3, b.booleanValue());
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
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
        if (c != null)
        {
            koh1.b(9, c);
        }
        super.writeTo(koh1);
    }
}
