// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyq extends koj
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;

    public hyq()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        a.doubleValue();
        int j = koh.f(1);
        b.doubleValue();
        int k = koh.f(2);
        c.doubleValue();
        int l = koh.f(3);
        d.doubleValue();
        return i + (j + 8) + (k + 8) + (l + 8) + (koh.f(4) + 8);
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
                a = Double.valueOf(kog1.b());
                break;

            case 17: // '\021'
                b = Double.valueOf(kog1.b());
                break;

            case 25: // '\031'
                c = Double.valueOf(kog1.b());
                break;

            case 33: // '!'
                d = Double.valueOf(kog1.b());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a.doubleValue());
        koh1.a(2, b.doubleValue());
        koh1.a(3, c.doubleValue());
        koh1.a(4, d.doubleValue());
        super.writeTo(koh1);
    }
}
