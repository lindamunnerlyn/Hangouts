// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ito
    implements joj
{

    private final itm a;
    private final joj b;

    public ito(itm itm, joj joj1)
    {
        a = itm;
        b = joj1;
    }

    public Object a()
    {
        iti iti1 = (iti)b.a();
        if (iti1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return iti1;
        }
    }
}
