// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iww extends koj
{

    public itb a;
    public ivz b;
    public byte c[];
    public Long d;
    public ixf requestHeader;

    public iww()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + koh.d(1, requestHeader);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.b(2, c);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d.longValue());
        }
        i = j;
        if (a != null)
        {
            i = j + koh.d(5, a);
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
                if (requestHeader == null)
                {
                    requestHeader = new ixf();
                }
                kog1.a(requestHeader);
                break;

            case 18: // '\022'
                c = kog1.k();
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new ivz();
                }
                kog1.a(b);
                break;

            case 32: // ' '
                d = Long.valueOf(kog1.d());
                break;

            case 42: // '*'
                if (a == null)
                {
                    a = new itb();
                }
                kog1.a(a);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (d != null)
        {
            koh1.a(4, d.longValue());
        }
        if (a != null)
        {
            koh1.b(5, a);
        }
        super.writeTo(koh1);
    }
}
