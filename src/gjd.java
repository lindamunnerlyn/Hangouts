// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;

public final class gjd extends gjg
    implements android.view.TextureView.SurfaceTextureListener
{

    private final TextureView c;
    private final boolean d = true;
    private Surface e;
    private gjf f;
    private boolean g;
    private boolean h;
    private final Runnable i = new gje(this);

    public gjd(gjk gjk, TextureView textureview)
    {
        super(gjk);
        e = null;
        c = textureview;
        gjk = textureview.getSurfaceTexture();
        if (gjk != null)
        {
            a(new gju(a(gjk), textureview.getWidth(), textureview.getHeight(), true));
        }
        textureview.setSurfaceTextureListener(this);
    }

    private Surface a(SurfaceTexture surfacetexture)
    {
        if (e == null)
        {
            e = new Surface(surfacetexture);
        }
        return e;
    }

    static gjf a(gjd gjd1)
    {
        return gjd1.f;
    }

    static boolean b(gjd gjd1)
    {
        gjd1.g = false;
        return false;
    }

    static boolean c(gjd gjd1)
    {
        gjd1.h = false;
        return false;
    }

    public void a()
    {
        c.setSurfaceTextureListener(null);
        f = null;
        if (e != null)
        {
            e.release();
            e = null;
        }
        super.a();
    }

    public void a(gjf gjf1)
    {
        f = gjf1;
    }

    protected void a(boolean flag)
    {
label0:
        {
            if (f != null)
            {
                gkc.b("vclib", (new StringBuilder(59)).append("TextureViewVideoRenderer.onCurrentParticipantChanged: ").append(flag).toString());
                Runnable runnable = i;
                g.y().removeCallbacks(runnable);
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
        if (flag && f != null)
        {
            gkc.b("vclib", (new StringBuilder(50)).append("TextureViewVideoRenderer.onMuteStateChanged: ").append(flag).toString());
            Runnable runnable = i;
            g.y().removeCallbacks(runnable);
            i.run();
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int j, int k)
    {
        gkc.b("vclib", "TextureViewVideoRenderer.onSurfaceTextureAvailable");
        a(new gju(a(surfacetexture), j, k, d));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        gkc.b("vclib", "TextureViewVideoRenderer.onSurfaceTextureDestroyed");
        e.release();
        e = null;
        a(((gju) (null)));
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int j, int k)
    {
        gkc.b("vclib", "TextureViewVideoRenderer.onSurfaceTextureSizeChanged");
        h = false;
        a(new gju(a(surfacetexture), j, k, d));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        if (f != null && h)
        {
            surfacetexture = i;
            g.y().removeCallbacks(surfacetexture);
            if (!g)
            {
                gbh.a();
                f.c();
                g = true;
            }
            g.a(i, 2000L);
        }
        h = true;
    }
}
