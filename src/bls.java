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

public final class bls extends ac
{

    public bls()
    {
    }

    public static bls a(String s)
    {
        bls bls1 = new bls();
        Bundle bundle = new Bundle();
        bundle.putString("name", s);
        bls1.setArguments(bundle);
        return bls1;
    }

    public Dialog a(Bundle bundle)
    {
        Object obj = getArguments().getString("name");
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(g.fD, null);
        bundle = (EditText)view.findViewById(h.aD);
        bundle.setText(((CharSequence) (obj)));
        bundle.setSelection(0, bundle.getText().toString().length());
        builder.setTitle(l.iN).setView(view).setPositiveButton(getString(l.iO), new blu(this, bundle)).setNegativeButton(getString(l.iM), new blt(this));
        obj = builder.create();
        bundle.addTextChangedListener(new blv(this, ((AlertDialog) (obj))));
        ((AlertDialog) (obj)).getWindow().setSoftInputMode(5);
        return ((Dialog) (obj));
    }
}
