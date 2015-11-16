// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lcj extends koj
{

    private static volatile lcj f[];
    public String a;
    public lcg b[];
    public lcg c;
    public lcg d;
    public kyo e;

    public lcj()
    {
        a = null;
        b = lcg.a();
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lcj[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new lcj[0];
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
        i = koh.b(1, a) + i;
        int j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    lcg lcg1 = b[k];
                    j = i;
                    if (lcg1 != null)
                    {
                        j = i + koh.d(2, lcg1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(5, e);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                lcg alcg[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alcg = new lcg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alcg, 0, j);
                    k = j;
                }
                for (; k < alcg.length - 1; k++)
                {
                    alcg[k] = new lcg();
                    kog1.a(alcg[k]);
                    kog1.a();
                }

                alcg[k] = new lcg();
                kog1.a(alcg[k]);
                b = alcg;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new lcg();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new lcg();
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
        koh1.a(1, a);
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lcg lcg1 = b[i];
                if (lcg1 != null)
                {
                    koh1.b(2, lcg1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c);
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
