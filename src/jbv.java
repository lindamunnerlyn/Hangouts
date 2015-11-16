// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbv extends kwm
{

    public iza a;
    public ixg b;
    public Boolean c;
    public Long d;
    public String e;
    public jdl responseHeader;

    public jbv()
    {
        responseHeader = null;
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
        if (responseHeader != null)
        {
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(2, d.longValue());
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.b(3, e);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(4, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(5, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(6) + 1);
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
                if (responseHeader == null)
                {
                    responseHeader = new jdl();
                }
                kwj1.a(responseHeader);
                break;

            case 16: // '\020'
                d = Long.valueOf(kwj1.d());
                break;

            case 26: // '\032'
                e = kwj1.j();
                break;

            case 34: // '"'
                if (a == null)
                {
                    a = new iza();
                }
                kwj1.a(a);
                break;

            case 42: // '*'
                if (b == null)
                {
                    b = new ixg();
                }
                kwj1.a(b);
                break;

            case 48: // '0'
                c = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (d != null)
        {
            kwk1.a(2, d.longValue());
        }
        if (e != null)
        {
            kwk1.a(3, e);
        }
        if (a != null)
        {
            kwk1.b(4, a);
        }
        if (b != null)
        {
            kwk1.b(5, b);
        }
        if (c != null)
        {
            kwk1.a(6, c.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
