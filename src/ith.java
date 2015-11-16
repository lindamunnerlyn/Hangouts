// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ith extends koj
{

    public itj a[];

    public ith()
    {
        a = itj.a();
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
                    itj itj1 = a[j];
                    k = i;
                    if (itj1 != null)
                    {
                        k = i + koh.d(1, itj1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
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
                itj aitj[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aitj = new itj[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aitj, 0, j);
                    k = j;
                }
                for (; k < aitj.length - 1; k++)
                {
                    aitj[k] = new itj();
                    kog1.a(aitj[k]);
                    kog1.a();
                }

                aitj[k] = new itj();
                kog1.a(aitj[k]);
                a = aitj;
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
                itj itj1 = a[i];
                if (itj1 != null)
                {
                    koh1.b(1, itj1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
