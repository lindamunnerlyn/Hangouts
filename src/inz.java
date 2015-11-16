// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class inz extends koj
{

    private static volatile inz e[];
    public String a;
    public String b;
    public int c[];
    public int d[];

    public inz()
    {
        a = null;
        b = null;
        c = kou.a;
        d = kou.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static inz[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new inz[0];
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
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j + c.length * 4 + c.length * 1;
            }
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                j = i + d.length * 4 + d.length * 1;
            }
        }
        return j;
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
                b = kog1.j();
                break;

            case 29: // '\035'
                int j1 = kou.b(kog1, 29);
                int ai[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ai = new int[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ai, 0, j);
                    j1 = j;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = kog1.h();
                    kog1.a();
                }

                ai[j1] = kog1.h();
                c = ai;
                break;

            case 26: // '\032'
                int k = kog1.p();
                int j2 = kog1.c(k);
                int k1 = k / 4;
                int ai1[];
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ai1 = new int[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, k);
                    k1 = k;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = kog1.h();
                }

                c = ai1;
                kog1.d(j2);
                break;

            case 37: // '%'
                int l1 = kou.b(kog1, 37);
                int ai2[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                ai2 = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, ai2, 0, l);
                    l1 = l;
                }
                for (; l1 < ai2.length - 1; l1++)
                {
                    ai2[l1] = kog1.h();
                    kog1.a();
                }

                ai2[l1] = kog1.h();
                d = ai2;
                break;

            case 34: // '"'
                int i1 = kog1.p();
                int k2 = kog1.c(i1);
                int i2 = i1 / 4;
                int ai3[];
                if (d == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = d.length;
                }
                ai3 = new int[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(d, 0, ai3, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ai3.length; i2++)
                {
                    ai3[i2] = kog1.h();
                }

                d = ai3;
                kog1.d(k2);
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
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                koh1.b(3, c[i]);
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                koh1.b(4, d[j]);
            }

        }
        super.writeTo(koh1);
    }
}
