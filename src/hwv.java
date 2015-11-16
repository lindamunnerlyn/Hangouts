// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwv extends koj
{

    public ikg a;
    public Boolean b;
    public Boolean c;
    public ijz d[];
    public ijz e[];

    public hwv()
    {
        a = null;
        b = null;
        c = null;
        d = ijz.a();
        e = ijz.a();
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
        int i1 = i;
        if (b != null)
        {
            b.booleanValue();
            i1 = i + (koh.f(2) + 1);
        }
        j = i1;
        if (c != null)
        {
            c.booleanValue();
            j = i1 + (koh.f(3) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (int k = 0; k < d.length;)
                {
                    ijz ijz1 = d[k];
                    i1 = i;
                    if (ijz1 != null)
                    {
                        i1 = i + koh.d(4, ijz1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        i1 = i;
        if (e != null)
        {
            i1 = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    ijz ijz2 = e[l];
                    i1 = i;
                    if (ijz2 != null)
                    {
                        i1 = i + koh.d(5, ijz2);
                    }
                    l++;
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
                if (a == null)
                {
                    a = new ikg();
                }
                kog1.a(a);
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kog1.i());
                break;

            case 34: // '"'
                int l = kou.b(kog1, 34);
                ijz aijz[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                aijz = new ijz[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, aijz, 0, j);
                    l = j;
                }
                for (; l < aijz.length - 1; l++)
                {
                    aijz[l] = new ijz();
                    kog1.a(aijz[l]);
                    kog1.a();
                }

                aijz[l] = new ijz();
                kog1.a(aijz[l]);
                d = aijz;
                break;

            case 42: // '*'
                int i1 = kou.b(kog1, 42);
                ijz aijz1[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aijz1 = new ijz[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, aijz1, 0, k);
                    i1 = k;
                }
                for (; i1 < aijz1.length - 1; i1++)
                {
                    aijz1[i1] = new ijz();
                    kog1.a(aijz1[i1]);
                    kog1.a();
                }

                aijz1[i1] = new ijz();
                kog1.a(aijz1[i1]);
                e = aijz1;
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
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                ijz ijz1 = d[i];
                if (ijz1 != null)
                {
                    koh1.b(4, ijz1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                ijz ijz2 = e[j];
                if (ijz2 != null)
                {
                    koh1.b(5, ijz2);
                }
            }

        }
        super.writeTo(koh1);
    }
}
