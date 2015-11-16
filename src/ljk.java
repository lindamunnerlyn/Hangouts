// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljk extends kwm
{

    public String a[];

    public ljk()
    {
        a = kwx.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = 0;
        int j1 = super.computeSerializedSize();
        if (a != null && a.length > 0)
        {
            int j = 0;
            int k;
            int l;
            for (k = 0; i < a.length; k = l)
            {
                String s = a[i];
                int i1 = j;
                l = k;
                if (s != null)
                {
                    l = k + 1;
                    i1 = j + kwk.a(s);
                }
                i++;
                j = i1;
            }

            return j1 + j + k * 1;
        } else
        {
            return j1;
        }
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
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = kwj1.j();
                    kwj1.a();
                }

                as[k] = kwj1.j();
                a = as;
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
                String s = a[i];
                if (s != null)
                {
                    kwk1.a(1, s);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
