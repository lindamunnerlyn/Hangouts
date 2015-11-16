// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hpl extends koj
{

    public Integer a;
    public hpm b[];
    public hoy c[];
    public hpn d;

    public hpl()
    {
        a = null;
        b = hpm.a();
        c = hoy.a();
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
            j = i + koh.e(1, a.intValue());
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
                    hpm hpm1 = b[j];
                    int k = i;
                    if (hpm1 != null)
                    {
                        k = i + koh.d(2, hpm1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    hoy hoy1 = c[l];
                    j = i;
                    if (hoy1 != null)
                    {
                        j = i + koh.d(3, hoy1);
                    }
                    l++;
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

            case 8: // '\b'
                a = Integer.valueOf(kog1.f());
                break;

            case 18: // '\022'
                int l = kou.b(kog1, 18);
                hpm ahpm[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahpm = new hpm[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahpm, 0, j);
                    l = j;
                }
                for (; l < ahpm.length - 1; l++)
                {
                    ahpm[l] = new hpm();
                    kog1.a(ahpm[l]);
                    kog1.a();
                }

                ahpm[l] = new hpm();
                kog1.a(ahpm[l]);
                b = ahpm;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                hoy ahoy[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ahoy = new hoy[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ahoy, 0, k);
                    i1 = k;
                }
                for (; i1 < ahoy.length - 1; i1++)
                {
                    ahoy[i1] = new hoy();
                    kog1.a(ahoy[i1]);
                    kog1.a();
                }

                ahoy[i1] = new hoy();
                kog1.a(ahoy[i1]);
                c = ahoy;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new hpn();
                }
                kog1.a(d);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                hpm hpm1 = b[i];
                if (hpm1 != null)
                {
                    koh1.b(2, hpm1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                hoy hoy1 = c[j];
                if (hoy1 != null)
                {
                    koh1.b(3, hoy1);
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
