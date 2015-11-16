// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lnk extends lnj
{

    private static final long serialVersionUID = 0xfffff6f623875386L;
    private final byte x;
    private final transient lns y;
    private final transient lns z;

    lnk(String s, byte byte0, lns lns, lns lns1)
    {
        super(s);
        x = byte0;
        y = lns;
        z = lns1;
    }

    private Object readResolve()
    {
        switch (x)
        {
        default:
            return this;

        case 1: // '\001'
            return lnj.a;

        case 2: // '\002'
            return lnj.b;

        case 3: // '\003'
            return lnj.c;

        case 4: // '\004'
            return lnj.d;

        case 5: // '\005'
            return lnj.e;

        case 6: // '\006'
            return lnj.f;

        case 7: // '\007'
            return lnj.g;

        case 8: // '\b'
            return lnj.h;

        case 9: // '\t'
            return lnj.i;

        case 10: // '\n'
            return lnj.j;

        case 11: // '\013'
            return lnj.k;

        case 12: // '\f'
            return lnj.l;

        case 13: // '\r'
            return lnj.m;

        case 14: // '\016'
            return lnj.n;

        case 15: // '\017'
            return lnj.o;

        case 16: // '\020'
            return lnj.p;

        case 17: // '\021'
            return lnj.q;

        case 18: // '\022'
            return lnj.r;

        case 19: // '\023'
            return lnj.s;

        case 20: // '\024'
            return lnj.t;

        case 21: // '\025'
            return lnj.u;

        case 22: // '\026'
            return lnj.v;

        case 23: // '\027'
            return lnj.w;
        }
    }

    public lni a(lng lng1)
    {
        lng1 = lnl.a(lng1);
        switch (x)
        {
        default:
            throw new InternalError();

        case 1: // '\001'
            return lng1.K();

        case 2: // '\002'
            return lng1.F();

        case 3: // '\003'
            return lng1.I();

        case 4: // '\004'
            return lng1.G();

        case 5: // '\005'
            return lng1.E();

        case 6: // '\006'
            return lng1.v();

        case 7: // '\007'
            return lng1.C();

        case 8: // '\b'
            return lng1.u();

        case 9: // '\t'
            return lng1.A();

        case 10: // '\n'
            return lng1.z();

        case 11: // '\013'
            return lng1.x();

        case 12: // '\f'
            return lng1.t();

        case 13: // '\r'
            return lng1.r();

        case 14: // '\016'
            return lng1.p();

        case 15: // '\017'
            return lng1.q();

        case 16: // '\020'
            return lng1.n();

        case 17: // '\021'
            return lng1.m();

        case 18: // '\022'
            return lng1.k();

        case 19: // '\023'
            return lng1.j();

        case 20: // '\024'
            return lng1.h();

        case 21: // '\025'
            return lng1.g();

        case 22: // '\026'
            return lng1.e();

        case 23: // '\027'
            return lng1.d();
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lnk)
            {
                if (x != ((lnk)obj).x)
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
        return 1 << x;
    }

    public lns y()
    {
        return y;
    }

    public lns z()
    {
        return z;
    }
}
