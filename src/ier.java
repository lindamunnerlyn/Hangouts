// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ier extends koj
{

    public iga a[];

    public ier()
    {
        a = iga.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    iga iga1 = a[j];
                    k = i;
                    if (iga1 != null)
                    {
                        k = i + koh.d(1, iga1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
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
                iga aiga[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiga = new iga[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiga, 0, j);
                    k = j;
                }
                for (; k < aiga.length - 1; k++)
                {
                    aiga[k] = new iga();
                    kog1.a(aiga[k]);
                    kog1.a();
                }

                aiga[k] = new iga();
                kog1.a(aiga[k]);
                a = aiga;
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
                iga iga1 = a[i];
                if (iga1 != null)
                {
                    koh1.b(1, iga1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
