// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lkv extends kwm
{

    private static volatile lkv f[];
    public ljn a;
    public String b;
    public lkx c[];
    public String d;
    public lhc e;

    public lkv()
    {
        a = null;
        b = null;
        c = lkx.a();
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lkv[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new lkv[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.d(1, a);
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
                    lkx lkx1 = c[j];
                    int k = i;
                    if (lkx1 != null)
                    {
                        k = i + kwk.d(3, lkx1);
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
        j = i;
        if (e != null)
        {
            j = i + kwk.d(5, e);
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
                    a = new ljn();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                lkx alkx[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                alkx = new lkx[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, alkx, 0, j);
                    k = j;
                }
                for (; k < alkx.length - 1; k++)
                {
                    alkx[k] = new lkx();
                    kwj1.a(alkx[k]);
                    kwj1.a();
                }

                alkx[k] = new lkx();
                kwj1.a(alkx[k]);
                c = alkx;
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new lhc();
                }
                kwj1.a(e);
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
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                lkx lkx1 = c[i];
                if (lkx1 != null)
                {
                    kwk1.b(3, lkx1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        super.writeTo(kwk1);
    }
}
