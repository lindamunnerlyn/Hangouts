// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.permissions.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.Button;
import chz;
import cia;
import cib;
import cic;
import cio;
import cip;
import ciq;
import g;
import hgx;
import hhw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RationaleActivity extends hhw
{

    private final android.view.View.OnClickListener j = new cio(this);
    private chz m;
    private cia n;
    private final cib o = new cip(this);

    public RationaleActivity()
    {
    }

    public static Intent a(RationaleActivity rationaleactivity)
    {
        Intent intent = new Intent();
        intent.putExtra("original_request_code", rationaleactivity.getIntent().getIntExtra("original_request_code", 0));
        Object obj = (ArrayList)rationaleactivity.getIntent().getSerializableExtra("permissions");
        ArrayList arraylist = new ArrayList();
        String s;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new cic(s, rationaleactivity.m.a(s))))
        {
            s = (String)((Iterator) (obj)).next();
        }

        intent.putExtra("permission_results", new ArrayList(arraylist));
        return intent;
    }

    public static ciq a(Intent intent)
    {
        return new ciq(intent.getIntExtra("original_request_code", 0), (ArrayList)intent.getSerializableExtra("permission_results"));
    }

    public static cia b(RationaleActivity rationaleactivity)
    {
        return rationaleactivity.n;
    }

    private void b(int i)
    {
        Button button = (Button)findViewById(i);
        button.setAllCaps(true);
        button.setOnClickListener(j);
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        m = (chz)k.a(chz);
        n = (cia)k.a(cia);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.nP);
        bundle = (ViewStub)findViewById(g.nN);
        Intent intent = getIntent();
        bundle.setBackgroundColor(intent.getIntExtra("background_color_res", 0));
        bundle.setLayoutResource(intent.getIntExtra("layout_res", 0));
        bundle.inflate();
        b(g.nO);
        b(g.nK);
        n.a(g.nL, o);
    }
}
