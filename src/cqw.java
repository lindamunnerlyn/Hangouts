// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import com.google.android.apps.hangouts.promo.AnnouncingRelativeLayout;

public abstract class cqw extends hhu
{

    private int a;
    private int b[];
    private android.view.View.OnClickListener c;

    public cqw(int i, int ai[])
    {
        c = new cqy(this);
        a = i;
        b = ai;
    }

    public abstract String a();

    public void a(int i)
    {
        ((cqz)getActivity()).g();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i = 0;
        layoutinflater = layoutinflater.inflate(g.os, viewgroup, false);
        ((AnnouncingRelativeLayout)layoutinflater.findViewById(g.or)).a(a());
        viewgroup = (ViewStub)layoutinflater.findViewById(g.oq);
        viewgroup.setLayoutResource(a);
        viewgroup.inflate();
        if (b != null)
        {
            viewgroup = (ViewStub)layoutinflater.findViewById(g.op);
            if (b.length == 1)
            {
                viewgroup.setLayoutResource(g.ot);
            } else
            {
                viewgroup.setLayoutResource(g.ou);
            }
            viewgroup = viewgroup.inflate();
            bundle = b;
            for (int j = bundle.length; i < j; i++)
            {
                Button button = (Button)viewgroup.findViewById(bundle[i]);
                button.setOnClickListener(c);
                button.setAllCaps(true);
            }

        }
        kb.c(layoutinflater, 1);
        layoutinflater.addOnAttachStateChangeListener(new cqx(this));
        return layoutinflater;
    }
}
