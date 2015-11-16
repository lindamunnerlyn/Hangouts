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

public final class bml extends ac
{

    public bml()
    {
    }

    public Dialog a(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(g.gV, null);
        ListView listview = (ListView)view.findViewById(h.bF);
        Resources resources = getActivity().getResources();
        String s = dul.a(dul.b());
        ArrayList arraylist = new ArrayList();
        arraylist.add(resources.getString(l.aE));
        arraylist.add(resources.getString(l.aK, new Object[] {
            s
        }));
        arraylist.add(resources.getString(l.x, new Object[] {
            s
        }));
        listview.setAdapter(new bmm(this, getActivity(), arraylist));
        bundle.setTitle(l.jT).setView(view);
        return bundle.create();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        ((bmk)getTargetFragment()).getActivity().finish();
    }
}
