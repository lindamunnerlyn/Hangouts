// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lat extends koj
{

    public las a[];
    public las b[];
    public String c;

    public lat()
    {
        a = las.a();
        b = las.a();
        c = null;
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
                    las las1 = a[j];
                    int k = i;
                    if (las1 != null)
                    {
                        k = i + koh.d(1, las1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    las las2 = b[l];
                    j = i;
                    if (las2 != null)
                    {
                        j = i + koh.d(2, las2);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(3, c);
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
                int l = kou.b(kog1, 10);
                las alas[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alas = new las[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alas, 0, j);
                    l = j;
                }
                for (; l < alas.length - 1; l++)
                {
                    alas[l] = new las();
                    kog1.a(alas[l]);
                    kog1.a();
                }

                alas[l] = new las();
                kog1.a(alas[l]);
                a = alas;
                break;

            case 18: // '\022'
                int i1 = kou.b(kog1, 18);
                las alas1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                alas1 = new las[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, alas1, 0, k);
                    i1 = k;
                }
                for (; i1 < alas1.length - 1; i1++)
                {
                    alas1[i1] = new las();
                    kog1.a(alas1[i1]);
                    kog1.a();
                }

                alas1[i1] = new las();
                kog1.a(alas1[i1]);
                b = alas1;
                break;

            case 26: // '\032'
                c = kog1.j();
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
                las las1 = a[i];
                if (las1 != null)
                {
                    koh1.b(1, las1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                las las2 = b[j];
                if (las2 != null)
                {
                    koh1.b(2, las2);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        super.writeTo(koh1);
    }
}
