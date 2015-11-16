// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

public final class bjl extends ac
{

    private String aj[];
    private String ak;

    public bjl()
    {
    }

    public static bjl a(String as[], String s)
    {
        bjl bjl1 = new bjl();
        Bundle bundle = new Bundle();
        bundle.putSerializable("dump_files", as);
        bundle.putString("action", s);
        bjl1.setArguments(bundle);
        return bjl1;
    }

    static String a(bjl bjl1)
    {
        return bjl1.ak;
    }

    static void a(bjl bjl1, String s)
    {
        Resources resources = bjl1.getResources();
        Object obj = String.valueOf(Environment.getExternalStorageDirectory());
        s = (new StringBuilder(String.valueOf(obj).length() + 8 + String.valueOf(s).length())).append("file://").append(((String) (obj))).append("/").append(s).toString();
        obj = new Intent("android.intent.action.SEND");
        ((Intent) (obj)).setType("application/octet-stream");
        ((Intent) (obj)).putExtra("android.intent.extra.STREAM", Uri.parse(s));
        ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", resources.getString(l.bF));
        bjl1.getActivity().startActivity(Intent.createChooser(((Intent) (obj)), resources.getString(l.bE)));
    }

    public Dialog a(Bundle bundle)
    {
        android.app.AlertDialog.Builder builder;
        Resources resources;
        bundle = getArguments();
        aj = (String[])bundle.getSerializable("dump_files");
        ak = bundle.getString("action");
        bundle = getActivity().getLayoutInflater().inflate(g.fI, null);
        ((ListView)bundle.findViewById(h.aW)).setAdapter(new bjm(this, getActivity(), aj));
        builder = new android.app.AlertDialog.Builder(getActivity());
        resources = getResources();
        if (!"load".equals(ak)) goto _L2; else goto _L1
_L1:
        builder.setTitle(resources.getString(l.ff));
_L4:
        builder.setView(bundle);
        return builder.create();
_L2:
        if ("email".equals(ak))
        {
            builder.setTitle(resources.getString(l.bG));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
