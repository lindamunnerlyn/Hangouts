// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ios extends koj
{

    public Integer a;
    public Integer b;

    public ios()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        return super.computeSerializedSize() + koh.e(1, a.intValue()) + koh.e(2, b.intValue());
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
                a = Integer.valueOf(kog1.f());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kog1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a.intValue());
        koh1.a(2, b.intValue());
        super.writeTo(koh1);
    }
}
