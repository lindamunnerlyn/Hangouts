// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ckm extends csw
{

    final BabelHomeActivity a;

    public ckm(BabelHomeActivity babelhomeactivity, Context context, hof hof, int i, int j)
    {
        a = babelhomeactivity;
        super(context, hof, i, j);
    }

    public void a(cuz cuz1)
    {
        if (!TextUtils.isEmpty(cuz1.a()))
        {
            cuz1 = Html.fromHtml(cuz1.a()).toString();
        } else
        {
            cuz1 = null;
        }
        BabelHomeActivity.a(a, cuz1);
    }

    protected void c()
    {
    }
}
