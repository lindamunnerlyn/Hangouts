// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kdf extends kwm
{

    public kdg a[];

    public kdf()
    {
        a = kdg.a();
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
                    kdg kdg1 = a[j];
                    k = i;
                    if (kdg1 != null)
                    {
                        k = i + kwk.d(1, kdg1);
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
                kdg akdg[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akdg = new kdg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akdg, 0, j);
                    k = j;
                }
                for (; k < akdg.length - 1; k++)
                {
                    akdg[k] = new kdg();
                    kwj1.a(akdg[k]);
                    kwj1.a();
                }

                akdg[k] = new kdg();
                kwj1.a(akdg[k]);
                a = akdg;
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
                kdg kdg1 = a[i];
                if (kdg1 != null)
                {
                    kwk1.b(1, kdg1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
