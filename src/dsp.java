// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

final class dsp extends ArrayAdapter
{

    final dso a;
    private CharSequence b[];

    public dsp(dso dso1, Context context, int i, CharSequence acharsequence[], CharSequence acharsequence1[])
    {
        a = dso1;
        super(context, i, acharsequence);
        b = null;
        b = acharsequence1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = LayoutInflater.from(getContext()).inflate(g.hc, viewgroup, false);
        ((TextView)view.findViewById(h.bn)).setText(a.f()[i]);
        ((TextView)view.findViewById(h.bm)).setText(b[i]);
        return view;
    }
}
