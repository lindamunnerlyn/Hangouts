// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class drt extends hmm
    implements hjp
{

    private gqu a;
    private dse b;
    private aoa c;
    private drw d;
    private bgp e;
    private CheckBoxPreference f;
    private CheckBoxPreference g;

    public drt()
    {
        new hjo(this, lifecycle);
    }

    static bgp a(drt drt1, bgp bgp)
    {
        drt1.e = bgp;
        return bgp;
    }

    static CheckBoxPreference a(drt drt1)
    {
        return drt1.g;
    }

    static CheckBoxPreference b(drt drt1)
    {
        return drt1.f;
    }

    static bgp c(drt drt1)
    {
        return drt1.e;
    }

    static aoa d(drt drt1)
    {
        return drt1.c;
    }

    static gqu e(drt drt1)
    {
        return drt1.a;
    }

    static dse f(drt drt1)
    {
        return drt1.b;
    }

    static hlt g(drt drt1)
    {
        return drt1.context;
    }

    static hlt h(drt drt1)
    {
        return drt1.context;
    }

    public void a()
    {
        c = dcn.e(a.a());
        Object obj = ((hkp)hlp.a(context, hkp)).b();
        int i = a.a();
        f = new CheckBoxPreference(context);
        f.g(l.fe);
        f.h(l.fd);
        f.a(b.b(i));
        ((PreferenceScreen) (obj)).c(f);
        g = new CheckBoxPreference(context);
        g.g(l.jd);
        g.h(l.je);
        g.a(b.c(i));
        ((PreferenceScreen) (obj)).c(g);
        obj = new dru(this);
        f.a(((hjv) (obj)));
        g.a(((hjv) (obj)));
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
        b = (dse)binder.a(dse);
    }

    public void onStart()
    {
        super.onStart();
        d = new drw(this);
        RealTimeChatService.a(d);
    }

    public void onStop()
    {
        super.onStop();
        RealTimeChatService.b(d);
        d = null;
    }
}
