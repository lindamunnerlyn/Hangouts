// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gyd extends gqn
{

    private final gyf a;

    gyd(String s, gyf gyf1)
    {
        super(s);
        a = gyf1;
    }

    protected grk a(Context context)
    {
        try
        {
            context = gxy.a(a.b());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new grk(0, context, null);
        }
        return context;
    }
}
