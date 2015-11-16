// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

final class dpw extends ArrayAdapter
{

    final dpv a;
    private CharSequence b[];

    public dpw(dpv dpv1, Context context, int i, CharSequence acharsequence[], CharSequence acharsequence1[])
    {
        a = dpv1;
        super(context, i, acharsequence);
        b = null;
        b = acharsequence1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = LayoutInflater.from(getContext()).inflate(g.hk, viewgroup, false);
        ((TextView)view.findViewById(h.bt)).setText(a.f()[i]);
        ((TextView)view.findViewById(h.bs)).setText(b[i]);
        return view;
    }
}
