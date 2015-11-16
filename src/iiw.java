// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iiw extends kwm
{

    public iiy a[];
    public iiy b;

    public iiw()
    {
        a = iiy.a();
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
                    iiy iiy1 = a[k];
                    j = i;
                    if (iiy1 != null)
                    {
                        j = i + kwk.d(1, iiy1);
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
                iiy aiiy[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiiy = new iiy[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiiy, 0, j);
                    k = j;
                }
                for (; k < aiiy.length - 1; k++)
                {
                    aiiy[k] = new iiy();
                    kwj1.a(aiiy[k]);
                    kwj1.a();
                }

                aiiy[k] = new iiy();
                kwj1.a(aiiy[k]);
                a = aiiy;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iiy();
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
                iiy iiy1 = a[i];
                if (iiy1 != null)
                {
                    kwk1.b(1, iiy1);
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
