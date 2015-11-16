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
import android.widget.TextView;

public final class bog extends ac
    implements android.content.DialogInterface.OnClickListener
{

    private gmt aj;
    private final bnk ak = bnk.a();
    private final boh al = new boh(this);

    public bog()
    {
    }

    public static bog a(String s)
    {
        bog bog1 = new bog();
        Bundle bundle = new Bundle();
        bundle.putString("key_participant_id", s);
        bog1.setArguments(bundle);
        return bog1;
    }

    static gmt a(bog bog1)
    {
        return bog1.aj;
    }

    public Dialog a(Bundle bundle)
    {
        aj = ak.a(getArguments().getString("key_participant_id"));
        Object obj = getActivity();
        bundle = new android.app.AlertDialog.Builder(((android.content.Context) (obj)));
        Resources resources = ((Activity) (obj)).getResources();
        obj = View.inflate(((android.content.Context) (obj)), g.fT, null);
        bundle.setView(((View) (obj)));
        bundle.setPositiveButton(resources.getString(l.hd), this);
        bundle.setNegativeButton(resources.getString(l.Q), this);
        ((TextView)((View) (obj)).findViewById(h.bS)).setText(Html.fromHtml(resources.getString(l.cH, new Object[] {
            aj.b()
        })));
        ((TextView)((View) (obj)).findViewById(h.bR)).setText(Html.fromHtml(resources.getString(l.cG, new Object[] {
            aj.b()
        })));
        bnk.a();
        return bundle.create();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        bnk.a();
        if (i == -1)
        {
            ak.d(aj.a());
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
    }

    public void onStart()
    {
        super.onStart();
        ak.a(al);
    }

    public void onStop()
    {
        super.onStop();
        ak.b(al);
    }
}
