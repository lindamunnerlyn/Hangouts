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

public final class bht extends hhs
    implements android.content.DialogInterface.OnClickListener
{

    private CheckBox aj;
    private CheckBox an;
    private bhv ao;

    public bht()
    {
    }

    public static bht a(int i, String s)
    {
        bht bht1 = new bht();
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", i);
        bundle.putString("dialog_inviter_name", s);
        bht1.setArguments(bundle);
        return bht1;
    }

    static bhv a(bht bht1)
    {
        return bht1.ao;
    }

    static CheckBox b(bht bht1)
    {
        return bht1.aj;
    }

    static CheckBox c(bht bht1)
    {
        return bht1.an;
    }

    public Dialog a(Bundle bundle)
    {
        bundle = getActivity().getResources();
        View view = View.inflate(getActivity(), g.gw, null);
        an = (CheckBox)view.findViewById(h.cm);
        aj = (CheckBox)view.findViewById(h.ck);
        String s = getArguments().getString("dialog_inviter_name");
        ani ani = dbf.e(getArguments().getInt("account_id"));
        ((TextView)view.findViewById(h.cl)).setText(Html.fromHtml(bundle.getString(l.dK, new Object[] {
            s
        })));
        ((TextView)view.findViewById(h.cj)).setText(Html.fromHtml(bundle.getString(l.dL, new Object[] {
            s
        })));
        return (new android.app.AlertDialog.Builder(getActivity())).setView(view).setPositiveButton(bundle.getString(l.hJ), new bhu(this, ani)).setNegativeButton(bundle.getString(l.T), null).create();
    }

    public void a(bhv bhv)
    {
        ao = bhv;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
    }
}
