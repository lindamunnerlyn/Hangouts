// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import ahb;
import android.animation.ObjectAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import eep;
import g;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.hangouts.hangout.multiwaveview:
//            TargetDrawable, PointCloud, Tweener

public class GlowPadView extends View
{

    private static final boolean DEBUG = false;
    private static final int HIDE_ANIMATION_DELAY = 200;
    private static final int HIDE_ANIMATION_DURATION = 200;
    private static final int INITIAL_SHOW_HANDLE_DURATION = 200;
    private static final int RETURN_TO_HOME_DELAY = 1200;
    private static final int RETURN_TO_HOME_DURATION = 200;
    private static final int REVEAL_GLOW_DELAY = 0;
    private static final int REVEAL_GLOW_DURATION = 0;
    private static final float RING_SCALE_COLLAPSED = 0.5F;
    private static final float RING_SCALE_EXPANDED = 1F;
    private static final int SHOW_ANIMATION_DELAY = 50;
    private static final int SHOW_ANIMATION_DURATION = 200;
    private static final float SNAP_MARGIN_DEFAULT = 20F;
    private static final int STATE_FINISH = 5;
    private static final int STATE_FIRST_TOUCH = 2;
    private static final int STATE_IDLE = 0;
    private static final int STATE_SNAP = 4;
    private static final int STATE_START = 1;
    private static final int STATE_TRACKING = 3;
    private static final String TAG = "GlowPadView";
    private static final float TAP_RADIUS_SCALE_ACCESSIBILITY_ENABLED = 1.3F;
    private static final float TARGET_SCALE_COLLAPSED = 0.8F;
    private static final float TARGET_SCALE_EXPANDED = 1F;
    private static final int WAVE_ANIMATION_DURATION = 1350;
    private int mActiveTarget;
    private boolean mAlwaysTrackFinger;
    private boolean mAnimatingTargets;
    private Tweener mBackgroundAnimator;
    private ArrayList mDirectionDescriptions;
    private int mDirectionDescriptionsResourceId;
    private boolean mDragging;
    private int mFeedbackCount;
    private AnimationBundle mGlowAnimations;
    private float mGlowRadius;
    private int mGrabbedState;
    private int mGravity;
    private TargetDrawable mHandleDrawable;
    private int mHorizontalInset;
    private boolean mInitialLayout;
    private float mInnerRadius;
    private int mMaxTargetHeight;
    private int mMaxTargetWidth;
    private int mNewTargetResources;
    private OnTriggerListener mOnTriggerListener;
    private float mOuterRadius;
    private TargetDrawable mOuterRing;
    private PointCloud mPointCloud;
    private int mPointerId;
    private android.animation.Animator.AnimatorListener mResetListener;
    private android.animation.Animator.AnimatorListener mResetListenerWithPing;
    private float mSnapMargin;
    private AnimationBundle mTargetAnimations;
    private ArrayList mTargetDescriptions;
    private int mTargetDescriptionsResourceId;
    private ArrayList mTargetDrawables;
    private int mTargetResourceId;
    private android.animation.Animator.AnimatorListener mTargetUpdateListener;
    private android.animation.ValueAnimator.AnimatorUpdateListener mUpdateListener;
    private int mVerticalInset;
    private int mVibrationDuration;
    private Vibrator mVibrator;
    private AnimationBundle mWaveAnimations;
    private float mWaveCenterX;
    private float mWaveCenterY;

    public GlowPadView(Context context)
    {
        this(context, null);
    }

