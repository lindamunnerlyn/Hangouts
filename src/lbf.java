// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbf extends koj
{

    private static volatile lbf g[];
    public kyo a;
    public lci b[];
    public String c;
    public String d;
    public Long e;
    public Long f;

    public lbf()
    {
        a = null;
        b = lci.a();
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lbf[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new lbf[0];
                }
            }
        }
        return g;
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
                    lci lci1 = b[j];
                    int k = i;
                    if (lci1 != null)
                    {
                        k = i + koh.d(2, lci1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        j += koh.b(3, c);
        i = j;
        if (d != null)
        {
            i = j + koh.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.e(5, e.longValue());
        }
        i = j;
        if (f != null)
        {
            i = j + koh.e(6, f.longValue());
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
                    a = new kyo();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                lci alci[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alci = new lci[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alci, 0, j);
                    k = j;
                }
                for (; k < alci.length - 1; k++)
                {
                    alci[k] = new lci();
                    kog1.a(alci[k]);
                    kog1.a();
                }

                alci[k] = new lci();
                kog1.a(alci[k]);
                b = alci;
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 40: // '('
                e = Long.valueOf(kog1.e());
                break;

            case 48: // '0'
                f = Long.valueOf(kog1.e());
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
                lci lci1 = b[i];
                if (lci1 != null)
                {
                    koh1.b(2, lci1);
                }
            }

        }
        koh1.a(3, c);
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e.longValue());
        }
        if (f != null)
        {
            koh1.b(6, f.longValue());
        }
        super.writeTo(koh1);
    }
}
