// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kin extends koj
{

    public Long a;
    public kip b[];
    public kio c[];
    public Integer d;
    public Integer e;

    public kin()
    {
        a = null;
        b = kip.a();
        c = kio.a();
        d = null;
        e = null;
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
            j = i + koh.e(1, a.longValue());
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
                    kip kip1 = b[j];
                    int k = i;
                    if (kip1 != null)
                    {
                        k = i + koh.d(2, kip1);
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
                    kio kio1 = c[l];
                    j = i;
                    if (kio1 != null)
                    {
                        j = i + koh.d(3, kio1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.e(5, e.intValue());
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

            case 8: // '\b'
                a = Long.valueOf(kog1.e());
                break;

            case 18: // '\022'
                int l = kou.b(kog1, 18);
                kip akip[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akip = new kip[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akip, 0, j);
                    l = j;
                }
                for (; l < akip.length - 1; l++)
                {
                    akip[l] = new kip();
                    kog1.a(akip[l]);
                    kog1.a();
                }

                akip[l] = new kip();
                kog1.a(akip[l]);
                b = akip;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                kio akio[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                akio = new kio[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, akio, 0, k);
                    i1 = k;
                }
                for (; i1 < akio.length - 1; i1++)
                {
                    akio[i1] = new kio();
                    kog1.a(akio[i1]);
                    kog1.a();
                }

                akio[i1] = new kio();
                kog1.a(akio[i1]);
                c = akio;
                break;

            case 32: // ' '
                d = Integer.valueOf(kog1.f());
                break;

            case 40: // '('
                e = Integer.valueOf(kog1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kip kip1 = b[i];
                if (kip1 != null)
                {
                    koh1.b(2, kip1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                kio kio1 = c[j];
                if (kio1 != null)
                {
                    koh1.b(3, kio1);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        super.writeTo(koh1);
    }
}
