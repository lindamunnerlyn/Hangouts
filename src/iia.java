// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iia extends kwm
{

    public Boolean a;
    public igw b;
    public igw c;
    public igw d;
    public ihu e;

    public iia()
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
            a.booleanValue();
            i = j + (kwk.f(5) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(6, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(7, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(8, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(9, e);
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

            case 40: // '('
                a = Boolean.valueOf(kwj1.i());
                break;

            case 50: // '2'
                if (b == null)
                {
                    b = new igw();
                }
                kwj1.a(b);
                break;

            case 58: // ':'
                if (c == null)
                {
                    c = new igw();
                }
                kwj1.a(c);
                break;

            case 66: // 'B'
                if (d == null)
                {
                    d = new igw();
                }
                kwj1.a(d);
                break;

            case 74: // 'J'
                if (e == null)
                {
                    e = new ihu();
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
            kwk1.a(5, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.b(6, b);
        }
        if (c != null)
        {
            kwk1.b(7, c);
        }
        if (d != null)
        {
            kwk1.b(8, d);
        }
        if (e != null)
        {
            kwk1.b(9, e);
        }
        super.writeTo(kwk1);
    }
}
