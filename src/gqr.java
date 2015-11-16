// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class gqr extends AnimatorListenerAdapter
{

    final Snackbar a;

    public gqr(Snackbar snackbar)
    {
        a = snackbar;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        if (android.os.Build.VERSION.SDK_INT < 21 && a.d() != 0)
        {
            Snackbar.a(a);
        }
    }

    public void onAnimationStart(Animator animator)
    {
        a.setVisibility(0);
    }
}
