// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itc extends koj
{

    public itd a;
    public ite b;

    public itc()
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
        if (b != null)
        {
            i = j + koh.d(1, b);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(2, a);
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
                if (b == null)
                {
                    b = new ite();
                }
                kog1.a(b);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new itd();
                }
                kog1.a(a);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.b(1, b);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        super.writeTo(koh1);
    }
}
