// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lha extends kwm
{

    public lkp a;
    public lgy b[];
    public lkm c;
    public lhc d;
    public lgo e;
    public lkl f;
    public ljr g;
    public String h;

    public lha()
    {
        a = null;
        b = lgy.a();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    lgy lgy1 = b[k];
                    j = i;
                    if (lgy1 != null)
                    {
                        j = i + kwk.d(1, lgy1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(2, c);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(3, a);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(5, e);
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.d(6, f);
        }
        j = i;
        if (g != null)
        {
            j = i + kwk.d(7, g);
        }
        i = j;
        if (h != null)
        {
            i = j + kwk.b(8, h);
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
                int k = kwx.a(kwj1, 10);
                lgy algy[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                algy = new lgy[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, algy, 0, j);
                    k = j;
                }
                for (; k < algy.length - 1; k++)
                {
                    algy[k] = new lgy();
                    kwj1.a(algy[k]);
                    kwj1.a();
                }

                algy[k] = new lgy();
                kwj1.a(algy[k]);
                b = algy;
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new lkm();
                }
                kwj1.a(c);
                break;

            case 26: // '\032'
                if (a == null)
                {
                    a = new lkp();
                }
                kwj1.a(a);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new lhc();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new lgo();
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

            case 66: // 'B'
                h = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lgy lgy1 = b[i];
                if (lgy1 != null)
                {
                    kwk1.b(1, lgy1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(2, c);
        }
        if (a != null)
        {
            kwk1.b(3, a);
        }
        if (d != null)
        {
            kwk1.b(4, d);
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
            kwk1.a(8, h);
        }
        super.writeTo(kwk1);
    }
}
