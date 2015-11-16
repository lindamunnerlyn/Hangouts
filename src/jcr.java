// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcr extends kwm
{

    public jcs a[];

    public jcr()
    {
        a = jcs.a();
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
                    jcs jcs1 = a[j];
                    k = i;
                    if (jcs1 != null)
                    {
                        k = i + kwk.d(1, jcs1);
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
                jcs ajcs[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajcs = new jcs[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajcs, 0, j);
                    k = j;
                }
                for (; k < ajcs.length - 1; k++)
                {
                    ajcs[k] = new jcs();
                    kwj1.a(ajcs[k]);
                    kwj1.a();
                }

                ajcs[k] = new jcs();
                kwj1.a(ajcs[k]);
                a = ajcs;
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
                jcs jcs1 = a[i];
                if (jcs1 != null)
                {
                    kwk1.b(1, jcs1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
