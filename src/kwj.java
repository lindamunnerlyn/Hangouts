// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwj extends koj
{

    private static volatile kwj c[];
    public String a;
    public String b;

    public kwj()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kwj[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new kwj[0];
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
        int j = super.computeSerializedSize() + koh.b(1, a);
        int i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                b = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a);
        if (b != null)
        {
            koh1.a(2, b);
        }
        super.writeTo(koh1);
    }
}
