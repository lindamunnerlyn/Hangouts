// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

public final class lls
{

    static final llv a;

    public static void a(Message message)
    {
        a.a(message, true);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            a = new llu();
        } else
        {
            a = new llt();
        }
    }
}
