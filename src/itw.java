// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itw extends koj
{

    public itk a[];
    public byte b[];
    public ixg responseHeader;

    public itw()
    {
        responseHeader = null;
        a = itk.a();
        b = null;
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
                    itk itk1 = a[j];
                    int k = i;
                    if (itk1 != null)
                    {
                        k = i + koh.d(2, itk1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(3, b);
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
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                itk aitk[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aitk = new itk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aitk, 0, j);
                    k = j;
                }
                for (; k < aitk.length - 1; k++)
                {
                    aitk[k] = new itk();
                    kog1.a(aitk[k]);
                    kog1.a();
                }

                aitk[k] = new itk();
                kog1.a(aitk[k]);
                a = aitk;
                break;

            case 26: // '\032'
                b = kog1.k();
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
                itk itk1 = a[i];
                if (itk1 != null)
                {
                    koh1.b(2, itk1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(3, b);
        }
        super.writeTo(koh1);
    }
}
