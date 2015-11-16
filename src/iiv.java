// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iiv extends koj
{

    public String a;
    public String b;
    public String c;
    public String d;
    public ibs e[];
    public String f[];

    public iiv()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = ibs.a();
        f = kou.f;
        unknownFieldData = null;
        cachedSize = -1;
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
            j = i + koh.b(2, b);
        }
        j += koh.b(3, c);
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                i = j;
                for (j = 0; j < e.length;)
                {
                    ibs ibs1 = e[j];
                    int k = i;
                    if (ibs1 != null)
                    {
                        k = i + koh.d(4, ibs1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < f.length;)
                {
                    String s = f[j];
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
        i = j;
        if (d != null)
        {
            i = j + koh.b(6, d);
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
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                int l = kou.b(kog1, 34);
                ibs aibs[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                aibs = new ibs[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, aibs, 0, j);
                    l = j;
                }
                for (; l < aibs.length - 1; l++)
                {
                    aibs[l] = new ibs();
                    kog1.a(aibs[l]);
                    kog1.a();
                }

                aibs[l] = new ibs();
                kog1.a(aibs[l]);
                e = aibs;
                break;

            case 42: // '*'
                int i1 = kou.b(kog1, 42);
                String as[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                as = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, as, 0, k);
                    i1 = k;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = kog1.j();
                    kog1.a();
                }

                as[i1] = kog1.j();
                f = as;
                break;

            case 50: // '2'
                d = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        koh1.a(3, c);
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                ibs ibs1 = e[i];
                if (ibs1 != null)
                {
                    koh1.b(4, ibs1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                String s = f[j];
                if (s != null)
                {
                    koh1.a(5, s);
                }
            }

        }
        if (d != null)
        {
            koh1.a(6, d);
        }
        super.writeTo(koh1);
    }
}
