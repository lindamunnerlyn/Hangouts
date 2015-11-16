// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class khm extends koj
{

    public kfy a;
    public ksv b;
    public String c;
    public String d;

    public khm()
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
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(4, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(5, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(6, d);
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
                if (a == null)
                {
                    a = new kfy();
                }
                kog1.a(a);
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new ksv();
                }
                kog1.a(b);
                break;

            case 42: // '*'
                c = kog1.j();
                break;

            case 50: // '2'
                d = kog1.j();
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
        if (b != null)
        {
            koh1.b(4, b);
        }
        if (c != null)
        {
            koh1.a(5, c);
        }
        if (d != null)
        {
            koh1.a(6, d);
        }
        super.writeTo(koh1);
    }
}
