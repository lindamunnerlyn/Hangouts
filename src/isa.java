// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class isa
    implements joj
{

    private final irz a;

    public isa(irz irz1)
    {
        a = irz1;
    }

    public Object a()
    {
        ad ad = a.a();
        if (ad == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ad;
        }
    }
}
