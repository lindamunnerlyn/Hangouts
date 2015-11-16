// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kem extends koj
{

    public kcr a[];
    public String b;

    public kem()
    {
        a = kcr.a();
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
                    kcr kcr1 = a[k];
                    j = i;
                    if (kcr1 != null)
                    {
                        j = i + koh.d(1, kcr1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
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
                kcr akcr[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akcr = new kcr[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akcr, 0, j);
                    k = j;
                }
                for (; k < akcr.length - 1; k++)
                {
                    akcr[k] = new kcr();
                    kog1.a(akcr[k]);
                    kog1.a();
                }

                akcr[k] = new kcr();
                kog1.a(akcr[k]);
                a = akcr;
                break;

            case 18: // '\022'
                b = kog1.j();
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
                kcr kcr1 = a[i];
                if (kcr1 != null)
                {
                    koh1.b(1, kcr1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        super.writeTo(koh1);
    }
}
