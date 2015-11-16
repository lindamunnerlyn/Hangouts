// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutFragment;

public final class bqu extends hhs
    implements android.content.DialogInterface.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private boolean aj;
    private Button an;
    private CheckBox ao;

    public bqu()
    {
    }

    public Dialog a(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        aj = g.a(dbf.e(((gmo)al.a(gmo)).a()), apk.d);
        if (aj)
        {
            bundle.setTitle(l.eB);
            Object obj = View.inflate(getActivity(), g.gd, null);
            bundle.setView(((View) (obj)));
            ((TextView)((View) (obj)).findViewById(h.cL)).setText(Html.fromHtml(getResources().getString(l.eA)));
            ao = (CheckBox)((View) (obj)).findViewById(h.cK);
            ao.setOnCheckedChangeListener(this);
            obj = getActivity().getResources();
            bundle.setPositiveButton(((Resources) (obj)).getString(l.is), this);
            bundle.setNegativeButton(((Resources) (obj)).getString(l.T), this);
        } else
        {
            bundle.setTitle(l.eB);
            bundle.setMessage(l.dh);
            bundle.setNeutralButton(getResources().getString(l.hJ), this);
        }
        return bundle.create();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        ((HangoutActivity)getActivity()).p();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        an.setEnabled(flag);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            ((HangoutActivity)getActivity()).o().f();
            return;
        } else
        {
            onCancel(dialoginterface);
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        AlertDialog alertdialog = (AlertDialog)c();
        if (aj)
        {
            an = alertdialog.getButton(-1);
            onCheckedChanged(ao, ao.isChecked());
        }
    }
}
