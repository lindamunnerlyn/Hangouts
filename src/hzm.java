// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzm extends kwm
{

    public iex a;
    public Boolean b;
    public hzt c;
    public ifc d;
    public kpn e;

    public hzm()
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
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (kwk.f(2) + 1);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(5, e);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new iex();
                }
                kwj1.a(a);
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new hzt();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new ifc();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new kpn();
                }
                kwj1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
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
