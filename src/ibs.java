// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibs extends koj
{

    private static volatile ibs i[];
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public String e;
    public String f;
    public String g;
    public ibt h;

    public ibs()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ibs[] a()
    {
        if (i == null)
        {
            synchronized (kon.a)
            {
                if (i == null)
                {
                    i = new ibs[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int k = koh.b(1, a);
        int l = koh.b(2, b);
        c.booleanValue();
        int i1 = koh.f(3);
        d.booleanValue();
        k = j + k + l + (i1 + 1) + (koh.f(4) + 1);
        j = k;
        if (e != null)
        {
            j = k + koh.b(5, e);
        }
        k = j;
        if (f != null)
        {
            k = j + koh.b(6, f);
        }
        j = k;
        if (g != null)
        {
            j = k + koh.b(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + koh.d(8, h);
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int j = kog1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(kog1, j))
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

            case 24: // '\030'
                c = Boolean.valueOf(kog1.i());
                break;

            case 32: // ' '
                d = Boolean.valueOf(kog1.i());
                break;

            case 42: // '*'
                e = kog1.j();
                break;

            case 50: // '2'
                f = kog1.j();
                break;

            case 58: // ':'
                g = kog1.j();
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new ibt();
                }
                kog1.a(h);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a);
        koh1.a(2, b);
        koh1.a(3, c.booleanValue());
        koh1.a(4, d.booleanValue());
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        super.writeTo(koh1);
    }
}
