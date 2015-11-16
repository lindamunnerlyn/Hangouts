// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hss extends koj
{

    public Boolean a;
    public lgw b;
    public String c;
    public String d;

    public hss()
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
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (koh.f(2) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(3, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(4, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(5, d);
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

            case 16: // '\020'
                a = Boolean.valueOf(kog1.i());
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new lgw();
                }
                kog1.a(b);
                break;

            case 34: // '"'
                c = kog1.j();
                break;

            case 42: // '*'
                d = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(2, a.booleanValue());
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null)
        {
            koh1.a(4, c);
        }
        if (d != null)
        {
            koh1.a(5, d);
        }
        super.writeTo(koh1);
    }
}
