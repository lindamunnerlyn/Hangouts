// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ido extends koj
{

    private static volatile ido e[];
    public idr a;
    public ids b;
    public idp c[];
    public idq d[];

    public ido()
    {
        a = null;
        b = null;
        c = idp.a();
        d = idq.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ido[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new ido[0];
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
                    idp idp1 = c[k];
                    int i1 = i;
                    if (idp1 != null)
                    {
                        i1 = i + koh.d(3, idp1);
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
                    idq idq1 = d[l];
                    j1 = i;
                    if (idq1 != null)
                    {
                        j1 = i + koh.d(4, idq1);
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
                    a = new idr();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ids();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                int l = kou.b(kog1, 26);
                idp aidp[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aidp = new idp[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aidp, 0, j);
                    l = j;
                }
                for (; l < aidp.length - 1; l++)
                {
                    aidp[l] = new idp();
                    kog1.a(aidp[l]);
                    kog1.a();
                }

                aidp[l] = new idp();
                kog1.a(aidp[l]);
                c = aidp;
                break;

            case 34: // '"'
                int i1 = kou.b(kog1, 34);
                idq aidq[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                aidq = new idq[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, aidq, 0, k);
                    i1 = k;
                }
                for (; i1 < aidq.length - 1; i1++)
                {
                    aidq[i1] = new idq();
                    kog1.a(aidq[i1]);
                    kog1.a();
                }

                aidq[i1] = new idq();
                kog1.a(aidq[i1]);
                d = aidq;
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
                idp idp1 = c[i];
                if (idp1 != null)
                {
                    koh1.b(3, idp1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                idq idq1 = d[j];
                if (idq1 != null)
                {
                    koh1.b(4, idq1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
