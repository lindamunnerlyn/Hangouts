// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;

public final class gmf extends gmi
    implements android.view.TextureView.SurfaceTextureListener
{

    gmh a;
    boolean b;
    boolean c;
    private final TextureView f;
    private final boolean g = true;
    private Surface h;
    private final Runnable i = new gmg(this);

    public gmf(gmm gmm, TextureView textureview)
    {
        super(gmm);
        h = null;
        f = textureview;
        gmm = textureview.getSurfaceTexture();
        if (gmm != null)
        {
            a(new gmw(a(gmm), textureview.getWidth(), textureview.getHeight(), true));
        }
        textureview.setSurfaceTextureListener(this);
    }

    private Surface a(SurfaceTexture surfacetexture)
    {
        if (h == null)
        {
            h = new Surface(surfacetexture);
        }
        return h;
    }

    public void a()
    {
        f.setSurfaceTextureListener(null);
        a = null;
        if (h != null)
        {
            h.release();
            h = null;
        }
        super.a();
    }

    public void a(gmh gmh1)
    {
        a = gmh1;
    }

    protected void a(boolean flag)
    {
label0:
        {
            if (a != null)
            {
                gne.a(3, "vclib", (new StringBuilder(59)).append("TextureViewVideoRenderer.onCurrentParticipantChanged: ").append(flag).toString());
                Runnable runnable = i;
                g.x().removeCallbacks(runnable);
                if (!flag)
                {
                    break label0;
                }
                i.run();
            }
            return;
        }
        g.a(i, 100L);
    }

    protected void b(boolean flag)
    {
        if (flag && a != null)
        {
            gne.a(3, "vclib", (new StringBuilder(50)).append("TextureViewVideoRenderer.onMuteStateChanged: ").append(flag).toString());
            Runnable runnable = i;
            g.x().removeCallbacks(runnable);
            i.run();
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int j, int k)
    {
        gne.a(3, "vclib", "TextureViewVideoRenderer.onSurfaceTextureAvailable");
        if (j == 0 || k == 0)
        {
            gne.a(3, "vclib", "Ignoring surface because it has an area of zero.");
            return;
        } else
        {
            a(new gmw(a(surfacetexture), j, k, g));
            return;
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        gne.a(3, "vclib", "TextureViewVideoRenderer.onSurfaceTextureDestroyed");
        h.release();
        h = null;
        a(((gmw) (null)));
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int j, int k)
    {
        gne.a(3, "vclib", "TextureViewVideoRenderer.onSurfaceTextureSizeChanged");
        c = false;
        if (j == 0 || k == 0)
        {
            gne.a(3, "vclib", "Ignoring surface because it has an area of zero.");
            return;
        } else
        {
            a(new gmw(a(surfacetexture), j, k, g));
            return;
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        if (a != null && c)
        {
            surfacetexture = i;
            g.x().removeCallbacks(surfacetexture);
            if (!b)
            {
                gdv.a();
                a.c();
                b = true;
            }
            g.a(i, 2000L);
        }
        c = true;
    }
}
