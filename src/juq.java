// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class juq extends koj
{

    private static volatile juq c[];
    public jug a;
    public jur b[];

    public juq()
    {
        a = null;
        b = jur.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static juq[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new juq[0];
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
                    jur jur1 = b[j];
                    int k = i;
                    if (jur1 != null)
                    {
                        k = i + koh.d(2, jur1);
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
                    a = new jug();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                jur ajur[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajur = new jur[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajur, 0, j);
                    k = j;
                }
                for (; k < ajur.length - 1; k++)
                {
                    ajur[k] = new jur();
                    kog1.a(ajur[k]);
                    kog1.a();
                }

                ajur[k] = new jur();
                kog1.a(ajur[k]);
                b = ajur;
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
                jur jur1 = b[i];
                if (jur1 != null)
                {
                    koh1.b(2, jur1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
