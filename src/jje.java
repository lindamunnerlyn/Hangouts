// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jje extends kwm
{

    private static volatile jje e[];
    public Float a;
    public Float b;
    public Float c;
    public Float d;

    public jje()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jje[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new jje[0];
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
        int j = kwk.f(1);
        b.floatValue();
        int k = kwk.f(2);
        c.floatValue();
        int l = kwk.f(3);
        d.floatValue();
        return i + (j + 4) + (k + 4) + (l + 4) + (kwk.f(4) + 4);
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 13: // '\r'
                a = Float.valueOf(kwj1.c());
                break;

            case 21: // '\025'
                b = Float.valueOf(kwj1.c());
                break;

            case 29: // '\035'
                c = Float.valueOf(kwj1.c());
                break;

            case 37: // '%'
                d = Float.valueOf(kwj1.c());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.floatValue());
        kwk1.a(2, b.floatValue());
        kwk1.a(3, c.floatValue());
        kwk1.a(4, d.floatValue());
        super.writeTo(kwk1);
    }
}
