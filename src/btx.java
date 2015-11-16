// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;

public final class btx extends hhs
    implements android.content.DialogInterface.OnClickListener
{

    private android.content.DialogInterface.OnDismissListener aj;

    public btx()
    {
    }

    public Dialog a(Bundle bundle)
    {
        ebw.c("Babel", "Showing disable knocking dialog");
        g.b(1666);
        bundle = getActivity();
        Resources resources = bundle.getResources();
        String s = resources.getString(h.id);
        String s1 = resources.getString(h.ic);
        return (new android.app.AlertDialog.Builder(bundle)).setTitle(s).setMessage(s1).setPositiveButton(resources.getString(h.ie), this).setNegativeButton(resources.getString(h.ib), this).setCancelable(false).create();
    }

    public void a(android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        aj = ondismisslistener;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            gbh.a("Unrecognized button click");
            return;

        case -1: 
            ebw.e("Babel", "Knocking to be disabled");
            g.b(1667);
            ((btu)hgx.a(getActivity(), btu)).a(false);
            return;

        case -2: 
            ebw.e("Babel", "Knocking will not be disabled");
            g.b(1668);
            return;
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (aj != null)
        {
            aj.onDismiss(dialoginterface);
        }
    }
}
