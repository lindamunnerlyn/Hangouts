// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gww
    implements joj
{

    private final gwv a;
    private final joj b;

    public gww(gwv gwv, joj joj1)
    {
        a = gwv;
        b = joj1;
    }

    public Object a()
    {
        gwq gwq1 = (gwq)b.a();
        if (gwq1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return gwq1;
        }
    }
}
