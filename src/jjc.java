// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jjc extends kwm
{

    public String a;
    public Float b;

    public jjc()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize() + kwk.b(1, a);
        int i = j;
        if (b != null)
        {
            b.floatValue();
            i = j + (kwk.f(2) + 4);
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

            case 21: // '\025'
                b = Float.valueOf(kwj1.c());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a);
        if (b != null)
        {
            kwk1.a(2, b.floatValue());
        }
        super.writeTo(kwk1);
    }
}
