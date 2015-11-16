// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfg extends kwm
{

    public jfe a[];

    public jfg()
    {
        a = jfe.a();
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
                    jfe jfe1 = a[j];
                    k = i;
                    if (jfe1 != null)
                    {
                        k = i + kwk.d(2, jfe1);
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

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                jfe ajfe[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajfe = new jfe[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajfe, 0, j);
                    k = j;
                }
                for (; k < ajfe.length - 1; k++)
                {
                    ajfe[k] = new jfe();
                    kwj1.a(ajfe[k]);
                    kwj1.a();
                }

                ajfe[k] = new jfe();
                kwj1.a(ajfe[k]);
                a = ajfe;
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
                jfe jfe1 = a[i];
                if (jfe1 != null)
                {
                    kwk1.b(2, jfe1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
