// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;

public final class eak extends ClickableSpan
{

    final URLSpan a;
    final Context b;

    public eak(URLSpan urlspan, Context context)
    {
        a = urlspan;
        b = context;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse(a.getURL()));
        b.startActivity(view);
    }
}
