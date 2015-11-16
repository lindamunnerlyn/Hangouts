// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jya extends koj
{

    private static volatile jya c[];
    public Integer a;
    public String b;

    public jya()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jya[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new jya[0];
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
        if (b != null)
        {
            i = j + koh.b(2, b);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.e(3, a.intValue());
        }
        return j;
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

            case 18: // '\022'
                b = kog1.j();
                break;

            case 24: // '\030'
                a = Integer.valueOf(kog1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (a != null)
        {
            koh1.a(3, a.intValue());
        }
        super.writeTo(koh1);
    }
}
