// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class isn extends Enum
    implements joj
{

    public static final isn a;
    private static final isn b[];

    private isn(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static isn valueOf(String s)
    {
        return (isn)Enum.valueOf(isn, s);
    }

    public static isn[] values()
    {
        return (isn[])b.clone();
    }

    public Object a()
    {
        return Collections.singleton(Boolean.valueOf(true));
    }

    static 
    {
        a = new isn("INSTANCE");
        b = (new isn[] {
            a
        });
    }
}
