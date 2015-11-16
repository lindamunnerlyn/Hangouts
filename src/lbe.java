// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbe extends koj
{

    public lbf a[];
    public Boolean b;
    public Boolean c;
    public Integer d;

    public lbe()
    {
        a = lbf.a();
        b = null;
        c = null;
        d = null;
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
                    lbf lbf1 = a[k];
                    j = i;
                    if (lbf1 != null)
                    {
                        j = i + koh.d(1, lbf1);
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
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (koh.f(3) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(4, d.intValue());
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
                lbf albf[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                albf = new lbf[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, albf, 0, j);
                    k = j;
                }
                for (; k < albf.length - 1; k++)
                {
                    albf[k] = new lbf();
                    kog1.a(albf[k]);
                    kog1.a();
                }

                albf[k] = new lbf();
                kog1.a(albf[k]);
                a = albf;
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kog1.i());
                break;

            case 32: // ' '
                d = Integer.valueOf(kog1.f());
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
                lbf lbf1 = a[i];
                if (lbf1 != null)
                {
                    koh1.b(1, lbf1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        super.writeTo(koh1);
    }
}
