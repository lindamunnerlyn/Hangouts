// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class itn
    implements joj
{

    private final itm a;

    public itn(itm itm)
    {
        a = itm;
    }

    public Object a()
    {
        java.util.Set set = Collections.emptySet();
        if (set == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return set;
        }
    }
}
