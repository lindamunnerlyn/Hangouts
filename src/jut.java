// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jut extends koj
{

    public juv a[];

    public jut()
    {
        a = juv.a();
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
                    juv juv1 = a[j];
                    k = i;
                    if (juv1 != null)
                    {
                        k = i + koh.d(1, juv1);
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
                juv ajuv[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajuv = new juv[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajuv, 0, j);
                    k = j;
                }
                for (; k < ajuv.length - 1; k++)
                {
                    ajuv[k] = new juv();
                    kog1.a(ajuv[k]);
                    kog1.a();
                }

                ajuv[k] = new juv();
                kog1.a(ajuv[k]);
                a = ajuv;
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
                juv juv1 = a[i];
                if (juv1 != null)
                {
                    koh1.b(1, juv1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
