// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hys extends koj
{

    public String a;
    public hyt b[];

    public hys()
    {
        a = null;
        b = hyt.a();
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
                    hyt hyt1 = b[j];
                    int k = i;
                    if (hyt1 != null)
                    {
                        k = i + koh.d(2, hyt1);
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
                int k = kou.b(kog1, 18);
                hyt ahyt[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahyt = new hyt[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahyt, 0, j);
                    k = j;
                }
                for (; k < ahyt.length - 1; k++)
                {
                    ahyt[k] = new hyt();
                    kog1.a(ahyt[k]);
                    kog1.a();
                }

                ahyt[k] = new hyt();
                kog1.a(ahyt[k]);
                b = ahyt;
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
                hyt hyt1 = b[i];
                if (hyt1 != null)
                {
                    koh1.b(2, hyt1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
