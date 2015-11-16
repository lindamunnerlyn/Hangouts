// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqm extends koj
{

    public String a;
    public Long b;
    public Long c;
    public Long d;

    public iqm()
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
        if (b != null)
        {
            j = i + koh.d(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d.longValue());
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

            case 16: // '\020'
                b = Long.valueOf(kog1.d());
                break;

            case 24: // '\030'
                c = Long.valueOf(kog1.d());
                break;

            case 32: // ' '
                d = Long.valueOf(kog1.d());
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
        if (b != null)
        {
            koh1.a(2, b.longValue());
        }
        if (c != null)
        {
            koh1.a(3, c.longValue());
        }
        if (d != null)
        {
            koh1.a(4, d.longValue());
        }
        super.writeTo(koh1);
    }
}
