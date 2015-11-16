// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lio extends kwm
{

    private static volatile lio f[];
    public String a;
    public String b;
    public lip c[];
    public lhc d;
    public lhc e;

    public lio()
    {
        a = null;
        b = null;
        c = lip.a();
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lio[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new lio[0];
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
            j = i + kwk.b(1, a);
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
                    lip lip1 = c[j];
                    int k = i;
                    if (lip1 != null)
                    {
                        k = i + kwk.d(3, lip1);
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
            i = j + kwk.d(4, d);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                lip alip[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                alip = new lip[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, alip, 0, j);
                    k = j;
                }
                for (; k < alip.length - 1; k++)
                {
                    alip[k] = new lip();
                    kwj1.a(alip[k]);
                    kwj1.a();
                }

                alip[k] = new lip();
                kwj1.a(alip[k]);
                c = alip;
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
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                lip lip1 = c[i];
                if (lip1 != null)
                {
                    kwk1.b(3, lip1);
                }
            }

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
