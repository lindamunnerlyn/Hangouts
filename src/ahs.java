// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;

public final class ahs
    implements TimeInterpolator
{

    private DecelerateInterpolator a;

    public ahs(float f)
    {
        a = new DecelerateInterpolator(f);
    }

    public float getInterpolation(float f)
    {
        return a.getInterpolation(f);
    }
}
