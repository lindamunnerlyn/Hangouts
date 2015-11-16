// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.media.MediaFormat;
import gdv;
import ggd;
import ggv;
import ghu;
import gia;
import gne;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Renderer, RendererManager, DecoderManager, MediaCodecDecoder

public final class RemoteRenderer extends Renderer
    implements ggv
{

    private int a;
    private final MediaCodecDecoder b;
    private final ghu c;
    private int d;
    private boolean e;

    RemoteRenderer(RendererManager renderermanager, DecoderManager decodermanager, ggd ggd, ghu ghu1)
    {
        gdv.a("Expected condition to be true", true);
        mRendererManager = renderermanager;
        mRendererID = mRendererManager.a(3);
        c = ghu1;
        if (decodermanager != null)
        {
            b = decodermanager.a(ggd, this);
        } else
        {
            b = null;
        }
        RendererManager.a(this);
    }

    public void a()
    {
        gdv.c();
        c.n();
    }

    public void a(int i)
    {
        if (b != null)
        {
            b.d(i);
        }
    }

    public boolean a(gia gia)
    {
        RendererFrameOutputData rendererframeoutputdata = (RendererFrameOutputData)gia;
        boolean flag = e;
        if (b != null && b.h())
        {
            d = b.g();
            e = true;
            rendererframeoutputdata.updatedTexture = b.j();
            if (rendererframeoutputdata.updatedTexture)
            {
                gia = b.k();
                if (gia != null)
                {
                    int j = gia.getInteger("width");
                    int k = gia.getInteger("height");
                    rendererframeoutputdata.frameWidth = j;
                    rendererframeoutputdata.frameHeight = k;
                    int i;
                    if (gia.containsKey("crop-left"))
                    {
                        i = gia.getInteger("crop-left");
                    } else
                    {
                        i = 0;
                    }
                    rendererframeoutputdata.cropLeft = i;
                    if (gia.containsKey("crop-top"))
                    {
                        i = gia.getInteger("crop-top");
                    } else
                    {
                        i = 0;
                    }
                    rendererframeoutputdata.cropTop = i;
                    if (gia.containsKey("crop-right"))
                    {
                        i = gia.getInteger("crop-right");
                    } else
                    {
                        i = j - 1;
                    }
                    rendererframeoutputdata.cropRight = i;
                    if (gia.containsKey("crop-bottom"))
                    {
                        i = gia.getInteger("crop-bottom");
                    } else
                    {
                        i = k - 1;
                    }
                    rendererframeoutputdata.cropBottom = i;
                    if (rendererframeoutputdata.cropLeft < 0 || rendererframeoutputdata.cropLeft >= j || rendererframeoutputdata.cropTop < 0 || rendererframeoutputdata.cropTop >= k || rendererframeoutputdata.cropRight < 0 || rendererframeoutputdata.cropRight >= j || rendererframeoutputdata.cropBottom < 0 || rendererframeoutputdata.cropBottom >= k)
                    {
                        gne.a(6, "vclib", String.format("RemoteRenderer hardware decode: Unexpected crop values: width: %d height: %d crop-left: %d crop-top: %d crop-right: %d crop-bottom: %d", new Object[] {
                            Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(rendererframeoutputdata.cropLeft), Integer.valueOf(rendererframeoutputdata.cropTop), Integer.valueOf(rendererframeoutputdata.cropRight), Integer.valueOf(rendererframeoutputdata.cropBottom)
                        }));
                        rendererframeoutputdata.cropLeft = 0;
                        rendererframeoutputdata.cropTop = 0;
                        rendererframeoutputdata.cropRight = j - 1;
                        rendererframeoutputdata.cropBottom = k - 1;
                    }
                }
            }
        } else
        {
            d = a;
            e = false;
            mRendererManager.renderFrame(mRendererID, null, gia);
            rendererframeoutputdata.cropLeft = 0;
            rendererframeoutputdata.cropTop = 0;
            rendererframeoutputdata.cropRight = rendererframeoutputdata.frameWidth - 1;
            rendererframeoutputdata.cropBottom = rendererframeoutputdata.frameHeight - 1;
        }
        if (flag != e)
        {
            c.n();
        }
        return rendererframeoutputdata.updatedTexture;
    }

    public void b()
    {
        mRendererManager.initializeGLContext(mRendererID);
        a = mRendererManager.getIntParam(mRendererID, "sub_outtex");
        if (b != null)
        {
            b.f();
        }
    }

    public int c()
    {
        gdv.b(Integer.valueOf(d), Integer.valueOf(0));
        return d;
    }

    public boolean d()
    {
        return e;
    }

    public void e()
    {
        int i = mRendererID;
        gne.a(2, "vclib", (new StringBuilder(19)).append("release ").append(i).toString());
        RendererManager.b(this);
        mRendererManager.releaseRenderer(mRendererID);
        if (b != null)
        {
            b.l();
        }
    }

    public int f()
    {
        if (b != null)
        {
            int i = b.i();
            if (i != -1)
            {
                return i;
            }
        }
        return 0;
    }

    private class RendererFrameOutputData extends gia
    {

        public int cropBottom;
        public int cropLeft;
        public int cropRight;
        public int cropTop;
        public int frameHeight;
        public boolean frameSizeChanged;
        public int frameWidth;
        public boolean updatedTexture;

        public RendererFrameOutputData()
        {
        }
    }

}
