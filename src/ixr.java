// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixr extends koj
{

    public Boolean a;
    public String b;
    public Integer c;
    public Boolean d;
    public ixf requestHeader;

    public ixr()
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
        if (a != null)
        {
            a.booleanValue();
            j = i + (koh.f(2) + 1);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.f(4, c.intValue());
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (koh.f(5) + 1);
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

            case 16: // '\020'
                a = Boolean.valueOf(kog1.i());
                break;

            case 26: // '\032'
                b = kog1.j();
                break;

            case 32: // ' '
                c = Integer.valueOf(kog1.l());
                break;

            case 40: // '('
                d = Boolean.valueOf(kog1.i());
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
        if (a != null)
        {
            koh1.a(2, a.booleanValue());
        }
        if (b != null)
        {
            koh1.a(3, b);
        }
        if (c != null)
        {
            koh1.c(4, c.intValue());
        }
        if (d != null)
        {
            koh1.a(5, d.booleanValue());
        }
        super.writeTo(koh1);
    }
}
