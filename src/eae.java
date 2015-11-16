// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eae extends kws
{

    private static volatile eae e[];
    public String a;
    public String b;
    public long c;
    public boolean d;

    public eae()
    {
        a = "";
        b = "";
        c = 0L;
        d = false;
        cachedSize = -1;
    }

    public static eae[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new eae[0];
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
        if (!a.equals(""))
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (!b.equals(""))
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != 0L)
        {
            i = j + kwk.e(3, c);
        }
        j = i;
        if (d)
        {
            j = i + (kwk.f(4) + 1);
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
                if (kwj1.b(i))
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
                b = kwj1.j();
                break;

            case 24: // '\030'
                c = kwj1.e();
                break;

            case 32: // ' '
                d = kwj1.i();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (!a.equals(""))
        {
            kwk1.a(1, a);
        }
        if (!b.equals(""))
        {
            kwk1.a(2, b);
        }
        if (c != 0L)
        {
            kwk1.b(3, c);
        }
        if (d)
        {
            kwk1.a(4, d);
        }
        super.writeTo(kwk1);
    }
}
