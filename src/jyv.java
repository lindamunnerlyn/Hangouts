// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jyv extends koj
{

    private static volatile jyv d[];
    public kck a;
    public Float b;
    public kju c;

    public jyv()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jyv[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new jyv[0];
                }
            }
        }
        return d;
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
            i = j + koh.d(1, a);
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
            i = j + koh.d(3, c);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new kck();
                }
                kog1.a(a);
                break;

            case 21: // '\025'
                b = Float.valueOf(kog1.c());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kju();
                }
                kog1.a(c);
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
        if (b != null)
        {
            koh1.a(2, b.floatValue());
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        super.writeTo(koh1);
    }
}
