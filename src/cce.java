// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class cce
    implements fqc
{

    final NavigationDrawerFragment a;

    public cce(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public final void a(fqd fqd, ftl ftl1)
    {
        if (!a.isAdded())
        {
            return;
        }
        Object obj = NavigationDrawerFragment.j(a).getResources();
        fqd = (ccg)fqd;
        aoa aoa1 = dcn.a(ftl1.a(), ftl1.d());
        boolean flag;
        boolean flag1;
        if (aoa1 != null && aoa1.r())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ((ccg) (fqd)).b.setVisibility(0);
        } else
        {
            ((ccg) (fqd)).b.setVisibility(8);
        }
        if (ftl1.b())
        {
            ((ccg) (fqd)).b.setVisibility(8);
            ((ccg) (fqd)).d.setText(ftl1.c());
            ((ccg) (fqd)).e.setImageDrawable(new BitmapDrawable(((Resources) (obj)), aon.c()));
        }
        flag1 = dcn.f(aoa1);
        if (flag1)
        {
            ((ccg) (fqd)).c.setVisibility(0);
            ((ccg) (fqd)).d.setTextAppearance(NavigationDrawerFragment.k(a), g.ia);
            obj = ((Resources) (obj)).getString(l.gx, new Object[] {
                ((ccg) (fqd)).d.getText()
            });
            ((ccg) (fqd)).d.setText(((CharSequence) (obj)));
        } else
        {
            ((ccg) (fqd)).c.setVisibility(4);
            ((ccg) (fqd)).d.setTextAppearance(NavigationDrawerFragment.l(a), g.ib);
        }
        ((ccg) (fqd)).a.setContentDescription(NavigationDrawerFragment.a(a, ftl1.a(), flag1, flag));
    }
}
