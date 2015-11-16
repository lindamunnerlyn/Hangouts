// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hsm extends koj
{

    public String a[];
    public hsl b;

    public hsm()
    {
        a = kou.f;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = 0;
        int k1 = super.computeSerializedSize();
        int k;
        if (a != null && a.length > 0)
        {
            int j = 0;
            int l;
            int i1;
            for (l = 0; i < a.length; l = i1)
            {
                String s = a[i];
                int j1 = j;
                i1 = l;
                if (s != null)
                {
                    i1 = l + 1;
                    j1 = j + koh.a(s);
                }
                i++;
                j = j1;
            }

            i = k1 + j + l * 1;
        } else
        {
            i = k1;
        }
        k = i;
        if (b != null)
        {
            k = i + koh.d(2, b);
        }
        return k;
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
                int k = kou.b(kog1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = kog1.j();
                    kog1.a();
                }

                as[k] = kog1.j();
                a = as;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new hsl();
                }
                kog1.a(b);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    koh1.a(1, s);
                }
            }

        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        super.writeTo(koh1);
    }
}
