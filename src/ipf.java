// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipf extends koj
{

    private static volatile ipf l[];
    public String a;
    public int b[];
    public String c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Integer h;
    public Boolean i;
    public Boolean j;
    public Boolean k;

    public ipf()
    {
        a = null;
        b = kou.a;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ipf[] a()
    {
        if (l == null)
        {
            synchronized (kon.a)
            {
                if (l == null)
                {
                    l = new ipf[0];
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
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(2, d);
        }
        i1 = j1;
        if (e != null)
        {
            e.booleanValue();
            i1 = j1 + (koh.f(3) + 1);
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (koh.f(4) + 1);
        }
        i1 = j1;
        if (g != null)
        {
            g.booleanValue();
            i1 = j1 + (koh.f(5) + 1);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.e(6, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (koh.f(7) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                int k1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < b.length; j1++)
                {
                    k1 += koh.e(b[j1]);
                }

                j1 = i1 + k1 + b.length * 1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            j.booleanValue();
            i1 = j1 + (koh.f(9) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(10, c);
        }
        i1 = j1;
        if (k != null)
        {
            k.booleanValue();
            i1 = j1 + (koh.f(11) + 1);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                d = kog1.j();
                break;

            case 24: // '\030'
                e = Boolean.valueOf(kog1.i());
                break;

            case 32: // ' '
                f = Boolean.valueOf(kog1.i());
                break;

            case 40: // '('
                g = Boolean.valueOf(kog1.i());
                break;

            case 48: // '0'
                h = Integer.valueOf(kog1.f());
                break;

            case 56: // '8'
                i = Boolean.valueOf(kog1.i());
                break;

            case 64: // '@'
                int l1 = kou.b(kog1, 64);
                int ai[];
                int j1;
                if (b == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = b.length;
                }
                ai = new int[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(b, 0, ai, 0, j1);
                    l1 = j1;
                }
                for (; l1 < ai.length - 1; l1++)
                {
                    ai[l1] = kog1.f();
                    kog1.a();
                }

                ai[l1] = kog1.f();
                b = ai;
                break;

            case 66: // 'B'
                int j2 = kog1.c(kog1.p());
                int k1 = kog1.r();
                int i2;
                for (i2 = 0; kog1.q() > 0; i2++)
                {
                    kog1.f();
                }

                kog1.e(k1);
                int ai1[];
                if (b == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = b.length;
                }
                ai1 = new int[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, k1);
                    i2 = k1;
                }
                for (; i2 < ai1.length; i2++)
                {
                    ai1[i2] = kog1.f();
                }

                b = ai1;
                kog1.d(j2);
                break;

            case 72: // 'H'
                j = Boolean.valueOf(kog1.i());
                break;

            case 82: // 'R'
                c = kog1.j();
                break;

            case 88: // 'X'
                k = Boolean.valueOf(kog1.i());
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
        if (d != null)
        {
            koh1.a(2, d);
        }
        if (e != null)
        {
            koh1.a(3, e.booleanValue());
        }
        if (f != null)
        {
            koh1.a(4, f.booleanValue());
        }
        if (g != null)
        {
            koh1.a(5, g.booleanValue());
        }
        if (h != null)
        {
            koh1.a(6, h.intValue());
        }
        if (i != null)
        {
            koh1.a(7, i.booleanValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i1 = 0; i1 < b.length; i1++)
            {
                koh1.a(8, b[i1]);
            }

        }
        if (j != null)
        {
            koh1.a(9, j.booleanValue());
        }
        if (c != null)
        {
            koh1.a(10, c);
        }
        if (k != null)
        {
            koh1.a(11, k.booleanValue());
        }
        super.writeTo(koh1);
    }
}
