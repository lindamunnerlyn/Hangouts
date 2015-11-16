// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcc extends koj
{

    public Integer a;
    public Integer b;
    public Integer c;

    public jcc()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.f(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.f(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.f(3, c.intValue());
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

            case 8: // '\b'
                a = Integer.valueOf(kog1.l());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.l());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kog1.l());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.c(1, a.intValue());
        }
        if (b != null)
        {
            koh1.c(2, b.intValue());
        }
        if (c != null)
        {
            koh1.c(3, c.intValue());
        }
        super.writeTo(koh1);
    }
}
