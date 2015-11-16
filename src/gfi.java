// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import java.util.concurrent.atomic.AtomicInteger;

final class gfi
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    final gff a;

    gfi(gff gff1)
    {
        a = gff1;
        super();
    }

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        a.b.incrementAndGet();
    }
}
