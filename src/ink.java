// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ink
    implements kxx
{

    private final ini a;
    private final kxx b;

    public ink(ini ini, kxx kxx1)
    {
        a = ini;
        b = kxx1;
    }

    public Object a()
    {
        ine ine1 = (ine)b.a();
        if (ine1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ine1;
        }
    }
}
