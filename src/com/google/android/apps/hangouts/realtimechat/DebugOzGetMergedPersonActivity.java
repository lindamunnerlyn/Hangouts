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
import ddq;
import ddr;
import dds;
import g;
import grn;
import h;
import hly;

public class DebugOzGetMergedPersonActivity extends hly
{

    public DebugOzGetMergedPersonActivity()
    {
        (new grn(this, b)).a(a);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fH);
        bundle = (EditText)findViewById(h.ex);
        RadioGroup radiogroup = (RadioGroup)findViewById(h.ey);
        ((RadioButton)findViewById(h.ej)).setOnClickListener(new ddq(this, bundle));
        ((RadioButton)findViewById(h.bb)).setOnClickListener(new ddr(this, bundle));
        CheckBox checkbox = (CheckBox)findViewById(h.v);
        ((Button)findViewById(h.fq)).setOnClickListener(new dds(this, (TextView)findViewById(h.fb), radiogroup, bundle, checkbox));
    }
}
