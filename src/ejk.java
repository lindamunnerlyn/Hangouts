// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class ejk
{

    public static final int a;
    private static final ejk b = new ejk();

    ejk()
    {
    }

    public static int a(Context context)
    {
        int j = ejn.a(context);
        int i = j;
        if (ejn.b(context, j))
        {
            i = 18;
        }
        return i;
    }

    public static Intent a(int i)
    {
        return ejn.a(i);
    }

    public static ejk a()
    {
        return b;
    }

    public static boolean a(Context context, int i)
    {
        return ejn.b(context, i);
    }

    public static void b(Context context)
    {
        ejn.b(context);
    }

    public static void c(Context context)
    {
        ejn.c(context);
    }

    static 
    {
        a = ejn.a;
    }
}
