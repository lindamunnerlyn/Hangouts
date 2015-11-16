// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hqf extends koj
{

    public Long a;
    public String b;
    public String c;

    public hqf()
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
            i = j + koh.e(2, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(3, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(4, c);
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

            case 16: // '\020'
                a = Long.valueOf(kog1.e());
                break;

            case 26: // '\032'
                b = kog1.j();
                break;

            case 34: // '"'
                c = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(2, a.longValue());
        }
        if (b != null)
        {
            koh1.a(3, b);
        }
        if (c != null)
        {
            koh1.a(4, c);
        }
        super.writeTo(koh1);
    }
}
