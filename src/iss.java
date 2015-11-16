// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class iss extends Enum
    implements joj
{

    public static final iss a;
    private static final iss b[];

    private iss(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static iss valueOf(String s)
    {
        return (iss)Enum.valueOf(iss, s);
    }

    public static iss[] values()
    {
        return (iss[])b.clone();
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
        a = new iss("INSTANCE");
        b = (new iss[] {
            a
        });
    }
}
