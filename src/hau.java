// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.jni.crashreporter.NativeCrashReporterActivity;

public final class hau
    implements Runnable
{

    final String a;
    final NativeCrashReporterActivity b;

    public hau(NativeCrashReporterActivity nativecrashreporteractivity, String s)
    {
        b = nativecrashreporteractivity;
        a = s;
        super();
    }

    public void run()
    {
        throw new hat(a);
    }
}
