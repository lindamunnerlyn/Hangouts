// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irt
    implements joj
{

    private final irs a;

    public irt(irs irs1)
    {
        a = irs1;
    }

    public Object a()
    {
        android.app.Activity activity = a.a();
        if (activity == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return activity;
        }
    }
}
