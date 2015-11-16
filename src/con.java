// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.text.Html;

final class con extends coj
{

    final SharedPreferences a;
    final cna b;
    private final boolean c;

    public con(cna cna1, SharedPreferences sharedpreferences)
    {
        b = cna1;
        super("Use desktop to debug all my backend requests");
        a = sharedpreferences;
        c = sharedpreferences.getBoolean("use_staging_servers", false);
    }

    public void a()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(b.a);
        boolean flag = c;
        builder.setTitle((new StringBuilder(22)).append("Current setting: ").append(flag).toString());
        builder.setMessage(Html.fromHtml("Enabling this mode makes the app talk to staging servers where all requests can be logged using xsds.<br/><b>A restart of the app might be required.</b><br/>\n\nAfter enabling this: Visit xsds.corp.google.com and click 'Unlock'"));
        builder.setPositiveButton("Enable it!", new coo(this));
        builder.setNegativeButton("Disable it!", new cop(this));
        builder.show();
    }
}
