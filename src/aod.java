// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class aod
    implements Runnable
{

    final Integer a[];
    final Context b;

    aod(Integer ainteger[], Context context)
    {
        a = ainteger;
        b = context;
        super();
    }

    public void run()
    {
        Integer ainteger[] = a;
        int j = ainteger.length;
        for (int i = 0; i < j; i++)
        {
            Integer integer = ainteger[i];
            aps.b(b, g.a(integer, -1));
        }

    }
}
