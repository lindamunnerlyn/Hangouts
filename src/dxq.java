// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class dxq extends ac
    implements android.content.DialogInterface.OnClickListener
{

    private List aj;

    public dxq()
    {
    }

    public static dxq a(int i, boolean flag, boolean flag1)
    {
        dxq dxq1 = new dxq();
        Bundle bundle = new Bundle();
        bundle.putInt("rating", i);
        bundle.putBoolean("should_show_audio_issues", flag);
        bundle.putBoolean("is_incoming", flag1);
        dxq1.setArguments(bundle);
        return dxq1;
    }

    private int q()
    {
        return getArguments().getInt("rating");
    }

    private boolean r()
    {
        return getArguments().getBoolean("should_show_audio_issues");
    }

    public Dialog a(Bundle bundle)
    {
        android.app.AlertDialog.Builder builder;
        int i;
        if (r())
        {
            i = g.oU;
        } else
        {
            i = g.oV;
        }
        aj = new LinkedList(Arrays.asList(getResources().getTextArray(i)));
        if (q() == 1)
        {
            aj.remove(getResources().getText(g.pn));
        }
        if (getArguments().getBoolean("is_incoming"))
        {
            aj.remove(getResources().getText(g.pm));
        }
        bundle = (CharSequence[])aj.toArray(new CharSequence[aj.size()]);
        builder = new android.app.AlertDialog.Builder(getActivity());
        if (r())
        {
            i = g.pl;
        } else
        if (q() == 0)
        {
            i = g.pq;
        } else
        {
            i = g.pp;
        }
        return builder.setTitle(i).setItems(bundle, this).setCancelable(false).setIcon(g.pf).create();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        DialogInterface dialoginterface1;
        com.google.android.apps.hangouts.telephony.TeleFeedback.FeedbackActivity feedbackactivity;
        Resources resources;
label0:
        {
            dialoginterface1 = null;
            if (getActivity() != null)
            {
                feedbackactivity = (com.google.android.apps.hangouts.telephony.TeleFeedback.FeedbackActivity)getActivity();
                dialoginterface = ((CharSequence)aj.get(i)).toString();
                resources = getResources();
                if (!r())
                {
                    break label0;
                }
                dialoginterface1 = dialoginterface;
                if (resources.getString(g.pk).equals(dialoginterface))
                {
                    dialoginterface1 = null;
                }
                feedbackactivity.a(dialoginterface1);
            }
            return;
        }
        boolean flag;
        if (resources.getString(g.po).equals(dialoginterface))
        {
            flag = false;
            dialoginterface = dialoginterface1;
        } else
        if (resources.getString(g.pn).equals(dialoginterface))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        feedbackactivity.a(dialoginterface, flag);
    }
}
