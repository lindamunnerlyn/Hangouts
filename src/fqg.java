// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class fqg extends AnimatorListenerAdapter
{

    final SelectedAccountNavigationView a;

    public fqg(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        a = selectedaccountnavigationview;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        a.a.B.setVisibility(8);
        a.a.y.setVisibility(8);
        if (a.a.C != null)
        {
            a.a.C.setVisibility(8);
        }
        SelectedAccountNavigationView.a(a);
        a.b();
        a.c = null;
    }
}
