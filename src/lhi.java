// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhi extends kwm
{

    private static volatile lhi d[];
    public String a;
    public lhj b[];
    public Boolean c;

    public lhi()
    {
        a = null;
        b = lhj.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lhi[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new lhi[0];
                }
            }
        }
        return d;
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lhj lhj1 = b[j];
                    int k = i;
                    if (lhj1 != null)
                    {
                        k = i + kwk.d(2, lhj1);
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
            c.booleanValue();
            i = j + (kwk.f(3) + 1);
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
                lhj alhj[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alhj = new lhj[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alhj, 0, j);
                    k = j;
                }
                for (; k < alhj.length - 1; k++)
                {
                    alhj[k] = new lhj();
                    kwj1.a(alhj[k]);
                    kwj1.a();
                }

                alhj[k] = new lhj();
                kwj1.a(alhj[k]);
                b = alhj;
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lhj lhj1 = b[i];
                if (lhj1 != null)
                {
                    kwk1.b(2, lhj1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
