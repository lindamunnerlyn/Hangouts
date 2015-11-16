// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxw extends kwm
{

    public Boolean a;
    public lrg b;
    public String c;
    public String d;

    public hxw()
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
            a.booleanValue();
            i = j + (kwk.f(2) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(3, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(4, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.b(5, d);
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

            case 16: // '\020'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new lrg();
                }
                kwj1.a(b);
                break;

            case 34: // '"'
                c = kwj1.j();
                break;

            case 42: // '*'
                d = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(2, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        if (d != null)
        {
            kwk1.a(5, d);
        }
        super.writeTo(kwk1);
    }
}
