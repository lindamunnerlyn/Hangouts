// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jtx extends koj
{

    public jty a[];
    public jtz b;

    public jtx()
    {
        a = jty.a();
        b = null;
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
                    jty jty1 = a[k];
                    j = i;
                    if (jty1 != null)
                    {
                        j = i + koh.d(1, jty1);
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
                int k = kou.b(kog1, 10);
                jty ajty[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajty = new jty[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajty, 0, j);
                    k = j;
                }
                for (; k < ajty.length - 1; k++)
                {
                    ajty[k] = new jty();
                    kog1.a(ajty[k]);
                    kog1.a();
                }

                ajty[k] = new jty();
                kog1.a(ajty[k]);
                a = ajty;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new jtz();
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
                jty jty1 = a[i];
                if (jty1 != null)
                {
                    koh1.b(1, jty1);
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
