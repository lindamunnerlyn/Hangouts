// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hsj extends koj
{

    private static volatile hsj f[];
    public hru a;
    public String b;
    public String c;
    public String d;
    public hsk e[];

    public hsj()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = hsk.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hsj[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new hsj[0];
                }
            }
        }
        return f;
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
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        int k = j;
        if (c != null)
        {
            k = j + koh.b(3, c);
        }
        i = k;
        if (d != null)
        {
            i = k + koh.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    hsk hsk1 = e[j];
                    int l = i;
                    if (hsk1 != null)
                    {
                        l = i + koh.d(5, hsk1);
                    }
                    j++;
                    i = l;
                }

                j = i;
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
                if (a == null)
                {
                    a = new hru();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                int k = kou.b(kog1, 42);
                hsk ahsk[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                ahsk = new hsk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, ahsk, 0, j);
                    k = j;
                }
                for (; k < ahsk.length - 1; k++)
                {
                    ahsk[k] = new hsk();
                    kog1.a(ahsk[k]);
                    kog1.a();
                }

                ahsk[k] = new hsk();
                kog1.a(ahsk[k]);
                e = ahsk;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                hsk hsk1 = e[i];
                if (hsk1 != null)
                {
                    koh1.b(5, hsk1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
