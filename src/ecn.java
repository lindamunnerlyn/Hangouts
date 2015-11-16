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

final class ecn extends ArrayAdapter
{

    final ecm a;

    public ecn(ecm ecm1, Context context, List list)
    {
        a = ecm1;
        super(context, h.je, list);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            view = LayoutInflater.from(getContext()).inflate(h.je, viewgroup, false);
            viewgroup = new eco(this, (TextView)view.findViewById(n.r), (TextView)view.findViewById(n.q), (AvatarView)view.findViewById(n.o), (ImageView)view.findViewById(n.p));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (eco)view.getTag();
        }
        obj = (eck)getItem(i);
        ((eco) (viewgroup)).a.setText(((eck) (obj)).a);
        if (!TextUtils.isEmpty(((eck) (obj)).b))
        {
            ((eco) (viewgroup)).b.setText(((eck) (obj)).b);
            ((eco) (viewgroup)).b.setVisibility(0);
        } else
        {
            ((eco) (viewgroup)).b.setVisibility(8);
        }
        if (((eck) (obj)).d)
        {
            ((eco) (viewgroup)).c.a(((eck) (obj)).c, ((eck) (obj)).a, dbf.e(((gmo)ecm.a(a).a(gmo)).a()));
            ((eco) (viewgroup)).c.setVisibility(0);
            ((eco) (viewgroup)).d.setVisibility(8);
            return view;
        }
        if (((eck) (obj)).e != 0)
        {
            obj = a.getResources().getDrawable(((eck) (obj)).e);
            i = a.getResources().getColor(g.qL);
            ((Drawable) (obj)).mutate().setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
            ((eco) (viewgroup)).d.setImageDrawable(((Drawable) (obj)));
            ((eco) (viewgroup)).d.setVisibility(0);
            ((eco) (viewgroup)).c.setVisibility(8);
            return view;
        } else
        {
            ((eco) (viewgroup)).c.setVisibility(8);
            ((eco) (viewgroup)).d.setVisibility(8);
            return view;
        }
    }
}
