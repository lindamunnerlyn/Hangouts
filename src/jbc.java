// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbc extends koj
{

    public jav a;
    public ivz b[];
    public Boolean c;
    public Boolean d;
    public Boolean e;

    public jbc()
    {
        a = null;
        b = ivz.a();
        c = null;
        d = null;
        e = null;
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
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ivz ivz1 = b[j];
                    int k = i;
                    if (ivz1 != null)
                    {
                        k = i + koh.d(2, ivz1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (koh.f(3) + 1);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (koh.f(4) + 1);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (koh.f(5) + 1);
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
                if (a == null)
                {
                    a = new jav();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                ivz aivz[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aivz = new ivz[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aivz, 0, j);
                    k = j;
                }
                for (; k < aivz.length - 1; k++)
                {
                    aivz[k] = new ivz();
                    kog1.a(aivz[k]);
                    kog1.a();
                }

                aivz[k] = new ivz();
                kog1.a(aivz[k]);
                b = aivz;
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
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ivz ivz1 = b[i];
                if (ivz1 != null)
                {
                    koh1.b(2, ivz1);
                }
            }

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
        super.writeTo(koh1);
    }
}
