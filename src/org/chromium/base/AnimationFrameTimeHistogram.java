// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


public class AnimationFrameTimeHistogram
{

    private final Recorder a;
    private final String b;

    private native void nativeSaveHistogram(String s, long al[], int i);

    public void a()
    {
        Recorder.a(a);
    }

    public void b()
    {
        if (Recorder.b(a))
        {
            nativeSaveHistogram(b, Recorder.c(a), Recorder.d(a));
        }
        Recorder.e(a);
    }

    private class Recorder
        implements android.animation.TimeAnimator.TimeListener
    {

        private final TimeAnimator a = new TimeAnimator();
        private long b[];
        private int c;

        static void a(Recorder recorder)
        {
            recorder.c = 0;
            recorder.b = new long[600];
            recorder.a.start();
        }

        static boolean b(Recorder recorder)
        {
            boolean flag = recorder.a.isStarted();
            recorder.a.end();
            return flag;
        }

        static long[] c(Recorder recorder)
        {
            return recorder.b;
        }

        static int d(Recorder recorder)
        {
            return recorder.c;
        }

        static void e(Recorder recorder)
        {
            recorder.b = null;
        }

        public void onTimeUpdate(TimeAnimator timeanimator, long l, long l1)
        {
            if (c == b.length)
            {
                a.end();
                b = null;
            } else
            if (l1 > 0L)
            {
                timeanimator = b;
                int i = c;
                c = i + 1;
                timeanimator[i] = l1;
                return;
            }
        }

        private Recorder()
        {
            a.setTimeListener(this);
        }
    }

}
