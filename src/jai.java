// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jai extends kwm
{

    public iyx a[];
    public Boolean b;
    public jak c;
    public jak d;
    public jak e;
    public jak f;
    public jak g;
    public jak h;
    public jdl responseHeader;

    public jai()
    {
        responseHeader = null;
        a = iyx.a();
        b = null;
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
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    iyx iyx1 = a[j];
                    int k = i;
                    if (iyx1 != null)
                    {
                        k = i + kwk.d(2, iyx1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (kwk.f(3) + 1);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.d(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.d(7, g);
        }
        j = i;
        if (h != null)
        {
            j = i + kwk.d(8, h);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(9, c);
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
                if (responseHeader == null)
                {
                    responseHeader = new jdl();
                }
                kwj1.a(responseHeader);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                iyx aiyx[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiyx = new iyx[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiyx, 0, j);
                    k = j;
                }
                for (; k < aiyx.length - 1; k++)
                {
                    aiyx[k] = new iyx();
                    kwj1.a(aiyx[k]);
                    kwj1.a();
                }

                aiyx[k] = new iyx();
                kwj1.a(aiyx[k]);
                a = aiyx;
                break;

            case 24: // '\030'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jak();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new jak();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new jak();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new jak();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new jak();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                if (c == null)
                {
                    c = new jak();
                }
                kwj1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iyx iyx1 = a[i];
                if (iyx1 != null)
                {
                    kwk1.b(2, iyx1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(3, b.booleanValue());
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
            kwk1.b(8, h);
        }
        if (c != null)
        {
            kwk1.b(9, c);
        }
        super.writeTo(kwk1);
    }
}
