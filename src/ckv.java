// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ckv
    implements Runnable
{

    final cku a;

    ckv(cku cku1)
    {
        a = cku1;
        super();
    }

    public void run()
    {
        a.b.setVisibility(0);
        a.c.setVisibility(0);
        a.d.setVisibility(0);
    }
}