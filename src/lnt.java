// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lnt extends lns
{

    private static final long serialVersionUID = 0x1c563f5ae6d3L;
    private final byte m;

    lnt(String s, byte byte0)
    {
        super(s);
        m = byte0;
    }

    private Object readResolve()
    {
        switch (m)
        {
        default:
            return this;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;

        case 3: // '\003'
            return c;

        case 4: // '\004'
            return d;

        case 5: // '\005'
            return e;

        case 6: // '\006'
            return f;

        case 7: // '\007'
            return g;

        case 8: // '\b'
            return h;

        case 9: // '\t'
            return i;

        case 10: // '\n'
            return j;

        case 11: // '\013'
            return k;

        case 12: // '\f'
            return l;
        }
    }

    public lnr a(lng lng1)
    {
        lng1 = lnl.a(lng1);
        switch (m)
        {
        default:
            throw new InternalError();

        case 1: // '\001'
            return lng1.J();

        case 2: // '\002'
            return lng1.H();

        case 3: // '\003'
            return lng1.y();

        case 4: // '\004'
            return lng1.D();

        case 5: // '\005'
            return lng1.B();

        case 6: // '\006'
            return lng1.w();

        case 7: // '\007'
            return lng1.s();

        case 8: // '\b'
            return lng1.o();

        case 9: // '\t'
            return lng1.l();

        case 10: // '\n'
            return lng1.i();

        case 11: // '\013'
            return lng1.f();

        case 12: // '\f'
            return lng1.c();
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lnt)
            {
                if (m != ((lnt)obj).m)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return 1 << m;
    }
}
