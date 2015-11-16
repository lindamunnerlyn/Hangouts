// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.hangouts.views.AvatarView;

public final class dnr extends hfa
{

    private String b;
    private ani c;

    public dnr(Context context)
    {
        super(context, null);
        e(g.gW);
    }

    public void a(View view)
    {
        super.a(view);
        view = (AvatarView)view.findViewById(h.E);
        if (b != null)
        {
            view.a(b, c.c(), c);
            return;
        } else
        {
            view.a(null, null, null);
            return;
        }
    }

    public void a(String s, ani ani1)
    {
        if (!TextUtils.equals(s, b))
        {
            b = s;
            c = ani1;
            z();
        }
    }
}
