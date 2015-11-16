// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;

public final class ism extends Enum
    implements joj
{

    public static final ism a;
    private static final ism b[];

    private ism(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static ism valueOf(String s)
    {
        return (ism)Enum.valueOf(ism, s);
    }

    public static ism[] values()
    {
        return (ism[])b.clone();
    }

    public Object a()
    {
        return Collections.singleton(new isl());
    }

    static 
    {
        a = new ism("INSTANCE");
        b = (new ism[] {
            a
        });
    }
}
