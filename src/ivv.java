// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivv extends koj
{

    private static volatile ivv c[];
    public irg a;
    public ivw b[];

    public ivv()
    {
        a = null;
        b = ivw.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ivv[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new ivv[0];
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
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ivw ivw1 = b[j];
                    int k = i;
                    if (ivw1 != null)
                    {
                        k = i + koh.d(2, ivw1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new irg();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                ivw aivw[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aivw = new ivw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aivw, 0, j);
                    k = j;
                }
                for (; k < aivw.length - 1; k++)
                {
                    aivw[k] = new ivw();
                    kog1.a(aivw[k]);
                    kog1.a();
                }

                aivw[k] = new ivw();
                kog1.a(aivw[k]);
                b = aivw;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ivw ivw1 = b[i];
                if (ivw1 != null)
                {
                    koh1.b(2, ivw1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
