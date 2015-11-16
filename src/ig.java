// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

final class ig
    implements id
{

    private final GestureDetector a;

    public ig(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
    {
        a = new GestureDetector(context, ongesturelistener, null);
    }

    public boolean a(MotionEvent motionevent)
    {
        return a.onTouchEvent(motionevent);
    }
}
