// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class kui extends kud
    implements kvd
{

    public kua d;

    public kui()
    {
        d = kua.a();
    }

    public boolean a(kvb kvb1, ktu ktu1, kty kty1, int i1)
    {
        kul kul1;
        int j1;
        boolean flag;
        int l1;
        flag = false;
        j1 = i1 & 7;
        l1 = i1 >>> 3;
        kul1 = kty1.a(kvb1, l1);
        if (kul1 == null) goto _L2; else goto _L1
_L1:
        if (j1 != kua.a(kul1.d.b(), false)) goto _L4; else goto _L3
_L3:
        j1 = 0;
_L6:
        if (j1 != 0)
        {
            return a(i1, ktu1);
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (kul1.d.d && kul1.d.c.c() && j1 == kua.a(kul1.d.b(), true))
        {
            j1 = 0;
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        j1 = 1;
        if (true) goto _L6; else goto _L5
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        i1 = ktu1.b(ktu1.s());
        if (kul1.d.b() == kvz.n)
        {
            for (; ktu1.t() > 0; d.b(kul1.d, kul1.a(kvb1)))
            {
                int k1 = ktu1.n();
                kvb1 = kul1.d.f().a(k1);
                if (kvb1 == null)
                {
                    return true;
                }
            }

        } else
        {
            for (; ktu1.t() > 0; d.b(kul1.d, kvb1))
            {
                kvb1 = ((kvb) (kua.a(ktu1, kul1.d.b())));
            }

        }
        ktu1.c(i1);
_L12:
        return true;
_L8:
        kue.a[kul1.d.c().ordinal()];
        JVM INSTR tableswitch 1 2: default 284
    //                   1 329
    //                   2 433;
           goto _L9 _L10 _L11
_L9:
        kvb1 = ((kvb) (kua.a(ktu1, kul1.d.b())));
_L13:
        if (kul1.d.d())
        {
            d.b(kul1.d, kul1.a(kvb1));
        } else
        {
            d.a(kul1.d, kul1.a(kvb1));
        }
        if (true) goto _L12; else goto _L10
_L10:
        if (kul1.d.d())
        {
            break MISSING_BLOCK_LABEL_490;
        }
        kvb1 = (kvb)d.a(kul1.d);
        if (kvb1 == null)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        kvb1 = kvb1.i();
_L14:
        Object obj = kvb1;
        if (kvb1 == null)
        {
            obj = kul1.b().j();
        }
        if (kul1.d.b() == kvz.j)
        {
            ktu1.a(kul1.a(), ((kvc) (obj)), kty1);
        } else
        {
            ktu1.a(((kvc) (obj)), kty1);
        }
        kvb1 = ((kvc) (obj)).i();
          goto _L13
_L11:
        i1 = ktu1.n();
        ktu1 = kul1.d.f().a(i1);
        kvb1 = ktu1;
        if (ktu1 == null)
        {
            a(l1, i1);
            return true;
        }
          goto _L13
        kvb1 = null;
          goto _L14
    }

    public final void f()
    {
        super.f();
        d.b();
    }

    public kvc i()
    {
        return super.h();
    }

    public kvc j()
    {
        return super.e();
    }

    public boolean k()
    {
        return d.f();
    }

    public kuj l()
    {
        return new kuj(this, true);
    }

    public int m()
    {
        return d.g();
    }
}
