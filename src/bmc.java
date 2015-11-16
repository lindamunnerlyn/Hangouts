// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public final class bmc extends ac
{

    public bmc()
    {
    }

    public static bmc q()
    {
        return new bmc();
    }

    public Dialog a(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(g.hd, null);
        ListView listview = (ListView)view.findViewById(h.bM);
        Resources resources = getActivity().getResources();
        String s = drs.a(drs.b());
        ArrayList arraylist = new ArrayList();
        arraylist.add(resources.getString(l.aK));
        arraylist.add(resources.getString(l.aQ, new Object[] {
            s
        }));
        arraylist.add(resources.getString(l.A, new Object[] {
            s
        }));
        listview.setAdapter(new bmd(this, getActivity(), arraylist));
        bundle.setTitle(l.kA).setView(view);
        return bundle.create();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        ((bmb)getTargetFragment()).getActivity().finish();
    }
}
