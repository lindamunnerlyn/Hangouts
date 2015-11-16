// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.Toast;

final class coo
    implements android.content.DialogInterface.OnClickListener
{

    final con a;

    coo(con con1)
    {
        a = con1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.a.edit();
        dialoginterface.putString(dmi.a.f, "https://staging-www.sandbox.googleapis.com/chat/v1/");
        dialoginterface.putString(dmi.c.f, "https://staging-www.sandbox.googleapis.com/hangouts/v1_staging/");
        dialoginterface.putBoolean("use_staging_servers", true);
        dialoginterface.apply();
        Toast.makeText(a.b.a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
