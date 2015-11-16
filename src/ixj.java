// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixj extends koj
{

    public ivt a;
    public iul b[];
    public ixh c[];
    public iyx d;

    public ixj()
    {
        a = null;
        b = iul.a();
        c = ixh.a();
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
            j = i + koh.d(1, a);
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
                    iul iul1 = b[j];
                    int k = i;
                    if (iul1 != null)
                    {
                        k = i + koh.d(2, iul1);
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
                    ixh ixh1 = c[l];
                    j = i;
                    if (ixh1 != null)
                    {
                        j = i + koh.d(3, ixh1);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new ivt();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int l = kou.b(kog1, 18);
                iul aiul[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aiul = new iul[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aiul, 0, j);
                    l = j;
                }
                for (; l < aiul.length - 1; l++)
                {
                    aiul[l] = new iul();
                    kog1.a(aiul[l]);
                    kog1.a();
                }

                aiul[l] = new iul();
                kog1.a(aiul[l]);
                b = aiul;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                ixh aixh[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aixh = new ixh[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aixh, 0, k);
                    i1 = k;
                }
                for (; i1 < aixh.length - 1; i1++)
                {
                    aixh[i1] = new ixh();
                    kog1.a(aixh[i1]);
                    kog1.a();
                }

                aixh[i1] = new ixh();
                kog1.a(aixh[i1]);
                c = aixh;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new iyx();
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
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                iul iul1 = b[i];
                if (iul1 != null)
                {
                    koh1.b(2, iul1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                ixh ixh1 = c[j];
                if (ixh1 != null)
                {
                    koh1.b(3, ixh1);
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
