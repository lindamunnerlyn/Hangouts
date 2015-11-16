// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class caz
    implements fng
{

    final NavigationDrawerFragment a;

    public caz(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public final void a(fnh fnh, fqu fqu1)
    {
        if (!a.isAdded())
        {
            return;
        }
        Object obj = NavigationDrawerFragment.i(a).getResources();
        fnh = (cbb)fnh;
        ani ani1 = dbf.a(fqu1.a(), fqu1.d());
        boolean flag;
        boolean flag1;
        if (ani1 != null && ani1.t())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ((cbb) (fnh)).b.setVisibility(0);
        } else
        {
            ((cbb) (fnh)).b.setVisibility(8);
        }
        if (fqu1.b())
        {
            ((cbb) (fnh)).b.setVisibility(8);
            ((cbb) (fnh)).d.setText(fqu1.c());
            ((cbb) (fnh)).e.setImageDrawable(new BitmapDrawable(((Resources) (obj)), anv.c()));
        }
        flag1 = dbf.g(ani1);
        if (flag1)
        {
            ((cbb) (fnh)).c.setVisibility(0);
            ((cbb) (fnh)).d.setTextAppearance(NavigationDrawerFragment.j(a), g.ii);
            obj = ((Resources) (obj)).getString(l.gO, new Object[] {
                ((cbb) (fnh)).d.getText()
            });
            ((cbb) (fnh)).d.setText(((CharSequence) (obj)));
        } else
        {
            ((cbb) (fnh)).c.setVisibility(4);
            ((cbb) (fnh)).d.setTextAppearance(NavigationDrawerFragment.k(a), g.ij);
        }
        ((cbb) (fnh)).a.setContentDescription(NavigationDrawerFragment.a(a, fqu1.a(), flag1, flag));
    }
}
