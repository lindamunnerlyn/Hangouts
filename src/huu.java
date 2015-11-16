// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huu extends koj
{

    public hyn a;
    public iba b;
    public Boolean c;

    public huu()
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
            i = j + koh.d(1, a);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (koh.f(2) + 1);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
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
                if (a == null)
                {
                    a = new hyn();
                }
                kog1.a(a);
                break;

            case 16: // '\020'
                c = Boolean.valueOf(kog1.i());
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new iba();
                }
                kog1.a(b);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (c != null)
        {
            koh1.a(2, c.booleanValue());
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        super.writeTo(koh1);
    }
}
