// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public final class dxq extends ad
{

    private dwz a;
    private int b[];

    public dxq()
    {
    }

    static int a(dxq dxq1)
    {
        int i = -1;
        int j = b(dxq1.getView());
        if (j != -1)
        {
            i = dxq1.b[j];
        }
        return i;
    }

    public static dxq a()
    {
        return new dxq();
    }

    private static void a(View view)
    {
        Button button = (Button)view.findViewById(g.pT);
        boolean flag;
        if (b(view) != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
    }

    static void a(dxq dxq1, View view)
    {
        a(view);
    }

    private static int b(View view)
    {
        return ((ListView)view.findViewById(0x102000a)).getCheckedItemPosition();
    }

    static dwz b(dxq dxq1)
    {
        return dxq1.a;
    }

    private String[] b()
    {
        String as[] = new String[b.length];
        for (int i = 0; i < b.length; i++)
        {
            as[i] = dbf.a(getActivity(), b[i]);
        }

        return as;
    }

    static dxu c(dxq dxq1)
    {
        return (dxu)((dyk)dxq1.getActivity()).g();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i = 0;
        a = dwz.a(getActivity());
        b = dwz.a();
        layoutinflater = layoutinflater.inflate(g.pU, viewgroup, false);
        viewgroup = (ListView)layoutinflater.findViewById(0x102000a);
        viewgroup.setAdapter(new ArrayAdapter(getActivity(), g.pW, b()));
        int j = a.b();
        do
        {
label0:
            {
                if (i < b.length)
                {
                    if (b[i] != j)
                    {
                        break label0;
                    }
                    viewgroup.setItemChecked(i, true);
                }
                viewgroup.setOnItemClickListener(new dxr(this));
                viewgroup = (Button)layoutinflater.findViewById(g.pT);
                viewgroup.setText(getActivity().getString(g.pZ));
                viewgroup.setOnClickListener(new dxs(this));
                a(layoutinflater);
                ((Button)layoutinflater.findViewById(g.pS)).setOnClickListener(new dxt(this));
                return layoutinflater;
            }
            i++;
        } while (true);
    }
}
