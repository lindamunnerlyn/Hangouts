// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class drb extends hmm
    implements hjp
{

    private gqu a;
    private aoa b;

    public drb()
    {
        new hjo(this, lifecycle);
    }

    static aoa a(drb drb1)
    {
        return drb1.b;
    }

    public void a()
    {
        PreferenceCategory preferencecategory = (new hjx(context)).a(l.eN);
        hjd hjd1 = new hjd(context, a.a(), "improve_hangouts_key");
        hjd1.g(l.eP);
        hjd1.h(l.eO);
        hjd1.b(Boolean.valueOf(((dra)binder.a(dra)).a(a.a())));
        hjd1.a(new drc(this));
        preferencecategory.c(hjd1);
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
        b = dcn.e(a.a());
    }
}
