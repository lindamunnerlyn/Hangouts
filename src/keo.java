// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class keo extends koj
{

    public String a;
    public kdz b[];
    public jzk c[];
    public kbt d[];
    public kel e[];

    public keo()
    {
        a = null;
        b = kdz.a();
        c = jzk.a();
        d = kbt.a();
        e = kel.a();
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kdz kdz1 = b[j];
                    int j1 = i;
                    if (kdz1 != null)
                    {
                        j1 = i + koh.d(2, kdz1);
                    }
                    j++;
                    i = j1;
                }

                j = i;
            }
        }
        int k1 = j;
        if (c != null)
        {
            k1 = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    jzk jzk1 = c[k];
                    k1 = i;
                    if (jzk1 != null)
                    {
                        k1 = i + koh.d(3, jzk1);
                    }
                    k++;
                    i = k1;
                }

                k1 = i;
            }
        }
        i = k1;
        if (d != null)
        {
            i = k1;
            if (d.length > 0)
            {
                i = k1;
                for (int l = 0; l < d.length;)
                {
                    kbt kbt1 = d[l];
                    k1 = i;
                    if (kbt1 != null)
                    {
                        k1 = i + koh.d(4, kbt1);
                    }
                    l++;
                    i = k1;
                }

            }
        }
        k1 = i;
        if (e != null)
        {
            k1 = i;
            if (e.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (i1 >= e.length)
                    {
                        break;
                    }
                    kel kel1 = e[i1];
                    k1 = i;
                    if (kel1 != null)
                    {
                        k1 = i + koh.d(5, kel1);
                    }
                    i1++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
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
                a = kog1.j();
                break;

            case 18: // '\022'
                int j1 = kou.b(kog1, 18);
                kdz akdz[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akdz = new kdz[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akdz, 0, j);
                    j1 = j;
                }
                for (; j1 < akdz.length - 1; j1++)
                {
                    akdz[j1] = new kdz();
                    kog1.a(akdz[j1]);
                    kog1.a();
                }

                akdz[j1] = new kdz();
                kog1.a(akdz[j1]);
                b = akdz;
                break;

            case 26: // '\032'
                int k1 = kou.b(kog1, 26);
                jzk ajzk[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajzk = new jzk[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ajzk, 0, k);
                    k1 = k;
                }
                for (; k1 < ajzk.length - 1; k1++)
                {
                    ajzk[k1] = new jzk();
                    kog1.a(ajzk[k1]);
                    kog1.a();
                }

                ajzk[k1] = new jzk();
                kog1.a(ajzk[k1]);
                c = ajzk;
                break;

            case 34: // '"'
                int l1 = kou.b(kog1, 34);
                kbt akbt[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                akbt = new kbt[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, akbt, 0, l);
                    l1 = l;
                }
                for (; l1 < akbt.length - 1; l1++)
                {
                    akbt[l1] = new kbt();
                    kog1.a(akbt[l1]);
                    kog1.a();
                }

                akbt[l1] = new kbt();
                kog1.a(akbt[l1]);
                d = akbt;
                break;

            case 42: // '*'
                int i2 = kou.b(kog1, 42);
                kel akel[];
                int i1;
                if (e == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = e.length;
                }
                akel = new kel[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(e, 0, akel, 0, i1);
                    i2 = i1;
                }
                for (; i2 < akel.length - 1; i2++)
                {
                    akel[i2] = new kel();
                    kog1.a(akel[i2]);
                    kog1.a();
                }

                akel[i2] = new kel();
                kog1.a(akel[i2]);
                e = akel;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kdz kdz1 = b[i];
                if (kdz1 != null)
                {
                    koh1.b(2, kdz1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                jzk jzk1 = c[j];
                if (jzk1 != null)
                {
                    koh1.b(3, jzk1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                kbt kbt1 = d[k];
                if (kbt1 != null)
                {
                    koh1.b(4, kbt1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < e.length; l++)
            {
                kel kel1 = e[l];
                if (kel1 != null)
                {
                    koh1.b(5, kel1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
