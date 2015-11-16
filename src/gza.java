// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.login.ui.CurrentAccountBannerView;

public final class gza
    implements Runnable
{

    final CurrentAccountBannerView a;

    public gza(CurrentAccountBannerView currentaccountbannerview)
    {
        a = currentaccountbannerview;
        super();
    }

    public void run()
    {
        if (CurrentAccountBannerView.a(a) != null)
        {
            a.announceForAccessibility(CurrentAccountBannerView.a(a));
            CurrentAccountBannerView.b(a);
        }
    }
}
