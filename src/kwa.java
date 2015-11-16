// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwa extends koj
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public kwa()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + koh.b(1, b);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.b(2, f);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.b(3, e);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.b(4, c);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.b(5, d);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.b(6, a);
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
                b = kog1.j();
                break;

            case 18: // '\022'
                f = kog1.j();
                break;

            case 26: // '\032'
                e = kog1.j();
                break;

            case 34: // '"'
                c = kog1.j();
                break;

            case 42: // '*'
                d = kog1.j();
                break;

            case 50: // '2'
                a = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(1, b);
        }
        if (f != null)
        {
            koh1.a(2, f);
        }
        if (e != null)
        {
            koh1.a(3, e);
        }
        if (c != null)
        {
            koh1.a(4, c);
        }
        if (d != null)
        {
            koh1.a(5, d);
        }
        if (a != null)
        {
            koh1.a(6, a);
        }
        super.writeTo(koh1);
    }
}
