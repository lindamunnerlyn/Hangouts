// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyw extends koj
{

    private static volatile kyw c[];
    public kyp a[];
    public String b[];

    public kyw()
    {
        a = kyp.a();
        b = kou.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kyw[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new kyw[0];
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    kyp kyp1 = a[j];
                    int k = i;
                    if (kyp1 != null)
                    {
                        k = i + koh.d(1, kyp1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < b.length;)
                {
                    String s = b[j];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + koh.a(s);
                    }
                    j++;
                    l = k1;
                    i1 = j1;
                }

                j = i + l + i1 * 1;
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
                int l = kou.b(kog1, 10);
                kyp akyp[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akyp = new kyp[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akyp, 0, j);
                    l = j;
                }
                for (; l < akyp.length - 1; l++)
                {
                    akyp[l] = new kyp();
                    kog1.a(akyp[l]);
                    kog1.a();
                }

                akyp[l] = new kyp();
                kog1.a(akyp[l]);
                a = akyp;
                break;

            case 18: // '\022'
                int i1 = kou.b(kog1, 18);
                String as[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                as = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, as, 0, k);
                    i1 = k;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = kog1.j();
                    kog1.a();
                }

                as[i1] = kog1.j();
                b = as;
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
                kyp kyp1 = a[i];
                if (kyp1 != null)
                {
                    koh1.b(1, kyp1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                String s = b[j];
                if (s != null)
                {
                    koh1.a(2, s);
                }
            }

        }
        super.writeTo(koh1);
    }
}
