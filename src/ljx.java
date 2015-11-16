// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljx extends kwm
{

    public lkp a;
    public ljw b[];
    public Integer c;
    public Integer d;
    public lhc e;
    public lkl f;
    public ljr g;
    public lju h;
    public ljy i;

    public ljx()
    {
        a = null;
        b = ljw.a();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + kwk.d(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j;
            if (b.length > 0)
            {
                for (k = 0; k < b.length;)
                {
                    ljw ljw1 = b[k];
                    int l = j;
                    if (ljw1 != null)
                    {
                        l = j + kwk.d(2, ljw1);
                    }
                    k++;
                    j = l;
                }

                k = j;
            }
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.e(3, c.intValue());
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.e(4, d.intValue());
        }
        j = k;
        if (e != null)
        {
            j = k + kwk.d(5, e);
        }
        k = j;
        if (f != null)
        {
            k = j + kwk.d(6, f);
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.d(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.d(60, h);
        }
        j = k;
        if (i != null)
        {
            j = k + kwk.d(61, i);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int j = kwj1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kwj1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new lkp();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                ljw aljw[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aljw = new ljw[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aljw, 0, k);
                    l = k;
                }
                for (; l < aljw.length - 1; l++)
                {
                    aljw[l] = new ljw();
                    kwj1.a(aljw[l]);
                    kwj1.a();
                }

                aljw[l] = new ljw();
                kwj1.a(aljw[l]);
                b = aljw;
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.f());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new lhc();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new lkl();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new ljr();
                }
                kwj1.a(g);
                break;

            case 482: 
                if (h == null)
                {
                    h = new lju();
                }
                kwj1.a(h);
                break;

            case 490: 
                if (i == null)
                {
                    i = new ljy();
                }
                kwj1.a(i);
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
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                ljw ljw1 = b[j];
                if (ljw1 != null)
                {
                    kwk1.b(2, ljw1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.b(60, h);
        }
        if (i != null)
        {
            kwk1.b(61, i);
        }
        super.writeTo(kwk1);
    }
}
