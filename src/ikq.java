// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikq extends kwm
{

    public ilt a[];

    public ikq()
    {
        a = ilt.a();
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
                    ilt ilt1 = a[j];
                    k = i;
                    if (ilt1 != null)
                    {
                        k = i + kwk.d(1, ilt1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
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
                ilt ailt[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ailt = new ilt[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ailt, 0, j);
                    k = j;
                }
                for (; k < ailt.length - 1; k++)
                {
                    ailt[k] = new ilt();
                    kwj1.a(ailt[k]);
                    kwj1.a();
                }

                ailt[k] = new ilt();
                kwj1.a(ailt[k]);
                a = ailt;
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
                ilt ilt1 = a[i];
                if (ilt1 != null)
                {
                    kwk1.b(1, ilt1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
