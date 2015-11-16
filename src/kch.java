// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kch extends kwm
{

    public kci a;
    public Long b;
    public kcn c;
    public kct d[];

    public kch()
    {
        a = null;
        b = null;
        c = null;
        d = kct.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    kct kct1 = d[j];
                    int k = i;
                    if (kct1 != null)
                    {
                        k = i + kwk.d(4, kct1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
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
                if (a == null)
                {
                    a = new kci();
                }
                kwj1.a(a);
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.e());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kcn();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                int k = kwx.a(kwj1, 34);
                kct akct[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                akct = new kct[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, akct, 0, j);
                    k = j;
                }
                for (; k < akct.length - 1; k++)
                {
                    akct[k] = new kct();
                    kwj1.a(akct[k]);
                    kwj1.a();
                }

                akct[k] = new kct();
                kwj1.a(akct[k]);
                d = akct;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                kct kct1 = d[i];
                if (kct1 != null)
                {
                    kwk1.b(4, kct1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
