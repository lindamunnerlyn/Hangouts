// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.Toast;

final class cop
    implements android.content.DialogInterface.OnClickListener
{

    final con a;

    cop(con con1)
    {
        a = con1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.a.edit();
        dialoginterface.remove(dmi.a.f);
        dialoginterface.remove(dmi.c.f);
        dialoginterface.remove("use_staging_servers");
        dialoginterface.apply();
        Toast.makeText(a.b.a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
