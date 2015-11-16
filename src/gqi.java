// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public abstract class gqi extends ArrayAdapter
{

    public gqi(Context context, int i)
    {
        super(context, i);
    }

    public abstract Object a(int i, View view);

    public abstract void a(int i, Object obj);

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        gqk gqk1 = (gqk)getItem(i);
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getContext()).inflate(gqk1.b(), viewgroup, false);
            view1.setTag(a(i, view1));
        }
        a(i, view1.getTag());
        return view1;
    }

    public boolean isEnabled(int i)
    {
        return ((gqk)getItem(i)).a();
    }
}
