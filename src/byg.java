// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class byg
    implements joj
{

    private final joj a;

    public byg(joj joj1)
    {
        a = joj1;
    }

    public Object a()
    {
        byf byf1 = (byf)hlp.a((Context)a.a(), byf);
        if (byf1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return byf1;
        }
    }
}
