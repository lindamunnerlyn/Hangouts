// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kee extends koj
{

    public Long a;
    public Long b;

    public kee()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.longValue();
            i = j + (koh.f(1) + 8);
        }
        j = i;
        if (b != null)
        {
            b.longValue();
            j = i + (koh.f(2) + 8);
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

            case 9: // '\t'
                a = Long.valueOf(kog1.g());
                break;

            case 17: // '\021'
                b = Long.valueOf(kog1.g());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.c(1, a.longValue());
        }
        if (b != null)
        {
            koh1.c(2, b.longValue());
        }
        super.writeTo(koh1);
    }
}
