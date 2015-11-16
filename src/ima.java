// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ima
    implements kxx
{

    private final ilz a;

    public ima(ilz ilz1)
    {
        a = ilz1;
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
