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

public final class chr extends hhu
{

    private cgw a;
    private aip b;
    private EditText c;
    private final TextWatcher d = new cht(this);

    public chr()
    {
    }

    static hhb a(chr chr1)
    {
        return chr1.context;
    }

    static EditText b(chr chr1)
    {
        return chr1.c;
    }

    static aip c(chr chr1)
    {
        return chr1.b;
    }

    public void a(LayoutInflater layoutinflater, Toolbar toolbar)
    {
        toolbar.b("");
        toolbar.setPadding(toolbar.getPaddingLeft(), 0, toolbar.getPaddingRight(), 0);
        layoutinflater = (FrameLayout)layoutinflater.inflate(g.nI, toolbar, false);
        toolbar.addView(layoutinflater);
        c = (EditText)layoutinflater.findViewById(l.uD);
        c.addTextChangedListener(d);
        c.setOnFocusChangeListener(new chs(this));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        setHasOptionsMenu(true);
        layoutinflater = layoutinflater.inflate(g.nH, viewgroup, false);
        a = (cgw)getChildFragmentManager().a(cgw.getName());
        if (a == null)
        {
            a = new cgw();
            getChildFragmentManager().a().a(l.uy, a, cgw.getName()).b();
        }
        b = new aip();
        a.a(b);
        return layoutinflater;
    }
}
