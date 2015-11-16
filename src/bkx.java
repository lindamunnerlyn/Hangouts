// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bkx extends aug
{

    public bkx(View view, bky bky1, dsp dsp)
    {
        super(view, bky1, dsp);
    }

    protected boolean a()
    {
        return ((bky)c).d() && ((bky)c).a() && ((bky)c).b();
    }

    protected dsn b()
    {
        String s;
        int i;
        if (((bky)c).e())
        {
            i = l.fl;
        } else
        {
            i = l.fm;
        }
        s = b.getResources().getString(i, new Object[] {
            ((bky)c).c()
        });
        return e().a(s).a();
    }
}
