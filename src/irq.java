// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;

public final class irq extends ContextWrapper
    implements irm
{

    private final Object a;

    public irq(Context context, Object obj)
    {
        super((Context)g.e(context));
        a = g.e(obj);
    }

    public Object a()
    {
        return a;
    }
}
