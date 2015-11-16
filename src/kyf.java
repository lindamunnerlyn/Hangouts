// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyf extends koj
{

    public kye a;
    public Long b;
    public String c;
    public String d;
    public kyq e[];
    public lcd f;

    public kyf()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kyq.a();
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(2, b.longValue());
        }
        int k = j;
        if (c != null)
        {
            k = j + koh.b(3, c);
        }
        i = k;
        if (d != null)
        {
            i = k + koh.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    kyq kyq1 = e[j];
                    int l = i;
                    if (kyq1 != null)
                    {
                        l = i + koh.d(5, kyq1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (f != null)
        {
            i = j + koh.d(6, f);
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
                    a = new kye();
                }
                kog1.a(a);
                break;

            case 16: // '\020'
                b = Long.valueOf(kog1.e());
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                int k = kou.b(kog1, 42);
                kyq akyq[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                akyq = new kyq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, akyq, 0, j);
                    k = j;
                }
                for (; k < akyq.length - 1; k++)
                {
                    akyq[k] = new kyq();
                    kog1.a(akyq[k]);
                    kog1.a();
                }

                akyq[k] = new kyq();
                kog1.a(akyq[k]);
                e = akyq;
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new lcd();
                }
                kog1.a(f);
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
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                kyq kyq1 = e[i];
                if (kyq1 != null)
                {
                    koh1.b(5, kyq1);
                }
            }

        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        super.writeTo(koh1);
    }
}
