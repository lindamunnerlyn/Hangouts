// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lax extends koj
{

    public Integer a;
    public Integer b;

    public lax()
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
            a.intValue();
            i = j + (koh.f(1) + 4);
        }
        j = i;
        if (b != null)
        {
            b.intValue();
            j = i + (koh.f(2) + 4);
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

            case 13: // '\r'
                a = Integer.valueOf(kog1.m());
                break;

            case 21: // '\025'
                b = Integer.valueOf(kog1.m());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.d(1, a.intValue());
        }
        if (b != null)
        {
            koh1.d(2, b.intValue());
        }
        super.writeTo(koh1);
    }
}
