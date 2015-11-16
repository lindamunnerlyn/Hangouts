// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbw extends koj
{

    private static volatile lbw f[];
    public kye a;
    public kyp b[];
    public kyp c;
    public String d;
    public String e;

    public lbw()
    {
        a = null;
        b = kyp.a();
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lbw[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new lbw[0];
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
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kyp kyp1 = b[j];
                    int k = i;
                    if (kyp1 != null)
                    {
                        k = i + koh.d(2, kyp1);
                    }
                    j++;
                    i = k;
                }

                j = i;
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
            j = i + koh.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.b(5, e);
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
                    a = new kye();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                kyp akyp[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akyp = new kyp[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akyp, 0, j);
                    k = j;
                }
                for (; k < akyp.length - 1; k++)
                {
                    akyp[k] = new kyp();
                    kog1.a(akyp[k]);
                    kog1.a();
                }

                akyp[k] = new kyp();
                kog1.a(akyp[k]);
                b = akyp;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kyp();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                e = kog1.j();
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kyp kyp1 = b[i];
                if (kyp1 != null)
                {
                    koh1.b(2, kyp1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        super.writeTo(koh1);
    }
}
