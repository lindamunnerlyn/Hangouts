// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class laa extends koj
{

    private static volatile laa f[];
    public String a;
    public String b;
    public lab c[];
    public kyo d;
    public kyo e;

    public laa()
    {
        a = null;
        b = null;
        c = lab.a();
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static laa[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new laa[0];
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
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    lab lab1 = c[j];
                    int k = i;
                    if (lab1 != null)
                    {
                        k = i + koh.d(3, lab1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(5, e);
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

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                lab alab[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                alab = new lab[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, alab, 0, j);
                    k = j;
                }
                for (; k < alab.length - 1; k++)
                {
                    alab[k] = new lab();
                    kog1.a(alab[k]);
                    kog1.a();
                }

                alab[k] = new lab();
                kog1.a(alab[k]);
                c = alab;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kyo();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new kyo();
                }
                kog1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
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
                lab lab1 = c[i];
                if (lab1 != null)
                {
                    koh1.b(3, lab1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        super.writeTo(koh1);
    }
}
