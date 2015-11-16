// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public class TargetDrawable
{

    private static final boolean DEBUG = false;
    public static final int STATE_ACTIVE[] = {
        0x101009e, 0x10100a2
    };
    public static final int STATE_FOCUSED[] = {
        0x101009e, 0xfefeff5e, 0x101009c
    };
    public static final int STATE_INACTIVE[] = {
        0x101009e, 0xfefeff5e
    };
    private static final String TAG = "TargetDrawable";
    private float mAlpha;
    private Drawable mDrawable;
    private boolean mEnabled;
    private float mPositionX;
    private float mPositionY;
    private final int mResourceId;
    private float mScaleX;
    private float mScaleY;
    private float mTranslationX;
    private float mTranslationY;

    public TargetDrawable(Resources resources, int i)
    {
        mTranslationX = 0.0F;
        mTranslationY = 0.0F;
        mPositionX = 0.0F;
        mPositionY = 0.0F;
        mScaleX = 1.0F;
        mScaleY = 1.0F;
        mAlpha = 1.0F;
        mEnabled = true;
        mResourceId = i;
        setDrawable(resources, i);
    }

    public TargetDrawable(TargetDrawable targetdrawable)
    {
        mTranslationX = 0.0F;
        mTranslationY = 0.0F;
        mPositionX = 0.0F;
        mPositionY = 0.0F;
        mScaleX = 1.0F;
        mScaleY = 1.0F;
        mAlpha = 1.0F;
        mEnabled = true;
        mResourceId = targetdrawable.mResourceId;
        if (targetdrawable.mDrawable != null)
        {
            targetdrawable = targetdrawable.mDrawable.mutate();
        } else
        {
            targetdrawable = null;
        }
        mDrawable = targetdrawable;
        resizeDrawables();
        setState(STATE_INACTIVE);
    }

    private void resizeDrawables()
    {
        if (mDrawable != null)
        {
            mDrawable.setBounds(0, 0, mDrawable.getIntrinsicWidth(), mDrawable.getIntrinsicHeight());
        }
    }

    public void draw(Canvas canvas)
    {
        if (mDrawable == null || !mEnabled)
        {
            return;
        } else
        {
            canvas.save(1);
            canvas.scale(mScaleX, mScaleY, mPositionX, mPositionY);
            canvas.translate(mTranslationX + mPositionX, mTranslationY + mPositionY);
            canvas.translate((float)getWidth() * -0.5F, (float)getHeight() * -0.5F);
            mDrawable.setAlpha(Math.round(mAlpha * 255F));
            mDrawable.draw(canvas);
            canvas.restore();
            return;
        }
    }

    public float getAlpha()
    {
        return mAlpha;
    }

    public int getHeight()
    {
        if (mDrawable != null)
        {
            return mDrawable.getIntrinsicHeight();
        } else
        {
            return 0;
        }
    }

    public float getPositionX()
    {
        return mPositionX;
    }

    public float getPositionY()
    {
        return mPositionY;
    }

    public int getResourceId()
    {
        return mResourceId;
    }

    public float getScaleX()
    {
        return mScaleX;
    }

    public float getScaleY()
    {
        return mScaleY;
    }

    public int getWidth()
    {
        if (mDrawable != null)
        {
            return mDrawable.getIntrinsicWidth();
        } else
        {
            return 0;
        }
    }

    public float getX()
    {
        return mTranslationX;
    }

    public float getY()
    {
        return mTranslationY;
    }

    public boolean hasState(int ai[])
    {
        return mDrawable instanceof StateListDrawable;
    }

    public boolean isActive()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!(mDrawable instanceof StateListDrawable)) goto _L2; else goto _L1
_L1:
        int ai[];
        int i;
        ai = ((StateListDrawable)mDrawable).getState();
        i = 0;
_L7:
        flag = flag1;
        if (i >= ai.length) goto _L2; else goto _L3
_L3:
        if (ai[i] != 0x101009c) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean isEnabled()
    {
        return mDrawable != null && mEnabled;
    }

    public void setAlpha(float f)
    {
        mAlpha = f;
    }

    public void setDrawable(Resources resources, int i)
    {
        Drawable drawable = null;
        if (i == 0)
        {
            resources = null;
        } else
        {
            resources = resources.getDrawable(i);
        }
        if (resources != null)
        {
            drawable = resources.mutate();
        }
        mDrawable = drawable;
        resizeDrawables();
        setState(STATE_INACTIVE);
    }

    public void setEnabled(boolean flag)
    {
        mEnabled = flag;
    }

    public void setPositionX(float f)
    {
        mPositionX = f;
    }

    public void setPositionY(float f)
    {
        mPositionY = f;
    }

    public void setScaleX(float f)
    {
        mScaleX = f;
    }

    public void setScaleY(float f)
    {
        mScaleY = f;
    }

    public void setState(int ai[])
    {
        if (mDrawable instanceof StateListDrawable)
        {
            ((StateListDrawable)mDrawable).setState(ai);
        }
    }

    public void setX(float f)
    {
        mTranslationX = f;
    }

    public void setY(float f)
    {
        mTranslationY = f;
    }

}
