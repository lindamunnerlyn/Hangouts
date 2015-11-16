// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.view.View;

public interface 
{

    public static final int CENTER_HANDLE = 1;
    public static final int NO_HANDLE = 0;

    public abstract void onFinishFinalAnimation();

    public abstract void onGrabbed(View view, int i);

    public abstract void onGrabbedStateChange(View view, int i);

    public abstract void onReleased(View view, int i);

    public abstract void onTrigger(View view, int i);
}
