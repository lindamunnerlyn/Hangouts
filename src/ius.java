// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ius extends koj
{

    private static volatile ius h[];
    public String a;
    public String b;
    public String c;
    public jtj d;
    public String e;
    public iut f[];
    public byte g[];

    public ius()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = iut.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ius[] a()
    {
        if (h == null)
        {
            synchronized (kon.a)
            {
                if (h == null)
                {
                    h = new ius[0];
                }
            }
        }
        return h;
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
            i = j + koh.b(3, c);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.b(4, e);
        }
        i = j;
        if (g != null)
        {
            i = j + koh.b(5, g);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    iut iut1 = f[j];
                    int k = i;
                    if (iut1 != null)
                    {
                        k = i + koh.d(6, iut1);
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
            i = j + koh.d(7, d);
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
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                e = kog1.j();
                break;

            case 42: // '*'
                g = kog1.k();
                break;

            case 50: // '2'
                int k = kou.b(kog1, 50);
                iut aiut[];
                int j;
                if (f == null)
                {
                    j = 0;
                } else
                {
                    j = f.length;
                }
                aiut = new iut[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(f, 0, aiut, 0, j);
                    k = j;
                }
                for (; k < aiut.length - 1; k++)
                {
                    aiut[k] = new iut();
                    kog1.a(aiut[k]);
                    kog1.a();
                }

                aiut[k] = new iut();
                kog1.a(aiut[k]);
                f = aiut;
                break;

            case 58: // ':'
                if (d == null)
                {
                    d = new jtj();
                }
                kog1.a(d);
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
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (g != null)
        {
            koh1.a(5, g);
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                iut iut1 = f[i];
                if (iut1 != null)
                {
                    koh1.b(6, iut1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(7, d);
        }
        super.writeTo(koh1);
    }
}
