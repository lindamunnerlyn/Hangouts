// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqe extends koj
{

    public itb a;
    public ius b[];
    public byte c[];
    public Long d;
    public ixf requestHeader;

    public iqe()
    {
        requestHeader = null;
        a = null;
        b = ius.a();
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (requestHeader != null)
        {
            j = i + koh.d(1, requestHeader);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(2, c);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ius ius1 = b[j];
                    int k = i;
                    if (ius1 != null)
                    {
                        k = i + koh.d(3, ius1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d.longValue());
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(5, a);
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
                if (requestHeader == null)
                {
                    requestHeader = new ixf();
                }
                kog1.a(requestHeader);
                break;

            case 18: // '\022'
                c = kog1.k();
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                ius aius[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aius = new ius[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aius, 0, j);
                    k = j;
                }
                for (; k < aius.length - 1; k++)
                {
                    aius[k] = new ius();
                    kog1.a(aius[k]);
                    kog1.a();
                }

                aius[k] = new ius();
                kog1.a(aius[k]);
                b = aius;
                break;

            case 32: // ' '
                d = Long.valueOf(kog1.d());
                break;

            case 42: // '*'
                if (a == null)
                {
                    a = new itb();
                }
                kog1.a(a);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ius ius1 = b[i];
                if (ius1 != null)
                {
                    koh1.b(3, ius1);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d.longValue());
        }
        if (a != null)
        {
            koh1.b(5, a);
        }
        super.writeTo(koh1);
    }
}
