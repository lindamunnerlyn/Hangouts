// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lba extends koj
{

    private static volatile lba l[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public kyo f;
    public String g;
    public String h;
    public String i;
    public kyo j;
    public lbc k[];

    public lba()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = lbc.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lba[] a()
    {
        if (l == null)
        {
            synchronized (kon.a)
            {
                if (l == null)
                {
                    l = new lba[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.b(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(2, c);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.d(4, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.b(5, g);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(6, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.d(7, j);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.b(8, h);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    lbc lbc1 = k[j1];
                    int k1 = i1;
                    if (lbc1 != null)
                    {
                        k1 = i1 + koh.d(9, lbc1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (a != null)
        {
            i1 = j1 + koh.b(10, a);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(11, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(12, e);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i1 = kog1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kog1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = kog1.j();
                break;

            case 18: // '\022'
                c = kog1.j();
                break;

            case 34: // '"'
                if (f == null)
                {
                    f = new kyo();
                }
                kog1.a(f);
                break;

            case 42: // '*'
                g = kog1.j();
                break;

            case 50: // '2'
                i = kog1.j();
                break;

            case 58: // ':'
                if (j == null)
                {
                    j = new kyo();
                }
                kog1.a(j);
                break;

            case 66: // 'B'
                h = kog1.j();
                break;

            case 74: // 'J'
                int k1 = kou.b(kog1, 74);
                lbc albc[];
                int j1;
                if (k == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = k.length;
                }
                albc = new lbc[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(k, 0, albc, 0, j1);
                    k1 = j1;
                }
                for (; k1 < albc.length - 1; k1++)
                {
                    albc[k1] = new lbc();
                    kog1.a(albc[k1]);
                    kog1.a();
                }

                albc[k1] = new lbc();
                kog1.a(albc[k1]);
                k = albc;
                break;

            case 82: // 'R'
                a = kog1.j();
                break;

            case 90: // 'Z'
                d = kog1.j();
                break;

            case 98: // 'b'
                e = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(1, b);
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (f != null)
        {
            koh1.b(4, f);
        }
        if (g != null)
        {
            koh1.a(5, g);
        }
        if (i != null)
        {
            koh1.a(6, i);
        }
        if (j != null)
        {
            koh1.b(7, j);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (k != null && k.length > 0)
        {
            for (int i1 = 0; i1 < k.length; i1++)
            {
                lbc lbc1 = k[i1];
                if (lbc1 != null)
                {
                    koh1.b(9, lbc1);
                }
            }

        }
        if (a != null)
        {
            koh1.a(10, a);
        }
        if (d != null)
        {
            koh1.a(11, d);
        }
        if (e != null)
        {
            koh1.a(12, e);
        }
        super.writeTo(koh1);
    }
}
