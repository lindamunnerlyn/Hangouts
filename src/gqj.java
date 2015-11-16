// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public abstract class gqj extends ac
{

    private ListAdapter aj;

    public gqj()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(0);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aj = s();
        layoutinflater = layoutinflater.inflate(g.sk, viewgroup, false);
        viewgroup = (ListView)layoutinflater.findViewById(g.sf);
        viewgroup.setAdapter(aj);
        viewgroup.setOnItemClickListener(r());
        viewgroup = q();
        bundle = (TextView)layoutinflater.findViewById(g.sg);
        if (TextUtils.isEmpty(viewgroup))
        {
            bundle.setVisibility(8);
            return layoutinflater;
        } else
        {
            bundle.setText(viewgroup);
            bundle.setVisibility(0);
            return layoutinflater;
        }
    }

    public void onStart()
    {
        super.onStart();
        c().getWindow().setLayout(-1, -2);
        c().getWindow().setBackgroundDrawableResource(0x106000b);
        c().getWindow().setGravity(81);
        c().getWindow().setWindowAnimations(g.sn);
    }

    public abstract String q();

    public abstract android.widget.AdapterView.OnItemClickListener r();

    public abstract ListAdapter s();

    public ListAdapter t()
    {
        return aj;
    }
}
