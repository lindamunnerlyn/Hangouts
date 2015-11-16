// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class dpa extends hhu
    implements hey
{

    private gmo a;
    private dpl b;
    private ani c;
    private dpd d;
    private bgd e;
    private CheckBoxPreference f;
    private CheckBoxPreference g;

    public dpa()
    {
        new hex(this, lifecycle);
    }

    static bgd a(dpa dpa1, bgd bgd)
    {
        dpa1.e = bgd;
        return bgd;
    }

    static CheckBoxPreference a(dpa dpa1)
    {
        return dpa1.g;
    }

    static CheckBoxPreference b(dpa dpa1)
    {
        return dpa1.f;
    }

    static bgd c(dpa dpa1)
    {
        return dpa1.e;
    }

    static ani d(dpa dpa1)
    {
        return dpa1.c;
    }

    static gmo e(dpa dpa1)
    {
        return dpa1.a;
    }

    static dpl f(dpa dpa1)
    {
        return dpa1.b;
    }

    public void a()
    {
        c = dbf.e(a.a());
        Object obj = ((hfy)hgx.a(context, hfy)).a();
        int i = a.a();
        f = new CheckBoxPreference(context);
        f.g(l.fv);
        f.h(l.fu);
        f.a(b.b(i));
        ((PreferenceScreen) (obj)).c(f);
        g = new CheckBoxPreference(context);
        g.g(l.jK);
        g.h(l.jL);
        g.a(b.c(i));
        ((PreferenceScreen) (obj)).c(g);
        obj = new dpb(this);
        f.a(((hfe) (obj)));
        g.a(((hfe) (obj)));
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
        b = (dpl)binder.a(dpl);
    }

    public void onStart()
    {
        super.onStart();
        d = new dpd(this);
        RealTimeChatService.a(d);
    }

    public void onStop()
    {
        super.onStop();
        RealTimeChatService.b(d);
        d = null;
    }
}
