// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ijg extends kwm
{

    private static volatile ijg e[];
    public String a;
    public ijf b;
    public ijd c;
    public ijh d;

    public ijg()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ijg[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new ijg[0];
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
        if (c != null)
        {
            j = i + kwk.d(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(3, d);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(4, b);
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

            case 18: // '\022'
                if (c == null)
                {
                    c = new ijd();
                }
                kwj1.a(c);
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new ijh();
                }
                kwj1.a(d);
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new ijf();
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
            kwk1.a(1, a);
        }
        if (c != null)
        {
            kwk1.b(2, c);
        }
        if (d != null)
        {
            kwk1.b(3, d);
        }
        if (b != null)
        {
            kwk1.b(4, b);
        }
        super.writeTo(kwk1);
    }
}
