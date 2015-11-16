// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;

public final class buk extends hmk
    implements android.content.DialogInterface.OnClickListener
{

    private android.content.DialogInterface.OnDismissListener aj;

    public buk()
    {
    }

    public Dialog a(Bundle bundle)
    {
        eev.c("Babel", "Showing disable knocking dialog");
        g.b(1666);
        bundle = getActivity();
        Resources resources = bundle.getResources();
        String s = resources.getString(h.hI);
        String s1 = resources.getString(h.hH);
        return (new android.app.AlertDialog.Builder(bundle)).setTitle(s).setMessage(s1).setPositiveButton(resources.getString(h.hJ), this).setNegativeButton(resources.getString(h.hG), this).setCancelable(false).create();
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
            gdv.a("Unrecognized button click");
            return;

        case -1: 
            eev.e("Babel", "Knocking to be disabled");
            g.b(1667);
            ((buh)hlp.a(getActivity(), buh)).a(false);
            return;

        case -2: 
            eev.e("Babel", "Knocking will not be disabled");
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
