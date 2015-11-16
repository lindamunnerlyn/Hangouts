// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lad extends kwm
{

    public String a;
    public Long b;
    public Long c;
    public lab d;
    public lab e;

    public lad()
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
        int j = super.computeSerializedSize() + kwk.b(1, a) + kwk.e(2, b.longValue()) + kwk.e(3, c.longValue());
        int i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(5, e);
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

            case 10: // '\n'
                a = kwj1.j();
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.e());
                break;

            case 24: // '\030'
                c = Long.valueOf(kwj1.e());
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new lab();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new lab();
                }
                kwj1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a);
        kwk1.b(2, b.longValue());
        kwk1.b(3, c.longValue());
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        super.writeTo(kwk1);
    }
}
