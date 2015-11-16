// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import dci;
import dcj;
import dck;
import g;
import gng;
import h;
import hhg;

public class DebugOzGetMergedPersonActivity extends hhg
{

    public DebugOzGetMergedPersonActivity()
    {
        (new gng(this, b)).a(a);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fJ);
        bundle = (EditText)findViewById(h.eP);
        RadioGroup radiogroup = (RadioGroup)findViewById(h.eQ);
        ((RadioButton)findViewById(h.eA)).setOnClickListener(new dci(this, bundle));
        ((RadioButton)findViewById(h.bh)).setOnClickListener(new dcj(this, bundle));
        CheckBox checkbox = (CheckBox)findViewById(h.v);
        ((Button)findViewById(h.fI)).setOnClickListener(new dck(this, (TextView)findViewById(h.ft), radiogroup, bundle, checkbox));
    }
}
