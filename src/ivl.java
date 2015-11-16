// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivl extends kwm
{

    public ivm a[];
    public Long b;

    public ivl()
    {
        a = ivm.a();
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
                    ivm ivm1 = a[k];
                    j = i;
                    if (ivm1 != null)
                    {
                        j = i + kwk.d(1, ivm1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.longValue());
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
                ivm aivm[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aivm = new ivm[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aivm, 0, j);
                    k = j;
                }
                for (; k < aivm.length - 1; k++)
                {
                    aivm[k] = new ivm();
                    kwj1.a(aivm[k]);
                    kwj1.a();
                }

                aivm[k] = new ivm();
                kwj1.a(aivm[k]);
                a = aivm;
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.e());
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
                ivm ivm1 = a[i];
                if (ivm1 != null)
                {
                    kwk1.b(1, ivm1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        super.writeTo(kwk1);
    }
}
