// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcu extends koj
{

    private static volatile jcu e[];
    public Float a;
    public Float b;
    public Float c;
    public Float d;

    public jcu()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jcu[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new jcu[0];
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
        int i = super.computeSerializedSize();
        a.floatValue();
        int j = koh.f(1);
        b.floatValue();
        int k = koh.f(2);
        c.floatValue();
        int l = koh.f(3);
        d.floatValue();
        return i + (j + 4) + (k + 4) + (l + 4) + (koh.f(4) + 4);
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
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a.floatValue());
        koh1.a(2, b.floatValue());
        koh1.a(3, c.floatValue());
        koh1.a(4, d.floatValue());
        super.writeTo(koh1);
    }
}
