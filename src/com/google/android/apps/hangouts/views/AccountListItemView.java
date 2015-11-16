// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import h;
import l;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            AvatarView

public class AccountListItemView extends RelativeLayout
{

    private static boolean a;
    private static String b;
    private AvatarView c;
    private TextView d;
    private TextView e;
    private View f;

    public AccountListItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!a)
        {
            b = getContext().getApplicationContext().getResources().getString(l.eJ);
            a = true;
        }
    }

    public void onFinishInflate()
    {
        c = (AvatarView)findViewById(h.E);
        d = (TextView)findViewById(h.l);
        e = (TextView)findViewById(h.m);
        f = findViewById(h.fD);
    }
}
