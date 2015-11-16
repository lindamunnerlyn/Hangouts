// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jvs extends koj
{

    private static volatile jvs e[];
    public jvp a;
    public Long b;
    public Float c;
    public Float d;

    public jvs()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jvs[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new jvs[0];
                }
            }
        }
        return e;
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
            j = i + koh.e(2, b.longValue());
        }
        i = j;
        if (d != null)
        {
            d.floatValue();
            i = j + (koh.f(3) + 4);
        }
        j = i;
        if (c != null)
        {
            c.floatValue();
            j = i + (koh.f(4) + 4);
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
                if (a == null)
                {
                    a = new jvp();
                }
                kog1.a(a);
                break;

            case 16: // '\020'
                b = Long.valueOf(kog1.e());
                break;

            case 29: // '\035'
                d = Float.valueOf(kog1.c());
                break;

            case 37: // '%'
                c = Float.valueOf(kog1.c());
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
            koh1.b(2, b.longValue());
        }
        if (d != null)
        {
            koh1.a(3, d.floatValue());
        }
        if (c != null)
        {
            koh1.a(4, c.floatValue());
        }
        super.writeTo(koh1);
    }
}
