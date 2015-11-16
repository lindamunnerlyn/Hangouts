// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbm extends koj
{

    public String a;
    public Integer b;
    public lbn c[];

    public lbm()
    {
        a = null;
        b = null;
        c = lbn.a();
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
            i = j + koh.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    lbn lbn1 = c[j];
                    int k = i;
                    if (lbn1 != null)
                    {
                        k = i + koh.d(3, lbn1);
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

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                lbn albn[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                albn = new lbn[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, albn, 0, j);
                    k = j;
                }
                for (; k < albn.length - 1; k++)
                {
                    albn[k] = new lbn();
                    kog1.a(albn[k]);
                    kog1.a();
                }

                albn[k] = new lbn();
                kog1.a(albn[k]);
                c = albn;
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
            koh1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                lbn lbn1 = c[i];
                if (lbn1 != null)
                {
                    koh1.b(3, lbn1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
