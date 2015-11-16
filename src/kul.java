// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kul extends ktx
{

    final kvb a;
    final Object b;
    final kvb c;
    final kuk d;

    public kul(kvb kvb, Object obj, kvb kvb1, kuk kuk1)
    {
        if (kvb == null)
        {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (kuk1.b() == kvz.k && kvb1 == null)
        {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else
        {
            a = kvb;
            b = obj;
            c = kvb1;
            d = kuk1;
            return;
        }
    }

    public int a()
    {
        return d.a();
    }

    Object a(Object obj)
    {
        Object obj1 = obj;
        if (d.c() == kwe.h)
        {
            obj1 = Integer.valueOf(((kur)obj).a());
        }
        return obj1;
    }

    public kvb b()
    {
        return c;
    }
}
