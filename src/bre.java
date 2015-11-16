// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

public final class bre extends ac
    implements android.content.DialogInterface.OnClickListener
{

    private boolean aj;

    public bre()
    {
    }

    static bre q()
    {
        return new bre();
    }

    public Dialog a(Bundle bundle)
    {
        bundle = getActivity().getResources();
        bundle = (new android.app.AlertDialog.Builder(getActivity())).setMessage(l.de).setTitle(bundle.getString(l.df)).setPositiveButton(bundle.getString(l.dc), this).setNegativeButton(bundle.getString(l.dd), this).create();
        bundle.setOnShowListener(new brf(this));
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            startActivity(g.q(g.a(g.nU, "babel_google_voice_add_balance_url", "https://www.google.com/voice/m/billing")));
            aj = true;
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (bnk.a().s() == null)
        {
            dialoginterface = (HangoutActivity)getActivity();
            if (dialoginterface != null)
            {
                boolean flag;
                if (!aj)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                dialoginterface.b(flag);
            }
        }
    }
}
