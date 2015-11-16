// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class fnl extends AnimatorListenerAdapter
{

    final SelectedAccountNavigationView a;

    public fnl(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        a = selectedaccountnavigationview;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        SelectedAccountNavigationView.e(a);
        SelectedAccountNavigationView.b(a);
        SelectedAccountNavigationView.c(a);
        SelectedAccountNavigationView.d(a);
    }
}
