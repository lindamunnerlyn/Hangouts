// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kdv extends kwm
{

    private static volatile kdv e[];
    public kds a;
    public Long b;
    public Float c;
    public Float d;

    public kdv()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kdv[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new kdv[0];
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
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.longValue());
        }
        i = j;
        if (d != null)
        {
            d.floatValue();
            i = j + (kwk.f(3) + 4);
        }
        j = i;
        if (c != null)
        {
            c.floatValue();
            j = i + (kwk.f(4) + 4);
        }
        return j;
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new kds();
                }
                kwj1.a(a);
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.e());
                break;

            case 29: // '\035'
                d = Float.valueOf(kwj1.c());
                break;

            case 37: // '%'
                c = Float.valueOf(kwj1.c());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        if (d != null)
        {
            kwk1.a(3, d.floatValue());
        }
        if (c != null)
        {
            kwk1.a(4, c.floatValue());
        }
        super.writeTo(kwk1);
    }
}
