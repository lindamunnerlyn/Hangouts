// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipt extends kwm
{

    private static volatile ipt c[];
    public ipg a;
    public String b;

    public ipt()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ipt[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new ipt[0];
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
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
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
                    a = new ipg();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
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
            kwk1.a(2, b);
        }
        super.writeTo(kwk1);
    }
}
