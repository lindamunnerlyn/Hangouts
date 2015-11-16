// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.login.ui.CurrentAccountBannerView;

public final class hdt
    implements Runnable
{

    final CurrentAccountBannerView a;

    public hdt(CurrentAccountBannerView currentaccountbannerview)
    {
        a = currentaccountbannerview;
        super();
    }

    public void run()
    {
        if (a.a != null)
        {
            a.announceForAccessibility(a.a);
            a.a = null;
        }
    }
}
