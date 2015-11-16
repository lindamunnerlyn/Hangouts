// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ief extends kwm
{

    private static volatile ief c[];
    public String a;
    public ieg b[];

    public ief()
    {
        a = null;
        b = ieg.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ief[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new ief[0];
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
                    ieg ieg1 = b[j];
                    int k = i;
                    if (ieg1 != null)
                    {
                        k = i + kwk.d(2, ieg1);
                    }
                    j++;
                    i = k;
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                ieg aieg[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aieg = new ieg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aieg, 0, j);
                    k = j;
                }
                for (; k < aieg.length - 1; k++)
                {
                    aieg[k] = new ieg();
                    kwj1.a(aieg[k]);
                    kwj1.a();
                }

                aieg[k] = new ieg();
                kwj1.a(aieg[k]);
                b = aieg;
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
                ieg ieg1 = b[i];
                if (ieg1 != null)
                {
                    kwk1.b(2, ieg1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
