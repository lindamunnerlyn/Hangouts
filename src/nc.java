// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class nc
{

    private static final nd a;
    private final Object b;

    public nc()
    {
        b = a.a(this);
    }

    public nc(Object obj)
    {
        b = obj;
    }

    public static mq b()
    {
        return null;
    }

    public static boolean c()
    {
        return false;
    }

    public static List d()
    {
        return null;
    }

    public static mq e()
    {
        return null;
    }

    public Object a()
    {
        return b;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new ng();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new ne();
        } else
        {
            a = new nd();
        }
    }
}
