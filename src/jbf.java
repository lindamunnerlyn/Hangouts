// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbf extends kwm
{

    private static volatile jbf c[];
    public ixl a;
    public String b[];

    public jbf()
    {
        a = null;
        b = kwx.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jbf[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new jbf[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < b.length;)
                {
                    String s = b[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + kwk.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
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

            case 18: // '\022'
                if (a == null)
                {
                    a = new ixl();
                }
                kwj1.a(a);
                break;

            case 34: // '"'
                int k = kwx.a(kwj1, 34);
                String as[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = kwj1.j();
                    kwj1.a();
                }

                as[k] = kwj1.j();
                b = as;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    kwk1.a(4, s);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
