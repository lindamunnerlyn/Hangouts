// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kub extends koj
{

    private static volatile kub d[];
    public String a;
    public String b[];
    public kua c[];

    public kub()
    {
        a = null;
        b = kou.f;
        c = kua.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kub[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new kub[0];
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
        boolean flag = false;
        int l1 = super.computeSerializedSize() + koh.b(1, a);
        int i;
        int i1;
        if (b != null && b.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int j1;
            for (l = 0; i < b.length; l = j1)
            {
                String s = b[i];
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
        if (c != null)
        {
            i1 = i;
            if (c.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= c.length)
                    {
                        break;
                    }
                    kua kua1 = c[k];
                    i1 = i;
                    if (kua1 != null)
                    {
                        i1 = i + koh.d(3, kua1);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                int l = kou.b(kog1, 18);
                String as[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kog1.j();
                    kog1.a();
                }

                as[l] = kog1.j();
                b = as;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                kua akua[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                akua = new kua[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, akua, 0, k);
                    i1 = k;
                }
                for (; i1 < akua.length - 1; i1++)
                {
                    akua[i1] = new kua();
                    kog1.a(akua[i1]);
                    kog1.a();
                }

                akua[i1] = new kua();
                kog1.a(akua[i1]);
                c = akua;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(1, a);
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    koh1.a(2, s);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                kua kua1 = c[j];
                if (kua1 != null)
                {
                    koh1.b(3, kua1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
