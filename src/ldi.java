// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ldi extends kwm
{

    public Integer a;
    public byte b[];
    public byte c[];
    public Long d;
    public Long e;
    public String f;
    public String g;

    public ldi()
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
        int j = super.computeSerializedSize() + kwk.e(1, a.intValue()) + kwk.b(2, b) + kwk.b(3, c);
        int i = j;
        if (d != null)
        {
            i = j + kwk.e(4, d.longValue());
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.e(6, e.longValue());
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.b(7, f);
        }
        j = i;
        if (g != null)
        {
            j = i + kwk.b(8, g);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = Integer.valueOf(kwj1.f());
                break;

            case 18: // '\022'
                b = kwj1.k();
                break;

            case 26: // '\032'
                c = kwj1.k();
                break;

            case 32: // ' '
                d = Long.valueOf(kwj1.e());
                break;

            case 48: // '0'
                e = Long.valueOf(kwj1.e());
                break;

            case 58: // ':'
                f = kwj1.j();
                break;

            case 66: // 'B'
                g = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.intValue());
        kwk1.a(2, b);
        kwk1.a(3, c);
        if (d != null)
        {
            kwk1.b(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.b(6, e.longValue());
        }
        if (f != null)
        {
            kwk1.a(7, f);
        }
        if (g != null)
        {
            kwk1.a(8, g);
        }
        super.writeTo(kwk1);
    }
}
