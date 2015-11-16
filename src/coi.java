// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.Toast;

final class coi
    implements android.content.DialogInterface.OnClickListener
{

    final dmi a;
    final EditText b;
    final coe c;

    coi(coe coe1, dmi dmi1, EditText edittext)
    {
        c = coe1;
        a = dmi1;
        b = edittext;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = c.a.edit();
        dialoginterface.putString(a.f, b.getText().toString());
        dialoginterface.apply();
        Toast.makeText(c.b.a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
