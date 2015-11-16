// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ijg extends koj
{

    public String a;
    public String b;
    public Long c;
    public ijh d[];

    public ijg()
    {
        a = null;
        b = null;
        c = null;
        d = ijh.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    ijh ijh1 = d[j];
                    int k = i;
                    if (ijh1 != null)
                    {
                        k = i + koh.d(4, ijh1);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 24: // '\030'
                c = Long.valueOf(kog1.e());
                break;

            case 34: // '"'
                int k = kou.b(kog1, 34);
                ijh aijh[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                aijh = new ijh[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, aijh, 0, j);
                    k = j;
                }
                for (; k < aijh.length - 1; k++)
                {
                    aijh[k] = new ijh();
                    kog1.a(aijh[k]);
                    kog1.a();
                }

                aijh[k] = new ijh();
                kog1.a(aijh[k]);
                d = aijh;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c.longValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                ijh ijh1 = d[i];
                if (ijh1 != null)
                {
                    koh1.b(4, ijh1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
