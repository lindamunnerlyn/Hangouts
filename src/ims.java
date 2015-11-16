// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ims extends kwm
{

    public ink a[];
    public Integer b;
    public Boolean c;

    public ims()
    {
        a = ink.a();
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int l = i;
        if (a != null)
        {
            l = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    l = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    ink ink1 = a[j];
                    l = i;
                    if (ink1 != null)
                    {
                        l = i + kwk.d(1, ink1);
                    }
                    j++;
                    i = l;
                } while (true);
            }
        }
        int k = kwk.e(2, b.intValue()) + l;
        i = k;
        if (c != null)
        {
            c.booleanValue();
            i = k + (kwk.f(3) + 1);
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
                ink aink[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aink = new ink[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aink, 0, j);
                    k = j;
                }
                for (; k < aink.length - 1; k++)
                {
                    aink[k] = new ink();
                    kwj1.a(aink[k]);
                    kwj1.a();
                }

                aink[k] = new ink();
                kwj1.a(aink[k]);
                a = aink;
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
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
                ink ink1 = a[i];
                if (ink1 != null)
                {
                    kwk1.b(1, ink1);
                }
            }

        }
        kwk1.a(2, b.intValue());
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
