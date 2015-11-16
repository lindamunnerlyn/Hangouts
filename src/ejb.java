// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.views.OverlayedAvatarView;

public final class ejb extends csw
{

    final OverlayedAvatarView a;

    public ejb(OverlayedAvatarView overlayedavatarview, Context context, hof hof, int i)
    {
        a = overlayedavatarview;
        super(context, hof, i, OverlayedAvatarView.h());
    }

    public void a(cuz cuz)
    {
        a.a(cuz);
    }

    protected void c()
    {
        a.a(null);
    }
}
