// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class idn extends koj
{

    public ido a[];
    public idi b[];
    public idt c[];
    public idk d;

    public idn()
    {
        a = ido.a();
        b = idi.a();
        c = idt.a();
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
                    ido ido1 = a[j];
                    int k = i;
                    if (ido1 != null)
                    {
                        k = i + koh.d(1, ido1);
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
                    idi idi1 = b[j];
                    int l = i;
                    if (idi1 != null)
                    {
                        l = i + koh.d(2, idi1);
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
                    idt idt1 = c[i1];
                    j = i;
                    if (idt1 != null)
                    {
                        j = i + koh.d(3, idt1);
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
                ido aido[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aido = new ido[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aido, 0, j);
                    i1 = j;
                }
                for (; i1 < aido.length - 1; i1++)
                {
                    aido[i1] = new ido();
                    kog1.a(aido[i1]);
                    kog1.a();
                }

                aido[i1] = new ido();
                kog1.a(aido[i1]);
                a = aido;
                break;

            case 18: // '\022'
                int j1 = kou.b(kog1, 18);
                idi aidi[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aidi = new idi[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aidi, 0, k);
                    j1 = k;
                }
                for (; j1 < aidi.length - 1; j1++)
                {
                    aidi[j1] = new idi();
                    kog1.a(aidi[j1]);
                    kog1.a();
                }

                aidi[j1] = new idi();
                kog1.a(aidi[j1]);
                b = aidi;
                break;

            case 26: // '\032'
                int k1 = kou.b(kog1, 26);
                idt aidt[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aidt = new idt[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aidt, 0, l);
                    k1 = l;
                }
                for (; k1 < aidt.length - 1; k1++)
                {
                    aidt[k1] = new idt();
                    kog1.a(aidt[k1]);
                    kog1.a();
                }

                aidt[k1] = new idt();
                kog1.a(aidt[k1]);
                c = aidt;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new idk();
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
                ido ido1 = a[i];
                if (ido1 != null)
                {
                    koh1.b(1, ido1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                idi idi1 = b[j];
                if (idi1 != null)
                {
                    koh1.b(2, idi1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                idt idt1 = c[k];
                if (idt1 != null)
                {
                    koh1.b(3, idt1);
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
