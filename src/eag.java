// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eag extends kws
{

    public int a;
    public String b;
    public String c;

    public eag()
    {
        a = 0;
        b = "";
        c = "";
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0)
        {
            i = j + kwk.e(1, a);
        }
        j = i;
        if (!b.equals(""))
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (!c.equals(""))
        {
            i = j + kwk.b(3, c);
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
                if (kwj1.b(i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = kwj1.f();
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != 0)
        {
            kwk1.a(1, a);
        }
        if (!b.equals(""))
        {
            kwk1.a(2, b);
        }
        if (!c.equals(""))
        {
            kwk1.a(3, c);
        }
        super.writeTo(kwk1);
    }
}
