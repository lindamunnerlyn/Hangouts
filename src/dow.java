// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class dow extends hhu
    implements hey
{

    private gmo a;

    public dow()
    {
        new hex(this, lifecycle);
    }

    static gmo a(dow dow1)
    {
        return dow1.a;
    }

    public void a()
    {
        PreferenceScreen preferencescreen = ((hfy)binder.a(hfy)).a();
        Object obj = getActivity().getIntent();
        String s = ((Intent) (obj)).getStringExtra("notifications_key");
        if (s != null)
        {
            hem hem1 = new hem(context, a.a(), s);
            hem1.g(l.kj);
            hem1.b(Boolean.valueOf(a.c().a(s, true)));
            hem1.c(s);
            preferencescreen.c(hem1);
        }
        Object obj1 = ((Intent) (obj)).getStringExtra("sound_key");
        dns dns1 = new dns(context);
        dns1.g(l.ah);
        int i = ((Intent) (obj)).getIntExtra("sound_type", 0);
        dns1.a(i);
        dns1.a(new dox(this, dns1, i, ((String) (obj1))));
        int j;
        if (i == 1)
        {
            i = g.ig;
        } else
        {
            i = g.ih;
        }
        j = a.a();
        dns1.c((new StringBuilder(String.valueOf(obj1).length() + 12)).append(j).append(".").append(((String) (obj1))).toString());
        dns1.a(a.c().a(((String) (obj1)), ebr.c(i).toString()));
        preferencescreen.c(dns1);
        dns1.e(s);
        obj = ((Intent) (obj)).getStringExtra("vibrate_key");
        obj1 = new hem(context, a.a(), ((String) (obj)));
        ((hfa) (obj1)).g(l.kl);
        ((hfa) (obj1)).b(Boolean.valueOf(a.c().a(((String) (obj)), true)));
        preferencescreen.c(((hfa) (obj1)));
        ((hfa) (obj1)).e(s);
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
    }
}
