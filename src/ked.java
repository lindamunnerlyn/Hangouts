// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ked extends koj
{

    public keh a;
    public kef b[];

    public ked()
    {
        a = null;
        b = kef.a();
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
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kef kef1 = b[j];
                    int k = i;
                    if (kef1 != null)
                    {
                        k = i + koh.d(2, kef1);
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
                    a = new keh();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                kef akef[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akef = new kef[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akef, 0, j);
                    k = j;
                }
                for (; k < akef.length - 1; k++)
                {
                    akef[k] = new kef();
                    kog1.a(akef[k]);
                    kog1.a();
                }

                akef[k] = new kef();
                kog1.a(akef[k]);
                b = akef;
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kef kef1 = b[i];
                if (kef1 != null)
                {
                    koh1.b(2, kef1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
