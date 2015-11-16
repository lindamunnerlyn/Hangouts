// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class laz extends koj
{

    public String a;
    public Boolean b;
    public Boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public laz()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + koh.b(1, a);
        }
        l = k;
        if (b != null)
        {
            b.booleanValue();
            l = k + (koh.f(2) + 1);
        }
        k = l;
        if (c != null)
        {
            c.booleanValue();
            k = l + (koh.f(3) + 1);
        }
        l = k;
        if (d != null)
        {
            l = k + koh.b(4, d);
        }
        k = l;
        if (e != null)
        {
            k = l + koh.b(5, e);
        }
        l = k;
        if (f != null)
        {
            l = k + koh.b(6, f);
        }
        k = l;
        if (g != null)
        {
            k = l + koh.b(8, g);
        }
        l = k;
        if (h != null)
        {
            l = k + koh.b(9, h);
        }
        k = l;
        if (i != null)
        {
            k = l + koh.b(10, i);
        }
        l = k;
        if (j != null)
        {
            l = k + koh.b(11, j);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int k = kog1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(kog1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kog1.j();
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kog1.i());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kog1.i());
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                e = kog1.j();
                break;

            case 50: // '2'
                f = kog1.j();
                break;

            case 66: // 'B'
                g = kog1.j();
                break;

            case 74: // 'J'
                h = kog1.j();
                break;

            case 82: // 'R'
                i = kog1.j();
                break;

            case 90: // 'Z'
                j = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.a(8, g);
        }
        if (h != null)
        {
            koh1.a(9, h);
        }
        if (i != null)
        {
            koh1.a(10, i);
        }
        if (j != null)
        {
            koh1.a(11, j);
        }
        super.writeTo(koh1);
    }
}
