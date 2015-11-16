// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

final class ejn extends Animation
{

    final ejl a;
    private final boolean b;
    private final int c;

    ejn(ejl ejl1, int i, boolean flag)
    {
        a = ejl1;
        super();
        b = flag;
        c = i;
        ejl1.b.setVisibility(0);
        if (flag)
        {
            i = 1;
        }
        ejl1.a(i);
    }

    public void applyTransformation(float f, Transformation transformation)
    {
        if (f != 1.0F) goto _L2; else goto _L1
_L1:
        int i = c;
_L4:
        a.a(i);
        return;
_L2:
        float f1 = f;
        if (!b)
        {
            f1 = 1.0F - f;
        }
        int j = (int)((float)c * f1);
        i = j;
        if (j <= 0)
        {
            i = 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean willChangeBounds()
    {
        return true;
    }
}
