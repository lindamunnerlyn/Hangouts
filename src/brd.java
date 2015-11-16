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

public final class brd extends hmk
    implements android.content.DialogInterface.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private boolean aj;
    private Button an;
    private CheckBox ao;

    public brd()
    {
    }

    public Dialog a(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        aj = g.a(dcn.e(((gqu)al.a(gqu)).a()), aqc.d);
        if (aj)
        {
            bundle.setTitle(l.ek);
            Object obj = View.inflate(getActivity(), g.fZ, null);
            bundle.setView(((View) (obj)));
            ((TextView)((View) (obj)).findViewById(h.cB)).setText(Html.fromHtml(getResources().getString(l.ej)));
            ao = (CheckBox)((View) (obj)).findViewById(h.cA);
            ao.setOnCheckedChangeListener(this);
            obj = getActivity().getResources();
            bundle.setPositiveButton(((Resources) (obj)).getString(l.hM), this);
            bundle.setNegativeButton(((Resources) (obj)).getString(l.Q), this);
        } else
        {
            bundle.setTitle(l.ek);
            bundle.setMessage(l.cQ);
            bundle.setNeutralButton(getResources().getString(l.hd), this);
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
