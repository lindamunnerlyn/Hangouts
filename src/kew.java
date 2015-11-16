// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kew extends kwm
{

    public Long a;
    public lse b[];
    public ksw c;

    public kew()
    {
        a = null;
        b = lse.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lse lse1 = b[j];
                    int k = i;
                    if (lse1 != null)
                    {
                        k = i + kwk.d(2, lse1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
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

            case 8: // '\b'
                a = Long.valueOf(kwj1.e());
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                lse alse[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alse = new lse[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alse, 0, j);
                    k = j;
                }
                for (; k < alse.length - 1; k++)
                {
                    alse[k] = new lse();
                    kwj1.a(alse[k]);
                    kwj1.a();
                }

                alse[k] = new lse();
                kwj1.a(alse[k]);
                b = alse;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ksw();
                }
                kwj1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lse lse1 = b[i];
                if (lse1 != null)
                {
                    kwk1.b(2, lse1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        super.writeTo(kwk1);
    }
}
