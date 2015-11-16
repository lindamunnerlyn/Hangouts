// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdb extends koj
{

    private static volatile jdb c[];
    public String a;
    public int b[];

    public jdb()
    {
        a = null;
        b = kou.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jdb[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new jdb[0];
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < b.length; j++)
                {
                    k += koh.h(b[j]);
                }

                j = i + k + b.length * 1;
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
                a = kog1.j();
                break;

            case 16: // '\020'
                int l = kou.b(kog1, 16);
                int ai[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = kog1.l();
                    kog1.a();
                }

                ai[l] = kog1.l();
                b = ai;
                break;

            case 18: // '\022'
                int j1 = kog1.c(kog1.p());
                int k = kog1.r();
                int i1;
                for (i1 = 0; kog1.q() > 0; i1++)
                {
                    kog1.l();
                }

                kog1.e(k);
                int ai1[];
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = kog1.l();
                }

                b = ai1;
                kog1.d(j1);
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
                koh1.c(2, b[i]);
            }

        }
        super.writeTo(koh1);
    }
}
