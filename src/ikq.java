// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikq extends koj
{

    public ikp a[];
    public Boolean b;

    public ikq()
    {
        a = ikp.a();
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
                    ikp ikp1 = a[k];
                    j = i;
                    if (ikp1 != null)
                    {
                        j = i + koh.d(1, ikp1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (koh.f(2) + 1);
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
                ikp aikp[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aikp = new ikp[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aikp, 0, j);
                    k = j;
                }
                for (; k < aikp.length - 1; k++)
                {
                    aikp[k] = new ikp();
                    kog1.a(aikp[k]);
                    kog1.a();
                }

                aikp[k] = new ikp();
                kog1.a(aikp[k]);
                a = aikp;
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
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
                ikp ikp1 = a[i];
                if (ikp1 != null)
                {
                    koh1.b(1, ikp1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        super.writeTo(koh1);
    }
}
