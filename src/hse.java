// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hse extends koj
{

    public String a;
    public String b;
    public String c;
    public hql d[];

    public hse()
    {
        a = null;
        b = null;
        c = null;
        d = hql.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    hql hql1 = d[j];
                    int k = i;
                    if (hql1 != null)
                    {
                        k = i + koh.d(3, hql1);
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
            i = j + koh.b(4, c);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                hql ahql[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                ahql = new hql[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, ahql, 0, j);
                    k = j;
                }
                for (; k < ahql.length - 1; k++)
                {
                    ahql[k] = new hql();
                    kog1.a(ahql[k]);
                    kog1.a();
                }

                ahql[k] = new hql();
                kog1.a(ahql[k]);
                d = ahql;
                break;

            case 34: // '"'
                c = kog1.j();
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
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                hql hql1 = d[i];
                if (hql1 != null)
                {
                    koh1.b(3, hql1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(4, c);
        }
        super.writeTo(koh1);
    }
}
