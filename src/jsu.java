// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jsu extends koj
{

    public static final kok a = kok.a(jsu, 0x65270aaL);
    private static final jsu e[] = new jsu[0];
    public Long b;
    public Long c;
    public lis d;

    public jsu()
    {
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        b.longValue();
        int j = koh.f(1);
        c.longValue();
        j = i + (j + 8) + (koh.f(2) + 8);
        i = j;
        if (d != null)
        {
            i = j + koh.d(3, d);
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

            case 9: // '\t'
                b = Long.valueOf(kog1.g());
                break;

            case 17: // '\021'
                c = Long.valueOf(kog1.g());
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new lis();
                }
                kog1.a(d);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.c(1, b.longValue());
        koh1.c(2, c.longValue());
        if (d != null)
        {
            koh1.b(3, d);
        }
        super.writeTo(koh1);
    }

}
