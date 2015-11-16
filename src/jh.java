// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;

class jh extends jk
{

    jh()
    {
    }

    public int a(MotionEvent motionevent)
    {
        return motionevent.getPointerCount();
    }

    public int a(MotionEvent motionevent, int i)
    {
        return motionevent.findPointerIndex(i);
    }

    public int b(MotionEvent motionevent, int i)
    {
        return motionevent.getPointerId(i);
    }

    public float c(MotionEvent motionevent, int i)
    {
        return motionevent.getX(i);
    }

    public float d(MotionEvent motionevent, int i)
    {
        return motionevent.getY(i);
    }
}
