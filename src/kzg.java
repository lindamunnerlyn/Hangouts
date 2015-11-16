// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzg extends koj
{

    private static volatile kzg e[];
    public String a;
    public Integer b;
    public Integer c;
    public Boolean d;

    public kzg()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kzg[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new kzg[0];
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
        int j = super.computeSerializedSize() + koh.b(1, a) + koh.f(2, b.intValue()) + koh.f(3, c.intValue());
        int i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (koh.f(4) + 1);
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

            case 16: // '\020'
                b = Integer.valueOf(kog1.l());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.l());
                break;

            case 32: // ' '
                d = Boolean.valueOf(kog1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a);
        koh1.c(2, b.intValue());
        koh1.c(3, c.intValue());
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        super.writeTo(koh1);
    }
}
