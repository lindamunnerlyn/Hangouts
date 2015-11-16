// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;

final class gdf extends gfc
{

    private float i[];
    private final float j[] = new float[16];
    private final float k[] = new float[16];
    private final SurfaceTexture l;
    private int m;
    private int n;

    gdf(SurfaceTexture surfacetexture, int i1)
    {
        super("FrameTransformer");
        i = gkd.a();
        m = 0;
        n = 0;
        l = surfacetexture;
        a(i1, 0, 0, false, true);
    }

    public void a()
    {
        super.a();
        if (n != 0)
        {
            g.o(n);
            n = 0;
        }
        if (m != 0)
        {
            g.p(m);
            m = 0;
        }
    }

    void a(int i1)
    {
        switch (i1)
        {
        default:
            i = gkd.a();
            return;

        case 90: // 'Z'
            i = gkd.b();
            return;

        case 180: 
            i = gkd.c();
            return;

        case 270: 
            i = gkd.d();
            break;
        }
    }

    void a(gki gki1, gki gki2, boolean flag)
    {
        a(a, gki1.a, gki1.b, d, true);
        a(gki2.a, gki2.b, flag);
        if (n == 0)
        {
            n = g.q();
        }
        if (m != 0)
        {
            g.p(m);
        }
        int i1 = n;
        int j1 = e;
        int k1 = f;
        gkc.b("vclib", (new StringBuilder(64)).append("generateFrameBuffer tex=").append(i1).append(" size=").append(j1).append("x").append(k1).toString());
        gbh.c();
        gki1 = new int[1];
        GLES20.glGenFramebuffers(1, gki1, 0);
        GLES20.glBindFramebuffer(36160, gki1[0]);
        GLES20.glBindTexture(3553, i1);
        GLES20.glTexImage2D(3553, 0, 6408, j1, k1, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i1, 0);
        g.z("generateFrameBuffer");
        GLES20.glBindFramebuffer(36160, 0);
        m = gki1[0];
    }

    void a(boolean flag)
    {
        a(a, b, c, flag, true);
    }

    boolean b()
    {
        boolean flag;
        if (m == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b("Did not set FrameTransformer size before rendering.", flag);
        l.getTransformMatrix(j);
        gkd.a(j, i, k);
        a(k);
        GLES20.glBindFramebuffer(36160, m);
        super.e();
        GLES20.glBindFramebuffer(36160, 0);
        return true;
    }

    int c()
    {
        return n;
    }
}
