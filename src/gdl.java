// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

final class gdl
    implements SurfaceHolder
{

    private final Surface a;

    gdl(Surface surface)
    {
        a = surface;
    }

    public void addCallback(android.view.SurfaceHolder.Callback callback)
    {
    }

    public Surface getSurface()
    {
        return a;
    }

    public Rect getSurfaceFrame()
    {
        return null;
    }

    public boolean isCreating()
    {
        return false;
    }

    public Canvas lockCanvas()
    {
        return null;
    }

    public Canvas lockCanvas(Rect rect)
    {
        return null;
    }

    public void removeCallback(android.view.SurfaceHolder.Callback callback)
    {
    }

    public void setFixedSize(int i, int j)
    {
    }

    public void setFormat(int i)
    {
    }

    public void setKeepScreenOn(boolean flag)
    {
    }

    public void setSizeFromLayout()
    {
    }

    public void setType(int i)
    {
    }

    public void unlockCanvasAndPost(Canvas canvas)
    {
    }
}
