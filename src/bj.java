// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.transition.Transition;

public final class bj extends android.transition.Transition.EpicenterCallback
{

    final bl a;
    private Rect b;

    public bj(bl bl1)
    {
        a = bl1;
        super();
    }

    public Rect onGetEpicenter(Transition transition)
    {
        if (b == null && a.a != null)
        {
            b = g.a(a.a);
        }
        return b;
    }
}
