// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jvd extends koj
{

    private static volatile jvd e[];
    public String a;
    public Long b;
    public String c;
    public Long d;

    public jvd()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jvd[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new jvd[0];
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            b.longValue();
            j = i + (koh.f(2) + 8);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(3, d.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.b(4, c);
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

            case 10: // '\n'
                a = kog1.j();
                break;

            case 17: // '\021'
                b = Long.valueOf(kog1.g());
                break;

            case 24: // '\030'
                d = Long.valueOf(kog1.e());
                break;

            case 34: // '"'
                c = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.c(2, b.longValue());
        }
        if (d != null)
        {
            koh1.b(3, d.longValue());
        }
        if (c != null)
        {
            koh1.a(4, c);
        }
        super.writeTo(koh1);
    }
}
