// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzz extends koj
{

    public String a;
    public String b;
    public kyo c;
    public String d;

    public kzz()
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.b(3, d);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(4, b);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new kyo();
                }
                kog1.a(c);
                break;

            case 26: // '\032'
                d = kog1.j();
                break;

            case 34: // '"'
                b = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (b != null)
        {
            koh1.a(4, b);
        }
        super.writeTo(koh1);
    }
}
