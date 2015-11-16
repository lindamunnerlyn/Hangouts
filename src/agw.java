// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class agw extends koj
{

    public ipw a[];
    public Integer b;

    public agw()
    {
        a = ipw.a();
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
                    ipw ipw1 = a[k];
                    j = i;
                    if (ipw1 != null)
                    {
                        j = i + koh.d(1, ipw1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(2, b.intValue());
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
                ipw aipw[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aipw = new ipw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aipw, 0, j);
                    k = j;
                }
                for (; k < aipw.length - 1; k++)
                {
                    aipw[k] = new ipw();
                    kog1.a(aipw[k]);
                    kog1.a();
                }

                aipw[k] = new ipw();
                kog1.a(aipw[k]);
                a = aipw;
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
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
                ipw ipw1 = a[i];
                if (ipw1 != null)
                {
                    koh1.b(1, ipw1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        super.writeTo(koh1);
    }
}
