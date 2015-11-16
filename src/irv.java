// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irv
    implements joj
{

    private final iru a;

    public irv(iru iru1)
    {
        a = iru1;
    }

    public Object a()
    {
        android.content.Context context = a.a();
        if (context == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return context;
        }
    }
}
