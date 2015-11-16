// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TypeEvaluator;
import android.graphics.Color;

public final class cre
    implements TypeEvaluator
{

    public cre()
    {
    }

    public Object evaluate(float f, Object obj, Object obj1)
    {
        obj = (Integer)obj;
        obj1 = (Integer)obj1;
        return Integer.valueOf(Color.rgb((int)((float)Color.red(g.a(((Integer) (obj)), 0)) * (1.0F - f) + (float)Color.red(g.a(((Integer) (obj1)), 0)) * f), (int)((float)Color.green(g.a(((Integer) (obj)), 0)) * (1.0F - f) + (float)Color.green(g.a(((Integer) (obj1)), 0)) * f), (int)((float)Color.blue(g.a(((Integer) (obj)), 0)) * (1.0F - f) + (float)Color.blue(g.a(((Integer) (obj1)), 0)) * f)));
    }
}
