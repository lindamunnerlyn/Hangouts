// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icr extends koj
{

    public String a;
    public ibs b;
    public ics c;

    public icr()
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
            i = j + koh.b(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(3, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(4, c);
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

            case 18: // '\022'
                a = kog1.j();
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new ibs();
                }
                kog1.a(b);
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new ics();
                }
                kog1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(2, a);
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null)
        {
            koh1.b(4, c);
        }
        super.writeTo(koh1);
    }
}
