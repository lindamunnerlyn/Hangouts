// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

public final class bpq extends hhs
    implements android.content.DialogInterface.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private gmo aj;
    private CheckBox an;
    private CheckBox ao;
    private TextView ap;
    private TextView aq;
    private boolean ar;
    private boolean as;
    private boolean at;
    private gho au;
    private final bof av = bof.a();
    private final bpr aw = new bpr(this);

    public bpq()
    {
        ar = false;
        as = false;
        at = false;
    }

    public static bpq a(String s)
    {
        bpq bpq1 = new bpq();
        Bundle bundle = new Bundle();
        bundle.putString("key_participant_id", s);
        bpq1.setArguments(bundle);
        return bpq1;
    }

    static gho a(bpq bpq1)
    {
        return bpq1.au;
    }

    static void b(bpq bpq1)
    {
        bpq1.q();
    }

    private void q()
    {
        if (as && !ar && !at)
        {
            at = true;
            bpd bpd1 = bnd.a().t();
            if (bpd1 != null)
            {
                bpd1.h(au.b());
            }
        }
    }

    public Dialog a(Bundle bundle)
    {
        au = bof.c().b(getArguments().getString("key_participant_id"));
        Object obj = getActivity();
        bundle = new android.app.AlertDialog.Builder(((android.content.Context) (obj)));
        Resources resources = ((Activity) (obj)).getResources();
        View view = View.inflate(((android.content.Context) (obj)), g.gb, null);
        bundle.setView(view);
        bundle.setPositiveButton(resources.getString(l.hJ), this);
        bundle.setNegativeButton(resources.getString(l.T), this);
        ap = (TextView)view.findViewById(h.bQ);
        aq = (TextView)view.findViewById(h.bU);
        g.a(ap, ((Activity) (obj)), resources, "https://support.google.com/plus/?hl=%locale%", "hangoutsabuse", l.cB);
        g.a(aq, ((Activity) (obj)), resources, "https://www.google.com/support/hangouts/?hl=%locale%", "blocking", l.cQ);
        ao = (CheckBox)view.findViewById(h.bR);
        an = (CheckBox)view.findViewById(h.bV);
        ao.setOnCheckedChangeListener(this);
        an.setOnCheckedChangeListener(this);
        ap.setVisibility(8);
        aq.setVisibility(8);
        ((TextView)view.findViewById(h.ci)).setText(Html.fromHtml(resources.getString(l.dz, new Object[] {
            au.c()
        })));
        ((TextView)view.findViewById(h.ch)).setText(Html.fromHtml(resources.getString(l.dy, new Object[] {
            au.c()
        })));
        obj = bnd.a().t();
        boolean flag;
        if ((ahk)hgx.b(getActivity().getApplicationContext(), ahk) != null)
        {
            flag = true;
        } else
        {
            flag = ((bpd) (obj)).j();
        }
        as = flag;
        if (!as)
        {
            ao.setVisibility(8);
        } else
        {
            bnd.a().t().i(au.b());
        }
        return bundle.create();
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (gmo)al.a(gmo);
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        int i;
        if (compoundbutton == ao)
        {
            compoundbutton = ap;
        } else
        {
            compoundbutton = aq;
        }
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
        dialoginterface = bnd.a().t();
        if (i == -1)
        {
            g.b(349);
            gfd.a().a(au);
            HangoutActivity hangoutactivity = (HangoutActivity)getActivity();
            if (an.isChecked())
            {
                g.b(263);
                g.a(hangoutactivity, dbf.e(aj.a()), au.c(), ((ghs)au).x(), null);
            }
            if (ao.isChecked())
            {
                g.b(651);
                dialoginterface.g(au.b());
                ar = true;
            }
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        q();
        super.onDismiss(dialoginterface);
    }

    public void onStart()
    {
        super.onStart();
        g.b(671);
        av.a(aw);
    }

    public void onStop()
    {
        super.onStop();
        av.b(aw);
    }
}
