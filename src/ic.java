// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MotionEvent;

public final class ic
{

    private final id a;

    public ic(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            a = new ig(context, ongesturelistener, null);
            return;
        } else
        {
            a = new ie(context, ongesturelistener, null);
            return;
        }
    }

    public boolean a(MotionEvent motionevent)
    {
        return a.a(motionevent);
    }
}
