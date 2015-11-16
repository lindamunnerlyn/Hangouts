// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class eml
{

    public static final int a;
    private static final eml b = new eml();

    eml()
    {
    }

    public static int a(Context context)
    {
        int j = emo.a(context);
        int i = j;
        if (emo.b(context, j))
        {
            i = 18;
        }
        return i;
    }

    public static Intent a(int i)
    {
        return emo.a(i);
    }

    public static eml a()
    {
        return b;
    }

    public static boolean a(Context context, int i)
    {
        return emo.b(context, i);
    }

    public static void b(Context context)
    {
        emo.b(context);
    }

    public static void c(Context context)
    {
        emo.c(context);
    }

    static 
    {
        a = emo.a;
    }
}
