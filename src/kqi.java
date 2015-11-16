// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kqi extends kwm
{

    private static volatile kqi c[];
    public String a;
    public kqk b[];

    public kqi()
    {
        a = null;
        b = kqk.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kqi[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new kqi[0];
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
                    kqk kqk1 = b[j];
                    int k = i;
                    if (kqk1 != null)
                    {
                        k = i + kwk.d(2, kqk1);
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
                kqk akqk[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akqk = new kqk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akqk, 0, j);
                    k = j;
                }
                for (; k < akqk.length - 1; k++)
                {
                    akqk[k] = new kqk();
                    kwj1.a(akqk[k]);
                    kwj1.a();
                }

                akqk[k] = new kqk();
                kwj1.a(akqk[k]);
                b = akqk;
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
                kqk kqk1 = b[i];
                if (kqk1 != null)
                {
                    kwk1.b(2, kqk1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
