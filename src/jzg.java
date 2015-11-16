// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jzg extends koj
{

    public Long a;
    public Long b;
    public Long c;
    public String d;
    public Integer e;

    public jzg()
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
            i = j + koh.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(2, b.longValue());
        }
        i = j;
        if (d != null)
        {
            i = j + koh.b(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.e(4, e.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(5, c.longValue());
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

            case 8: // '\b'
                a = Long.valueOf(kog1.e());
                break;

            case 16: // '\020'
                b = Long.valueOf(kog1.e());
                break;

            case 26: // '\032'
                d = kog1.j();
                break;

            case 32: // ' '
                e = Integer.valueOf(kog1.f());
                break;

            case 40: // '('
                c = Long.valueOf(kog1.e());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a.longValue());
        }
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (e != null)
        {
            koh1.a(4, e.intValue());
        }
        if (c != null)
        {
            koh1.b(5, c.longValue());
        }
        super.writeTo(koh1);
    }
}
