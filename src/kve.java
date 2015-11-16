// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kve extends koj
{

    public Integer a;
    public byte b[];
    public byte c[];
    public Long d;
    public Long e;
    public String f;
    public String g;

    public kve()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize() + koh.e(1, a.intValue()) + koh.b(2, b) + koh.b(3, c);
        int i = j;
        if (d != null)
        {
            i = j + koh.e(4, d.longValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.e(6, e.longValue());
        }
        i = j;
        if (f != null)
        {
            i = j + koh.b(7, f);
        }
        j = i;
        if (g != null)
        {
            j = i + koh.b(8, g);
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
                a = Integer.valueOf(kog1.f());
                break;

            case 18: // '\022'
                b = kog1.k();
                break;

            case 26: // '\032'
                c = kog1.k();
                break;

            case 32: // ' '
                d = Long.valueOf(kog1.e());
                break;

            case 48: // '0'
                e = Long.valueOf(kog1.e());
                break;

            case 58: // ':'
                f = kog1.j();
                break;

            case 66: // 'B'
                g = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a.intValue());
        koh1.a(2, b);
        koh1.a(3, c);
        if (d != null)
        {
            koh1.b(4, d.longValue());
        }
        if (e != null)
        {
            koh1.b(6, e.longValue());
        }
        if (f != null)
        {
            koh1.a(7, f);
        }
        if (g != null)
        {
            koh1.a(8, g);
        }
        super.writeTo(koh1);
    }
}
