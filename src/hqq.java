// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hqq extends koj
{

    private static volatile hqq g[];
    public hru a;
    public String b;
    public String c;
    public Integer d;
    public Integer e;
    public Boolean f;

    public hqq()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hqq[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new hqq[0];
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
        if (b != null)
        {
            i = j + koh.b(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.b(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(3, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.e(4, e.intValue());
        }
        i = j;
        if (f != null)
        {
            f.booleanValue();
            i = j + (koh.f(5) + 1);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(6, a);
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
                b = kog1.j();
                break;

            case 18: // '\022'
                c = kog1.j();
                break;

            case 24: // '\030'
                d = Integer.valueOf(kog1.f());
                break;

            case 32: // ' '
                e = Integer.valueOf(kog1.f());
                break;

            case 40: // '('
                f = Boolean.valueOf(kog1.i());
                break;

            case 50: // '2'
                if (a == null)
                {
                    a = new hru();
                }
                kog1.a(a);
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
            koh1.a(3, d.intValue());
        }
        if (e != null)
        {
            koh1.a(4, e.intValue());
        }
        if (f != null)
        {
            koh1.a(5, f.booleanValue());
        }
        if (a != null)
        {
            koh1.b(6, a);
        }
        super.writeTo(koh1);
    }
}
