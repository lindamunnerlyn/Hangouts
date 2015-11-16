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

public final class caq
    implements fnu
{

    final NavigationDrawerFragment a;

    public caq(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public void a(fnv fnv1, fqu fqu1, List list)
    {
        cbe cbe1 = (cbe)fnv1;
        ani ani1 = dbf.a(fqu1.a(), fqu1.d());
        if (ani1 != null && ani1.t())
        {
            cbe1.a.setVisibility(0);
            cbe1.b.setVisibility(0);
            StringBuilder stringbuilder = new StringBuilder();
            ebr.a(stringbuilder, a.getString(l.jS, new Object[] {
                fqu1.a()
            }));
            ebr.a(stringbuilder, a.getContext().getResources().getText(l.kz));
            cbe1.l.setContentDescription(stringbuilder.toString());
        } else
        {
            cbe1.a.setVisibility(8);
            cbe1.b.setVisibility(8);
        }
        if (fqu1.b() || fqu1 == NavigationDrawerFragment.l(a))
        {
            fnv1.r.setText(null);
        }
        if (list.size() > 0)
        {
            NavigationDrawerFragment.a(a, (fqu)list.get(0), cbe1.s, cbe1.d, cbe1.f, cbe1.c, cbe1.e);
        }
        if (list.size() > 1)
        {
            NavigationDrawerFragment.a(a, (fqu)list.get(1), cbe1.t, cbe1.h, cbe1.j, cbe1.g, cbe1.i);
        }
    }
}
