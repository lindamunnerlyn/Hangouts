// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lak extends koj
{

    public lcb a;
    public lal b[];
    public kyo c;
    public int d[];
    public Integer e;

    public lak()
    {
        a = null;
        b = lal.a();
        c = null;
        d = kou.a;
        e = null;
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
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lal lal1 = b[j];
                    int k = i;
                    if (lal1 != null)
                    {
                        k = i + koh.d(2, lal1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < d.length; j++)
                {
                    l += koh.e(d[j]);
                }

                j = i + l + d.length * 1;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + koh.e(5, e.intValue());
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
                if (a == null)
                {
                    a = new lcb();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int i1 = kou.b(kog1, 18);
                lal alal[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alal = new lal[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alal, 0, j);
                    i1 = j;
                }
                for (; i1 < alal.length - 1; i1++)
                {
                    alal[i1] = new lal();
                    kog1.a(alal[i1]);
                    kog1.a();
                }

                alal[i1] = new lal();
                kog1.a(alal[i1]);
                b = alal;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kyo();
                }
                kog1.a(c);
                break;

            case 32: // ' '
                int j1 = kou.b(kog1, 32);
                int ai[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                ai = new int[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, ai, 0, k);
                    j1 = k;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = kog1.f();
                    kog1.a();
                }

                ai[j1] = kog1.f();
                d = ai;
                break;

            case 34: // '"'
                int l1 = kog1.c(kog1.p());
                int l = kog1.r();
                int k1;
                for (k1 = 0; kog1.q() > 0; k1++)
                {
                    kog1.f();
                }

                kog1.e(l);
                int ai1[];
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                ai1 = new int[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, ai1, 0, l);
                    k1 = l;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = kog1.f();
                }

                d = ai1;
                kog1.d(l1);
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
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lal lal1 = b[i];
                if (lal1 != null)
                {
                    koh1.b(2, lal1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                koh1.a(4, d[j]);
            }

        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        super.writeTo(koh1);
    }
}
