// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kbt extends koj
{

    private static volatile kbt j[];
    public kch a;
    public String b;
    public String c;
    public String d;
    public String e;
    public kay f;
    public kcf g;
    public kcg h;
    public kce i;

    public kbt()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kbt[] a()
    {
        if (j == null)
        {
            synchronized (kon.a)
            {
                if (j == null)
                {
                    j = new kbt[0];
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
        if (b != null)
        {
            k = l + koh.b(1, b);
        }
        l = k;
        if (c != null)
        {
            l = k + koh.b(2, c);
        }
        k = l;
        if (d != null)
        {
            k = l + koh.b(3, d);
        }
        l = k;
        if (e != null)
        {
            l = k + koh.b(4, e);
        }
        k = l;
        if (f != null)
        {
            k = l + koh.d(5, f);
        }
        l = k;
        if (a != null)
        {
            l = k + koh.d(6, a);
        }
        k = l;
        if (g != null)
        {
            k = l + koh.d(8, g);
        }
        l = k;
        if (h != null)
        {
            l = k + koh.d(10, h);
        }
        k = l;
        if (i != null)
        {
            k = l + koh.d(11, i);
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
                if (super.storeUnknownField(kog1, k))
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

            case 26: // '\032'
                d = kog1.j();
                break;

            case 34: // '"'
                e = kog1.j();
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new kay();
                }
                kog1.a(f);
                break;

            case 50: // '2'
                if (a == null)
                {
                    a = new kch();
                }
                kog1.a(a);
                break;

            case 66: // 'B'
                if (g == null)
                {
                    g = new kcf();
                }
                kog1.a(g);
                break;

            case 82: // 'R'
                if (h == null)
                {
                    h = new kcg();
                }
                kog1.a(h);
                break;

            case 90: // 'Z'
                if (i == null)
                {
                    i = new kce();
                }
                kog1.a(i);
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
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (f != null)
        {
            koh1.b(5, f);
        }
        if (a != null)
        {
            koh1.b(6, a);
        }
        if (g != null)
        {
            koh1.b(8, g);
        }
        if (h != null)
        {
            koh1.b(10, h);
        }
        if (i != null)
        {
            koh1.b(11, i);
        }
        super.writeTo(koh1);
    }
}
