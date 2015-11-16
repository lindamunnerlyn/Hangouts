// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kxe extends kwm
{

    public Long a;
    public String b;
    public kxv c[];
    public String d;

    public kxe()
    {
        a = null;
        b = null;
        c = kxv.a();
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
            j = i + kwk.e(1, a.longValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    kxv kxv1 = c[j];
                    int k = i;
                    if (kxv1 != null)
                    {
                        k = i + kwk.d(3, kxv1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(4, d);
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
                b = kwj1.j();
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                kxv akxv[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                akxv = new kxv[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, akxv, 0, j);
                    k = j;
                }
                for (; k < akxv.length - 1; k++)
                {
                    akxv[k] = new kxv();
                    kwj1.a(akxv[k]);
                    kwj1.a();
                }

                akxv[k] = new kxv();
                kwj1.a(akxv[k]);
                c = akxv;
                break;

            case 34: // '"'
                d = kwj1.j();
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
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kxv kxv1 = c[i];
                if (kxv1 != null)
                {
                    kwk1.b(3, kxv1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        super.writeTo(kwk1);
    }
}
