// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public final class kt
{

    static final kw a;

    public static void a(ViewGroup viewgroup)
    {
        a.a(viewgroup, false);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new ky();
        } else
        if (i >= 18)
        {
            a = new kx();
        } else
        if (i >= 14)
        {
            a = new kv();
        } else
        if (i >= 11)
        {
            a = new ku();
        } else
        {
            a = new kw();
        }
    }
}
