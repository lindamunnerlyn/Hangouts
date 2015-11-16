// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class aic
    implements Interpolator
{

    private TimeInterpolator a;

    public aic(int i)
    {
        Object obj;
        obj = null;
        super();
        if (android.os.Build.VERSION.SDK_INT < 21) goto _L2; else goto _L1
_L1:
        aif.a[i - 1];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 50
    //                   2 67;
           goto _L3 _L4 _L5
_L3:
        a = ((TimeInterpolator) (obj));
        return;
_L4:
        obj = new PathInterpolator(0.4F, 0.0F, 0.2F, 1.0F);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new PathInterpolator(0.8F, 0.0F, 0.6F, 1.0F);
        if (true) goto _L3; else goto _L2
_L2:
        switch (aif.a[i - 1])
        {
        case 1: // '\001'
            obj = new aid(this);
            break;

        case 2: // '\002'
            obj = new aie(this);
            break;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    public float getInterpolation(float f)
    {
        return a.getInterpolation(f);
    }
}
