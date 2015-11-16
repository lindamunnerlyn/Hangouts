// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;

public final class cix extends hmm
{

    private cic a;
    private aii b;
    private EditText c;
    private final TextWatcher d = new ciz(this);

    public cix()
    {
    }

    static hlt a(cix cix1)
    {
        return cix1.context;
    }

    static EditText b(cix cix1)
    {
        return cix1.c;
    }

    static aii c(cix cix1)
    {
        return cix1.b;
    }

    public void a(LayoutInflater layoutinflater, Toolbar toolbar)
    {
        toolbar.b("");
        toolbar.setPadding(toolbar.getPaddingLeft(), 0, toolbar.getPaddingRight(), 0);
        layoutinflater = (FrameLayout)layoutinflater.inflate(g.nK, toolbar, false);
        toolbar.addView(layoutinflater);
        c = (EditText)layoutinflater.findViewById(l.tU);
        c.addTextChangedListener(d);
        c.setOnFocusChangeListener(new ciy(this));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        setHasOptionsMenu(true);
        layoutinflater = layoutinflater.inflate(g.nJ, viewgroup, false);
        a = (cic)getChildFragmentManager().a(cic.getName());
        if (a == null)
        {
            a = new cic();
            getChildFragmentManager().a().a(l.tP, a, cic.getName()).b();
        }
        b = new aii();
        a.a(b);
        return layoutinflater;
    }
}
