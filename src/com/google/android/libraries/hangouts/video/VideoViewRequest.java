// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;


// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Renderer, RendererManager

public class VideoViewRequest
{

    public final int frameRate;
    public final int height;
    public final int rendererId;
    public final long rendererManagerNativeContext;
    public final int ssrc;
    public final int width;

    public VideoViewRequest(int i, Renderer renderer, int j, int k, int l)
    {
        ssrc = i;
        width = j;
        height = k;
        frameRate = l;
        rendererManagerNativeContext = renderer.mRendererManager.b();
        rendererId = renderer.mRendererID;
    }
}
