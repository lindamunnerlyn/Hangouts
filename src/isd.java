// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class isd extends Enum
    implements joj
{

    public static final isd a;
    private static final isd b[];

    private isd(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static isd valueOf(String s)
    {
        return (isd)Enum.valueOf(isd, s);
    }

    public static isd[] values()
    {
        return (isd[])b.clone();
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
        a = new isd("INSTANCE");
        b = (new isd[] {
            a
        });
    }
}
