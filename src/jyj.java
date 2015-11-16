// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jyj extends koj
{

    public Boolean a;
    public jzm b;
    public jyg c;

    public jyj()
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
        if (b != null)
        {
            i = j + koh.d(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(2, c);
        }
        i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (koh.f(3) + 1);
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
                if (b == null)
                {
                    b = new jzm();
                }
                kog1.a(b);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new jyg();
                }
                kog1.a(c);
                break;

            case 24: // '\030'
                a = Boolean.valueOf(kog1.i());
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
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (a != null)
        {
            koh1.a(3, a.booleanValue());
        }
        super.writeTo(koh1);
    }
}
