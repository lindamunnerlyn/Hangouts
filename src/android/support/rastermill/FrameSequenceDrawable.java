// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.rastermill;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;

// Referenced classes of package android.support.rastermill:
//            FrameSequence

public class FrameSequenceDrawable extends Drawable
    implements Animatable, Runnable
{

    private static final long DEFAULT_DELAY_MS = 100L;
    public static final int LOOP_DEFAULT = 3;
    public static final int LOOP_INF = 2;
    public static final int LOOP_ONCE = 1;
    private static final long MIN_DELAY_MS = 20L;
    private static final int STATE_DECODING = 2;
    private static final int STATE_READY_TO_SWAP = 4;
    private static final int STATE_SCHEDULED = 1;
    private static final int STATE_WAITING_TO_SWAP = 3;
    private static BitmapProvider sAllocatingBitmapProvider = new _cls1();
    private static HandlerThread sDecodingThread;
    private static Handler sDecodingThreadHandler;
    private static final Object sLock = new Object();
    private Bitmap mBackBitmap;
    private BitmapShader mBackBitmapShader;
    private final BitmapProvider mBitmapProvider;
    private Runnable mCallbackRunnable;
    private boolean mCircleMaskEnabled;
    private int mCurrentLoop;
    private Runnable mDecodeRunnable;
    private boolean mDestroyed;
    private final FrameSequence mFrameSequence;
    private final FrameSequence.State mFrameSequenceState;
    private Bitmap mFrontBitmap;
    private BitmapShader mFrontBitmapShader;
    private long mLastSwap;
    private final Object mLock;
    private int mLoopBehavior;
    private int mNextFrameToDecode;
    private long mNextSwap;
    private OnFinishedListener mOnFinishedListener;
    private final Paint mPaint;
    private final Rect mSrcRect;
    private int mState;

    public FrameSequenceDrawable(FrameSequence framesequence)
    {
        this(framesequence, sAllocatingBitmapProvider);
    }

    public FrameSequenceDrawable(FrameSequence framesequence, BitmapProvider bitmapprovider)
    {
        mLock = new Object();
        mDestroyed = false;
        mLoopBehavior = 3;
        mDecodeRunnable = new _cls2();
        mCallbackRunnable = new _cls3();
        if (framesequence == null || bitmapprovider == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            mFrameSequence = framesequence;
            mFrameSequenceState = framesequence.createState();
            int i = framesequence.getWidth();
            int j = framesequence.getHeight();
            mBitmapProvider = bitmapprovider;
            mFrontBitmap = acquireAndValidateBitmap(bitmapprovider, i, j);
            mBackBitmap = acquireAndValidateBitmap(bitmapprovider, i, j);
            mSrcRect = new Rect(0, 0, i, j);
            mPaint = new Paint();
            mPaint.setFilterBitmap(true);
            mFrontBitmapShader = new BitmapShader(mFrontBitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            mBackBitmapShader = new BitmapShader(mBackBitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            mLastSwap = 0L;
            mNextFrameToDecode = -1;
            mFrameSequenceState.getFrame(0, mFrontBitmap, -1);
            initializeDecodingThread();
            return;
        }
    }

    private static Bitmap acquireAndValidateBitmap(BitmapProvider bitmapprovider, int i, int j)
    {
        bitmapprovider = bitmapprovider.acquireBitmap(i, j);
        if (bitmapprovider.getWidth() < i || bitmapprovider.getHeight() < j || bitmapprovider.getConfig() != android.graphics.Bitmap.Config.ARGB_8888)
        {
            throw new IllegalArgumentException("Invalid bitmap provided");
        } else
        {
            return bitmapprovider;
        }
    }

    private void checkDestroyedLocked()
    {
        if (mDestroyed)
        {
            throw new IllegalStateException("Cannot perform operation on recycled drawable");
        } else
        {
            return;
        }
    }

    private static void initializeDecodingThread()
    {
label0:
        {
            synchronized (sLock)
            {
                if (sDecodingThread == null)
                {
                    break label0;
                }
            }
            return;
        }
        HandlerThread handlerthread = new HandlerThread("FrameSequence decoding thread", 10);
        sDecodingThread = handlerthread;
        handlerthread.start();
        sDecodingThreadHandler = new Handler(sDecodingThread.getLooper());
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void scheduleDecodeLocked()
    {
        mState = 1;
        mNextFrameToDecode = (mNextFrameToDecode + 1) % mFrameSequence.getFrameCount();
        sDecodingThreadHandler.post(mDecodeRunnable);
    }

    public void destroy()
    {
        Bitmap bitmap = null;
        if (mBitmapProvider == null)
        {
            throw new IllegalStateException("BitmapProvider must be non-null");
        }
        Bitmap bitmap1;
        synchronized (mLock)
        {
            checkDestroyedLocked();
            bitmap1 = mFrontBitmap;
            mFrontBitmap = null;
            if (mState != 2)
            {
                bitmap = mBackBitmap;
                mBackBitmap = null;
            }
            mDestroyed = true;
        }
        mBitmapProvider.releaseBitmap(bitmap1);
        if (bitmap != null)
        {
            mBitmapProvider.releaseBitmap(bitmap);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void draw(Canvas canvas)
    {
        boolean flag1 = true;
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        checkDestroyedLocked();
        if (mState == 3 && mNextSwap - SystemClock.uptimeMillis() <= 0L)
        {
            mState = 4;
        }
        if (!isRunning() || mState != 4) goto _L2; else goto _L1
_L1:
        Object obj1 = mBackBitmap;
        mBackBitmap = mFrontBitmap;
        mFrontBitmap = ((Bitmap) (obj1));
        obj1 = mBackBitmapShader;
        mBackBitmapShader = mFrontBitmapShader;
        mFrontBitmapShader = ((BitmapShader) (obj1));
        mLastSwap = SystemClock.uptimeMillis();
        boolean flag = flag1;
        if (mNextFrameToDecode != mFrameSequence.getFrameCount() - 1) goto _L4; else goto _L3
_L3:
        mCurrentLoop = mCurrentLoop + 1;
        if (mLoopBehavior == 1 && mCurrentLoop == 1) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (mLoopBehavior != 3) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (mCurrentLoop != mFrameSequence.getDefaultLoopCount()) goto _L4; else goto _L6
_L4:
        if (!flag) goto _L9; else goto _L8
_L8:
        scheduleDecodeLocked();
_L2:
        obj;
        JVM INSTR monitorexit ;
        if (mCircleMaskEnabled)
        {
            obj = getBounds();
            mPaint.setShader(mFrontBitmapShader);
            float f = ((Rect) (obj)).width();
            float f1 = ((Rect) (obj)).height();
            float f2 = Math.min(f, f1) / 2.0F;
            canvas.drawCircle(f / 2.0F, f1 / 2.0F, f2, mPaint);
            return;
        } else
        {
            mPaint.setShader(null);
            canvas.drawBitmap(mFrontBitmap, mSrcRect, getBounds(), mPaint);
            return;
        }
_L9:
        scheduleSelf(mCallbackRunnable, 0L);
          goto _L2
        canvas;
        obj;
        JVM INSTR monitorexit ;
        throw canvas;
_L6:
        flag = false;
        if (true) goto _L4; else goto _L10
_L10:
    }

    protected void finalize()
    {
        mFrameSequenceState.destroy();
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public int getIntrinsicHeight()
    {
        return mFrameSequence.getHeight();
    }

    public int getIntrinsicWidth()
    {
        return mFrameSequence.getWidth();
    }

    public int getOpacity()
    {
        return !mFrameSequence.isOpaque() ? -2 : -1;
    }

    public boolean isDestroyed()
    {
        boolean flag;
        synchronized (mLock)
        {
            flag = mDestroyed;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isRunning()
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (mNextFrameToDecode >= 0 && !mDestroyed)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
        boolean flag1 = false;
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        if (mNextFrameToDecode < 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        flag = flag1;
        if (mState != 3)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        mState = 4;
        flag = true;
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            invalidateSelf();
        }
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setAlpha(int i)
    {
        mPaint.setAlpha(i);
    }

    public final void setCircleMaskEnabled(boolean flag)
    {
        mCircleMaskEnabled = flag;
        mPaint.setAntiAlias(flag);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
    }

    public void setFilterBitmap(boolean flag)
    {
        mPaint.setFilterBitmap(flag);
    }

    public void setLoopBehavior(int i)
    {
        mLoopBehavior = i;
    }

    public void setOnFinishedListener(OnFinishedListener onfinishedlistener)
    {
        mOnFinishedListener = onfinishedlistener;
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        boolean flag2 = super.setVisible(flag, flag1);
        if (!flag)
        {
            stop();
        } else
        if (flag1 || flag2)
        {
            stop();
            start();
            return flag2;
        }
        return flag2;
    }

    public void start()
    {
label0:
        {
            if (isRunning())
            {
                break MISSING_BLOCK_LABEL_46;
            }
            synchronized (mLock)
            {
                checkDestroyedLocked();
                if (mState != 1)
                {
                    break label0;
                }
            }
            return;
        }
        mCurrentLoop = 0;
        scheduleDecodeLocked();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        if (isRunning())
        {
            unscheduleSelf(this);
        }
    }

    public void unscheduleSelf(Runnable runnable)
    {
        synchronized (mLock)
        {
            mNextFrameToDecode = -1;
            mState = 0;
        }
        super.unscheduleSelf(runnable);
        return;
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
    }







/*
    static Bitmap access$302(FrameSequenceDrawable framesequencedrawable, Bitmap bitmap)
    {
        framesequencedrawable.mBackBitmap = bitmap;
        return bitmap;
    }

*/



/*
    static int access$402(FrameSequenceDrawable framesequencedrawable, int i)
    {
        framesequencedrawable.mState = i;
        return i;
    }

*/




/*
    static long access$602(FrameSequenceDrawable framesequencedrawable, long l)
    {
        framesequencedrawable.mNextSwap = l;
        return l;
    }

*/




    private class _cls2
        implements Runnable
    {

        final FrameSequenceDrawable this$0;

        public void run()
        {
label0:
            {
                synchronized (mLock)
                {
                    if (!mDestroyed)
                    {
                        break label0;
                    }
                }
                return;
            }
            int i = mNextFrameToDecode;
            if (i >= 0)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            obj;
            JVM INSTR monitorexit ;
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            Object obj2;
            obj2 = mBackBitmap;
            mState = 2;
            obj;
            JVM INSTR monitorexit ;
            boolean flag1;
            long l;
            long l1 = mFrameSequenceState.getFrame(i, ((Bitmap) (obj2)), i - 2);
            l = l1;
            if (l1 < 20L)
            {
                l = 100L;
            }
            flag1 = false;
            obj2 = mLock;
            obj2;
            JVM INSTR monitorenter ;
            if (!mDestroyed) goto _L2; else goto _L1
_L1:
            Object obj1;
            obj1 = mBackBitmap;
            mBackBitmap = null;
            boolean flag = false;
_L4:
            l = mNextSwap;
            obj2;
            JVM INSTR monitorexit ;
            if (flag)
            {
                scheduleSelf(FrameSequenceDrawable.this, l);
            }
            if (obj1 != null)
            {
                mBitmapProvider.releaseBitmap(((Bitmap) (obj1)));
                return;
            } else
            {
                return;
            }
_L2:
            flag = flag1;
            if (mNextFrameToDecode < 0)
            {
                break MISSING_BLOCK_LABEL_250;
            }
            flag = flag1;
            if (mState != 2)
            {
                break MISSING_BLOCK_LABEL_250;
            }
            flag = true;
            mNextSwap = l + mLastSwap;
            mState = 3;
            break MISSING_BLOCK_LABEL_250;
            obj1;
            obj2;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1 = null;
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls2()
        {
            this$0 = FrameSequenceDrawable.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final FrameSequenceDrawable this$0;

        public void run()
        {
            if (mOnFinishedListener != null)
            {
                mOnFinishedListener.onFinished(FrameSequenceDrawable.this);
            }
        }

        _cls3()
        {
            this$0 = FrameSequenceDrawable.this;
            super();
        }

        private class OnFinishedListener
        {

            public abstract void onFinished(FrameSequenceDrawable framesequencedrawable);
        }

    }


    private class BitmapProvider
    {

        public abstract Bitmap acquireBitmap(int i, int j);

        public abstract void releaseBitmap(Bitmap bitmap);
    }


    private class _cls1
        implements BitmapProvider
    {

        public Bitmap acquireBitmap(int i, int j)
        {
            return Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }

        public void releaseBitmap(Bitmap bitmap)
        {
            bitmap.recycle();
        }

        _cls1()
        {
        }
    }

}
