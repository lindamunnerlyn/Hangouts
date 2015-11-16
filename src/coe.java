// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;

final class coe extends coj
{

    final SharedPreferences a;
    final cna b;

    public coe(cna cna1, SharedPreferences sharedpreferences)
    {
        b = cna1;
        super("Change API endpoint URLs");
        a = sharedpreferences;
    }

    public void a()
    {
        dmi admi[] = dmi.values();
        CharSequence acharsequence[] = new CharSequence[admi.length];
        for (int i = 0; i < admi.length; i++)
        {
            acharsequence[i] = admi[i].toString();
        }

        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(b.a);
        builder.setTitle("Choose API to change");
        builder.setItems(acharsequence, new cof(this, admi));
        builder.show();
    }
}
