// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.libraries.hangouts.video.EncoderManager;
import com.google.android.libraries.hangouts.video.RendererManager;

public final class ggl extends gex
{

    final geg a;
    final ghn b;
    boolean c;
    private final gie d;
    private final ghm e;
    private final EncoderManager f;
    private boolean g;

    public ggl(Context context, geg geg1, gfu gfu, RendererManager renderermanager, ghn ghn1)
    {
        g = false;
        c = true;
        a = geg1;
        b = ghn1;
        f = new EncoderManager(context);
        e = ghn1.c();
        d = new gie(this, f, renderermanager, gfu, e);
        e.a(d);
        geg1.a(this);
    }

    public void a()
    {
        a.b(this);
        d.F_();
        f.b();
    }

    public void a(geu geu)
    {
        g = true;
        d();
    }

    public void a(jjr jjr1)
    {
        if (jjr1 == null || jjr1.c == null)
        {
            return;
        } else
        {
            jjr1 = jjr1.c;
            d.a(((jjs) (jjr1)).b.intValue(), ((jjs) (jjr1)).a.intValue());
            return;
        }
    }

    public void a(boolean flag)
    {
        boolean flag1 = c;
        c = flag;
        d();
        if (flag != flag1)
        {
            e.f();
        }
    }

    public EncoderManager b()
    {
        return f;
    }

    public gmy c()
    {
        return d;
    }

    void d()
    {
        if (!g)
        {
            return;
        }
        if (e.d() != null)
        {
            e.d().b(c);
            a.a(c);
            return;
        } else
        {
            b.a(new ggm(this));
            return;
        }
    }
}
