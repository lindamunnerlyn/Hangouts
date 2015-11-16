// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kbt extends kwm
{

    public Float a;
    public Float b;
    public int c[];

    public kbt()
    {
        a = null;
        b = null;
        c = kwx.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            a.floatValue();
            j = i + (kwk.f(1) + 4);
        }
        i = j;
        if (b != null)
        {
            b.floatValue();
            i = j + (kwk.f(2) + 4);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < c.length; j++)
                {
                    k += kwk.e(c[j]);
                }

                j = i + k + c.length * 1;
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

            case 21: // '\025'
                b = Float.valueOf(kwj1.c());
                break;

            case 24: // '\030'
                int l = kwx.a(kwj1, 24);
                int ai[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = kwj1.f();
                    kwj1.a();
                }

                ai[l] = kwj1.f();
                c = ai;
                break;

            case 26: // '\032'
                int j1 = kwj1.c(kwj1.p());
                int k = kwj1.r();
                int i1;
                for (i1 = 0; kwj1.q() > 0; i1++)
                {
                    kwj1.f();
                }

                kwj1.e(k);
                int ai1[];
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = kwj1.f();
                }

                c = ai1;
                kwj1.d(j1);
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
            kwk1.a(2, b.floatValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kwk1.a(3, c[i]);
            }

        }
        super.writeTo(kwk1);
    }
}
