// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iho extends koj
{

    public iig a[];
    public Integer b;
    public Boolean c;

    public iho()
    {
        a = iig.a();
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int l = i;
        if (a != null)
        {
            l = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    l = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    iig iig1 = a[j];
                    l = i;
                    if (iig1 != null)
                    {
                        l = i + koh.d(1, iig1);
                    }
                    j++;
                    i = l;
                } while (true);
            }
        }
        int k = koh.e(2, b.intValue()) + l;
        i = k;
        if (c != null)
        {
            c.booleanValue();
            i = k + (koh.f(3) + 1);
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
                int k = kou.b(kog1, 10);
                iig aiig[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiig = new iig[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiig, 0, j);
                    k = j;
                }
                for (; k < aiig.length - 1; k++)
                {
                    aiig[k] = new iig();
                    kog1.a(aiig[k]);
                    kog1.a();
                }

                aiig[k] = new iig();
                kog1.a(aiig[k]);
                a = aiig;
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kog1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iig iig1 = a[i];
                if (iig1 != null)
                {
                    koh1.b(1, iig1);
                }
            }

        }
        koh1.a(2, b.intValue());
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        super.writeTo(koh1);
    }
}
