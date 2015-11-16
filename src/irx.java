// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class irx extends Enum
    implements joj
{

    public static final irx a;
    private static final irx b[];

    private irx(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static irx valueOf(String s)
    {
        return (irx)Enum.valueOf(irx, s);
    }

    public static irx[] values()
    {
        return (irx[])b.clone();
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
        a = new irx("INSTANCE");
        b = (new irx[] {
            a
        });
    }
}
