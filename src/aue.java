// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class aue extends aux
{

    public aue(View view, auf auf1, dvi dvi)
    {
        super(view, auf1, dvi);
    }

    protected boolean a()
    {
        boolean flag;
        if (dcn.h() && g.f(((auf)c).d()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return ((auf)c).b() && !((auf)c).c() && flag;
    }

    protected dvg b()
    {
        aoa aoa1 = ((auf)c).a();
        return e().a(b.getContext().getString(l.jp, new Object[] {
            aoa1.d()
        })).a();
    }
}
