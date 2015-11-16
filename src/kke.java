// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kke extends koj
{

    public String a;
    public Long b;
    public Long c;

    public kke()
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            b.longValue();
            j = i + (koh.f(2) + 8);
        }
        i = j;
        if (c != null)
        {
            c.longValue();
            i = j + (koh.f(3) + 8);
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
                a = kog1.j();
                break;

            case 17: // '\021'
                b = Long.valueOf(kog1.g());
                break;

            case 25: // '\031'
                c = Long.valueOf(kog1.g());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.c(2, b.longValue());
        }
        if (c != null)
        {
            koh1.c(3, c.longValue());
        }
        super.writeTo(koh1);
    }
}
