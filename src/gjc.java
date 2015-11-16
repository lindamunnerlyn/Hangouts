// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import com.google.android.libraries.hangouts.video.sdk.ScreenVideoCapturer;

public final class gjc
    implements gjx
{

    final ScreenVideoCapturer a;

    public gjc(ScreenVideoCapturer screenvideocapturer)
    {
        a = screenvideocapturer;
        super();
    }

    public void a(SurfaceTexture surfacetexture)
    {
        ScreenVideoCapturer.a(a, surfacetexture);
        if (ScreenVideoCapturer.a(a) == null)
        {
            ScreenVideoCapturer.b(a);
            ScreenVideoCapturer.c(a);
        }
    }

    public void a(gjy gjy)
    {
        ScreenVideoCapturer.b(a);
    }
}
