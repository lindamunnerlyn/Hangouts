// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iev extends kwm
{

    private static volatile iev e[];
    public String a;
    public Integer b;
    public Integer c;
    public Integer d;

    public iev()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iev[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new iev[0];
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
        int j = super.computeSerializedSize() + kwk.b(1, a);
        int i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.e(3, c.intValue());
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(4, d.intValue());
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
                a = kwj1.j();
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a);
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
