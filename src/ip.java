// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;

public final class ip
{

    static final iq a;

    public static void a(LayoutInflater layoutinflater, iv iv)
    {
        a.a(layoutinflater, iv);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new is();
        } else
        if (i >= 11)
        {
            a = new ir();
        } else
        {
            a = new iq();
        }
    }
}
