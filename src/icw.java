// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icw extends koj
{

    public Boolean a;
    public ibs b;
    public ibs c;
    public ibs d;
    public icq e;

    public icw()
    {
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
        if (a != null)
        {
            a.booleanValue();
            i = j + (koh.f(5) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(6, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(7, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(8, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(9, e);
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

            case 40: // '('
                a = Boolean.valueOf(kog1.i());
                break;

            case 50: // '2'
                if (b == null)
                {
                    b = new ibs();
                }
                kog1.a(b);
                break;

            case 58: // ':'
                if (c == null)
                {
                    c = new ibs();
                }
                kog1.a(c);
                break;

            case 66: // 'B'
                if (d == null)
                {
                    d = new ibs();
                }
                kog1.a(d);
                break;

            case 74: // 'J'
                if (e == null)
                {
                    e = new icq();
                }
                kog1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(5, a.booleanValue());
        }
        if (b != null)
        {
            koh1.b(6, b);
        }
        if (c != null)
        {
            koh1.b(7, c);
        }
        if (d != null)
        {
            koh1.b(8, d);
        }
        if (e != null)
        {
            koh1.b(9, e);
        }
        super.writeTo(koh1);
    }
}
