// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class agx extends koj
{

    public iqa a[];
    public Integer b;

    public agx()
    {
        a = iqa.a();
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
                    iqa iqa1 = a[k];
                    j = i;
                    if (iqa1 != null)
                    {
                        j = i + koh.d(1, iqa1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(2, b.intValue());
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
                iqa aiqa[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiqa = new iqa[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiqa, 0, j);
                    k = j;
                }
                for (; k < aiqa.length - 1; k++)
                {
                    aiqa[k] = new iqa();
                    kog1.a(aiqa[k]);
                    kog1.a();
                }

                aiqa[k] = new iqa();
                kog1.a(aiqa[k]);
                a = aiqa;
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
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
                iqa iqa1 = a[i];
                if (iqa1 != null)
                {
                    koh1.b(1, iqa1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        super.writeTo(koh1);
    }
}
