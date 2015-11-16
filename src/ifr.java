// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifr extends kwm
{

    public Long a;
    public Long b;
    public String c;
    public Integer d;
    public ifs e;

    public ifr()
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
            i = j + kwk.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(3, c);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(4, e);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(5, d.intValue());
        }
        return i;
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
                a = Long.valueOf(kwj1.e());
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.e());
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new ifs();
                }
                kwj1.a(e);
                break;

            case 40: // '('
                d = Integer.valueOf(kwj1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a.longValue());
        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (e != null)
        {
            kwk1.b(4, e);
        }
        if (d != null)
        {
            kwk1.a(5, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
