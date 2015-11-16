// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.OverlayedAvatarView;
import com.google.android.apps.hangouts.views.RichStatusView;

public final class efy
    implements Runnable
{

    final OverlayedAvatarView a;

    public efy(OverlayedAvatarView overlayedavatarview)
    {
        a = overlayedavatarview;
        super();
    }

    public void run()
    {
        OverlayedAvatarView.a(a).a();
    }
}
