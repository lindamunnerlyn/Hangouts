// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krz extends kwm
{

    public krw a[];

    public krz()
    {
        a = krw.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    krw krw1 = a[j];
                    k = i;
                    if (krw1 != null)
                    {
                        k = i + kwk.d(2, krw1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
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

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                krw akrw[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akrw = new krw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akrw, 0, j);
                    k = j;
                }
                for (; k < akrw.length - 1; k++)
                {
                    akrw[k] = new krw();
                    kwj1.a(akrw[k]);
                    kwj1.a();
                }

                akrw[k] = new krw();
                kwj1.a(akrw[k]);
                a = akrw;
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
                krw krw1 = a[i];
                if (krw1 != null)
                {
                    kwk1.b(2, krw1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
