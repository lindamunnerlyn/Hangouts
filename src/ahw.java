// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.AccelerateDecelerateInterpolator;

final class ahw extends AccelerateDecelerateInterpolator
{

    final ahv a;
    private ahs b;

    ahw(ahv ahv)
    {
        a = ahv;
        super();
        b = new ahs(0.8F);
    }

    public float getInterpolation(float f)
    {
        return super.getInterpolation(b.getInterpolation(f));
    }
}
