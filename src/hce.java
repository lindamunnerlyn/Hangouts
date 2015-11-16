// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public final class hce extends hmk
    implements android.content.DialogInterface.OnClickListener
{

    private hbi aj;
    private gqz an;
    private itd ao;

    public hce()
    {
    }

    public static void a(ap ap, String s, int ai[], boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putIntArray("account_ids", ai);
        bundle.putBoolean("add_account_enabled", flag);
        s = new hce();
        s.setArguments(bundle);
        s.a(ap, "account.selector");
    }

    public Dialog a(Bundle bundle)
    {
        ContextThemeWrapper contextthemewrapper = new ContextThemeWrapper(getActivity(), g.tt);
        bundle = getArguments();
        String s = bundle.getString("title");
        int ai[] = bundle.getIntArray("account_ids");
        boolean flag = bundle.getBoolean("add_account_enabled");
        bundle = this;
        if (ao != null)
        {
            bundle = ao.a(this, "AccountSelection");
        }
        return (new android.app.AlertDialog.Builder(contextthemewrapper)).setTitle(s).setAdapter(new hcd(contextthemewrapper, ai, flag), bundle).setCancelable(false).create();
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (hbi)al.a(hbi);
        an = (gqz)al.a(gqz);
        ao = (itd)al.b(itd);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        aj.c();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        int ai[] = getArguments().getIntArray("account_ids");
        boolean flag1 = getArguments().getBoolean("add_account_enabled");
        dialoginterface = (hbi)al.a(hbi);
        boolean flag;
        if (flag1 && i == ai.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            i = ai[i];
            if (!an.c(i))
            {
                dialoginterface.c();
                return;
            } else
            {
                grb grb1 = an.a(i);
                dialoginterface.a(grb1.b("account_name"), grb1.b("effective_gaia_id"));
                return;
            }
        } else
        {
            dialoginterface.b();
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        Object obj = c();
        if (obj == null)
        {
            return;
        }
        Resources resources = getResources();
        ((AlertDialog)obj).getListView().setDivider(null);
        ((Dialog) (obj)).findViewById(resources.getIdentifier("titleDivider", "id", "android")).setVisibility(8);
        obj = ((Dialog) (obj)).findViewById(resources.getIdentifier("title_template", "id", "android"));
        ((View) (obj)).setBackgroundColor(resources.getColor(h.jp));
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
        int i;
        int j;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            j = layoutparams.getMarginStart();
            i = layoutparams.getMarginEnd();
            layoutparams.setMarginStart(0);
            layoutparams.setMarginEnd(0);
        } else
        {
            j = layoutparams.leftMargin;
            i = layoutparams.rightMargin;
            layoutparams.setMargins(0, layoutparams.topMargin, 0, layoutparams.bottomMargin);
        }
        ((View) (obj)).setLayoutParams(layoutparams);
        ((View) (obj)).setPadding(j, ((View) (obj)).getPaddingTop(), i, ((View) (obj)).getPaddingBottom());
        i = resources.getIdentifier("alertTitle", "id", "android");
        ((TextView)c().findViewById(i)).setTypeface(null, 1);
    }
}
