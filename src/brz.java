// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import com.google.android.apps.hangouts.hangout.PresentToAllBannerView;

public final class brz
    implements android.view.View.OnClickListener
{

    final PresentToAllBannerView a;

    public brz(PresentToAllBannerView presenttoallbannerview)
    {
        a = presenttoallbannerview;
        super();
    }

    public void onClick(View view)
    {
        view = a;
        if (view.getVisibility() == 0)
        {
            if (view.getAnimation() != null)
            {
                view.getAnimation().cancel();
            }
            int i = -view.getHeight();
            bsa bsa1 = new bsa(view, (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams(), i);
            bsa1.setDuration(view.getContext().getResources().getInteger(g.eV));
            view.startAnimation(bsa1);
        }
    }
}
