// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwo extends koj
{

    private static volatile kwo g[];
    public String a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public kwp e;
    public kwr f;

    public kwo()
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

    public static kwo[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new kwo[0];
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (koh.f(8) + 1);
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (koh.f(10) + 1);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (koh.f(12) + 1);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(13, e);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.d(101, f);
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
                a = kog1.j();
                break;

            case 64: // '@'
                b = Boolean.valueOf(kog1.i());
                break;

            case 80: // 'P'
                c = Boolean.valueOf(kog1.i());
                break;

            case 96: // '`'
                d = Boolean.valueOf(kog1.i());
                break;

            case 106: // 'j'
                if (e == null)
                {
                    e = new kwp();
                }
                kog1.a(e);
                break;

            case 810: 
                if (f == null)
                {
                    f = new kwr();
                }
                kog1.a(f);
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
            koh1.a(8, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(10, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(12, d.booleanValue());
        }
        if (e != null)
        {
            koh1.b(13, e);
        }
        if (f != null)
        {
            koh1.b(101, f);
        }
        super.writeTo(koh1);
    }
}
