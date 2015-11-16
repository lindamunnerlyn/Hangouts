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

public final class eba extends ad
{

    private eaj a;
    private int b[];

    public eba()
    {
    }

    static int a(eba eba1)
    {
        int i = -1;
        int j = b(eba1.getView());
        if (j != -1)
        {
            i = eba1.b[j];
        }
        return i;
    }

    public static eba a()
    {
        return new eba();
    }

    private static void a(View view)
    {
        Button button = (Button)view.findViewById(g.pV);
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

    static void a(eba eba1, View view)
    {
        a(view);
    }

    private static int b(View view)
    {
        return ((ListView)view.findViewById(0x102000a)).getCheckedItemPosition();
    }

    static eaj b(eba eba1)
    {
        return eba1.a;
    }

    private String[] b()
    {
        String as[] = new String[b.length];
        for (int i = 0; i < b.length; i++)
        {
            as[i] = dcn.a(getActivity(), b[i]);
        }

        return as;
    }

    static ebe c(eba eba1)
    {
        return (ebe)((ebv)eba1.getActivity()).g();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i = 0;
        a = eaj.a(getActivity());
        b = eaj.a();
        layoutinflater = layoutinflater.inflate(g.pW, viewgroup, false);
        viewgroup = (ListView)layoutinflater.findViewById(0x102000a);
        viewgroup.setAdapter(new ArrayAdapter(getActivity(), g.pY, b()));
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
                viewgroup.setOnItemClickListener(new ebb(this));
                viewgroup = (Button)layoutinflater.findViewById(g.pV);
                viewgroup.setText(getActivity().getString(g.qb));
                viewgroup.setOnClickListener(new ebc(this));
                a(layoutinflater);
                ((Button)layoutinflater.findViewById(g.pU)).setOnClickListener(new ebd(this));
                return layoutinflater;
            }
            i++;
        } while (true);
    }
}
