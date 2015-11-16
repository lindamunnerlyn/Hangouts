// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iyg extends koj
{

    public iwo a;
    public isj b;
    public isb c;
    public ivs d;
    public iuk e;
    public iyw f;
    public izh g;
    public ixf requestHeader;

    public iyg()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + koh.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(5, c);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(6, d);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(7, e);
        }
        i = j;
        if (f != null)
        {
            i = j + koh.d(8, f);
        }
        j = i;
        if (g != null)
        {
            j = i + koh.d(9, g);
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

            case 10: // '\n'
                if (requestHeader == null)
                {
                    requestHeader = new ixf();
                }
                kog1.a(requestHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new iwo();
                }
                kog1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new isj();
                }
                kog1.a(b);
                break;

            case 42: // '*'
                if (c == null)
                {
                    c = new isb();
                }
                kog1.a(c);
                break;

            case 50: // '2'
                if (d == null)
                {
                    d = new ivs();
                }
                kog1.a(d);
                break;

            case 58: // ':'
                if (e == null)
                {
                    e = new iuk();
                }
                kog1.a(e);
                break;

            case 66: // 'B'
                if (f == null)
                {
                    f = new iyw();
                }
                kog1.a(f);
                break;

            case 74: // 'J'
                if (g == null)
                {
                    g = new izh();
                }
                kog1.a(g);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null)
        {
            koh1.b(5, c);
        }
        if (d != null)
        {
            koh1.b(6, d);
        }
        if (e != null)
        {
            koh1.b(7, e);
        }
        if (f != null)
        {
            koh1.b(8, f);
        }
        if (g != null)
        {
            koh1.b(9, g);
        }
        super.writeTo(koh1);
    }
}
