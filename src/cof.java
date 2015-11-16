// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.EditText;

final class cof
    implements android.content.DialogInterface.OnClickListener
{

    final dmi a[];
    final coe b;

    cof(coe coe1, dmi admi[])
    {
        b = coe1;
        a = admi;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        coe coe1 = b;
        dmi dmi1 = a[i];
        dialoginterface = coe1.a.getString(dmi1.f, null);
        EditText edittext = new EditText(coe1.b.a);
        edittext.setInputType(16);
        edittext.setHint(dmi1.g.a());
        edittext.setId(dmi1.ordinal());
        if (dialoginterface != null)
        {
            edittext.setText(dialoginterface);
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(coe1.b.a);
        dialoginterface = String.valueOf(dmi1.toString());
        if (dialoginterface.length() != 0)
        {
            dialoginterface = "Change endpoint for ".concat(dialoginterface);
        } else
        {
            dialoginterface = new String("Change endpoint for ");
        }
        builder.setTitle(dialoginterface);
        builder.setView(edittext);
        builder.setNegativeButton("Cancel", new cog(coe1));
        builder.setNeutralButton("Set to default", new coh(coe1, dmi1));
        builder.setPositiveButton("Set it!", new coi(coe1, dmi1, edittext));
        builder.show();
    }
}
