// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipu extends kwm
{

    public ipt a[];
    public Boolean b;

    public ipu()
    {
        a = ipt.a();
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
                    ipt ipt1 = a[k];
                    j = i;
                    if (ipt1 != null)
                    {
                        j = i + kwk.d(1, ipt1);
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
            i = j + (kwk.f(2) + 1);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = kwx.a(kwj1, 10);
                ipt aipt[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aipt = new ipt[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aipt, 0, j);
                    k = j;
                }
                for (; k < aipt.length - 1; k++)
                {
                    aipt[k] = new ipt();
                    kwj1.a(aipt[k]);
                    kwj1.a();
                }

                aipt[k] = new ipt();
                kwj1.a(aipt[k]);
                a = aipt;
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                ipt ipt1 = a[i];
                if (ipt1 != null)
                {
                    kwk1.b(1, ipt1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
