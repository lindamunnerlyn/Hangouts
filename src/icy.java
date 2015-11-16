// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icy extends koj
{

    public icz a[];
    public ibn b[];
    public idg c[];
    public ibu d;

    public icy()
    {
        a = icz.a();
        b = ibn.a();
        c = idg.a();
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
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    icz icz1 = a[j];
                    int k = i;
                    if (icz1 != null)
                    {
                        k = i + koh.d(1, icz1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
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
                    ibn ibn1 = b[j];
                    int l = i;
                    if (ibn1 != null)
                    {
                        l = i + koh.d(2, ibn1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    idg idg1 = c[i1];
                    j = i;
                    if (idg1 != null)
                    {
                        j = i + koh.d(3, idg1);
                    }
                    i1++;
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

            case 10: // '\n'
                int i1 = kou.b(kog1, 10);
                icz aicz[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aicz = new icz[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aicz, 0, j);
                    i1 = j;
                }
                for (; i1 < aicz.length - 1; i1++)
                {
                    aicz[i1] = new icz();
                    kog1.a(aicz[i1]);
                    kog1.a();
                }

                aicz[i1] = new icz();
                kog1.a(aicz[i1]);
                a = aicz;
                break;

            case 18: // '\022'
                int j1 = kou.b(kog1, 18);
                ibn aibn[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aibn = new ibn[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aibn, 0, k);
                    j1 = k;
                }
                for (; j1 < aibn.length - 1; j1++)
                {
                    aibn[j1] = new ibn();
                    kog1.a(aibn[j1]);
                    kog1.a();
                }

                aibn[j1] = new ibn();
                kog1.a(aibn[j1]);
                b = aibn;
                break;

            case 26: // '\032'
                int k1 = kou.b(kog1, 26);
                idg aidg[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aidg = new idg[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aidg, 0, l);
                    k1 = l;
                }
                for (; k1 < aidg.length - 1; k1++)
                {
                    aidg[k1] = new idg();
                    kog1.a(aidg[k1]);
                    kog1.a();
                }

                aidg[k1] = new idg();
                kog1.a(aidg[k1]);
                c = aidg;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new ibu();
                }
                kog1.a(d);
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
                icz icz1 = a[i];
                if (icz1 != null)
                {
                    koh1.b(1, icz1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                ibn ibn1 = b[j];
                if (ibn1 != null)
                {
                    koh1.b(2, ibn1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                idg idg1 = c[k];
                if (idg1 != null)
                {
                    koh1.b(3, idg1);
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
