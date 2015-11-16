// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lch extends koj
{

    private static volatile lch f[];
    public laz a;
    public String b;
    public lcj c[];
    public String d;
    public kyo e;

    public lch()
    {
        a = null;
        b = null;
        c = lcj.a();
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lch[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new lch[0];
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
            j = i + koh.d(1, a);
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
                    lcj lcj1 = c[j];
                    int k = i;
                    if (lcj1 != null)
                    {
                        k = i + koh.d(3, lcj1);
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
            i = j + koh.b(4, d);
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
                if (a == null)
                {
                    a = new laz();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                lcj alcj[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                alcj = new lcj[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, alcj, 0, j);
                    k = j;
                }
                for (; k < alcj.length - 1; k++)
                {
                    alcj[k] = new lcj();
                    kog1.a(alcj[k]);
                    kog1.a();
                }

                alcj[k] = new lcj();
                kog1.a(alcj[k]);
                c = alcj;
                break;

            case 34: // '"'
                d = kog1.j();
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
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                lcj lcj1 = c[i];
                if (lcj1 != null)
                {
                    koh1.b(3, lcj1);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        super.writeTo(koh1);
    }
}
