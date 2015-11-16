// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public abstract class gmc extends ArrayAdapter
{

    public gmc(Context context, int i)
    {
        super(context, i);
    }

    public abstract Object a(int i, View view);

    public abstract void a(int i, Object obj);

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        gme gme1 = (gme)getItem(i);
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getContext()).inflate(gme1.b(), viewgroup, false);
            view1.setTag(a(i, view1));
        }
        a(i, view1.getTag());
        return view1;
    }

    public boolean isEnabled(int i)
    {
        return ((gme)getItem(i)).a();
    }
}
