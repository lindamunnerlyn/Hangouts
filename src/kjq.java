// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kjq extends koj
{

    public kjm a;
    public kjm b;

    public kjq()
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
            i = j + koh.d(4, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(5, b);
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

            case 34: // '"'
                if (a == null)
                {
                    a = new kjm();
                }
                kog1.a(a);
                break;

            case 42: // '*'
                if (b == null)
                {
                    b = new kjm();
                }
                kog1.a(b);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(4, a);
        }
        if (b != null)
        {
            koh1.b(5, b);
        }
        super.writeTo(koh1);
    }
}
