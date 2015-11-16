// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikh extends kwm
{

    public String a;
    public iki b;
    public Integer c;

    public ikh()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iki();
                }
                kwj1.a(b);
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        super.writeTo(kwk1);
    }
}
