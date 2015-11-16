// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Debug;
import android.os.Looper;
import android.os.Process;

public final class goi
{

    private static final Thread a = Looper.getMainLooper().getThread();

    public static lgk a(int i)
    {
        if (a.equals(Thread.currentThread()))
        {
            throw new UnsupportedOperationException("getMemoryUsageMetric should not be called from Ui thread.");
        }
        lgk lgk1 = new lgk();
        lgk1.a = new lgj();
        Object obj = lgk1.a;
        Object obj1 = new android.os.Debug.MemoryInfo();
        Debug.getMemoryInfo(((android.os.Debug.MemoryInfo) (obj1)));
        lge lge1 = new lge();
        lge1.a = Integer.valueOf(((android.os.Debug.MemoryInfo) (obj1)).dalvikPss);
        lge1.b = Integer.valueOf(((android.os.Debug.MemoryInfo) (obj1)).nativePss);
        lge1.c = Integer.valueOf(((android.os.Debug.MemoryInfo) (obj1)).otherPss);
        lge1.d = Integer.valueOf(((android.os.Debug.MemoryInfo) (obj1)).dalvikPrivateDirty);
        lge1.e = Integer.valueOf(((android.os.Debug.MemoryInfo) (obj1)).nativePrivateDirty);
        lge1.f = Integer.valueOf(((android.os.Debug.MemoryInfo) (obj1)).otherPrivateDirty);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            lge1.g = Integer.valueOf(((android.os.Debug.MemoryInfo) (obj1)).getTotalPrivateClean());
            lge1.i = Integer.valueOf(((android.os.Debug.MemoryInfo) (obj1)).getTotalSwappablePss());
        }
        lge1.h = Integer.valueOf(((android.os.Debug.MemoryInfo) (obj1)).getTotalSharedDirty());
        obj.a = lge1;
        lgk1.b = new lgl();
        obj = lgk1.b;
        obj1 = new lgf();
        obj1.a = Long.valueOf(Process.getElapsedCpuTime());
        obj1.b = Boolean.valueOf(goj.a());
        obj1.c = Integer.valueOf(Thread.activeCount());
        obj.a = ((lgf) (obj1));
        lgk1.c = i;
        return lgk1;
    }

}
