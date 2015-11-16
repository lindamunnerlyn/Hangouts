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

public final class bnx extends ac
    implements android.content.DialogInterface.OnClickListener
{

    private gho aj;
    private final bof ak = bof.a();
    private final bnd al = bnd.a();
    private final bny am = new bny(this);

    public bnx()
    {
    }

    public static bnx a(String s)
    {
        bnx bnx1 = new bnx();
        Bundle bundle = new Bundle();
        bundle.putString("key_participant_id", s);
        bnx1.setArguments(bundle);
        return bnx1;
    }

    static gho a(bnx bnx1)
    {
        return bnx1.aj;
    }

    public Dialog a(Bundle bundle)
    {
        aj = bof.c().b(getArguments().getString("key_participant_id"));
        Object obj = getActivity();
        bundle = new android.app.AlertDialog.Builder(((android.content.Context) (obj)));
        Resources resources = ((Activity) (obj)).getResources();
        obj = View.inflate(((android.content.Context) (obj)), g.fX, null);
        bundle.setView(((View) (obj)));
        bundle.setPositiveButton(resources.getString(l.hJ), this);
        bundle.setNegativeButton(resources.getString(l.T), this);
        ((TextView)((View) (obj)).findViewById(h.cc)).setText(Html.fromHtml(resources.getString(l.cY, new Object[] {
            aj.c()
        })));
        ((TextView)((View) (obj)).findViewById(h.cb)).setText(Html.fromHtml(resources.getString(l.cX, new Object[] {
            aj.c()
        })));
        bnd.a();
        return bundle.create();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        bnd.a();
        if (i == -1)
        {
            al.c(aj.a());
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
    }

    public void onStart()
    {
        super.onStart();
        al.a(am);
    }

    public void onStop()
    {
        super.onStop();
        al.b(am);
    }
}
