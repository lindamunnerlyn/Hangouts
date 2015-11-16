// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class khl extends kwm
{

    private static volatile khl d[];
    public String a;
    public String b;
    public khm c[];

    public khl()
    {
        a = null;
        b = null;
        c = khm.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static khl[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new khl[0];
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
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    khm khm1 = c[j];
                    int k = i;
                    if (khm1 != null)
                    {
                        k = i + kwk.d(2, khm1);
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
            i = j + kwk.b(3, b);
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
                khm akhm[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                akhm = new khm[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, akhm, 0, j);
                    k = j;
                }
                for (; k < akhm.length - 1; k++)
                {
                    akhm[k] = new khm();
                    kwj1.a(akhm[k]);
                    kwj1.a();
                }

                akhm[k] = new khm();
                kwj1.a(akhm[k]);
                c = akhm;
                break;

            case 26: // '\032'
                b = kwj1.j();
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
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                khm khm1 = c[i];
                if (khm1 != null)
                {
                    kwk1.b(2, khm1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        super.writeTo(kwk1);
    }
}
