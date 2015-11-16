// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljs extends kwm
{

    public ljt a[];
    public Boolean b;
    public Boolean c;
    public Integer d;

    public ljs()
    {
        a = ljt.a();
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
                    ljt ljt1 = a[k];
                    j = i;
                    if (ljt1 != null)
                    {
                        j = i + kwk.d(1, ljt1);
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
            i = j + (kwk.f(2) + 1);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(3) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(4, d.intValue());
        }
        return i;
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
                ljt aljt[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aljt = new ljt[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aljt, 0, j);
                    k = j;
                }
                for (; k < aljt.length - 1; k++)
                {
                    aljt[k] = new ljt();
                    kwj1.a(aljt[k]);
                    kwj1.a();
                }

                aljt[k] = new ljt();
                kwj1.a(aljt[k]);
                a = aljt;
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.f());
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
                ljt ljt1 = a[i];
                if (ljt1 != null)
                {
                    kwk1.b(1, ljt1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
