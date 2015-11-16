// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kgz extends kwm
{

    public kgy a[];

    public kgz()
    {
        a = kgy.a();
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
                    kgy kgy1 = a[j];
                    k = i;
                    if (kgy1 != null)
                    {
                        k = i + kwk.d(1, kgy1);
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

            case 10: // '\n'
                int k = kwx.a(kwj1, 10);
                kgy akgy[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akgy = new kgy[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akgy, 0, j);
                    k = j;
                }
                for (; k < akgy.length - 1; k++)
                {
                    akgy[k] = new kgy();
                    kwj1.a(akgy[k]);
                    kwj1.a();
                }

                akgy[k] = new kgy();
                kwj1.a(akgy[k]);
                a = akgy;
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
                kgy kgy1 = a[i];
                if (kgy1 != null)
                {
                    kwk1.b(1, kgy1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
