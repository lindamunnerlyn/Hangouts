// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class iqn
    implements joj
{

    private final iqm a;
    private final joj b;

    public iqn(iqm iqm, joj joj1)
    {
        a = iqm;
        b = joj1;
    }

    public Object a()
    {
        gqz gqz1 = (gqz)hlp.a((Context)b.a(), gqz);
        if (gqz1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return gqz1;
        }
    }
}