    public GlowPadView(Context context, AttributeSet attributeset)
    {
        boolean flag = false;
        super(context, attributeset);
        mTargetDrawables = new ArrayList();
        mWaveAnimations = new AnimationBundle(null);
        mTargetAnimations = new AnimationBundle(null);
        mGlowAnimations = new AnimationBundle(null);
        mFeedbackCount = 3;
        mVibrationDuration = 0;
        mActiveTarget = -1;
        mOuterRadius = 0.0F;
        mSnapMargin = 0.0F;
        mResetListener = new _cls1();
        mResetListenerWithPing = new _cls2();
        mUpdateListener = new _cls3();
        mTargetUpdateListener = new _cls4();
        mGravity = 48;
        mInitialLayout = true;
        Object obj = context.getResources();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, ahb.A);
        mInnerRadius = typedarray.getDimension(ahb.G, mInnerRadius);
        mOuterRadius = typedarray.getDimension(ahb.H, mOuterRadius);
        mSnapMargin = typedarray.getDimension(ahb.K, mSnapMargin);
        mVibrationDuration = typedarray.getInt(ahb.N, mVibrationDuration);
        mFeedbackCount = typedarray.getInt(ahb.D, mFeedbackCount);
        TypedValue typedvalue = typedarray.peekValue(ahb.F);
        int i;
        if (typedvalue != null)
        {
            i = typedvalue.resourceId;
        } else
        {
            i = 0;
        }
        mHandleDrawable = new TargetDrawable(((Resources) (obj)), i);
        mHandleDrawable.setState(TargetDrawable.STATE_INACTIVE);
        mOuterRing = new TargetDrawable(((Resources) (obj)), getResourceId(typedarray, ahb.I));
        mAlwaysTrackFinger = typedarray.getBoolean(ahb.B, false);
        i = getResourceId(typedarray, ahb.J);
        if (i != 0)
        {
            obj = ((Resources) (obj)).getDrawable(i);
        } else
        {
            obj = null;
        }
        mGlowRadius = typedarray.getDimension(ahb.E, 0.0F);
        typedvalue = new TypedValue();
        if (typedarray.getValue(ahb.M, typedvalue))
        {
            internalSetTargetResources(typedvalue.resourceId);
        }
        if (mTargetDrawables == null || mTargetDrawables.size() == 0)
        {
            throw new IllegalStateException("Must specify at least one target drawable");
        }
        if (typedarray.getValue(ahb.L, typedvalue))
        {
            int j = typedvalue.resourceId;
            if (j == 0)
            {
                throw new IllegalStateException("Must specify target descriptions");
            }
            setTargetDescriptionsResourceId(j);
        }
        if (typedarray.getValue(ahb.C, typedvalue))
        {
            int k = typedvalue.resourceId;
            if (k == 0)
            {
                throw new IllegalStateException("Must specify direction descriptions");
            }
            setDirectionDescriptionsResourceId(k);
        }
        typedarray.recycle();
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100b3
        });
        mGravity = context.getInt(0, 48);
        context.recycle();
        if (mVibrationDuration > 0)
        {
            flag = true;
        }
        setVibrateEnabled(flag);
        assignDefaultsIfNeeded();
        mPointCloud = new PointCloud(((android.graphics.drawable.Drawable) (obj)));
        mPointCloud.makePointCloud(mInnerRadius, mOuterRadius);
        mPointCloud.glowManager.setRadius(mGlowRadius);
    }

    private void announceTargets()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = mTargetDrawables.size();
        for (int i = 0; i < j; i++)
        {
            String s = getTargetDescription(i);
            String s1 = getDirectionDescription(i);
            if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
            {
                stringbuilder.append(String.format(s1, new Object[] {
                    s
                }));
            }
        }

        if (stringbuilder.length() > 0)
        {
            eep.a(this, null, stringbuilder.toString());
        }
    }

    private void assignDefaultsIfNeeded()
    {
        if (mOuterRadius == 0.0F)
        {
            mOuterRadius = (float)Math.max(mOuterRing.getWidth(), mOuterRing.getHeight()) / 2.0F;
        }
        if (mSnapMargin == 0.0F)
        {
            mSnapMargin = TypedValue.applyDimension(1, 20F, getContext().getResources().getDisplayMetrics());
        }
        if (mInnerRadius == 0.0F)
        {
            mInnerRadius = (float)mHandleDrawable.getWidth() / 10F;
        }
    }

    private void computeInsets(int i, int j)
    {
        int k = mGravity;
        k & 7;
        JVM INSTR tableswitch 3 5: default 36
    //                   3 80
    //                   4 36
    //                   5 88;
           goto _L1 _L2 _L1 _L3
_L3:
        break MISSING_BLOCK_LABEL_88;
_L1:
        mHorizontalInset = i / 2;
_L4:
        switch (k & 0x70)
        {
        default:
            mVerticalInset = j / 2;
            return;

        case 48: // '0'
            mVerticalInset = 0;
            return;

        case 80: // 'P'
            mVerticalInset = j;
            break;
        }
        break MISSING_BLOCK_LABEL_107;
_L2:
        mHorizontalInset = 0;
          goto _L4
        mHorizontalInset = i;
          goto _L4
    }

    private void deactivateTargets()
    {
        int j = mTargetDrawables.size();
        for (int i = 0; i < j; i++)
        {
            ((TargetDrawable)mTargetDrawables.get(i)).setState(TargetDrawable.STATE_INACTIVE);
        }

        mActiveTarget = -1;
    }

    private void dispatchOnFinishFinalAnimation()
    {
        if (mOnTriggerListener != null)
        {
            mOnTriggerListener.onFinishFinalAnimation();
        }
    }

    private void dispatchTriggerEvent(int i)
    {
        vibrate();
        if (mOnTriggerListener != null)
        {
            mOnTriggerListener.onTrigger(this, i);
        }
    }

    private float dist2(float f, float f1)
    {
        return f * f + f1 * f1;
    }

    private void doFinish()
    {
        int i = mActiveTarget;
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            highlightSelected(i);
            hideGlow(200, 1200, 0.0F, mResetListener);
            dispatchTriggerEvent(i);
            if (!mAlwaysTrackFinger)
            {
                mTargetAnimations.stop();
            }
        } else
        {
            hideGlow(200, 0, 0.0F, mResetListenerWithPing);
            hideTargets(true, false);
        }
        setGrabbedState(0);
    }

    private void dump()
    {
        float f = mOuterRadius;
        (new StringBuilder(30)).append("Outer Radius = ").append(f);
        f = mSnapMargin;
        (new StringBuilder(28)).append("SnapMargin = ").append(f);
        int i = mFeedbackCount;
        (new StringBuilder(27)).append("FeedbackCount = ").append(i);
        i = mVibrationDuration;
        (new StringBuilder(31)).append("VibrationDuration = ").append(i);
        f = mGlowRadius;
        (new StringBuilder(28)).append("GlowRadius = ").append(f);
        f = mWaveCenterX;
        (new StringBuilder(29)).append("WaveCenterX = ").append(f);
        f = mWaveCenterY;
        (new StringBuilder(29)).append("WaveCenterY = ").append(f);
    }

    private String getDirectionDescription(int i)
    {
        if (mDirectionDescriptions == null || mDirectionDescriptions.isEmpty())
        {
            mDirectionDescriptions = loadDescriptions(mDirectionDescriptionsResourceId);
            if (mTargetDrawables.size() != mDirectionDescriptions.size())
            {
                return null;
            }
        }
        return (String)mDirectionDescriptions.get(i);
    }

    private int getResourceId(TypedArray typedarray, int i)
    {
        typedarray = typedarray.peekValue(i);
        if (typedarray == null)
        {
            return 0;
        } else
        {
            return ((TypedValue) (typedarray)).resourceId;
        }
    }

    private float getScaledGlowRadiusSquared()
    {
        float f;
        if (((AccessibilityManager)getContext().getSystemService("accessibility")).isEnabled())
        {
            f = 1.3F * mGlowRadius;
        } else
        {
            f = mGlowRadius;
        }
        return square(f);
    }

    private String getTargetDescription(int i)
    {
        if (mTargetDescriptions == null || mTargetDescriptions.isEmpty())
        {
            mTargetDescriptions = loadDescriptions(mTargetDescriptionsResourceId);
            if (mTargetDrawables.size() != mTargetDescriptions.size())
            {
                return null;
            }
        }
        return (String)mTargetDescriptions.get(i);
    }

    private void handleCancel(MotionEvent motionevent)
    {
        mActiveTarget = -1;
        int j = motionevent.findPointerIndex(mPointerId);
        int i = j;
        if (j == -1)
        {
            i = 0;
        }
        switchToState(5, motionevent.getX(i), motionevent.getY(i));
    }

    private void handleDown(MotionEvent motionevent)
    {
        int i = motionevent.getActionIndex();
        float f = motionevent.getX(i);
        float f1 = motionevent.getY(i);
        switchToState(1, f, f1);
        if (!trySwitchToFirstTouchState(f, f1))
        {
            mDragging = false;
            return;
        } else
        {
            mPointerId = motionevent.getPointerId(i);
            updateGlowPosition(f, f1);
            return;
        }
    }

    private void handleMove(MotionEvent motionevent)
    {
        int i1 = motionevent.getHistorySize();
        ArrayList arraylist = mTargetDrawables;
        int j1 = arraylist.size();
        int k1 = motionevent.findPointerIndex(mPointerId);
        if (k1 != -1)
        {
            int k = 0;
            float f = 0.0F;
            float f1 = 0.0F;
            int i;
            int l;
            for (i = -1; k < i1 + 1; i = l)
            {
                double d;
                float f2;
                float f3;
                float f4;
                if (k < i1)
                {
                    f = motionevent.getHistoricalX(k1, k);
                } else
                {
                    f = motionevent.getX(k1);
                }
                if (k < i1)
                {
                    f1 = motionevent.getHistoricalY(k1, k);
                } else
                {
                    f1 = motionevent.getY(k1);
                }
                f4 = f - mWaveCenterX;
                f3 = f1 - mWaveCenterY;
                f2 = (float)Math.sqrt(dist2(f4, f3));
                if (f2 > mOuterRadius)
                {
                    f2 = mOuterRadius / f2;
                } else
                {
                    f2 = 1.0F;
                }
                d = Math.atan2(-f3, f4);
                if (!mDragging)
                {
                    trySwitchToFirstTouchState(f, f1);
                }
                l = i;
                if (mDragging)
                {
                    f = mOuterRadius - mSnapMargin;
                    int j = 0;
                    do
                    {
                        l = i;
                        if (j >= j1)
                        {
                            break;
                        }
                        TargetDrawable targetdrawable = (TargetDrawable)arraylist.get(j);
                        double d1 = (((double)j - 0.5D) * 2D * 3.1415926535897931D) / (double)j1;
                        double d2 = (((double)j + 0.5D) * 2D * 3.1415926535897931D) / (double)j1;
                        if (targetdrawable.isEnabled())
                        {
                            if (d > d1 && d <= d2 || 6.2831853071795862D + d > d1 && 6.2831853071795862D + d <= d2)
                            {
                                l = 1;
                            } else
                            {
                                l = 0;
                            }
                            if (l != 0 && dist2(f4, f3) > f * f)
                            {
                                i = j;
                            }
                        }
                        j++;
                    } while (true);
                }
                k++;
                f1 = f4 * f2;
                f = f3 * f2;
            }

            if (mDragging)
            {
                if (i != -1)
                {
                    switchToState(4, f1, f);
                    updateGlowPosition(f1, f);
                } else
                {
                    switchToState(3, f1, f);
                    updateGlowPosition(f1, f);
                }
                if (mActiveTarget != i)
                {
                    if (mActiveTarget != -1)
                    {
                        motionevent = (TargetDrawable)arraylist.get(mActiveTarget);
                        if (motionevent.hasState(TargetDrawable.STATE_FOCUSED))
                        {
                            motionevent.setState(TargetDrawable.STATE_INACTIVE);
                        }
                    }
                    if (i != -1)
                    {
                        motionevent = (TargetDrawable)arraylist.get(i);
                        if (motionevent.hasState(TargetDrawable.STATE_FOCUSED))
                        {
                            motionevent.setState(TargetDrawable.STATE_FOCUSED);
                        }
                        motionevent = (AccessibilityManager)getContext().getSystemService("accessibility");
                        if (motionevent.isEnabled())
                        {
                            eep.a(this, motionevent, getTargetDescription(i));
                        }
                    }
                }
                mActiveTarget = i;
                return;
            }
        }
    }

    private void handleUp(MotionEvent motionevent)
    {
        int i = motionevent.getActionIndex();
        if (motionevent.getPointerId(i) == mPointerId)
        {
            switchToState(5, motionevent.getX(i), motionevent.getY(i));
        }
    }

    private void hideGlow(int i, int j, float f, android.animation.Animator.AnimatorListener animatorlistener)
    {
        mGlowAnimations.cancel();
        mGlowAnimations.add(Tweener.to(mPointCloud.glowManager, i, new Object[] {
            "ease", Ease.Quart.easeOut, "delay", Integer.valueOf(j), "alpha", Float.valueOf(f), "x", Float.valueOf(0.0F), "y", Float.valueOf(0.0F), 
            "onUpdate", mUpdateListener, "onComplete", animatorlistener
        }));
        mGlowAnimations.start();
    }

    private void hideTargets(boolean flag, boolean flag1)
    {
        mTargetAnimations.cancel();
        mAnimatingTargets = flag;
        float f;
        android.animation.TimeInterpolator timeinterpolator;
        int i;
        char c;
        int k;
        if (flag)
        {
            i = 200;
        } else
        {
            i = 0;
        }
        if (flag)
        {
            c = '\310';
        } else
        {
            c = '\0';
        }
        if (flag1)
        {
            f = 1.0F;
        } else
        {
            f = 0.8F;
        }
        k = mTargetDrawables.size();
        timeinterpolator = Ease.Cubic.easeOut;
        for (int j = 0; j < k; j++)
        {
            TargetDrawable targetdrawable = (TargetDrawable)mTargetDrawables.get(j);
            targetdrawable.setState(TargetDrawable.STATE_INACTIVE);
            mTargetAnimations.add(Tweener.to(targetdrawable, i, new Object[] {
                "ease", timeinterpolator, "alpha", Float.valueOf(0.0F), "scaleX", Float.valueOf(f), "scaleY", Float.valueOf(f), "delay", Integer.valueOf(c), 
                "onUpdate", mUpdateListener
            }));
        }

        if (flag1)
        {
            f = 1.0F;
        } else
        {
            f = 0.5F;
        }
        mTargetAnimations.add(Tweener.to(mOuterRing, i, new Object[] {
            "ease", timeinterpolator, "alpha", Float.valueOf(0.0F), "scaleX", Float.valueOf(f), "scaleY", Float.valueOf(f), "delay", Integer.valueOf(c), 
            "onUpdate", mUpdateListener, "onComplete", mTargetUpdateListener
        }));
        mTargetAnimations.start();
    }

    private void hideUnselected(int i)
    {
        for (int j = 0; j < mTargetDrawables.size(); j++)
        {
            if (j != i)
            {
                ((TargetDrawable)mTargetDrawables.get(j)).setAlpha(0.0F);
            }
        }

    }

    private void highlightSelected(int i)
    {
        ((TargetDrawable)mTargetDrawables.get(i)).setState(TargetDrawable.STATE_ACTIVE);
        hideUnselected(i);
    }

    private void internalSetTargetResources(int i)
    {
        ArrayList arraylist = loadDrawableArray(i);
        mTargetDrawables = arraylist;
        mTargetResourceId = i;
        Resources resources = getContext().getResources();
        int j = resources.getDimensionPixelOffset(g.eR);
        i = resources.getDimensionPixelOffset(g.eB);
        int l = arraylist.size();
        int k = 0;
        while (k < l) 
        {
            TargetDrawable targetdrawable = (TargetDrawable)arraylist.get(k);
            if (k % 2 == 0)
            {
                j = Math.max(j, targetdrawable.getWidth());
            } else
            {
                i = Math.max(i, targetdrawable.getHeight());
            }
            k++;
        }
        if (mMaxTargetWidth != j || mMaxTargetHeight != i)
        {
            mMaxTargetWidth = j;
            mMaxTargetHeight = i;
            requestLayout();
            return;
        } else
        {
            updateTargetPositions(mWaveCenterX, mWaveCenterY);
            updatePointCloudPosition(mWaveCenterX, mWaveCenterY);
            return;
        }
    }

    private ArrayList loadDescriptions(int i)
    {
        TypedArray typedarray = getContext().getResources().obtainTypedArray(i);
        int j = typedarray.length();
        ArrayList arraylist = new ArrayList(j);
        for (i = 0; i < j; i++)
        {
            arraylist.add(typedarray.getString(i));
        }

        typedarray.recycle();
        return arraylist;
    }

    private ArrayList loadDrawableArray(int i)
    {
        Resources resources = getContext().getResources();
        TypedArray typedarray = resources.obtainTypedArray(i);
        int k = typedarray.length();
        ArrayList arraylist = new ArrayList(k);
        i = 0;
        while (i < k) 
        {
            TypedValue typedvalue = typedarray.peekValue(i);
            int j;
            if (typedvalue != null)
            {
                j = typedvalue.resourceId;
            } else
            {
                j = 0;
            }
            arraylist.add(new TargetDrawable(resources, j));
            i++;
        }
        typedarray.recycle();
        return arraylist;
    }

    private boolean replaceTargetDrawables(Resources resources, int i, int j)
    {
        boolean flag3 = false;
        boolean flag = false;
        boolean flag2 = flag;
        if (i != 0)
        {
            if (j == 0)
            {
                flag2 = flag;
            } else
            {
                ArrayList arraylist = mTargetDrawables;
                int l = arraylist.size();
                int k = 0;
                boolean flag1 = flag3;
                for (; k < l; k++)
                {
                    TargetDrawable targetdrawable = (TargetDrawable)arraylist.get(k);
                    if (targetdrawable != null && targetdrawable.getResourceId() == i)
                    {
                        targetdrawable.setDrawable(resources, j);
                        flag1 = true;
                    }
                }

                flag2 = flag1;
                if (flag1)
                {
                    requestLayout();
                    return flag1;
                }
            }
        }
        return flag2;
    }

    private int resolveMeasured(int i, int j)
    {
        int l = android.view.View.MeasureSpec.getSize(i);
        int k = j;
        switch (android.view.View.MeasureSpec.getMode(i))
        {
        default:
            k = l;
            // fall through

        case 0: // '\0'
            return k;

        case -2147483648: 
            return Math.min(l, j);
        }
    }

    private void setGrabbedState(int i)
    {
        if (i != mGrabbedState)
        {
            if (i != 0)
            {
                vibrate();
            }
            mGrabbedState = i;
            if (mOnTriggerListener != null)
            {
                if (i == 0)
                {
                    mOnTriggerListener.onReleased(this, 1);
                } else
                {
                    mOnTriggerListener.onGrabbed(this, 1);
                }
                mOnTriggerListener.onGrabbedStateChange(this, i);
            }
        }
    }

    private void showGlow(int i, int j, float f, android.animation.Animator.AnimatorListener animatorlistener)
    {
        mGlowAnimations.cancel();
        mGlowAnimations.add(Tweener.to(mPointCloud.glowManager, i, new Object[] {
            "ease", Ease.Cubic.easeIn, "delay", Integer.valueOf(j), "alpha", Float.valueOf(f), "onUpdate", mUpdateListener, "onComplete", animatorlistener
        }));
        mGlowAnimations.start();
    }

    private void showTargets(boolean flag)
    {
        mTargetAnimations.stop();
        mAnimatingTargets = flag;
        byte byte0;
        int i;
        int k;
        if (flag)
        {
            byte0 = 50;
        } else
        {
            byte0 = 0;
        }
        if (flag)
        {
            i = 200;
        } else
        {
            i = 0;
        }
        k = mTargetDrawables.size();
        for (int j = 0; j < k; j++)
        {
            TargetDrawable targetdrawable = (TargetDrawable)mTargetDrawables.get(j);
            targetdrawable.setState(TargetDrawable.STATE_INACTIVE);
            mTargetAnimations.add(Tweener.to(targetdrawable, i, new Object[] {
                "ease", Ease.Cubic.easeOut, "alpha", Float.valueOf(1.0F), "scaleX", Float.valueOf(1.0F), "scaleY", Float.valueOf(1.0F), "delay", Integer.valueOf(byte0), 
                "onUpdate", mUpdateListener
            }));
        }

        mTargetAnimations.add(Tweener.to(mOuterRing, i, new Object[] {
            "ease", Ease.Cubic.easeOut, "alpha", Float.valueOf(1.0F), "scaleX", Float.valueOf(1.0F), "scaleY", Float.valueOf(1.0F), "delay", Integer.valueOf(byte0), 
            "onUpdate", mUpdateListener, "onComplete", mTargetUpdateListener
        }));
        mTargetAnimations.start();
    }

    private float square(float f)
    {
        return f * f;
    }

    private void startBackgroundAnimation(int i, float f)
    {
        android.graphics.drawable.Drawable drawable = getBackground();
        if (mAlwaysTrackFinger && drawable != null)
        {
            if (mBackgroundAnimator != null)
            {
                mBackgroundAnimator.animator.cancel();
            }
            mBackgroundAnimator = Tweener.to(drawable, i, new Object[] {
                "ease", Ease.Cubic.easeIn, "alpha", Integer.valueOf((int)(255F * f)), "delay", Integer.valueOf(50)
            });
            mBackgroundAnimator.animator.start();
        }
    }

    private void startWaveAnimation()
    {
        mWaveAnimations.cancel();
        mPointCloud.waveManager.setAlpha(1.0F);
        mPointCloud.waveManager.setRadius((float)mHandleDrawable.getWidth() / 2.0F);
        mWaveAnimations.add(Tweener.to(mPointCloud.waveManager, 1350L, new Object[] {
            "ease", Ease.Quad.easeOut, "delay", Integer.valueOf(0), "radius", Float.valueOf(mOuterRadius * 2.0F), "onUpdate", mUpdateListener, "onComplete", new _cls5()
        }));
        mWaveAnimations.start();
    }

    private void stopAndHideWaveAnimation()
    {
        mWaveAnimations.cancel();
        mPointCloud.waveManager.setAlpha(0.0F);
    }

    private void switchToState(int i, float f, float f1)
    {
        i;
        JVM INSTR tableswitch 0 5: default 40
    //                   0 41
    //                   1 78
    //                   2 85
    //                   3 139
    //                   4 156
    //                   5 173;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L2:
        deactivateTargets();
        hideGlow(0, 0, 0.0F, null);
        startBackgroundAnimation(0, 0.0F);
        mHandleDrawable.setState(TargetDrawable.STATE_INACTIVE);
        mHandleDrawable.setAlpha(1.0F);
        return;
_L3:
        startBackgroundAnimation(0, 0.0F);
        return;
_L4:
        mHandleDrawable.setAlpha(0.0F);
        deactivateTargets();
        showTargets(true);
        startBackgroundAnimation(200, 1.0F);
        setGrabbedState(1);
        if (((AccessibilityManager)getContext().getSystemService("accessibility")).isEnabled())
        {
            announceTargets();
            return;
        }
          goto _L1
_L5:
        mHandleDrawable.setAlpha(0.0F);
        showGlow(0, 0, 1.0F, null);
        return;
_L6:
        mHandleDrawable.setAlpha(0.0F);
        showGlow(0, 0, 0.0F, null);
        return;
_L7:
        doFinish();
        return;
    }

    private boolean trySwitchToFirstTouchState(float f, float f1)
    {
        float f2 = f - mWaveCenterX;
        float f3 = f1 - mWaveCenterY;
        if (mAlwaysTrackFinger || dist2(f2, f3) <= getScaledGlowRadiusSquared())
        {
            switchToState(2, f, f1);
            updateGlowPosition(f2, f3);
            mDragging = true;
            return true;
        } else
        {
            return false;
        }
    }

    private void updateGlowPosition(float f, float f1)
    {
        mPointCloud.glowManager.setX(f);
        mPointCloud.glowManager.setY(f1);
    }

    private void updatePointCloudPosition(float f, float f1)
    {
        mPointCloud.setCenter(f, f1);
    }

    private void updateTargetPositions(float f, float f1)
    {
        ArrayList arraylist = mTargetDrawables;
        int j = arraylist.size();
        float f2 = (float)(-6.2831853071795862D / (double)j);
        for (int i = 0; i < j; i++)
        {
            TargetDrawable targetdrawable = (TargetDrawable)arraylist.get(i);
            float f3 = (float)i * f2;
            targetdrawable.setPositionX(f);
            targetdrawable.setPositionY(f1);
            targetdrawable.setX(mOuterRadius * (float)Math.cos(f3));
            float f4 = mOuterRadius;
            targetdrawable.setY((float)Math.sin(f3) * f4);
        }

    }

    private void vibrate()
    {
        boolean flag = true;
        if (android.provider.Settings.System.getInt(getContext().getContentResolver(), "haptic_feedback_enabled", 1) == 0)
        {
            flag = false;
        }
        if (mVibrator != null && flag)
        {
            mVibrator.vibrate(mVibrationDuration);
        }
    }

    public int getDirectionDescriptionsResourceId()
    {
        return mDirectionDescriptionsResourceId;
    }

    public int getResourceIdForTarget(int i)
    {
        TargetDrawable targetdrawable = (TargetDrawable)mTargetDrawables.get(i);
        if (targetdrawable == null)
        {
            return 0;
        } else
        {
            return targetdrawable.getResourceId();
        }
    }

    protected int getSuggestedMinimumHeight()
    {
        return (int)(Math.max(mOuterRing.getHeight(), 2.0F * mOuterRadius) + (float)mMaxTargetHeight);
    }

    protected int getSuggestedMinimumWidth()
    {
        return (int)(Math.max(mOuterRing.getWidth(), 2.0F * mOuterRadius) + (float)mMaxTargetWidth);
    }

    public int getTargetDescriptionsResourceId()
    {
        return mTargetDescriptionsResourceId;
    }

    public int getTargetPosition(int i)
    {
        for (int j = 0; j < mTargetDrawables.size(); j++)
        {
            if (((TargetDrawable)mTargetDrawables.get(j)).getResourceId() == i)
            {
                return j;
            }
        }

        return -1;
    }

    public int getTargetResourceId()
    {
        return mTargetResourceId;
    }

    protected void onDraw(Canvas canvas)
    {
        mPointCloud.draw(canvas);
        mOuterRing.draw(canvas);
        int j = mTargetDrawables.size();
        for (int i = 0; i < j; i++)
        {
            TargetDrawable targetdrawable = (TargetDrawable)mTargetDrawables.get(i);
            if (targetdrawable != null)
            {
                targetdrawable.draw(canvas);
            }
        }

        mHandleDrawable.draw(canvas);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        if (!((AccessibilityManager)getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) goto _L2; else goto _L1
_L1:
        int i = motionevent.getAction();
        i;
        JVM INSTR tableswitch 7 10: default 56
    //                   7 81
    //                   8 56
    //                   9 73
    //                   10 89;
           goto _L3 _L4 _L3 _L5 _L6
_L3:
        onTouchEvent(motionevent);
        motionevent.setAction(i);
_L2:
        return super.onHoverEvent(motionevent);
_L5:
        motionevent.setAction(0);
        continue; /* Loop/switch isn't completed */
_L4:
        motionevent.setAction(2);
        continue; /* Loop/switch isn't completed */
_L6:
        motionevent.setAction(1);
        if (true) goto _L3; else goto _L7
_L7:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        float f1 = Math.max(mOuterRing.getWidth(), mOuterRadius * 2.0F);
        float f = Math.max(mOuterRing.getHeight(), mOuterRadius * 2.0F);
        float f2 = mHorizontalInset;
        f1 = Math.max(k - i, f1 + (float)mMaxTargetWidth) / 2.0F + f2;
        f2 = mVerticalInset;
        f = Math.max(l - j, f + (float)mMaxTargetHeight) / 2.0F + f2;
        if (mInitialLayout)
        {
            stopAndHideWaveAnimation();
            hideTargets(false, false);
            mInitialLayout = false;
        }
        mOuterRing.setPositionX(f1);
        mOuterRing.setPositionY(f);
        mHandleDrawable.setPositionX(f1);
        mHandleDrawable.setPositionY(f);
        updateTargetPositions(f1, f);
        updatePointCloudPosition(f1, f);
        updateGlowPosition(f1, f);
        mWaveCenterX = f1;
        mWaveCenterY = f;
    }

    protected void onMeasure(int i, int j)
    {
        int k = getSuggestedMinimumWidth();
        int l = getSuggestedMinimumHeight();
        i = resolveMeasured(i, k);
        j = resolveMeasured(j, l);
        computeInsets(i - k, j - l);
        setMeasuredDimension(i, j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        int i;
        i = motionevent.getActionMasked();
        flag1 = false;
        flag = flag1;
        i;
        JVM INSTR tableswitch 0 6: default 56
    //                   0 68
    //                   1 93
    //                   2 83
    //                   3 108
    //                   4 58
    //                   5 68
    //                   6 93;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L2 _L3
_L5:
        break MISSING_BLOCK_LABEL_108;
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        flag = flag1;
_L7:
        invalidate();
        if (flag)
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
_L2:
        handleDown(motionevent);
        handleMove(motionevent);
        flag = true;
          goto _L7
_L4:
        handleMove(motionevent);
        flag = true;
          goto _L7
_L3:
        handleMove(motionevent);
        handleUp(motionevent);
        flag = true;
          goto _L7
        handleMove(motionevent);
        handleCancel(motionevent);
        flag = true;
          goto _L7
    }

    public void ping()
    {
        if (mFeedbackCount > 0)
        {
            AnimationBundle animationbundle = mWaveAnimations;
            boolean flag;
            if (animationbundle.size() > 0 && ((Tweener)animationbundle.get(0)).animator.isRunning() && ((Tweener)animationbundle.get(0)).animator.getCurrentPlayTime() < 675L)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            if (flag)
            {
                startWaveAnimation();
            }
        }
    }

    public boolean replaceTargetDrawablesIfPresent(ComponentName componentname, String s, int i)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (i != 0) goto _L2; else goto _L1
_L1:
        flag1 = flag;
_L4:
        return flag1;
_L2:
        flag = flag1;
        if (componentname == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        PackageManager packagemanager;
        Bundle bundle;
        packagemanager = getContext().getPackageManager();
        bundle = packagemanager.getActivityInfo(componentname, 128).metaData;
        flag = flag1;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        int j = bundle.getInt(s);
        flag = flag1;
        if (j != 0)
        {
            try
            {
                flag = replaceTargetDrawables(packagemanager.getResourcesForActivity(componentname), i, j);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                componentname = String.valueOf(componentname.flattenToShortString());
                (new StringBuilder(String.valueOf(componentname).length() + 35)).append("Failed to swap drawable; ").append(componentname).append(" not found");
                flag = flag1;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                componentname = String.valueOf(componentname.flattenToShortString());
                if (componentname.length() != 0)
                {
                    "Failed to swap drawable from ".concat(componentname);
                    flag = flag1;
                } else
                {
                    new String("Failed to swap drawable from ");
                    flag = flag1;
                }
            }
        }
        flag1 = flag;
        if (!flag)
        {
            replaceTargetDrawables(getContext().getResources(), i, i);
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void reset(boolean flag)
    {
        mGlowAnimations.stop();
        mTargetAnimations.stop();
        startBackgroundAnimation(0, 0.0F);
        stopAndHideWaveAnimation();
        hideTargets(flag, false);
        hideGlow(0, 0, 0.0F, null);
        Tweener.reset();
    }

    public void resumeAnimations()
    {
        mWaveAnimations.setSuspended(false);
        mTargetAnimations.setSuspended(false);
        mGlowAnimations.setSuspended(false);
        mWaveAnimations.start();
        mTargetAnimations.start();
        mGlowAnimations.start();
    }

    public void setDirectionDescriptionsResourceId(int i)
    {
        mDirectionDescriptionsResourceId = i;
        if (mDirectionDescriptions != null)
        {
            mDirectionDescriptions.clear();
        }
    }

    public void setEnableTarget(int i, boolean flag)
    {
        int j = 0;
        do
        {
label0:
            {
                if (j < mTargetDrawables.size())
                {
                    TargetDrawable targetdrawable = (TargetDrawable)mTargetDrawables.get(j);
                    if (targetdrawable.getResourceId() != i)
                    {
                        break label0;
                    }
                    targetdrawable.setEnabled(flag);
                }
                return;
            }
            j++;
        } while (true);
    }

    public void setHandleDrawable(Resources resources, int i)
    {
        if (mHandleDrawable != null)
        {
            mHandleDrawable.setDrawable(resources, i);
        }
    }

    public void setOnTriggerListener(OnTriggerListener ontriggerlistener)
    {
        mOnTriggerListener = ontriggerlistener;
    }

    public void setTargetDescriptionsResourceId(int i)
    {
        mTargetDescriptionsResourceId = i;
        if (mTargetDescriptions != null)
        {
            mTargetDescriptions.clear();
        }
    }

    public void setTargetResources(int i)
    {
        if (mAnimatingTargets)
        {
            mNewTargetResources = i;
            return;
        } else
        {
            internalSetTargetResources(i);
            return;
        }
    }

    public void setVibrateEnabled(boolean flag)
    {
        if (flag && mVibrator == null)
        {
            mVibrator = (Vibrator)getContext().getSystemService("vibrator");
            return;
        } else
        {
            mVibrator = null;
            return;
        }
    }

    public void suspendAnimations()
    {
        mWaveAnimations.setSuspended(true);
        mTargetAnimations.setSuspended(true);
        mGlowAnimations.setSuspended(true);
    }







/*
    static int access$502(GlowPadView glowpadview, int i)
    {
        glowpadview.mNewTargetResources = i;
        return i;
    }

*/




/*
    static boolean access$802(GlowPadView glowpadview, boolean flag)
    {
        glowpadview.mAnimatingTargets = flag;
        return flag;
    }

*/


    private class AnimationBundle extends ArrayList
    {

        private static final long serialVersionUID = 0xa84d78726f127468L;
        private boolean mSuspended;
        final GlowPadView this$0;

        public void cancel()
        {
            int j = size();
            for (int i = 0; i < j; i++)
            {
                ((Tweener)get(i)).animator.cancel();
            }

            clear();
        }

        public void setSuspended(boolean flag)
        {
            mSuspended = flag;
        }

        public void start()
        {
            if (!mSuspended)
            {
                int j = size();
                int i = 0;
                while (i < j) 
                {
                    ((Tweener)get(i)).animator.start();
                    i++;
                }
            }
        }

        public void stop()
        {
            int j = size();
            for (int i = 0; i < j; i++)
            {
                ((Tweener)get(i)).animator.end();
            }

            clear();
        }

        private AnimationBundle()
        {
            this$0 = GlowPadView.this;
            super();
        }

        AnimationBundle(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1 extends AnimatorListenerAdapter
    {

        final GlowPadView this$0;

        public void onAnimationEnd(Animator animator)
        {
            switchToState(0, mWaveCenterX, mWaveCenterY);
            dispatchOnFinishFinalAnimation();
        }

        _cls1()
        {
            this$0 = GlowPadView.this;
            super();
        }
    }


    private class _cls2 extends AnimatorListenerAdapter
    {

        final GlowPadView this$0;

        public void onAnimationEnd(Animator animator)
        {
            ping();
            switchToState(0, mWaveCenterX, mWaveCenterY);
            dispatchOnFinishFinalAnimation();
        }

        _cls2()
        {
            this$0 = GlowPadView.this;
            super();
        }
    }


    private class _cls3
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final GlowPadView this$0;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            invalidate();
        }

        _cls3()
        {
            this$0 = GlowPadView.this;
            super();
        }
    }


    private class _cls4 extends AnimatorListenerAdapter
    {

        final GlowPadView this$0;

        public void onAnimationEnd(Animator animator)
        {
            if (mNewTargetResources != 0)
            {
                internalSetTargetResources(mNewTargetResources);
                mNewTargetResources = 0;
                hideTargets(false, false);
            }
            mAnimatingTargets = false;
        }

        _cls4()
        {
            this$0 = GlowPadView.this;
            super();
        }
    }


    private class OnTriggerListener
    {

        public static final int CENTER_HANDLE = 1;
        public static final int NO_HANDLE = 0;

        public abstract void onFinishFinalAnimation();

        public abstract void onGrabbed(View view, int i);

        public abstract void onGrabbedStateChange(View view, int i);

        public abstract void onReleased(View view, int i);

        public abstract void onTrigger(View view, int i);
    }


    private class _cls5 extends AnimatorListenerAdapter
    {

        final GlowPadView this$0;

        public void onAnimationEnd(Animator animator)
        {
            mPointCloud.waveManager.setRadius(0.0F);
            mPointCloud.waveManager.setAlpha(0.0F);
        }

        _cls5()
        {
            this$0 = GlowPadView.this;
            super();
        }
    }

}
