// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class imd extends Enum
    implements kxx
{

    public static final imd a;
    private static final imd b[];

    private imd(String s)
    {
        super(s, 0);
    }

    public static kxx b()
    {
        return a;
    }

    public static imd valueOf(String s)
    {
        return (imd)Enum.valueOf(imd, s);
    }

    public static imd[] values()
    {
        return (imd[])b.clone();
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
        a = new imd("INSTANCE");
        b = (new imd[] {
            a
        });
    }
}
