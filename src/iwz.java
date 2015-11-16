// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwz extends koj
{

    public isv a;
    public irb b;
    public Long c;
    public String d;
    public ixg responseHeader;

    public iwz()
    {
        responseHeader = null;
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
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(2, c.longValue());
        }
        i = j;
        if (d != null)
        {
            i = j + koh.b(3, d);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(4, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(5, b);
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
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 16: // '\020'
                c = Long.valueOf(kog1.d());
                break;

            case 26: // '\032'
                d = kog1.j();
                break;

            case 34: // '"'
                if (a == null)
                {
                    a = new isv();
                }
                kog1.a(a);
                break;

            case 42: // '*'
                if (b == null)
                {
                    b = new irb();
                }
                kog1.a(b);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (c != null)
        {
            koh1.a(2, c.longValue());
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
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
