// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jec extends koj
{

    public jdr a;
    public jdy b;
    public jeb c;
    public jdn d;
    public jdz e;
    public jdw f;
    public jdi g;
    public jdt h;
    public jdm i;
    public jds j;
    public jdk k;

    public jec()
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
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + koh.d(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + koh.d(2, b);
        }
        l = i1;
        if (c != null)
        {
            l = i1 + koh.d(3, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + koh.d(4, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + koh.d(5, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + koh.d(6, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + koh.d(7, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + koh.d(8, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + koh.d(9, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + koh.d(10, j);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + koh.d(11, k);
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int l = kog1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(kog1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new jdr();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new jdy();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new jeb();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jdn();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new jdz();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new jdw();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new jdi();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new jdt();
                }
                kog1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new jdm();
                }
                kog1.a(i);
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new jds();
                }
                kog1.a(j);
                break;

            case 90: // 'Z'
                if (k == null)
                {
                    k = new jdk();
                }
                kog1.a(k);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        if (i != null)
        {
            koh1.b(9, i);
        }
        if (j != null)
        {
            koh1.b(10, j);
        }
        if (k != null)
        {
            koh1.b(11, k);
        }
        super.writeTo(koh1);
    }
}
