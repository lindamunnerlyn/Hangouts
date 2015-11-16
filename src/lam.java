// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lam extends kwm
{

    private static volatile lam d[];
    public Long a;
    public String b;
    public String c;

    public lam()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lam[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new lam[0];
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
        return super.computeSerializedSize() + kwk.e(1, a.longValue()) + kwk.b(2, b) + kwk.b(3, c);
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

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.b(1, a.longValue());
        kwk1.a(2, b);
        kwk1.a(3, c);
        super.writeTo(kwk1);
    }
}
