// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdo extends koj
{

    public jdp a[];

    public jdo()
    {
        a = jdp.a();
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
                    jdp jdp1 = a[j];
                    k = i;
                    if (jdp1 != null)
                    {
                        k = i + koh.d(1, jdp1);
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
                jdp ajdp[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajdp = new jdp[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajdp, 0, j);
                    k = j;
                }
                for (; k < ajdp.length - 1; k++)
                {
                    ajdp[k] = new jdp();
                    kog1.a(ajdp[k]);
                    kog1.a();
                }

                ajdp[k] = new jdp();
                kog1.a(ajdp[k]);
                a = ajdp;
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
                jdp jdp1 = a[i];
                if (jdp1 != null)
                {
                    koh1.b(1, jdp1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
