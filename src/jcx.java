// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcx extends kwm
{

    public iwl a[];
    public jam b[];
    public Long c;
    public jdk requestHeader;

    public jcx()
    {
        requestHeader = null;
        a = iwl.a();
        b = jam.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (requestHeader != null)
        {
            j = i + kwk.d(1, requestHeader);
        }
        i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    iwl iwl1 = a[j];
                    int k = i;
                    if (iwl1 != null)
                    {
                        k = i + kwk.d(2, iwl1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    jam jam1 = b[l];
                    j = i;
                    if (jam1 != null)
                    {
                        j = i + kwk.d(3, jam1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(4, c.longValue());
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
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                iwl aiwl[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiwl = new iwl[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiwl, 0, j);
                    l = j;
                }
                for (; l < aiwl.length - 1; l++)
                {
                    aiwl[l] = new iwl();
                    kwj1.a(aiwl[l]);
                    kwj1.a();
                }

                aiwl[l] = new iwl();
                kwj1.a(aiwl[l]);
                a = aiwl;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                jam ajam[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ajam = new jam[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ajam, 0, k);
                    i1 = k;
                }
                for (; i1 < ajam.length - 1; i1++)
                {
                    ajam[i1] = new jam();
                    kwj1.a(ajam[i1]);
                    kwj1.a();
                }

                ajam[i1] = new jam();
                kwj1.a(ajam[i1]);
                b = ajam;
                break;

            case 32: // ' '
                c = Long.valueOf(kwj1.d());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iwl iwl1 = a[i];
                if (iwl1 != null)
                {
                    kwk1.b(2, iwl1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                jam jam1 = b[j];
                if (jam1 != null)
                {
                    kwk1.b(3, jam1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(4, c.longValue());
        }
        super.writeTo(kwk1);
    }
}
