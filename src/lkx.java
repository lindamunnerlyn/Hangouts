// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lkx extends kwm
{

    private static volatile lkx f[];
    public String a;
    public lku b[];
    public lku c;
    public lku d;
    public lhc e;

    public lkx()
    {
        a = null;
        b = lku.a();
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lkx[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new lkx[0];
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
        i = kwk.b(1, a) + i;
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
                    lku lku1 = b[k];
                    j = i;
                    if (lku1 != null)
                    {
                        j = i + kwk.d(2, lku1);
                    }
                    k++;
                    i = j;
                } while (true);
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
            j = i + kwk.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(5, e);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                lku alku[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alku = new lku[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alku, 0, j);
                    k = j;
                }
                for (; k < alku.length - 1; k++)
                {
                    alku[k] = new lku();
                    kwj1.a(alku[k]);
                    kwj1.a();
                }

                alku[k] = new lku();
                kwj1.a(alku[k]);
                b = alku;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new lku();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new lku();
                }
                kwj1.a(d);
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
        kwk1.a(1, a);
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lku lku1 = b[i];
                if (lku1 != null)
                {
                    kwk1.b(2, lku1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        super.writeTo(kwk1);
    }
}
