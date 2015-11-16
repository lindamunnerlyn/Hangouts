// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ioc extends koj
{

    private static volatile ioc c[];
    public String a;
    public String b;

    public ioc()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ioc[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new ioc[0];
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
        int j = super.computeSerializedSize() + koh.b(6, a);
        int i = j;
        if (b != null)
        {
            i = j + koh.b(7, b);
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

            case 50: // '2'
                a = kog1.j();
                break;

            case 58: // ':'
                b = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(6, a);
        if (b != null)
        {
            koh1.a(7, b);
        }
        super.writeTo(koh1);
    }
}
