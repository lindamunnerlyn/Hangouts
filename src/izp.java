// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izp extends kwm
{

    private static volatile izp d[];
    public jce a;
    public ixl b;
    public Integer c;

    public izp()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static izp[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new izp[0];
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
            i = j + kwk.d(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.e(2, c.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(3, b);
        }
        return i;
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
                    a = new jce();
                }
                kwj1.a(a);
                break;

            case 16: // '\020'
                c = Integer.valueOf(kwj1.f());
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new ixl();
                }
                kwj1.a(b);
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
        if (c != null)
        {
            kwk1.a(2, c.intValue());
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        super.writeTo(kwk1);
    }
}
