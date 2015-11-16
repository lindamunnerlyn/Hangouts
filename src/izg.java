// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izg extends koj
{

    public Long a;
    public irm b[];
    public Long c;
    public ium d;
    public iss e[];
    public iqm f;
    public ixg responseHeader;

    public izg()
    {
        responseHeader = null;
        a = null;
        b = irm.a();
        c = null;
        d = null;
        e = iss.a();
        f = null;
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
        if (a != null)
        {
            i = j + koh.d(2, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    irm irm1 = b[j];
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
        int l = j;
        if (c != null)
        {
            l = j + koh.d(4, c.longValue());
        }
        i = l;
        if (d != null)
        {
            i = l + koh.d(5, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= e.length)
                    {
                        break;
                    }
                    iss iss1 = e[i1];
                    j = i;
                    if (iss1 != null)
                    {
                        j = i + koh.d(6, iss1);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (f != null)
        {
            i = j + koh.d(7, f);
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
                a = Long.valueOf(kog1.d());
                break;

            case 26: // '\032'
                int l = kou.b(kog1, 26);
                irm airm[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                airm = new irm[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, airm, 0, j);
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
                b = airm;
                break;

            case 32: // ' '
                c = Long.valueOf(kog1.d());
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new ium();
                }
                kog1.a(d);
                break;

            case 50: // '2'
                int i1 = kou.b(kog1, 50);
                iss aiss[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aiss = new iss[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, aiss, 0, k);
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
                e = aiss;
                break;

            case 58: // ':'
                if (f == null)
                {
                    f = new iqm();
                }
                kog1.a(f);
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
        if (a != null)
        {
            koh1.a(2, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                irm irm1 = b[i];
                if (irm1 != null)
                {
                    koh1.b(3, irm1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(4, c.longValue());
        }
        if (d != null)
        {
            koh1.b(5, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                iss iss1 = e[j];
                if (iss1 != null)
                {
                    koh1.b(6, iss1);
                }
            }

        }
        if (f != null)
        {
            koh1.b(7, f);
        }
        super.writeTo(koh1);
    }
}
