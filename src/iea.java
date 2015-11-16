// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iea extends koj
{

    private static volatile iea c[];
    public String a[];
    public ieb b[];

    public iea()
    {
        a = kou.f;
        b = ieb.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iea[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new iea[0];
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
        int l1 = super.computeSerializedSize();
        int i;
        int i1;
        if (a != null && a.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int j1;
            for (l = 0; i < a.length; l = j1)
            {
                String s = a[i];
                int k1 = j;
                j1 = l;
                if (s != null)
                {
                    j1 = l + 1;
                    k1 = j + koh.a(s);
                }
                i++;
                j = k1;
            }

            i = l1 + j + l * 1;
        } else
        {
            i = l1;
        }
        i1 = i;
        if (b != null)
        {
            i1 = i;
            if (b.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    ieb ieb1 = b[k];
                    i1 = i;
                    if (ieb1 != null)
                    {
                        i1 = i + koh.d(2, ieb1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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
                int l = kou.b(kog1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kog1.j();
                    kog1.a();
                }

                as[l] = kog1.j();
                a = as;
                break;

            case 18: // '\022'
                int i1 = kou.b(kog1, 18);
                ieb aieb[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aieb = new ieb[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aieb, 0, k);
                    i1 = k;
                }
                for (; i1 < aieb.length - 1; i1++)
                {
                    aieb[i1] = new ieb();
                    kog1.a(aieb[i1]);
                    kog1.a();
                }

                aieb[i1] = new ieb();
                kog1.a(aieb[i1]);
                b = aieb;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    koh1.a(1, s);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                ieb ieb1 = b[j];
                if (ieb1 != null)
                {
                    koh1.b(2, ieb1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
