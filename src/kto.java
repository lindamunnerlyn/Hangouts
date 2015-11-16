// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class kto
    implements kvf
{

    private static final kty a = kty.a();

    public kto()
    {
    }

    public kvb a(kts kts1, kty kty1)
    {
        try
        {
            kts1 = kts1.f();
            kty1 = (kvb)a(((ktu) (kts1)), kty1);
        }
        // Misplaced declaration of an exception variable
        catch (kts kts1)
        {
            throw kts1;
        }
        kts1.a(0);
        return kty1;
        kts1;
        throw kts1.a(kty1);
    }

    public kvb b(kts kts1, kty kty1)
    {
        kty1 = a(kts1, kty1);
        if (kty1 != null && !kty1.E_())
        {
            if (kty1 instanceof ktl)
            {
                kts1 = ((ktl)kty1).b();
            } else
            if (kty1 instanceof ktn)
            {
                kts1 = ((ktn)kty1).J_();
            } else
            {
                kts1 = new kvt();
            }
            throw kts1.a().a(kty1);
        } else
        {
            return kty1;
        }
    }

    public Object c(kts kts1, kty kty1)
    {
        return b(kts1, kty1);
    }

}
