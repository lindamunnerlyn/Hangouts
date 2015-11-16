// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

final class bdl extends ArrayAdapter
{

    final bdg a;

    public bdl(bdg bdg1, ArrayList arraylist)
    {
        a = bdg1;
        super(bdg1.getActivity(), 0, arraylist);
    }

    static void a(ImageView imageview, bdk bdk1)
    {
        if (bdk1.d.b != null)
        {
            imageview.setImageBitmap(bdk1.d.b.e());
            imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else
        if (bdk1.d.a != null)
        {
            imageview.setImageDrawable(bdk1.d.a);
            imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            bdk1.d.a.a();
        } else
        {
            bdk1 = String.valueOf(bdk1.a);
            if (bdk1.length() != 0)
            {
                bdk1 = "No cache item set:".concat(bdk1);
            } else
            {
                bdk1 = new String("No cache item set:");
            }
            gdv.a(bdk1);
        }
        imageview.setAlpha(0.0F);
        imageview.animate().alpha(1.0F).setDuration(250L).start();
    }

    public void a()
    {
        for (int i = 0; i < getCount(); i++)
        {
            bdk bdk1 = (bdk)getItem(i);
            if (bdk1 != null && bdk1.d != null)
            {
                bdk1.d.a();
                bdk1.d = null;
            }
        }

    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
label0:
        {
            view1 = view;
            if (view == null)
            {
                view1 = a.getActivity().getLayoutInflater().inflate(g.lp, viewgroup, false);
            }
            view = (bdk)getItem(i);
            viewgroup = (ImageView)view1.findViewById(h.hi);
            if (i != g.a((Integer)viewgroup.getTag(), -1))
            {
                viewgroup.setTag(Integer.valueOf(i));
                viewgroup.setContentDescription(bdr.b(a.getResources(), ((bdk) (view)).a));
                if (((bdk) (view)).d == null)
                {
                    break label0;
                }
                a(viewgroup, view);
            }
            return view1;
        }
        viewgroup.setImageResource(g.lk);
        viewgroup.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        viewgroup.setAlpha(0.2F);
        int j = a.getActivity().getResources().getInteger(g.lm);
        edq edq1 = (new edq(((bdk) (view)).b, null)).b(j, j).a(bdg.a(a));
        edq1.b(((bdk) (view)).a);
        view = new arr(((gqu)bdg.b(a).a(gqu)).a(), edq1, ((bdk) (view)).c, new bdm(this, view, i), viewgroup);
        ((dpn)bdg.c(a).a(dpn)).a(view);
        return view1;
    }
}
