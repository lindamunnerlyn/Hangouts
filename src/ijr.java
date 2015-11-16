// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ijr extends koj
{

    public String a;
    public ieh b[];
    public kuc c;
    public Long d;
    public String e;

    public ijr()
    {
        a = null;
        b = ieh.a();
        c = null;
        d = null;
        e = null;
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
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ieh ieh1 = b[j];
                    int k = i;
                    if (ieh1 != null)
                    {
                        k = i + koh.d(2, ieh1);
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
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.e(4, d.longValue());
        }
        i = j;
        if (e != null)
        {
            i = j + koh.b(5, e);
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
                int k = kou.b(kog1, 18);
                ieh aieh[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aieh = new ieh[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aieh, 0, j);
                    k = j;
                }
                for (; k < aieh.length - 1; k++)
                {
                    aieh[k] = new ieh();
                    kog1.a(aieh[k]);
                    kog1.a();
                }

                aieh[k] = new ieh();
                kog1.a(aieh[k]);
                b = aieh;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kuc();
                }
                kog1.a(c);
                break;

            case 32: // ' '
                d = Long.valueOf(kog1.e());
                break;

            case 42: // '*'
                e = kog1.j();
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ieh ieh1 = b[i];
                if (ieh1 != null)
                {
                    koh1.b(2, ieh1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d.longValue());
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        super.writeTo(koh1);
    }
}
