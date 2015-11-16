// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class isg extends Enum
    implements joj
{

    public static final isg a;
    private static final isg b[];

    private isg(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static isg valueOf(String s)
    {
        return (isg)Enum.valueOf(isg, s);
    }

    public static isg[] values()
    {
        return (isg[])b.clone();
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
        a = new isg("INSTANCE");
        b = (new isg[] {
            a
        });
    }
}
