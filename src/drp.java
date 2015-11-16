// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class drp extends hmm
    implements hjp
{

    private gqu a;

    public drp()
    {
        new hjo(this, lifecycle);
    }

    static gqu a(drp drp1)
    {
        return drp1.a;
    }

    public void a()
    {
        PreferenceScreen preferencescreen = ((hkp)binder.a(hkp)).b();
        Object obj = getActivity().getIntent();
        String s = ((Intent) (obj)).getStringExtra("notifications_key");
        if (s != null)
        {
            hjd hjd1 = new hjd(context, a.a(), s);
            hjd1.g(l.jC);
            hjd1.b(Boolean.valueOf(a.c().a(s, true)));
            hjd1.c(s);
            preferencescreen.c(hjd1);
        }
        Object obj1 = ((Intent) (obj)).getStringExtra("sound_key");
        dql dql1 = new dql(context);
        dql1.g(l.ae);
        int i = ((Intent) (obj)).getIntExtra("sound_type", 0);
        dql1.b(i);
        dql1.a(new drq(this, dql1, i, ((String) (obj1))));
        int j;
        if (i == 1)
        {
            i = g.hY;
        } else
        {
            i = g.hZ;
        }
        j = a.a();
        dql1.c((new StringBuilder(String.valueOf(obj1).length() + 12)).append(j).append(".").append(((String) (obj1))).toString());
        dql1.a(a.c().a(((String) (obj1)), eep.c(i).toString()));
        preferencescreen.c(dql1);
        dql1.e(s);
        obj = ((Intent) (obj)).getStringExtra("vibrate_key");
        obj1 = new hjd(context, a.a(), ((String) (obj)));
        ((hjr) (obj1)).g(l.jE);
        ((hjr) (obj1)).b(Boolean.valueOf(a.c().a(((String) (obj)), true)));
        preferencescreen.c(((hjr) (obj1)));
        ((hjr) (obj1)).e(s);
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
    }
}
