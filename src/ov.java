// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class ov
    implements ow
{

    ov()
    {
    }

    public Object a(Context context)
    {
        return new EdgeEffect(context);
    }

    public void a(Object obj, int i, int j)
    {
        ((EdgeEffect)obj).setSize(i, j);
    }

    public boolean a(Object obj)
    {
        return ((EdgeEffect)obj).isFinished();
    }

    public boolean a(Object obj, float f)
    {
        return g.a(obj, f);
    }

    public boolean a(Object obj, float f, float f1)
    {
        return g.a(obj, f);
    }

    public boolean a(Object obj, int i)
    {
        ((EdgeEffect)obj).onAbsorb(i);
        return true;
    }

    public boolean a(Object obj, Canvas canvas)
    {
        return ((EdgeEffect)obj).draw(canvas);
    }

    public void b(Object obj)
    {
        ((EdgeEffect)obj).finish();
    }

    public boolean c(Object obj)
    {
        obj = (EdgeEffect)obj;
        ((EdgeEffect) (obj)).onRelease();
        return ((EdgeEffect) (obj)).isFinished();
    }
}
