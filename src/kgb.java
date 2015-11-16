// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kgb extends koj
{

    public Boolean a;
    public kig b;
    public kgc c;
    public khj d;

    public kgb()
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
            i = j + (koh.f(1) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d);
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

            case 8: // '\b'
                a = Boolean.valueOf(kog1.i());
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kig();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kgc();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new khj();
                }
                kog1.a(d);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        super.writeTo(koh1);
    }
}
