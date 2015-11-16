// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihq extends koj
{

    public ihm a;
    public String b;
    public String c;
    public igw d[];

    public ihq()
    {
        a = null;
        b = null;
        c = null;
        d = igw.a();
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
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    igw igw1 = d[j];
                    int k = i;
                    if (igw1 != null)
                    {
                        k = i + koh.d(4, igw1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new ihm();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                int k = kou.b(kog1, 34);
                igw aigw[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                aigw = new igw[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, aigw, 0, j);
                    k = j;
                }
                for (; k < aigw.length - 1; k++)
                {
                    aigw[k] = new igw();
                    kog1.a(aigw[k]);
                    kog1.a();
                }

                aigw[k] = new igw();
                kog1.a(aigw[k]);
                d = aigw;
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
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                igw igw1 = d[i];
                if (igw1 != null)
                {
                    koh1.b(4, igw1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
