// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kkh extends koj
{

    public kbz a;
    public String b;
    public kkf c;
    public kkf d[];
    public kkf e[];

    public kkh()
    {
        a = null;
        b = null;
        c = null;
        d = kkf.a();
        e = kkf.a();
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
            i = j + koh.d(1, a);
        }
        int i1 = i;
        if (b != null)
        {
            i1 = i + koh.b(2, b);
        }
        j = i1;
        if (c != null)
        {
            j = i1 + koh.d(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (int k = 0; k < d.length;)
                {
                    kkf kkf1 = d[k];
                    i1 = i;
                    if (kkf1 != null)
                    {
                        i1 = i + koh.d(5, kkf1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        i1 = i;
        if (e != null)
        {
            i1 = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    kkf kkf2 = e[l];
                    i1 = i;
                    if (kkf2 != null)
                    {
                        i1 = i + koh.d(6, kkf2);
                    }
                    l++;
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
                if (a == null)
                {
                    a = new kbz();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kkf();
                }
                kog1.a(c);
                break;

            case 42: // '*'
                int l = kou.b(kog1, 42);
                kkf akkf[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                akkf = new kkf[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, akkf, 0, j);
                    l = j;
                }
                for (; l < akkf.length - 1; l++)
                {
                    akkf[l] = new kkf();
                    kog1.a(akkf[l]);
                    kog1.a();
                }

                akkf[l] = new kkf();
                kog1.a(akkf[l]);
                d = akkf;
                break;

            case 50: // '2'
                int i1 = kou.b(kog1, 50);
                kkf akkf1[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                akkf1 = new kkf[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, akkf1, 0, k);
                    i1 = k;
                }
                for (; i1 < akkf1.length - 1; i1++)
                {
                    akkf1[i1] = new kkf();
                    kog1.a(akkf1[i1]);
                    kog1.a();
                }

                akkf1[i1] = new kkf();
                kog1.a(akkf1[i1]);
                e = akkf1;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                kkf kkf1 = d[i];
                if (kkf1 != null)
                {
                    koh1.b(5, kkf1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                kkf kkf2 = e[j];
                if (kkf2 != null)
                {
                    koh1.b(6, kkf2);
                }
            }

        }
        super.writeTo(koh1);
    }
}
