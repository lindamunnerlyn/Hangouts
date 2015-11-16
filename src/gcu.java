// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.LibjingleSoftwareEncoder;
import com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder;
import com.google.android.libraries.hangouts.video.RendererManager;

public final class gcu
    implements gda
{

    gdb a;
    gdp b;
    private MediaCodecSimulcastEncoder c;
    private LibjingleSoftwareEncoder d;
    private int e;

    public gcu(boolean flag, RendererManager renderermanager, gdb gdb, gdp gdp1)
    {
        a = gdb;
        b = gdp1;
        e = 0;
        if (flag)
        {
            c = new MediaCodecSimulcastEncoder(gdp1);
        }
        d = new LibjingleSoftwareEncoder(renderermanager);
    }

    private void a(int i)
    {
        if (e != i && i != -1)
        {
            e = i;
            if (a != null)
            {
                b.a(new gcv(this, i));
                return;
            }
        }
    }

    public void a()
    {
        if (c != null)
        {
            c.a();
        }
        if (d != null)
        {
            d.a();
        }
    }

    public void a(int i, int j)
    {
        if (a != null)
        {
            b.a(new gcw(this, i, j));
        }
    }

    public void a(int i, int j, boolean flag)
    {
        if (d != null)
        {
            d.a(i, j, flag);
            if (c != null)
            {
                d.a(1L);
            }
        }
        if (c != null)
        {
            c.a(i, j, flag);
        }
    }

    public boolean a(int i, long l, boolean flag)
    {
        boolean flag2;
        if (c != null)
        {
            boolean flag1;
            if (!c.a(i, l, flag))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag2 = flag1;
            if (!flag1)
            {
                a(c.b());
                d.a(l);
                flag2 = flag1;
            }
        } else
        {
            flag2 = true;
        }
        if (flag2)
        {
            d.a(i, l, flag);
            a(d.b());
        }
        return true;
    }

    public int b()
    {
        return e;
    }

    public void c()
    {
        if (c != null)
        {
            c.c();
            c = null;
        }
        if (d != null)
        {
            d.c();
            d = null;
        }
    }
}
