// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jug extends koj
{

    private static volatile jug f[];
    public Float a;
    public Float b;
    public Float c;
    public Float d;
    public Float e;

    public jug()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jug[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new jug[0];
                }
            }
        }
        return f;
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
            a.floatValue();
            i = j + (koh.f(1) + 4);
        }
        j = i;
        if (b != null)
        {
            b.floatValue();
            j = i + (koh.f(2) + 4);
        }
        i = j;
        if (c != null)
        {
            c.floatValue();
            i = j + (koh.f(3) + 4);
        }
        j = i;
        if (d != null)
        {
            d.floatValue();
            j = i + (koh.f(4) + 4);
        }
        i = j;
        if (e != null)
        {
            e.floatValue();
            i = j + (koh.f(5) + 4);
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

            case 13: // '\r'
                a = Float.valueOf(kog1.c());
                break;

            case 21: // '\025'
                b = Float.valueOf(kog1.c());
                break;

            case 29: // '\035'
                c = Float.valueOf(kog1.c());
                break;

            case 37: // '%'
                d = Float.valueOf(kog1.c());
                break;

            case 45: // '-'
                e = Float.valueOf(kog1.c());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.floatValue());
        }
        if (b != null)
        {
            koh1.a(2, b.floatValue());
        }
        if (c != null)
        {
            koh1.a(3, c.floatValue());
        }
        if (d != null)
        {
            koh1.a(4, d.floatValue());
        }
        if (e != null)
        {
            koh1.a(5, e.floatValue());
        }
        super.writeTo(koh1);
    }
}
