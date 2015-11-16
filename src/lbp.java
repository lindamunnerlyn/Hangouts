// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbp extends koj
{

    public lbo a[];
    public Boolean b;

    public lbp()
    {
        a = lbo.a();
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    lbo lbo1 = a[k];
                    j = i;
                    if (lbo1 != null)
                    {
                        j = i + koh.d(1, lbo1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (koh.f(2) + 1);
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
                lbo albo[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                albo = new lbo[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, albo, 0, j);
                    k = j;
                }
                for (; k < albo.length - 1; k++)
                {
                    albo[k] = new lbo();
                    kog1.a(albo[k]);
                    kog1.a();
                }

                albo[k] = new lbo();
                kog1.a(albo[k]);
                a = albo;
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
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
                lbo lbo1 = a[i];
                if (lbo1 != null)
                {
                    koh1.b(1, lbo1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        super.writeTo(koh1);
    }
}
