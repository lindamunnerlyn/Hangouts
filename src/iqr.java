// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqr extends koj
{

    public ivm a;
    public isy b[];

    public iqr()
    {
        a = null;
        b = isy.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    isy isy1 = b[k];
                    j = i;
                    if (isy1 != null)
                    {
                        j = i + koh.d(2, isy1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (a != null)
        {
            i = j + koh.d(3, a);
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

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                isy aisy[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aisy = new isy[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aisy, 0, j);
                    k = j;
                }
                for (; k < aisy.length - 1; k++)
                {
                    aisy[k] = new isy();
                    kog1.a(aisy[k]);
                    kog1.a();
                }

                aisy[k] = new isy();
                kog1.a(aisy[k]);
                b = aisy;
                break;

            case 26: // '\032'
                if (a == null)
                {
                    a = new ivm();
                }
                kog1.a(a);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                isy isy1 = b[i];
                if (isy1 != null)
                {
                    koh1.b(2, isy1);
                }
            }

        }
        if (a != null)
        {
            koh1.b(3, a);
        }
        super.writeTo(koh1);
    }
}
