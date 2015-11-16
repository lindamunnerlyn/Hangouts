// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.Toast;

final class coh
    implements android.content.DialogInterface.OnClickListener
{

    final dmi a;
    final coe b;

    coh(coe coe1, dmi dmi1)
    {
        b = coe1;
        a = dmi1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = b.a.edit();
        dialoginterface.remove(a.f);
        dialoginterface.apply();
        Toast.makeText(b.b.a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
