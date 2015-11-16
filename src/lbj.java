// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbj extends koj
{

    public lcb a;
    public lbi b[];
    public Integer c;
    public Integer d;
    public kyo e;
    public lbx f;
    public lbd g;
    public lbg h;
    public lbk i;

    public lbj()
    {
        a = null;
        b = lbi.a();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + koh.d(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j;
            if (b.length > 0)
            {
                for (k = 0; k < b.length;)
                {
                    lbi lbi1 = b[k];
                    int l = j;
                    if (lbi1 != null)
                    {
                        l = j + koh.d(2, lbi1);
                    }
                    k++;
                    j = l;
                }

                k = j;
            }
        }
        j = k;
        if (c != null)
        {
            j = k + koh.e(3, c.intValue());
        }
        k = j;
        if (d != null)
        {
            k = j + koh.e(4, d.intValue());
        }
        j = k;
        if (e != null)
        {
            j = k + koh.d(5, e);
        }
        k = j;
        if (f != null)
        {
            k = j + koh.d(6, f);
        }
        j = k;
        if (g != null)
        {
            j = k + koh.d(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + koh.d(60, h);
        }
        j = k;
        if (i != null)
        {
            j = k + koh.d(61, i);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int j = kog1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kog1, j))
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
                int l = kou.b(kog1, 18);
                lbi albi[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                albi = new lbi[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, albi, 0, k);
                    l = k;
                }
                for (; l < albi.length - 1; l++)
                {
                    albi[l] = new lbi();
                    kog1.a(albi[l]);
                    kog1.a();
                }

                albi[l] = new lbi();
                kog1.a(albi[l]);
                b = albi;
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kog1.f());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new kyo();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new lbx();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new lbd();
                }
                kog1.a(g);
                break;

            case 482: 
                if (h == null)
                {
                    h = new lbg();
                }
                kog1.a(h);
                break;

            case 490: 
                if (i == null)
                {
                    i = new lbk();
                }
                kog1.a(i);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                lbi lbi1 = b[j];
                if (lbi1 != null)
                {
                    koh1.b(2, lbi1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.b(60, h);
        }
        if (i != null)
        {
            koh1.b(61, i);
        }
        super.writeTo(koh1);
    }
}
