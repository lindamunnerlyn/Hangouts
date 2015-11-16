// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kmi extends klu
{

    final kmy a;
    final Object b;
    final kmy c;
    public final kmh d;

    public kmi(kmy kmy, Object obj, kmy kmy1, kmh kmh1)
    {
        if (kmy == null)
        {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (kmh1.b() == knw.k && kmy1 == null)
        {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else
        {
            a = kmy;
            b = obj;
            c = kmy1;
            d = kmh1;
            return;
        }
    }

    public int a()
    {
        return d.a();
    }

    public Object a(Object obj)
    {
        Object obj1 = obj;
        if (d.c() == kob.h)
        {
            obj1 = Integer.valueOf(((kmo)obj).a());
        }
        return obj1;
    }

    public kmy b()
    {
        return c;
    }
}
