// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class csu
    implements joj
{

    private final cst a;
    private final joj b;

    public csu(cst cst, joj joj1)
    {
        a = cst;
        b = joj1;
    }

    public Object a()
    {
        csy csy1 = (csy)hlp.a((Context)b.a(), csy);
        if (csy1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return csy1;
        }
    }
}
