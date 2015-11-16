// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kcr extends kwm
{

    private static volatile kcr e[];
    public String a;
    public Long b;
    public String c;
    public Long d;

    public kcr()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kcr[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new kcr[0];
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            b.longValue();
            j = i + (kwk.f(2) + 8);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(3, d.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.b(4, c);
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
                a = kwj1.j();
                break;

            case 17: // '\021'
                b = Long.valueOf(kwj1.g());
                break;

            case 24: // '\030'
                d = Long.valueOf(kwj1.e());
                break;

            case 34: // '"'
                c = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.c(2, b.longValue());
        }
        if (d != null)
        {
            kwk1.b(3, d.longValue());
        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        super.writeTo(kwk1);
    }
}
