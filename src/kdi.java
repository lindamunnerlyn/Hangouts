// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kdi extends kwm
{

    private static volatile kdi c[];
    public kds a;
    public kdj b[];

    public kdi()
    {
        a = null;
        b = kdj.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kdi[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new kdi[0];
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
                    kdj kdj1 = b[j];
                    int k = i;
                    if (kdj1 != null)
                    {
                        k = i + kwk.d(2, kdj1);
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
                    a = new kds();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                kdj akdj[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akdj = new kdj[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akdj, 0, j);
                    k = j;
                }
                for (; k < akdj.length - 1; k++)
                {
                    akdj[k] = new kdj();
                    kwj1.a(akdj[k]);
                    kwj1.a();
                }

                akdj[k] = new kdj();
                kwj1.a(akdj[k]);
                b = akdj;
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
                kdj kdj1 = b[i];
                if (kdj1 != null)
                {
                    kwk1.b(2, kdj1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
