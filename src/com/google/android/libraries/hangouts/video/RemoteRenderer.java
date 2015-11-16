// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.media.MediaFormat;
import gbh;
import gct;
import gdp;
import geu;
import gey;
import gfb;
import gkc;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Renderer, RendererManager, DecoderManager, Decoder

public final class RemoteRenderer extends Renderer
    implements gct
{

    private int a;
    private final Decoder b;
    private final gey c;
    private final gdp d;
    private int e;
    private boolean f;

    RemoteRenderer(RendererManager renderermanager, DecoderManager decodermanager, gdp gdp1, gey gey1)
    {
        gbh.a(true);
        mRendererManager = renderermanager;
        mRendererID = mRendererManager.a(3);
        d = gdp1;
        c = gey1;
        if (decodermanager != null)
        {
            b = decodermanager.a(gdp1, this);
        } else
        {
            b = null;
        }
        RendererManager.a(this);
    }

    public static gey a(RemoteRenderer remoterenderer)
    {
        return remoterenderer.c;
    }

    public void a()
    {
        gbh.c();
        if (c != null)
        {
            c.a();
        }
    }

    public void a(int i)
    {
        if (b != null)
        {
            b.b(i);
        }
    }

    public boolean a(gfb gfb)
    {
        RendererFrameOutputData rendererframeoutputdata = (RendererFrameOutputData)gfb;
        boolean flag = f;
        if (b != null && b.c())
        {
            e = b.b();
            f = true;
            rendererframeoutputdata.updatedTexture = b.e();
            if (rendererframeoutputdata.updatedTexture)
            {
                gfb = b.f();
                if (gfb != null)
                {
                    int j = gfb.getInteger("width");
                    int k = gfb.getInteger("height");
                    rendererframeoutputdata.frameWidth = j;
                    rendererframeoutputdata.frameHeight = k;
                    int i;
                    if (gfb.containsKey("crop-left"))
                    {
                        i = gfb.getInteger("crop-left");
                    } else
                    {
                        i = 0;
                    }
                    rendererframeoutputdata.cropLeft = i;
                    if (gfb.containsKey("crop-top"))
                    {
                        i = gfb.getInteger("crop-top");
                    } else
                    {
                        i = 0;
                    }
                    rendererframeoutputdata.cropTop = i;
                    if (gfb.containsKey("crop-right"))
                    {
                        i = gfb.getInteger("crop-right");
                    } else
                    {
                        i = j - 1;
                    }
                    rendererframeoutputdata.cropRight = i;
                    if (gfb.containsKey("crop-bottom"))
                    {
                        i = gfb.getInteger("crop-bottom");
                    } else
                    {
                        i = k - 1;
                    }
                    rendererframeoutputdata.cropBottom = i;
                    if (rendererframeoutputdata.cropLeft < 0 || rendererframeoutputdata.cropLeft >= j || rendererframeoutputdata.cropTop < 0 || rendererframeoutputdata.cropTop >= k || rendererframeoutputdata.cropRight < 0 || rendererframeoutputdata.cropRight >= j || rendererframeoutputdata.cropBottom < 0 || rendererframeoutputdata.cropBottom >= k)
                    {
                        gkc.e("vclib", String.format("RemoteRenderer hardware decode: Unexpected crop values: width: %d height: %d crop-left: %d crop-top: %d crop-right: %d crop-bottom: %d", new Object[] {
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
            e = a;
            f = false;
            mRendererManager.renderFrame(mRendererID, null, gfb);
            rendererframeoutputdata.cropLeft = 0;
            rendererframeoutputdata.cropTop = 0;
            rendererframeoutputdata.cropRight = rendererframeoutputdata.frameWidth - 1;
            rendererframeoutputdata.cropBottom = rendererframeoutputdata.frameHeight - 1;
        }
        if (flag != f && c != null)
        {
            d.a(new geu(this));
        }
        return rendererframeoutputdata.updatedTexture;
    }

    public void b()
    {
        mRendererManager.initializeGLContext(mRendererID);
        a = mRendererManager.getIntParam(mRendererID, "sub_outtex");
        if (b != null)
        {
            b.a();
        }
    }

    public int c()
    {
        gbh.b(Integer.valueOf(e), Integer.valueOf(0));
        return e;
    }

    public boolean d()
    {
        return f;
    }

    public void e()
    {
        int i = mRendererID;
        gkc.a("vclib", (new StringBuilder(19)).append("release ").append(i).toString());
        RendererManager.b(this);
        mRendererManager.releaseRenderer(mRendererID);
        if (b != null)
        {
            b.g();
        }
    }

    public int f()
    {
        if (b != null)
        {
            int i = b.d();
            if (i != -1)
            {
                return i;
            }
        }
        return 0;
    }

    private class RendererFrameOutputData extends gfb
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
