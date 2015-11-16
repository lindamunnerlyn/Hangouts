// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

public final class edp
    implements android.view.View.OnClickListener
{

    final Context a;
    final URLSpan b;

    public edp(Context context, URLSpan urlspan)
    {
        a = context;
        b = urlspan;
        super();
    }

    public void onClick(View view)
    {
        if (((AccessibilityManager)a.getSystemService("accessibility")).isEnabled())
        {
            view = new Intent("android.intent.action.VIEW");
            view.setData(Uri.parse(b.getURL()));
            a.startActivity(view);
        }
    }
}
