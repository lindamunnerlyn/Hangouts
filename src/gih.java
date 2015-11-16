// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import java.util.concurrent.atomic.AtomicInteger;

final class gih
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    final gie a;

    gih(gie gie1)
    {
        a = gie1;
        super();
    }

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        a.b.incrementAndGet();
    }
}
