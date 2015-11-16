// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class fnk extends AnimatorListenerAdapter
{

    final SelectedAccountNavigationView a;

    public fnk(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        a = selectedaccountnavigationview;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        SelectedAccountNavigationView.a(a).B.setVisibility(8);
        SelectedAccountNavigationView.a(a).y.setVisibility(8);
        if (SelectedAccountNavigationView.a(a).C != null)
        {
            SelectedAccountNavigationView.a(a).C.setVisibility(8);
        }
        SelectedAccountNavigationView.b(a);
        SelectedAccountNavigationView.c(a);
        SelectedAccountNavigationView.d(a);
    }
}
