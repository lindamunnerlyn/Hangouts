// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutFragment;

public final class bqr extends ac
    implements android.content.DialogInterface.OnClickListener
{

    private CheckBox aj;

    public bqr()
    {
    }

    public Dialog a(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(l.er);
        View view = View.inflate(getActivity(), g.gc, null);
        bundle.setView(view);
        TextView textview = (TextView)view.findViewById(h.aj);
        Math.round(textview.getTextSize());
        textview.setText(Html.fromHtml(getResources().getString(l.eq), null, null));
        aj = (CheckBox)view.findViewById(h.ak);
        bundle.setPositiveButton(getActivity().getResources().getString(l.hJ), this);
        return bundle.create();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        ((HangoutActivity)getActivity()).p();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        gbh.a(Integer.valueOf(i), Integer.valueOf(-1));
        dialoginterface = (HangoutActivity)getActivity();
        dialoginterface.o().e();
        if (aj.isChecked())
        {
            ank.k(getActivity(), dbf.e(((gmo)hgx.a(dialoginterface, gmo)).a()));
        }
    }
}
