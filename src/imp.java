// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class imp extends Enum
    implements kxx
{

    public static final imp a;
    private static final imp b[];

    private imp(String s)
    {
        super(s, 0);
    }

    public static kxx b()
    {
        return a;
    }

    public static imp valueOf(String s)
    {
        return (imp)Enum.valueOf(imp, s);
    }

    public static imp[] values()
    {
        return (imp[])b.clone();
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

    static 
    {
        a = new imp("INSTANCE");
        b = (new imp[] {
            a
        });
    }
}
