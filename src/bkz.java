// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class bkz extends aug
{

    public bkz(View view, blb blb1, dsp dsp)
    {
        super(view, blb1, dsp);
    }

    protected boolean a()
    {
        return ((blb)c).A();
    }

    protected dsn b()
    {
        dso dso1 = e();
        Resources resources = b.getResources();
        dso1.a(resources.getString(l.az));
        dso1.c(resources.getString(l.U));
        dso1.a(new bla(this));
        return dso1.a();
    }
}
