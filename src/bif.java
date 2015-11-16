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

public final class bif extends hmk
    implements android.content.DialogInterface.OnClickListener
{

    private CheckBox aj;
    private CheckBox an;
    private bih ao;

    public bif()
    {
    }

    static bih a(bif bif1)
    {
        return bif1.ao;
    }

    static CheckBox b(bif bif1)
    {
        return bif1.aj;
    }

    static CheckBox c(bif bif1)
    {
        return bif1.an;
    }

    public Dialog a(Bundle bundle)
    {
        bundle = getActivity().getResources();
        View view = View.inflate(getActivity(), g.gs, null);
        an = (CheckBox)view.findViewById(h.cc);
        aj = (CheckBox)view.findViewById(h.ca);
        String s = getArguments().getString("dialog_inviter_name");
        aoa aoa = dcn.e(getArguments().getInt("account_id"));
        ((TextView)view.findViewById(h.cb)).setText(Html.fromHtml(bundle.getString(l.dt, new Object[] {
            s
        })));
        ((TextView)view.findViewById(h.bZ)).setText(Html.fromHtml(bundle.getString(l.du, new Object[] {
            s
        })));
        return (new android.app.AlertDialog.Builder(getActivity())).setView(view).setPositiveButton(bundle.getString(l.hd), new big(this, aoa)).setNegativeButton(bundle.getString(l.Q), null).create();
    }

    public void a(bih bih)
    {
        ao = bih;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
    }
}
