// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class isi extends koj
{

    public ivz a[];
    public ixg responseHeader;

    public isi()
    {
        responseHeader = null;
        a = ivz.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    ivz ivz1 = a[j];
                    int k = i;
                    if (ivz1 != null)
                    {
                        k = i + koh.d(2, ivz1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
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
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                ivz aivz[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aivz = new ivz[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aivz, 0, j);
                    k = j;
                }
                for (; k < aivz.length - 1; k++)
                {
                    aivz[k] = new ivz();
                    kog1.a(aivz[k]);
                    kog1.a();
                }

                aivz[k] = new ivz();
                kog1.a(aivz[k]);
                a = aivz;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                ivz ivz1 = a[i];
                if (ivz1 != null)
                {
                    koh1.b(2, ivz1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
