// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lae extends koj
{

    private static volatile lae d[];
    public String a;
    public laa b[];
    public kyo c;

    public lae()
    {
        a = null;
        b = laa.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lae[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new lae[0];
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    laa laa1 = b[j];
                    int k = i;
                    if (laa1 != null)
                    {
                        k = i + koh.d(2, laa1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        return i;
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
                a = kog1.j();
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                laa alaa[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alaa = new laa[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alaa, 0, j);
                    k = j;
                }
                for (; k < alaa.length - 1; k++)
                {
                    alaa[k] = new laa();
                    kog1.a(alaa[k]);
                    kog1.a();
                }

                alaa[k] = new laa();
                kog1.a(alaa[k]);
                b = alaa;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kyo();
                }
                kog1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                laa laa1 = b[i];
                if (laa1 != null)
                {
                    koh1.b(2, laa1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        super.writeTo(koh1);
    }
}
