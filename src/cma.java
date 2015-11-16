// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cma
    implements Runnable
{

    final clz a;

    cma(clz clz1)
    {
        a = clz1;
        super();
    }

    public void run()
    {
        a.b.setVisibility(0);
        a.c.setVisibility(0);
        a.d.setVisibility(0);
    }
}
