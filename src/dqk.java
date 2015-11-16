// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.hangouts.views.AvatarView;

public final class dqk extends hjr
{

    private String a;
    private aoa c;

    public dqk(Context context)
    {
        super(context, null);
        e(g.gO);
    }

    public void a(View view)
    {
        super.a(view);
        view = (AvatarView)view.findViewById(h.D);
        if (a != null)
        {
            view.a(a, c.c(), c);
            return;
        } else
        {
            view.a(null, null, null);
            return;
        }
    }

    public void a(String s, aoa aoa1)
    {
        if (!TextUtils.equals(s, a))
        {
            a = s;
            c = aoa1;
            z();
        }
    }
}
