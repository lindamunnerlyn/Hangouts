// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ian extends koj
{

    public Long a;
    public Long b;
    public String c;
    public Integer d;
    public iao e;

    public ian()
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
        if (c != null)
        {
            i = j + koh.b(3, c);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(4, e);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(5, d.intValue());
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
                c = kog1.j();
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new iao();
                }
                kog1.a(e);
                break;

            case 40: // '('
                d = Integer.valueOf(kog1.f());
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
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (e != null)
        {
            koh1.b(4, e);
        }
        if (d != null)
        {
            koh1.a(5, d.intValue());
        }
        super.writeTo(koh1);
    }
}
