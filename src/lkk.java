// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lkk extends kwm
{

    private static volatile lkk f[];
    public lgs a;
    public lhd b[];
    public lhd c;
    public String d;
    public String e;

    public lkk()
    {
        a = null;
        b = lhd.a();
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lkk[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new lkk[0];
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
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lhd lhd1 = b[j];
                    int k = i;
                    if (lhd1 != null)
                    {
                        k = i + kwk.d(2, lhd1);
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
        j = i;
        if (d != null)
        {
            j = i + kwk.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.b(5, e);
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
                if (a == null)
                {
                    a = new lgs();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                lhd alhd[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alhd = new lhd[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alhd, 0, j);
                    k = j;
                }
                for (; k < alhd.length - 1; k++)
                {
                    alhd[k] = new lhd();
                    kwj1.a(alhd[k]);
                    kwj1.a();
                }

                alhd[k] = new lhd();
                kwj1.a(alhd[k]);
                b = alhd;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new lhd();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                e = kwj1.j();
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
            for (int i = 0; i < b.length; i++)
            {
                lhd lhd1 = b[i];
                if (lhd1 != null)
                {
                    kwk1.b(2, lhd1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        super.writeTo(kwk1);
    }
}
