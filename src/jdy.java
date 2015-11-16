// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdy extends koj
{

    public jbw a;
    public jcm b[];
    public jdx c[];
    public jdx d;

    public jdy()
    {
        a = null;
        b = jcm.a();
        c = jdx.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.d(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (j = 0; j < b.length;)
                {
                    jcm jcm1 = b[j];
                    int k = i;
                    if (jcm1 != null)
                    {
                        k = i + koh.d(2, jcm1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    jdx jdx1 = c[l];
                    j = i;
                    if (jdx1 != null)
                    {
                        j = i + koh.d(3, jdx1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d);
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
                if (a == null)
                {
                    a = new jbw();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int l = kou.b(kog1, 18);
                jcm ajcm[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajcm = new jcm[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajcm, 0, j);
                    l = j;
                }
                for (; l < ajcm.length - 1; l++)
                {
                    ajcm[l] = new jcm();
                    kog1.a(ajcm[l]);
                    kog1.a();
                }

                ajcm[l] = new jcm();
                kog1.a(ajcm[l]);
                b = ajcm;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                jdx ajdx[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajdx = new jdx[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ajdx, 0, k);
                    i1 = k;
                }
                for (; i1 < ajdx.length - 1; i1++)
                {
                    ajdx[i1] = new jdx();
                    kog1.a(ajdx[i1]);
                    kog1.a();
                }

                ajdx[i1] = new jdx();
                kog1.a(ajdx[i1]);
                c = ajdx;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jdx();
                }
                kog1.a(d);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jcm jcm1 = b[i];
                if (jcm1 != null)
                {
                    koh1.b(2, jcm1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                jdx jdx1 = c[j];
                if (jdx1 != null)
                {
                    koh1.b(3, jdx1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        super.writeTo(koh1);
    }
}
