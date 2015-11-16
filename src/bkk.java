// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bkk extends aug
{

    public bkk(View view, bkl bkl1, dsp dsp)
    {
        super(view, bkl1, dsp);
    }

    protected boolean a()
    {
        return ((bkl)c).c() && ((bkl)c).b() != ((bkl)c).a();
    }

    protected dsn b()
    {
        dso dso1 = e();
        int i;
        if (((bkl)c).b())
        {
            i = l.kN;
        } else
        {
            i = l.kO;
        }
        dso1.a(b.getResources().getString(i));
        return dso1.a();
    }
}
