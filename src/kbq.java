// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kbq extends kwm
{

    public Float a;
    public kbx b;
    public Float c;
    public Float d;
    public kbx e[];

    public kbq()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kbx.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.floatValue();
            i = j + (kwk.f(1) + 4);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(2, b);
        }
        int k = j;
        if (c != null)
        {
            c.floatValue();
            k = j + (kwk.f(3) + 4);
        }
        i = k;
        if (d != null)
        {
            d.floatValue();
            i = k + (kwk.f(4) + 4);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    kbx kbx1 = e[j];
                    int l = i;
                    if (kbx1 != null)
                    {
                        l = i + kwk.d(5, kbx1);
                    }
                    j++;
                    i = l;
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

            case 13: // '\r'
                a = Float.valueOf(kwj1.c());
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kbx();
                }
                kwj1.a(b);
                break;

            case 29: // '\035'
                c = Float.valueOf(kwj1.c());
                break;

            case 37: // '%'
                d = Float.valueOf(kwj1.c());
                break;

            case 42: // '*'
                int k = kwx.a(kwj1, 42);
                kbx akbx[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                akbx = new kbx[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, akbx, 0, j);
                    k = j;
                }
                for (; k < akbx.length - 1; k++)
                {
                    akbx[k] = new kbx();
                    kwj1.a(akbx[k]);
                    kwj1.a();
                }

                akbx[k] = new kbx();
                kwj1.a(akbx[k]);
                e = akbx;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.floatValue());
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.floatValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.floatValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                kbx kbx1 = e[i];
                if (kbx1 != null)
                {
                    kwk1.b(5, kbx1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
