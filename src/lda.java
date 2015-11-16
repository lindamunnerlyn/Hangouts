// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lda extends lcz
{

    private static final long serialVersionUID = 0xfffff6f623875386L;
    private final byte x;
    private final transient ldi y;
    private final transient ldi z;

    lda(String s, byte byte0, ldi ldi, ldi ldi1)
    {
        super(s);
        x = byte0;
        y = ldi;
        z = ldi1;
    }

    private Object readResolve()
    {
        switch (x)
        {
        default:
            return this;

        case 1: // '\001'
            return lcz.a;

        case 2: // '\002'
            return lcz.b;

        case 3: // '\003'
            return lcz.c;

        case 4: // '\004'
            return lcz.d;

        case 5: // '\005'
            return lcz.e;

        case 6: // '\006'
            return lcz.f;

        case 7: // '\007'
            return lcz.g;

        case 8: // '\b'
            return lcz.h;

        case 9: // '\t'
            return lcz.i;

        case 10: // '\n'
            return lcz.j;

        case 11: // '\013'
            return lcz.k;

        case 12: // '\f'
            return lcz.l;

        case 13: // '\r'
            return lcz.m;

        case 14: // '\016'
            return lcz.n;

        case 15: // '\017'
            return lcz.o;

        case 16: // '\020'
            return lcz.p;

        case 17: // '\021'
            return lcz.q;

        case 18: // '\022'
            return lcz.r;

        case 19: // '\023'
            return lcz.s;

        case 20: // '\024'
            return lcz.t;

        case 21: // '\025'
            return lcz.u;

        case 22: // '\026'
            return lcz.v;

        case 23: // '\027'
            return lcz.w;
        }
    }

    public lcy a(lcw lcw1)
    {
        lcw1 = ldb.a(lcw1);
        switch (x)
        {
        default:
            throw new InternalError();

        case 1: // '\001'
            return lcw1.K();

        case 2: // '\002'
            return lcw1.F();

        case 3: // '\003'
            return lcw1.I();

        case 4: // '\004'
            return lcw1.G();

        case 5: // '\005'
            return lcw1.E();

        case 6: // '\006'
            return lcw1.v();

        case 7: // '\007'
            return lcw1.C();

        case 8: // '\b'
            return lcw1.u();

        case 9: // '\t'
            return lcw1.A();

        case 10: // '\n'
            return lcw1.z();

        case 11: // '\013'
            return lcw1.x();

        case 12: // '\f'
            return lcw1.t();

        case 13: // '\r'
            return lcw1.r();

        case 14: // '\016'
            return lcw1.p();

        case 15: // '\017'
            return lcw1.q();

        case 16: // '\020'
            return lcw1.n();

        case 17: // '\021'
            return lcw1.m();

        case 18: // '\022'
            return lcw1.k();

        case 19: // '\023'
            return lcw1.j();

        case 20: // '\024'
            return lcw1.h();

        case 21: // '\025'
            return lcw1.g();

        case 22: // '\026'
            return lcw1.e();

        case 23: // '\027'
            return lcw1.d();
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lda)
            {
                if (x != ((lda)obj).x)
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

    public ldi y()
    {
        return y;
    }

    public ldi z()
    {
        return z;
    }
}
