// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvm extends koj
{

    public hwc a;
    public hwc b;
    public hvl c[];
    public Boolean d;

    public hvm()
    {
        a = null;
        b = null;
        c = hvl.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    hvl hvl1 = c[j];
                    int k = i;
                    if (hvl1 != null)
                    {
                        k = i + koh.d(2, hvl1);
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
            i = j + koh.d(3, b);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (koh.f(4) + 1);
        }
        return j;
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
                if (a == null)
                {
                    a = new hwc();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                hvl ahvl[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ahvl = new hvl[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ahvl, 0, j);
                    k = j;
                }
                for (; k < ahvl.length - 1; k++)
                {
                    ahvl[k] = new hvl();
                    kog1.a(ahvl[k]);
                    kog1.a();
                }

                ahvl[k] = new hvl();
                kog1.a(ahvl[k]);
                c = ahvl;
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new hwc();
                }
                kog1.a(b);
                break;

            case 32: // ' '
                d = Boolean.valueOf(kog1.i());
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
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                hvl hvl1 = c[i];
                if (hvl1 != null)
                {
                    koh1.b(2, hvl1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        super.writeTo(koh1);
    }
}
