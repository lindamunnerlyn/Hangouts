// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

public final class buj extends hmk
    implements android.content.DialogInterface.OnClickListener
{

    public buj()
    {
    }

    public Dialog a(Bundle bundle)
    {
        eev.c("Babel", "Showing allow externals dialog");
        ai ai = getActivity();
        Resources resources = ai.getResources();
        String s = ((buh)hlp.a(ak, buh)).c();
        if (TextUtils.isEmpty(s))
        {
            bundle = resources.getString(h.hB);
        } else
        {
            bundle = resources.getString(h.hA, new Object[] {
                s
            });
        }
        if (TextUtils.isEmpty(s))
        {
            s = resources.getString(h.hz);
        } else
        {
            s = resources.getString(h.hy, new Object[] {
                s
            });
        }
        return (new android.app.AlertDialog.Builder(ai)).setTitle(bundle).setMessage(s).setPositiveButton(resources.getString(h.hw), this).setNegativeButton(resources.getString(h.hx), this).create();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            gdv.a("Unrecognized button click");
            return;

        case -1: 
            eev.e("Babel", "Allowing external users to join the call");
            g.b(1501);
            ((buh)hlp.a(ak, buh)).a(true);
            return;

        case -2: 
            eev.e("Babel", "Not allowing external users to join the call");
            return;
        }
    }
}
