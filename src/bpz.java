// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

public final class bpz extends hmk
    implements android.content.DialogInterface.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private gqu aj;
    private CheckBox an;
    private TextView ao;
    private gmt ap;
    private final bnk aq = bnk.a();
    private final bqa ar = new bqa(this);

    public bpz()
    {
    }

    public static bpz a(String s)
    {
        bpz bpz1 = new bpz();
        Bundle bundle = new Bundle();
        bundle.putString("key_participant_id", s);
        bpz1.setArguments(bundle);
        return bpz1;
    }

    static gmt a(bpz bpz1)
    {
        return bpz1.ap;
    }

    public Dialog a(Bundle bundle)
    {
        ap = aq.a(getArguments().getString("key_participant_id"));
        bundle = getActivity();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(bundle);
        Resources resources = bundle.getResources();
        View view = View.inflate(bundle, g.fX, null);
        builder.setView(view);
        builder.setPositiveButton(resources.getString(l.hd), this);
        builder.setNegativeButton(resources.getString(l.Q), this);
        ao = (TextView)view.findViewById(h.bK);
        g.a(ao, bundle, resources.getString(l.cz, new Object[] {
            g.f("https://www.google.com/support/hangouts/?hl=%locale%", "blocking").toString()
        }));
        an = (CheckBox)view.findViewById(h.bL);
        an.setOnCheckedChangeListener(this);
        ao.setVisibility(8);
        ((TextView)view.findViewById(h.bY)).setText(Html.fromHtml(resources.getString(l.di, new Object[] {
            ap.b()
        })));
        ((TextView)view.findViewById(h.bX)).setText(Html.fromHtml(resources.getString(l.dh, new Object[] {
            ap.b()
        })));
        return builder.create();
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (gqu)al.a(gqu);
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = ao;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        compoundbutton.setVisibility(i);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            g.b(349);
            gic.a().a(ap.a());
            dialoginterface = (HangoutActivity)getActivity();
            if (an.isChecked())
            {
                g.b(263);
                g.a(dialoginterface, dcn.e(aj.a()), ap.b(), ap.h(), null, false);
            }
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
    }

    public void onStart()
    {
        super.onStart();
        g.b(671);
        aq.a(ar);
    }

    public void onStop()
    {
        super.onStop();
        aq.b(ar);
    }
}
