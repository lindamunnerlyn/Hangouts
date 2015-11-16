// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivq extends koj
{

    public isv a;
    public irb b;
    public Boolean c;
    public Long d;
    public String e;
    public ixg responseHeader;

    public ivq()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
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
        if (d != null)
        {
            j = i + koh.d(2, d.longValue());
        }
        i = j;
        if (e != null)
        {
            i = j + koh.b(3, e);
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
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (koh.f(6) + 1);
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
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 16: // '\020'
                d = Long.valueOf(kog1.d());
                break;

            case 26: // '\032'
                e = kog1.j();
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

            case 48: // '0'
                c = Boolean.valueOf(kog1.i());
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
        if (d != null)
        {
            koh1.a(2, d.longValue());
        }
        if (e != null)
        {
            koh1.a(3, e);
        }
        if (a != null)
        {
            koh1.b(4, a);
        }
        if (b != null)
        {
            koh1.b(5, b);
        }
        if (c != null)
        {
            koh1.a(6, c.booleanValue());
        }
        super.writeTo(koh1);
    }
}
