// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kgy extends kwm
{

    private static volatile kgy d[];
    public kkn a;
    public Float b;
    public krx c;

    public kgy()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kgy[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new kgy[0];
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
        if (b != null)
        {
            b.floatValue();
            j = i + (kwk.f(2) + 4);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
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
                    a = new kkn();
                }
                kwj1.a(a);
                break;

            case 21: // '\025'
                b = Float.valueOf(kwj1.c());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new krx();
                }
                kwj1.a(c);
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
            kwk1.a(2, b.floatValue());
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        super.writeTo(kwk1);
    }
}
