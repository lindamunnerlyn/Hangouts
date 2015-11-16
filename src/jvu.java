// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jvu extends koj
{

    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;

    public jvu()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.doubleValue();
            i = j + (koh.f(1) + 8);
        }
        j = i;
        if (b != null)
        {
            b.doubleValue();
            j = i + (koh.f(2) + 8);
        }
        i = j;
        if (c != null)
        {
            c.doubleValue();
            i = j + (koh.f(3) + 8);
        }
        j = i;
        if (d != null)
        {
            d.doubleValue();
            j = i + (koh.f(4) + 8);
        }
        i = j;
        if (e != null)
        {
            e.doubleValue();
            i = j + (koh.f(5) + 8);
        }
        j = i;
        if (f != null)
        {
            f.doubleValue();
            j = i + (koh.f(6) + 8);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 9: // '\t'
                a = Double.valueOf(kog1.b());
                break;

            case 17: // '\021'
                b = Double.valueOf(kog1.b());
                break;

            case 25: // '\031'
                c = Double.valueOf(kog1.b());
                break;

            case 33: // '!'
                d = Double.valueOf(kog1.b());
                break;

            case 41: // ')'
                e = Double.valueOf(kog1.b());
                break;

            case 49: // '1'
                f = Double.valueOf(kog1.b());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.doubleValue());
        }
        if (b != null)
        {
            koh1.a(2, b.doubleValue());
        }
        if (c != null)
        {
            koh1.a(3, c.doubleValue());
        }
        if (d != null)
        {
            koh1.a(4, d.doubleValue());
        }
        if (e != null)
        {
            koh1.a(5, e.doubleValue());
        }
        if (f != null)
        {
            koh1.a(6, f.doubleValue());
        }
        super.writeTo(koh1);
    }
}
