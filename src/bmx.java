// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutFragment;

public final class bmx extends ac
    implements android.content.DialogInterface.OnClickListener
{

    public bmx()
    {
    }

    public Dialog a(Bundle bundle)
    {
        bundle = (HangoutActivity)getActivity();
        android.content.res.Resources resources = bundle.getResources();
        View view = View.inflate(bundle, g.fV, null);
        g.a((TextView)view.findViewById(h.bS), bundle, resources, "https://support.google.com/plus/?hl=%locale%", "hangoutsabuse", l.cE);
        return (new android.app.AlertDialog.Builder(bundle)).setTitle(l.cF).setView(view).setPositiveButton(l.hJ, this).setNegativeButton(l.T, this).create();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        ((HangoutActivity)getActivity()).p();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (HangoutActivity)getActivity();
        if (i == -1)
        {
            ani ani = dbf.e(((gmo)hgx.a(dialoginterface, gmo)).a());
            ank.m(getActivity(), ani);
            dialoginterface.o().q();
            return;
        } else
        {
            dialoginterface.p();
            return;
        }
    }
}
