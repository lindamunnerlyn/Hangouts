// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izd extends koj
{

    public Boolean a;
    public Long b;
    public irm c[];
    public Boolean d;
    public ium e;
    public iss f[];
    public iqm g;
    public ixg responseHeader;

    public izd()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = irm.a();
        d = null;
        e = null;
        f = iss.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (responseHeader != null)
        {
            j = i + koh.d(1, responseHeader);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    irm irm1 = c[j];
                    int k = i;
                    if (irm1 != null)
                    {
                        k = i + koh.d(3, irm1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (koh.f(4) + 1);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(5, e);
        }
        i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (koh.f(6) + 1);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= f.length)
                    {
                        break;
                    }
                    iss iss1 = f[l];
                    j = i;
                    if (iss1 != null)
                    {
                        j = i + koh.d(7, iss1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (g != null)
        {
            i = j + koh.d(8, g);
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
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 16: // '\020'
                b = Long.valueOf(kog1.d());
                break;

            case 26: // '\032'
                int l = kou.b(kog1, 26);
                irm airm[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                airm = new irm[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, airm, 0, j);
                    l = j;
                }
                for (; l < airm.length - 1; l++)
                {
                    airm[l] = new irm();
                    kog1.a(airm[l]);
                    kog1.a();
                }

                airm[l] = new irm();
                kog1.a(airm[l]);
                c = airm;
                break;

            case 32: // ' '
                d = Boolean.valueOf(kog1.i());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new ium();
                }
                kog1.a(e);
                break;

            case 48: // '0'
                a = Boolean.valueOf(kog1.i());
                break;

            case 58: // ':'
                int i1 = kou.b(kog1, 58);
                iss aiss[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                aiss = new iss[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, aiss, 0, k);
                    i1 = k;
                }
                for (; i1 < aiss.length - 1; i1++)
                {
                    aiss[i1] = new iss();
                    kog1.a(aiss[i1]);
                    kog1.a();
                }

                aiss[i1] = new iss();
                kog1.a(aiss[i1]);
                f = aiss;
                break;

            case 66: // 'B'
                if (g == null)
                {
                    g = new iqm();
                }
                kog1.a(g);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (b != null)
        {
            koh1.a(2, b.longValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                irm irm1 = c[i];
                if (irm1 != null)
                {
                    koh1.b(3, irm1);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (a != null)
        {
            koh1.a(6, a.booleanValue());
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                iss iss1 = f[j];
                if (iss1 != null)
                {
                    koh1.b(7, iss1);
                }
            }

        }
        if (g != null)
        {
            koh1.b(8, g);
        }
        super.writeTo(koh1);
    }
}
