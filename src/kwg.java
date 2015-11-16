// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwg extends koj
{

    private static volatile kwg c[];
    public Long a;
    public Long b;

    public kwg()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kwg[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new kwg[0];
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
        return super.computeSerializedSize() + koh.e(1, a.longValue()) + koh.e(2, b.longValue());
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

            case 8: // '\b'
                a = Long.valueOf(kog1.e());
                break;

            case 16: // '\020'
                b = Long.valueOf(kog1.e());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.b(1, a.longValue());
        koh1.b(2, b.longValue());
        super.writeTo(koh1);
    }
}
