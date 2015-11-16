// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.rastermill;

import android.graphics.Bitmap;

// Referenced classes of package android.support.rastermill:
//            FrameSequence

class mNativeState
{

    private long mNativeState;

    public void destroy()
    {
        if (mNativeState != 0L)
        {
            FrameSequence.access$000(mNativeState);
            mNativeState = 0L;
        }
    }

    public long getFrame(int i, Bitmap bitmap, int j)
    {
        if (bitmap == null || bitmap.getConfig() != android.graphics._fld888)
        {
            throw new IllegalArgumentException("Bitmap passed must be non-null and ARGB_8888");
        }
        if (mNativeState == 0L)
        {
            throw new IllegalStateException("attempted to draw destroyed FrameSequenceState");
        } else
        {
            return FrameSequence.access$100(mNativeState, i, bitmap, j);
        }
    }

    public (long l)
    {
        mNativeState = l;
    }
}
