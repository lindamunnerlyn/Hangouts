// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kmm extends kwm
{

    public kjr a;
    public lsa b;
    public String c;
    public String d;

    public kmm()
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
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(4, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(5, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.b(6, d);
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
                if (a == null)
                {
                    a = new kjr();
                }
                kwj1.a(a);
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new lsa();
                }
                kwj1.a(b);
                break;

            case 42: // '*'
                c = kwj1.j();
                break;

            case 50: // '2'
                d = kwj1.j();
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
            kwk1.b(4, b);
        }
        if (c != null)
        {
            kwk1.a(5, c);
        }
        if (d != null)
        {
            kwk1.a(6, d);
        }
        super.writeTo(kwk1);
    }
}
