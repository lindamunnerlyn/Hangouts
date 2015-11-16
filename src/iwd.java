// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwd extends kwm
{

    private static volatile iwd d[];
    public Integer a;
    public Integer b;
    public Integer c;

    public iwd()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iwd[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new iwd[0];
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
        return super.computeSerializedSize() + kwk.e(1, a.intValue()) + kwk.e(2, b.intValue()) + kwk.e(3, c.intValue());
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

            case 8: // '\b'
                a = Integer.valueOf(kwj1.f());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.intValue());
        kwk1.a(2, b.intValue());
        kwk1.a(3, c.intValue());
        super.writeTo(kwk1);
    }
}
