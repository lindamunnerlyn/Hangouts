// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdp extends koj
{

    private static volatile jdp d[];
    public iyt a;
    public jec b;
    public jdv c;

    public jdp()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jdp[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new jdp[0];
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
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new iyt();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new jec();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new jdv();
                }
                kog1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        super.writeTo(koh1);
    }
}
