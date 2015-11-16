// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iij extends kwm
{

    public iil a[];
    public iil b;

    public iij()
    {
        a = iil.a();
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
                    iil iil1 = a[k];
                    j = i;
                    if (iil1 != null)
                    {
                        j = i + kwk.d(1, iil1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
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
                iil aiil[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiil = new iil[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiil, 0, j);
                    k = j;
                }
                for (; k < aiil.length - 1; k++)
                {
                    aiil[k] = new iil();
                    kwj1.a(aiil[k]);
                    kwj1.a();
                }

                aiil[k] = new iil();
                kwj1.a(aiil[k]);
                a = aiil;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iil();
                }
                kwj1.a(b);
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
                iil iil1 = a[i];
                if (iil1 != null)
                {
                    kwk1.b(1, iil1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        super.writeTo(kwk1);
    }
}
