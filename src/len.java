// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class len extends kwm
{

    private static volatile len c[];
    public Long a;
    public Long b;

    public len()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static len[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new len[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        return super.computeSerializedSize() + kwk.e(1, a.longValue()) + kwk.e(2, b.longValue());
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
                a = Long.valueOf(kwj1.e());
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.e());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.b(1, a.longValue());
        kwk1.b(2, b.longValue());
        super.writeTo(kwk1);
    }
}
