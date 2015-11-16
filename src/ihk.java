// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihk extends kwm
{

    public String a;
    public ijl b;
    public ihl c;

    public ihk()
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
            i = j + kwk.b(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(3, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(4, c);
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

            case 18: // '\022'
                a = kwj1.j();
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new ijl();
                }
                kwj1.a(b);
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new ihl();
                }
                kwj1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(2, a);
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (c != null)
        {
            kwk1.b(4, c);
        }
        super.writeTo(kwk1);
    }
}
