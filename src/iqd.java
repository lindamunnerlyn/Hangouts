// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqd extends koj
{

    private static volatile iqd g[];
    public Integer a;
    public Integer b;
    public Integer c;
    public String d;
    public byte e[];
    public Integer f;

    public iqd()
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

    public static iqd[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new iqd[0];
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
            i = j + koh.f(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.f(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.f(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.b(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.f(6, f.intValue());
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

            case 8: // '\b'
                a = Integer.valueOf(kog1.l());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.l());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.l());
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                e = kog1.k();
                break;

            case 48: // '0'
                f = Integer.valueOf(kog1.l());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.c(1, a.intValue());
        }
        if (b != null)
        {
            koh1.c(2, b.intValue());
        }
        if (c != null)
        {
            koh1.c(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null)
        {
            koh1.c(6, f.intValue());
        }
        super.writeTo(koh1);
    }
}
