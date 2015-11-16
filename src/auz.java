// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class auz
    implements Runnable
{

    final View a;

    public auz(View view)
    {
        a = view;
        super();
    }

    public void run()
    {
        g.d(a);
    }
}
