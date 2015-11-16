// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class doi extends hhu
    implements hey
{

    private gmo a;
    private ani b;

    public doi()
    {
        new hex(this, lifecycle);
    }

    static ani a(doi doi1)
    {
        return doi1.b;
    }

    public void a()
    {
        PreferenceCategory preferencecategory = (new hfg(context)).a(l.fe);
        hem hem1 = new hem(context, a.a(), "improve_hangouts_key");
        hem1.g(l.fg);
        hem1.h(l.ff);
        hem1.b(Boolean.valueOf(((doh)binder.a(doh)).a(a.a())));
        hem1.a(new doj(this));
        preferencecategory.c(hem1);
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
        b = dbf.e(a.a());
    }
}
