// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

public final class btw extends hhs
    implements android.content.DialogInterface.OnClickListener
{

    public btw()
    {
    }

    public Dialog a(Bundle bundle)
    {
        ebw.c("Babel", "Showing allow externals dialog");
        ai ai = getActivity();
        Resources resources = ai.getResources();
        String s = ((btu)hgx.a(ak, btu)).c();
        if (TextUtils.isEmpty(s))
        {
            bundle = resources.getString(h.hW);
        } else
        {
            bundle = resources.getString(h.hV, new Object[] {
                s
            });
        }
        if (TextUtils.isEmpty(s))
        {
            s = resources.getString(h.hU);
        } else
        {
            s = resources.getString(h.hT, new Object[] {
                s
            });
        }
        return (new android.app.AlertDialog.Builder(ai)).setTitle(bundle).setMessage(s).setPositiveButton(resources.getString(h.hR), this).setNegativeButton(resources.getString(h.hS), this).create();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            gbh.a("Unrecognized button click");
            return;

        case -1: 
            ebw.e("Babel", "Allowing external users to join the call");
            g.b(1501);
            ((btu)hgx.a(ak, btu)).a(true);
            return;

        case -2: 
            ebw.e("Babel", "Not allowing external users to join the call");
            return;
        }
    }
}
