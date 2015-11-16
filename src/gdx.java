// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.libraries.hangouts.video.EncoderManager;
import com.google.android.libraries.hangouts.video.RendererManager;

public final class gdx extends gcj
{

    final gbs a;
    final gen b;
    boolean c;
    private final gff d;
    private final gem e;
    private final EncoderManager f;
    private boolean g;

    public gdx(Context context, gbs gbs1, gdg gdg, RendererManager renderermanager, gen gen1)
    {
        g = false;
        c = true;
        a = gbs1;
        b = gen1;
        f = new EncoderManager(context);
        e = gen1.c();
        d = new gff(this, f, renderermanager, gdg, e);
        e.a(d);
        gbs1.a(this);
    }

    public void a()
    {
        a.b(this);
        d.D_();
        f.a();
    }

    public void a(gcg gcg)
    {
        g = true;
        c();
    }

    public void a(boolean flag)
    {
        boolean flag1 = c;
        c = flag;
        c();
        if (flag != flag1)
        {
            e.f();
        }
    }

    public gjw b()
    {
        return d;
    }

    void c()
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
            b.a(new gdy(this));
            return;
        }
    }
}
