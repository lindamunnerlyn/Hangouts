// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Keyframe;

final class gqf extends gqa
    implements gqg
{

    private float i;
    private float j;

    public gqf(float f, float f1, float f2, float f3)
    {
        super(f, f1, f2, f3);
    }

    public void a(Keyframe keyframe, Keyframe keyframe1)
    {
        i = keyframe.getFraction();
        j = keyframe1.getFraction() - i;
    }

    public float getInterpolation(float f)
    {
        return i + j * super.getInterpolation((f - i) / j);
    }
}
