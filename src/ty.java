// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;

public final class ty
    implements android.view.View.OnClickListener
{

    final vr a;
    final ActionBarContextView b;

    public ty(ActionBarContextView actionbarcontextview, vr vr1)
    {
        b = actionbarcontextview;
        a = vr1;
        super();
    }

    public void onClick(View view)
    {
        a.c();
    }
}
