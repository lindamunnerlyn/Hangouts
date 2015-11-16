// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.PresentToAllBannerView;

public final class brq
    implements android.view.View.OnClickListener
{

    final PresentToAllBannerView a;

    public brq(PresentToAllBannerView presenttoallbannerview)
    {
        a = presenttoallbannerview;
        super();
    }

    public void onClick(View view)
    {
        PresentToAllBannerView.a(a);
    }
}
