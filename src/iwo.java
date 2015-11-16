// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwo extends kwm
{

    public jex a[];

    public iwo()
    {
        a = jex.a();
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
                    jex jex1 = a[j];
                    k = i;
                    if (jex1 != null)
                    {
                        k = i + kwk.d(1, jex1);
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
                jex ajex[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajex = new jex[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajex, 0, j);
                    k = j;
                }
                for (; k < ajex.length - 1; k++)
                {
                    ajex[k] = new jex();
                    kwj1.a(ajex[k]);
                    kwj1.a();
                }

                ajex[k] = new jex();
                kwj1.a(ajex[k]);
                a = ajex;
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
                jex jex1 = a[i];
                if (jex1 != null)
                {
                    kwk1.b(1, jex1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
