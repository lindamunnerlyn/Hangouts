// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;

class lx extends lu
{

    lx()
    {
    }

    public void a(lr lr, View view, me me)
    {
        if (me != null)
        {
            view.animate().setListener(new mc(me, view));
            return;
        } else
        {
            view.animate().setListener(null);
            return;
        }
    }
}
