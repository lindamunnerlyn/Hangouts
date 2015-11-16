// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class isz extends koj
{

    public Long a;
    public byte b[];
    public String c;

    public isz()
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
        if (c != null)
        {
            i = j + koh.b(1, c);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (a != null)
        {
            i = j + koh.d(3, a.longValue());
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
                c = kog1.j();
                break;

            case 18: // '\022'
                b = kog1.k();
                break;

            case 24: // '\030'
                a = Long.valueOf(kog1.d());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (c != null)
        {
            koh1.a(1, c);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (a != null)
        {
            koh1.a(3, a.longValue());
        }
        super.writeTo(koh1);
    }
}
