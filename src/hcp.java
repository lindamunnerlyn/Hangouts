// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hcp
    implements joj
{

    private final joj a;

    public hcp(joj joj1)
    {
        a = joj1;
    }

    public Object a()
    {
        hda hda1 = (hda)a.a();
        if (hda1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hda1;
        }
    }
}
