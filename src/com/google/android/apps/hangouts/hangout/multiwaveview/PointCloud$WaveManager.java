// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;


// Referenced classes of package com.google.android.apps.hangouts.hangout.multiwaveview:
//            PointCloud

public class alpha
{

    private float alpha;
    private float radius;
    final PointCloud this$0;
    private float width;

    public float getAlpha()
    {
        return alpha;
    }

    public float getRadius()
    {
        return radius;
    }

    public void setAlpha(float f)
    {
        alpha = f;
    }

    public void setRadius(float f)
    {
        radius = f;
    }




    public ()
    {
        this$0 = PointCloud.this;
        super();
        radius = 50F;
        width = 200F;
        alpha = 0.0F;
    }
}
