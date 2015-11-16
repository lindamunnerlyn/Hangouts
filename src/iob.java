// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iob extends koj
{

    public String a;
    public String b;
    public Integer c;
    public Integer d;
    public ioc e[];

    public iob()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = ioc.a();
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
        int k = j;
        if (c != null)
        {
            k = j + koh.e(3, c.intValue());
        }
        i = k;
        if (d != null)
        {
            i = k + koh.e(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    ioc ioc1 = e[j];
                    int l = i;
                    if (ioc1 != null)
                    {
                        l = i + koh.c(5, ioc1);
                    }
                    j++;
                    i = l;
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
                c = Integer.valueOf(kog1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kog1.f());
                break;

            case 43: // '+'
                int k = kou.b(kog1, 43);
                ioc aioc[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                aioc = new ioc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, aioc, 0, j);
                    k = j;
                }
                for (; k < aioc.length - 1; k++)
                {
                    aioc[k] = new ioc();
                    kog1.a(aioc[k], 5);
                    kog1.a();
                }

                aioc[k] = new ioc();
                kog1.a(aioc[k], 5);
                e = aioc;
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
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                ioc ioc1 = e[i];
                if (ioc1 != null)
                {
                    koh1.a(5, ioc1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
