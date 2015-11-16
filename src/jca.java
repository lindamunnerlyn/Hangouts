// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jca extends kwm
{

    private static volatile jca c[];
    public ixl a;
    public jcb b[];

    public jca()
    {
        a = null;
        b = jcb.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jca[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new jca[0];
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
                    jcb jcb1 = b[j];
                    int k = i;
                    if (jcb1 != null)
                    {
                        k = i + kwk.d(2, jcb1);
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
                if (a == null)
                {
                    a = new ixl();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                jcb ajcb[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajcb = new jcb[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajcb, 0, j);
                    k = j;
                }
                for (; k < ajcb.length - 1; k++)
                {
                    ajcb[k] = new jcb();
                    kwj1.a(ajcb[k]);
                    kwj1.a();
                }

                ajcb[k] = new jcb();
                kwj1.a(ajcb[k]);
                b = ajcb;
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
                jcb jcb1 = b[i];
                if (jcb1 != null)
                {
                    kwk1.b(2, jcb1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
