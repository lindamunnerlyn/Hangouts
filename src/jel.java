// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jel extends kwm
{

    public jct a;
    public iyo b;
    public iyg c;
    public jbx d;
    public jap e;
    public jfb f;
    public jfm g;
    public jdk requestHeader;

    public jel()
    {
        requestHeader = null;
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
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(5, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(6, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(7, e);
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.d(8, f);
        }
        j = i;
        if (g != null)
        {
            j = i + kwk.d(9, g);
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
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new jct();
                }
                kwj1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new iyo();
                }
                kwj1.a(b);
                break;

            case 42: // '*'
                if (c == null)
                {
                    c = new iyg();
                }
                kwj1.a(c);
                break;

            case 50: // '2'
                if (d == null)
                {
                    d = new jbx();
                }
                kwj1.a(d);
                break;

            case 58: // ':'
                if (e == null)
                {
                    e = new jap();
                }
                kwj1.a(e);
                break;

            case 66: // 'B'
                if (f == null)
                {
                    f = new jfb();
                }
                kwj1.a(f);
                break;

            case 74: // 'J'
                if (g == null)
                {
                    g = new jfm();
                }
                kwj1.a(g);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (c != null)
        {
            kwk1.b(5, c);
        }
        if (d != null)
        {
            kwk1.b(6, d);
        }
        if (e != null)
        {
            kwk1.b(7, e);
        }
        if (f != null)
        {
            kwk1.b(8, f);
        }
        if (g != null)
        {
            kwk1.b(9, g);
        }
        super.writeTo(kwk1);
    }
}
