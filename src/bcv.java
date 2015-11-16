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

final class bcv extends ArrayAdapter
{

    final bcq a;

    public bcv(bcq bcq1, ArrayList arraylist)
    {
        a = bcq1;
        super(bcq1.getActivity(), 0, arraylist);
    }

    static void a(ImageView imageview, bcu bcu1)
    {
        b(imageview, bcu1);
    }

    private static void b(ImageView imageview, bcu bcu1)
    {
        if (bcu1.d.b != null)
        {
            imageview.setImageBitmap(bcu1.d.b.e());
            imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else
        if (bcu1.d.a != null)
        {
            imageview.setImageDrawable(bcu1.d.a);
            imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            bcu1.d.a.a();
        } else
        {
            bcu1 = String.valueOf(bcu1.a);
            if (bcu1.length() != 0)
            {
                bcu1 = "No cache item set:".concat(bcu1);
            } else
            {
                bcu1 = new String("No cache item set:");
            }
            gbh.a(bcu1);
        }
        imageview.setAlpha(0.0F);
        imageview.animate().alpha(1.0F).setDuration(250L).start();
    }

    public void a()
    {
        for (int i = 0; i < getCount(); i++)
        {
            bcu bcu1 = (bcu)getItem(i);
            if (bcu1 != null && bcu1.d != null)
            {
                bcu1.d.a();
                bcu1.d = null;
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
                view1 = a.getActivity().getLayoutInflater().inflate(g.lx, viewgroup, false);
            }
            view = (bcu)getItem(i);
            viewgroup = (ImageView)view1.findViewById(h.hC);
            if (i != g.a((Integer)viewgroup.getTag(), -1))
            {
                viewgroup.setTag(Integer.valueOf(i));
                viewgroup.setContentDescription(bdb.b(a.getResources(), ((bcu) (view)).a));
                if (((bcu) (view)).d == null)
                {
                    break label0;
                }
                b(viewgroup, view);
            }
            return view1;
        }
        viewgroup.setImageResource(g.ls);
        viewgroup.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        viewgroup.setAlpha(0.2F);
        int j = a.getActivity().getResources().getInteger(g.lu);
        eam eam1 = (new eam(((bcu) (view)).b, null)).b(j, j).a(bcq.a(a));
        eam1.b(((bcu) (view)).a);
        view = new ara(((gmo)bcq.b(a).a(gmo)).a(), eam1, ((bcu) (view)).c, new bcw(this, view, i), viewgroup);
        ((dmt)bcq.c(a).a(dmt)).a(view);
        return view1;
    }
}
