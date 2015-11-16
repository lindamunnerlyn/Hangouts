// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huv extends koj
{

    public hye a[];
    public hye b[];
    public Integer c;
    public String d;
    public hyu e;
    public iba f[];

    public huv()
    {
        a = hye.a();
        b = hye.a();
        c = null;
        d = null;
        e = null;
        f = iba.a();
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    hye hye1 = a[j];
                    int l = i;
                    if (hye1 != null)
                    {
                        l = i + koh.d(1, hye1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    hye hye2 = b[j];
                    int i1 = i;
                    if (hye2 != null)
                    {
                        i1 = i + koh.d(2, hye2);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(4, e);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.b(5, d);
        }
        int j1 = i;
        if (f != null)
        {
            j1 = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    iba iba1 = f[k];
                    j1 = i;
                    if (iba1 != null)
                    {
                        j1 = i + koh.d(6, iba1);
                    }
                    k++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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
                hye ahye[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ahye = new hye[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ahye, 0, j);
                    i1 = j;
                }
                for (; i1 < ahye.length - 1; i1++)
                {
                    ahye[i1] = new hye();
                    kog1.a(ahye[i1]);
                    kog1.a();
                }

                ahye[i1] = new hye();
                kog1.a(ahye[i1]);
                a = ahye;
                break;

            case 18: // '\022'
                int j1 = kou.b(kog1, 18);
                hye ahye1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ahye1 = new hye[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ahye1, 0, k);
                    j1 = k;
                }
                for (; j1 < ahye1.length - 1; j1++)
                {
                    ahye1[j1] = new hye();
                    kog1.a(ahye1[j1]);
                    kog1.a();
                }

                ahye1[j1] = new hye();
                kog1.a(ahye1[j1]);
                b = ahye1;
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.f());
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new hyu();
                }
                kog1.a(e);
                break;

            case 42: // '*'
                d = kog1.j();
                break;

            case 50: // '2'
                int k1 = kou.b(kog1, 50);
                iba aiba[];
                int l;
                if (f == null)
                {
                    l = 0;
                } else
                {
                    l = f.length;
                }
                aiba = new iba[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(f, 0, aiba, 0, l);
                    k1 = l;
                }
                for (; k1 < aiba.length - 1; k1++)
                {
                    aiba[k1] = new iba();
                    kog1.a(aiba[k1]);
                    kog1.a();
                }

                aiba[k1] = new iba();
                kog1.a(aiba[k1]);
                f = aiba;
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
                hye hye1 = a[i];
                if (hye1 != null)
                {
                    koh1.b(1, hye1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                hye hye2 = b[j];
                if (hye2 != null)
                {
                    koh1.b(2, hye2);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (e != null)
        {
            koh1.b(4, e);
        }
        if (d != null)
        {
            koh1.a(5, d);
        }
        if (f != null && f.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < f.length; k++)
            {
                iba iba1 = f[k];
                if (iba1 != null)
                {
                    koh1.b(6, iba1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
