// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public final class bmb extends ac
{

    public bmb()
    {
    }

    public Dialog a(Bundle bundle)
    {
        Object obj = getArguments().getString("name");
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(g.fB, null);
        bundle = (EditText)view.findViewById(h.ay);
        bundle.setText(((CharSequence) (obj)));
        bundle.setSelection(0, bundle.getText().toString().length());
        builder.setTitle(l.ih).setView(view).setPositiveButton(getString(l.ii), new bmd(this, bundle)).setNegativeButton(getString(l.ig), new bmc(this));
        obj = builder.create();
        bundle.addTextChangedListener(new bme(this, ((AlertDialog) (obj))));
        ((AlertDialog) (obj)).getWindow().setSoftInputMode(5);
        return ((Dialog) (obj));
    }
}
