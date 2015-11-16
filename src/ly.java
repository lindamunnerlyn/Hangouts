// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;

class ly extends lw
{

    ly()
    {
    }

    public void a(View view, mg mg)
    {
        view.animate().setUpdateListener(new md(mg, view));
    }
}
