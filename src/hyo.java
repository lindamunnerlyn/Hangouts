// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyo extends koj
{

    public Integer a;
    public Integer b;

    public hyo()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        a.intValue();
        int j = koh.f(1);
        b.intValue();
        return i + (j + 4) + (koh.f(2) + 4);
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

            case 13: // '\r'
                a = Integer.valueOf(kog1.h());
                break;

            case 21: // '\025'
                b = Integer.valueOf(kog1.h());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.b(1, a.intValue());
        koh1.b(2, b.intValue());
        super.writeTo(koh1);
    }
}
