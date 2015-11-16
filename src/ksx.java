// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksx extends koj
{

    public kku a[];
    public Integer b;
    public Integer c;
    public kso d[];

    public ksx()
    {
        a = kku.a();
        b = null;
        c = null;
        d = kso.a();
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
                    kku kku1 = a[j];
                    int l = i;
                    if (kku1 != null)
                    {
                        l = i + koh.d(1, kku1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.intValue());
        }
        int i1 = i;
        if (d != null)
        {
            i1 = i;
            if (d.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= d.length)
                    {
                        break;
                    }
                    kso kso1 = d[k];
                    i1 = i;
                    if (kso1 != null)
                    {
                        i1 = i + koh.d(4, kso1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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
                int l = kou.b(kog1, 10);
                kku akku[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akku = new kku[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akku, 0, j);
                    l = j;
                }
                for (; l < akku.length - 1; l++)
                {
                    akku[l] = new kku();
                    kog1.a(akku[l]);
                    kog1.a();
                }

                akku[l] = new kku();
                kog1.a(akku[l]);
                a = akku;
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.f());
                break;

            case 34: // '"'
                int i1 = kou.b(kog1, 34);
                kso akso[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                akso = new kso[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, akso, 0, k);
                    i1 = k;
                }
                for (; i1 < akso.length - 1; i1++)
                {
                    akso[i1] = new kso();
                    kog1.a(akso[i1]);
                    kog1.a();
                }

                akso[i1] = new kso();
                kog1.a(akso[i1]);
                d = akso;
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
                kku kku1 = a[i];
                if (kku1 != null)
                {
                    koh1.b(1, kku1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                kso kso1 = d[j];
                if (kso1 != null)
                {
                    koh1.b(4, kso1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
