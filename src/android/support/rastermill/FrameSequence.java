// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.rastermill;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class FrameSequence
{

    private final int mDefaultLoopCount;
    private final int mFrameCount;
    private final int mHeight;
    private final long mNativeFrameSequence;
    private final boolean mOpaque;
    private final int mWidth;

    private FrameSequence(long l, int i, int j, boolean flag, int k, int i1)
    {
        mNativeFrameSequence = l;
        mWidth = i;
        mHeight = j;
        mOpaque = flag;
        mFrameCount = k;
        mDefaultLoopCount = i1;
    }

    public static FrameSequence decodeByteArray(byte abyte0[])
    {
        return decodeByteArray(abyte0, 0, abyte0.length);
    }

    public static FrameSequence decodeByteArray(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException();
        }
        if (i < 0 || j < 0 || i + j > abyte0.length)
        {
            throw new IllegalArgumentException("invalid offset/length parameters");
        } else
        {
            return nativeDecodeByteArray(abyte0, i, j);
        }
    }

    public static FrameSequence decodeByteBuffer(ByteBuffer bytebuffer)
    {
        if (bytebuffer == null)
        {
            throw new IllegalArgumentException();
        }
        if (!bytebuffer.isDirect())
        {
            if (bytebuffer.hasArray())
            {
                return decodeByteArray(bytebuffer.array(), bytebuffer.position(), bytebuffer.remaining());
            } else
            {
                throw new IllegalArgumentException("Cannot have non-direct ByteBuffer with no byte array");
            }
        } else
        {
            return nativeDecodeByteBuffer(bytebuffer, bytebuffer.position(), bytebuffer.remaining());
        }
    }

    public static FrameSequence decodeStream(InputStream inputstream)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            return nativeDecodeStream(inputstream, new byte[16384]);
        }
    }

    private static native long nativeCreateState(long l);

    private static native FrameSequence nativeDecodeByteArray(byte abyte0[], int i, int j);

    private static native FrameSequence nativeDecodeByteBuffer(ByteBuffer bytebuffer, int i, int j);

    private static native FrameSequence nativeDecodeStream(InputStream inputstream, byte abyte0[]);

    private static native void nativeDestroyFrameSequence(long l);

    private static native void nativeDestroyState(long l);

    private static native long nativeGetFrame(long l, int i, Bitmap bitmap, int j);

    State createState()
    {
        if (mNativeFrameSequence == 0L)
        {
            throw new IllegalStateException("attempted to use incorrectly built FrameSequence");
        }
        long l = nativeCreateState(mNativeFrameSequence);
        if (l == 0L)
        {
            return null;
        } else
        {
            return new State(l);
        }
    }

    protected void finalize()
    {
        if (mNativeFrameSequence != 0L)
        {
            nativeDestroyFrameSequence(mNativeFrameSequence);
        }
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public int getDefaultLoopCount()
    {
        return mDefaultLoopCount;
    }

    public int getFrameCount()
    {
        return mFrameCount;
    }

    public int getHeight()
    {
        return mHeight;
    }

    public int getWidth()
    {
        return mWidth;
    }

    public boolean isOpaque()
    {
        return mOpaque;
    }

    static 
    {
        System.loadLibrary("framesequence");
    }



    private class State
    {

        private long mNativeState;

        public void destroy()
        {
            if (mNativeState != 0L)
            {
                FrameSequence.nativeDestroyState(mNativeState);
                mNativeState = 0L;
            }
        }

        public long getFrame(int i, Bitmap bitmap, int j)
        {
            if (bitmap == null || bitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888)
            {
                throw new IllegalArgumentException("Bitmap passed must be non-null and ARGB_8888");
            }
            if (mNativeState == 0L)
            {
                throw new IllegalStateException("attempted to draw destroyed FrameSequenceState");
            } else
            {
                return FrameSequence.nativeGetFrame(mNativeState, i, bitmap, j);
            }
        }

        public State(long l)
        {
            mNativeState = l;
        }
    }

}
