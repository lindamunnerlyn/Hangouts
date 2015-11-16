// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dwx extends kop
{

    private static volatile dwx j[];
    public dwv a;
    public String b;
    public long c;
    public long d;
    public String e;
    public String f;
    public int g;
    public dww h;
    public boolean i;

    public dwx()
    {
        a = null;
        b = "";
        c = 0L;
        d = 0L;
        e = "";
        f = "";
        g = 0;
        h = null;
        i = false;
        cachedSize = -1;
    }

    public static dwx[] a()
    {
        if (j == null)
        {
            synchronized (kon.a)
            {
                if (j == null)
                {
                    j = new dwx[0];
                }
            }
        }
        return j;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + koh.d(1, a);
        }
        l = k;
        if (!b.equals(""))
        {
            l = k + koh.b(2, b);
        }
        k = l;
        if (c != 0L)
        {
            k = l + koh.e(3, c);
        }
        l = k;
        if (d != 0L)
        {
            l = k + koh.e(4, d);
        }
        k = l;
        if (!e.equals(""))
        {
            k = l + koh.b(5, e);
        }
        l = k;
        if (!f.equals(""))
        {
            l = k + koh.b(6, f);
        }
        k = l;
        if (g != 0)
        {
            k = l + koh.e(7, g);
        }
        l = k;
        if (h != null)
        {
            l = k + koh.d(8, h);
        }
        k = l;
        if (i)
        {
            k = l + (koh.f(9) + 1);
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int k = kog1.a();
            switch (k)
            {
            default:
                if (kou.a(kog1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new dwv();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 24: // '\030'
                c = kog1.e();
                break;

            case 32: // ' '
                d = kog1.e();
                break;

            case 42: // '*'
                e = kog1.j();
                break;

            case 50: // '2'
                f = kog1.j();
                break;

            case 56: // '8'
                g = kog1.f();
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new dww();
                }
                kog1.a(h);
                break;

            case 72: // 'H'
                i = kog1.i();
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
        if (!b.equals(""))
        {
            koh1.a(2, b);
        }
        if (c != 0L)
        {
            koh1.b(3, c);
        }
        if (d != 0L)
        {
            koh1.b(4, d);
        }
        if (!e.equals(""))
        {
            koh1.a(5, e);
        }
        if (!f.equals(""))
        {
            koh1.a(6, f);
        }
        if (g != 0)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        if (i)
        {
            koh1.a(9, i);
        }
        super.writeTo(koh1);
    }
}
