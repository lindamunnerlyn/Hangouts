// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hui extends koj
{

    public hzt a;
    public Boolean b;
    public hup c;
    public hzy d;
    public khk e;

    public hui()
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
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (koh.f(2) + 1);
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
        i = j;
        if (e != null)
        {
            i = j + koh.d(5, e);
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
                    a = new hzt();
                }
                kog1.a(a);
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new hup();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new hzy();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new khk();
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
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        super.writeTo(koh1);
    }
}
