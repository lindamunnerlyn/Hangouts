// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import gdv;
import gfo;
import gnk;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            RendererManager

public final class LibjingleSoftwareEncoder
    implements gfo
{

    private final RendererManager a;
    private int b;
    private gnk c;
    private boolean d;
    private int e;
    private boolean f;
    private final EncoderInputData g = new EncoderInputData();

    public LibjingleSoftwareEncoder(RendererManager renderermanager)
    {
        a = renderermanager;
        b = -1;
    }

    public void a()
    {
        b = a.a(0);
        a.initializeGLContext(b);
    }

    public void a(int i, int j, boolean flag)
    {
        if (b == -1)
        {
            gdv.a("Asked to setResolution without first calling initializeGLContext.");
        } else
        {
            gnk gnk1 = new gnk(i, j);
            Object obj;
            if (flag)
            {
                obj = new gnk(i & -8, j & -2);
            } else
            if (i * j >= 0x7e900)
            {
                obj = new gnk(i & 0xffffffc0, j & -8);
            } else
            if (i * j >= 0x1fa40)
            {
                obj = new gnk(i & 0xffffffe0, j & -4);
            } else
            {
                obj = new gnk(i & -8, j & -2);
            }
            if (c == null || !c.equals(gnk1))
            {
                c = gnk1;
                a.setIntParam(b, "sub_indims", gnk1.a());
                a.setIntParam(b, "sub_outdims", ((gnk) (obj)).a());
                RendererManager renderermanager = a;
                i = b;
                j = gnk1.a;
                int k = ((gnk) (obj)).a;
                renderermanager.setIntParam(i, "sub_inclip", gnk1.b - ((gnk) (obj)).b | j - k << 16);
            }
            if (d != flag)
            {
                d = flag;
                obj = a;
                j = b;
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                ((RendererManager) (obj)).setIntParam(j, "sub_screencast", i);
                return;
            }
        }
    }

    public void a(long l)
    {
        g.timestampNanos = l;
        g.isFake = true;
        a.renderFrame(b, g, null);
    }

    public boolean a(int i, long l, boolean flag)
    {
        if (b == -1)
        {
            gdv.a("Asked to encode a frame without first calling initializeGLContext.");
            return false;
        }
        if (f != flag)
        {
            f = flag;
            RendererManager renderermanager = a;
            int k = b;
            int j;
            if (flag)
            {
                j = 36197;
            } else
            {
                j = 3553;
            }
            renderermanager.setIntParam(k, "sub_intextype", j);
        }
        if (e != i)
        {
            e = i;
            a.setIntParam(b, "sub_intex", i);
        }
        g.timestampNanos = l;
        g.isFake = false;
        a.renderFrame(b, g, null);
        return true;
    }

    public int b()
    {
        return 0;
    }

    public void c()
    {
        if (b == -1)
        {
            return;
        } else
        {
            a.releaseRenderer(b);
            b = -1;
            return;
        }
    }

    private class EncoderInputData
    {

        public boolean isFake;
        public long timestampNanos;

        EncoderInputData()
        {
        }
    }

}
