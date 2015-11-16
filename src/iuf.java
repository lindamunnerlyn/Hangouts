// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iuf extends koj
{

    public Boolean a;
    public byte b[];
    public iue c[];

    public iuf()
    {
        a = null;
        b = null;
        c = iue.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            a.booleanValue();
            j = i + (koh.f(1) + 1);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    iue iue1 = c[j];
                    int k = i;
                    if (iue1 != null)
                    {
                        k = i + koh.d(3, iue1);
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

            case 8: // '\b'
                a = Boolean.valueOf(kog1.i());
                break;

            case 18: // '\022'
                b = kog1.k();
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                iue aiue[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aiue = new iue[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aiue, 0, j);
                    k = j;
                }
                for (; k < aiue.length - 1; k++)
                {
                    aiue[k] = new iue();
                    kog1.a(aiue[k]);
                    kog1.a();
                }

                aiue[k] = new iue();
                kog1.a(aiue[k]);
                c = aiue;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                iue iue1 = c[i];
                if (iue1 != null)
                {
                    koh1.b(3, iue1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
