// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

public final class isf
    implements joj
{

    private final joj a;

    public isf(joj joj1)
    {
        a = joj1;
    }

    public Object a()
    {
        Object obj = (Activity)a.a();
        g.b(obj instanceof hoe, "Cannot inject lifecycle for an activity that doesn't have a lifecycle: %s", new Object[] {
            obj
        });
        obj = ((hoe)obj).getLifecycle();
        if (obj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return obj;
        }
    }
}
