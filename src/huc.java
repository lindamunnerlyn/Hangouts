// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huc extends koj
{

    public hug a[];
    public hur b;
    public huf c;

    public huc()
    {
        a = hug.a();
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    hug hug1 = a[k];
                    j = i;
                    if (hug1 != null)
                    {
                        j = i + koh.d(1, hug1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(3, c);
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
                int k = kou.b(kog1, 10);
                hug ahug[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ahug = new hug[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ahug, 0, j);
                    k = j;
                }
                for (; k < ahug.length - 1; k++)
                {
                    ahug[k] = new hug();
                    kog1.a(ahug[k]);
                    kog1.a();
                }

                ahug[k] = new hug();
                kog1.a(ahug[k]);
                a = ahug;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new hur();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new huf();
                }
                kog1.a(c);
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
                hug hug1 = a[i];
                if (hug1 != null)
                {
                    koh1.b(1, hug1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        super.writeTo(koh1);
    }
}
