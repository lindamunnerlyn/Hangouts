// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ira extends koj
{

    public ivz a[];
    public ivz b[];
    public itl c[];
    public itm d;

    public ira()
    {
        a = ivz.a();
        b = ivz.a();
        c = itl.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    ivz ivz1 = a[j];
                    int k = i;
                    if (ivz1 != null)
                    {
                        k = i + koh.d(1, ivz1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (j = 0; j < b.length;)
                {
                    ivz ivz2 = b[j];
                    int l = i;
                    if (ivz2 != null)
                    {
                        l = i + koh.d(2, ivz2);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    itl itl1 = c[i1];
                    j = i;
                    if (itl1 != null)
                    {
                        j = i + koh.d(3, itl1);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d);
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
                int i1 = kou.b(kog1, 10);
                ivz aivz[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aivz = new ivz[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aivz, 0, j);
                    i1 = j;
                }
                for (; i1 < aivz.length - 1; i1++)
                {
                    aivz[i1] = new ivz();
                    kog1.a(aivz[i1]);
                    kog1.a();
                }

                aivz[i1] = new ivz();
                kog1.a(aivz[i1]);
                a = aivz;
                break;

            case 18: // '\022'
                int j1 = kou.b(kog1, 18);
                ivz aivz1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aivz1 = new ivz[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aivz1, 0, k);
                    j1 = k;
                }
                for (; j1 < aivz1.length - 1; j1++)
                {
                    aivz1[j1] = new ivz();
                    kog1.a(aivz1[j1]);
                    kog1.a();
                }

                aivz1[j1] = new ivz();
                kog1.a(aivz1[j1]);
                b = aivz1;
                break;

            case 26: // '\032'
                int k1 = kou.b(kog1, 26);
                itl aitl[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aitl = new itl[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aitl, 0, l);
                    k1 = l;
                }
                for (; k1 < aitl.length - 1; k1++)
                {
                    aitl[k1] = new itl();
                    kog1.a(aitl[k1]);
                    kog1.a();
                }

                aitl[k1] = new itl();
                kog1.a(aitl[k1]);
                c = aitl;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new itm();
                }
                kog1.a(d);
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
                ivz ivz1 = a[i];
                if (ivz1 != null)
                {
                    koh1.b(1, ivz1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                ivz ivz2 = b[j];
                if (ivz2 != null)
                {
                    koh1.b(2, ivz2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                itl itl1 = c[k];
                if (itl1 != null)
                {
                    koh1.b(3, itl1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        super.writeTo(koh1);
    }
}
