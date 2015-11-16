// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class atn extends aug
{

    public atn(View view, ato ato1, dsp dsp)
    {
        super(view, ato1, dsp);
    }

    protected boolean a()
    {
        boolean flag;
        if (dbf.h() && g.f(((ato)c).d()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return ((ato)c).b() && !((ato)c).c() && flag;
    }

    protected dsn b()
    {
        ani ani1 = ((ato)c).a();
        return e().a(b.getContext().getString(l.jW, new Object[] {
            ani1.d()
        })).a();
    }
}
