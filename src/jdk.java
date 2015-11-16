// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdk extends koj
{

    public jel a[];
    public jdj b[];

    public jdk()
    {
        a = jel.a();
        b = jdj.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (int k = 0; k < a.length;)
                {
                    jel jel1 = a[k];
                    int i1 = i;
                    if (jel1 != null)
                    {
                        i1 = i + koh.d(2, jel1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (b != null)
        {
            j1 = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    jdj jdj1 = b[l];
                    j1 = i;
                    if (jdj1 != null)
                    {
                        j1 = i + koh.d(3, jdj1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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
                int l = kou.b(kog1, 18);
                jel ajel[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajel = new jel[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajel, 0, j);
                    l = j;
                }
                for (; l < ajel.length - 1; l++)
                {
                    ajel[l] = new jel();
                    kog1.a(ajel[l]);
                    kog1.a();
                }

                ajel[l] = new jel();
                kog1.a(ajel[l]);
                a = ajel;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                jdj ajdj[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ajdj = new jdj[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ajdj, 0, k);
                    i1 = k;
                }
                for (; i1 < ajdj.length - 1; i1++)
                {
                    ajdj[i1] = new jdj();
                    kog1.a(ajdj[i1]);
                    kog1.a();
                }

                ajdj[i1] = new jdj();
                kog1.a(ajdj[i1]);
                b = ajdj;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jel jel1 = a[i];
                if (jel1 != null)
                {
                    koh1.b(2, jel1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                jdj jdj1 = b[j];
                if (jdj1 != null)
                {
                    koh1.b(3, jdj1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
