// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxn extends kwm
{

    private static volatile hxn f[];
    public hwx a;
    public String b;
    public String c;
    public String d;
    public hxo e[];

    public hxn()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = hxo.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hxn[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new hxn[0];
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
            j = i + kwk.b(2, b);
        }
        int k = j;
        if (c != null)
        {
            k = j + kwk.b(3, c);
        }
        i = k;
        if (d != null)
        {
            i = k + kwk.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    hxo hxo1 = e[j];
                    int l = i;
                    if (hxo1 != null)
                    {
                        l = i + kwk.d(5, hxo1);
                    }
                    j++;
                    i = l;
                }

                j = i;
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new hwx();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                int k = kwx.a(kwj1, 42);
                hxo ahxo[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                ahxo = new hxo[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, ahxo, 0, j);
                    k = j;
                }
                for (; k < ahxo.length - 1; k++)
                {
                    ahxo[k] = new hxo();
                    kwj1.a(ahxo[k]);
                    kwj1.a();
                }

                ahxo[k] = new hxo();
                kwj1.a(ahxo[k]);
                e = ahxo;
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
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                hxo hxo1 = e[i];
                if (hxo1 != null)
                {
                    kwk1.b(5, hxo1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
