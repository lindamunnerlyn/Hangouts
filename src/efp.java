// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;
import java.util.List;

final class efp extends ArrayAdapter
{

    final efo a;

    public efp(efo efo1, Context context, List list)
    {
        a = efo1;
        super(context, h.jc, list);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            view = LayoutInflater.from(getContext()).inflate(h.jc, viewgroup, false);
            viewgroup = new efq(this, (TextView)view.findViewById(n.r), (TextView)view.findViewById(n.q), (AvatarView)view.findViewById(n.o), (ImageView)view.findViewById(n.p));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (efq)view.getTag();
        }
        obj = (efm)getItem(i);
        ((efq) (viewgroup)).a.setText(((efm) (obj)).a);
        if (!TextUtils.isEmpty(((efm) (obj)).b))
        {
            ((efq) (viewgroup)).b.setText(((efm) (obj)).b);
            ((efq) (viewgroup)).b.setVisibility(0);
        } else
        {
            ((efq) (viewgroup)).b.setVisibility(8);
        }
        if (((efm) (obj)).d)
        {
            ((efq) (viewgroup)).c.a(((efm) (obj)).c, ((efm) (obj)).a, dcn.e(((gqu)efo.a(a).a(gqu)).a()));
            ((efq) (viewgroup)).c.setVisibility(0);
            ((efq) (viewgroup)).d.setVisibility(8);
            return view;
        }
        if (((efm) (obj)).e != 0)
        {
            obj = a.getResources().getDrawable(((efm) (obj)).e);
            i = a.getResources().getColor(g.qN);
            ((Drawable) (obj)).mutate().setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
            ((efq) (viewgroup)).d.setImageDrawable(((Drawable) (obj)));
            ((efq) (viewgroup)).d.setVisibility(0);
            ((efq) (viewgroup)).c.setVisibility(8);
            return view;
        } else
        {
            ((efq) (viewgroup)).c.setVisibility(8);
            ((efq) (viewgroup)).d.setVisibility(8);
            return view;
        }
    }
}
