// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lck extends koj
{

    private static volatile lck i[];
    public Boolean a;
    public Boolean b;
    public String c;
    public kye d;
    public String e;
    public String f;
    public String g;
    public kyo h;

    public lck()
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

    public static lck[] a()
    {
        if (i == null)
        {
            synchronized (kon.a)
            {
                if (i == null)
                {
                    i = new lck[0];
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
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            a.booleanValue();
            j = k + (koh.f(1) + 1);
        }
        k = j;
        if (b != null)
        {
            b.booleanValue();
            k = j + (koh.f(2) + 1);
        }
        j = k;
        if (c != null)
        {
            j = k + koh.b(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + koh.d(4, d);
        }
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
            k = j + koh.d(9, h);
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

            case 8: // '\b'
                a = Boolean.valueOf(kog1.i());
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kye();
                }
                kog1.a(d);
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

            case 74: // 'J'
                if (h == null)
                {
                    h = new kyo();
                }
                kog1.a(h);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
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
            koh1.b(9, h);
        }
        super.writeTo(koh1);
    }
}
