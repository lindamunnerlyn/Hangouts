// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActionBar;
import android.graphics.drawable.Drawable;

public final class aaf
{

    final ActionBar a;

    public aaf(ActionBar actionbar)
    {
        a = actionbar;
    }

    public void a()
    {
        a.setDisplayHomeAsUpEnabled(true);
    }

    public void a(Drawable drawable)
    {
        a.setLogo(drawable);
    }

    public void a(CharSequence charsequence)
    {
        a.setTitle(charsequence);
    }

    public void a(pq pq)
    {
        a.addOnMenuVisibilityListener(new aag(this, pq));
    }

    public void b()
    {
        a.setDisplayOptions(8, 8);
    }

    public void b(CharSequence charsequence)
    {
        a.setSubtitle(charsequence);
    }

    public void c()
    {
        a.show();
    }

    public void d()
    {
        a.hide();
    }
}
