// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import java.util.List;

public final class cbv
    implements fqq
{

    final NavigationDrawerFragment a;

    public cbv(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public void a(fqr fqr1, ftl ftl1, List list)
    {
        ccj ccj1 = (ccj)fqr1;
        aoa aoa1 = dcn.a(ftl1.a(), ftl1.d());
        if (aoa1 != null && aoa1.r())
        {
            ccj1.a.setVisibility(0);
            ccj1.b.setVisibility(0);
            StringBuilder stringbuilder = new StringBuilder();
            eep.a(stringbuilder, a.getString(l.jl, new Object[] {
                ftl1.a()
            }));
            eep.a(stringbuilder, a.getContext().getResources().getText(l.jS));
            ccj1.l.setContentDescription(stringbuilder.toString());
        } else
        {
            ccj1.a.setVisibility(8);
            ccj1.b.setVisibility(8);
        }
        if (ftl1.b() || ftl1 == NavigationDrawerFragment.m(a))
        {
            fqr1.r.setText(null);
        }
        if (list.size() > 0)
        {
            NavigationDrawerFragment.a(a, (ftl)list.get(0), ccj1.s, ccj1.d, ccj1.f, ccj1.c, ccj1.e);
        }
        if (list.size() > 1)
        {
            NavigationDrawerFragment.a(a, (ftl)list.get(1), ccj1.t, ccj1.h, ccj1.j, ccj1.g, ccj1.i);
        }
    }
}
