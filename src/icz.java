// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icz extends koj
{

    private static volatile icz e[];
    public ide a;
    public idf b;
    public idc c[];
    public idd d[];

    public icz()
    {
        a = null;
        b = null;
        c = idc.a();
        d = idd.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static icz[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new icz[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    idc idc1 = c[k];
                    int i1 = i;
                    if (idc1 != null)
                    {
                        i1 = i + koh.d(3, idc1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (d != null)
        {
            j1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    idd idd1 = d[l];
                    j1 = i;
                    if (idd1 != null)
                    {
                        j1 = i + koh.d(4, idd1);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new ide();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new idf();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                int l = kou.b(kog1, 26);
                idc aidc[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aidc = new idc[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aidc, 0, j);
                    l = j;
                }
                for (; l < aidc.length - 1; l++)
                {
                    aidc[l] = new idc();
                    kog1.a(aidc[l]);
                    kog1.a();
                }

                aidc[l] = new idc();
                kog1.a(aidc[l]);
                c = aidc;
                break;

            case 34: // '"'
                int i1 = kou.b(kog1, 34);
                idd aidd[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                aidd = new idd[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, aidd, 0, k);
                    i1 = k;
                }
                for (; i1 < aidd.length - 1; i1++)
                {
                    aidd[i1] = new idd();
                    kog1.a(aidd[i1]);
                    kog1.a();
                }

                aidd[i1] = new idd();
                kog1.a(aidd[i1]);
                d = aidd;
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
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                idc idc1 = c[i];
                if (idc1 != null)
                {
                    koh1.b(3, idc1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                idd idd1 = d[j];
                if (idd1 != null)
                {
                    koh1.b(4, idd1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
