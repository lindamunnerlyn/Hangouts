// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Html;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class cjh extends ebd
{

    final BabelHomeActivity a;

    public cjh(BabelHomeActivity babelhomeactivity, hjm hjm, int i, int j)
    {
        a = babelhomeactivity;
        super(hjm, i, j);
    }

    public void a(csw csw1)
    {
        if (!TextUtils.isEmpty(csw1.a()))
        {
            csw1 = Html.fromHtml(csw1.a()).toString();
        } else
        {
            csw1 = null;
        }
        BabelHomeActivity.a(a, csw1);
    }

    protected void c()
    {
    }
}
