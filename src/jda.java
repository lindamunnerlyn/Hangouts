// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jda extends koj
{

    public int a[];
    public jdb b[];

    public jda()
    {
        a = kou.a;
        b = jdb.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int i;
        if (a != null && a.length > 0)
        {
            i = 0;
            int j = 0;
            for (; i < a.length; i++)
            {
                j += koh.h(a[i]);
            }

            i = l + j + a.length * 1;
        } else
        {
            i = l;
        }
        l = i;
        if (b != null)
        {
            l = i;
            if (b.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    l = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    jdb jdb1 = b[k];
                    l = i;
                    if (jdb1 != null)
                    {
                        l = i + koh.d(2, jdb1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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
                int i1 = kou.b(kog1, 8);
                int ai[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ai = new int[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ai, 0, j);
                    i1 = j;
                }
                for (; i1 < ai.length - 1; i1++)
                {
                    ai[i1] = kog1.l();
                    kog1.a();
                }

                ai[i1] = kog1.l();
                a = ai;
                break;

            case 10: // '\n'
                int l1 = kog1.c(kog1.p());
                int k = kog1.r();
                int j1;
                for (j1 = 0; kog1.q() > 0; j1++)
                {
                    kog1.l();
                }

                kog1.e(k);
                int ai1[];
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ai1 = new int[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, k);
                    j1 = k;
                }
                for (; j1 < ai1.length; j1++)
                {
                    ai1[j1] = kog1.l();
                }

                a = ai1;
                kog1.d(l1);
                break;

            case 18: // '\022'
                int k1 = kou.b(kog1, 18);
                jdb ajdb[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                ajdb = new jdb[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, ajdb, 0, l);
                    k1 = l;
                }
                for (; k1 < ajdb.length - 1; k1++)
                {
                    ajdb[k1] = new jdb();
                    kog1.a(ajdb[k1]);
                    kog1.a();
                }

                ajdb[k1] = new jdb();
                kog1.a(ajdb[k1]);
                b = ajdb;
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
                koh1.c(1, a[i]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                jdb jdb1 = b[j];
                if (jdb1 != null)
                {
                    koh1.b(2, jdb1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
