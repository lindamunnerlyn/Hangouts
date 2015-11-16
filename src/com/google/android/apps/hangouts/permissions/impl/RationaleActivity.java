// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.permissions.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.Button;
import cjf;
import cjg;
import cjh;
import cji;
import cju;
import cjv;
import g;
import hlp;
import hmo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RationaleActivity extends hmo
{

    public cjg j;
    private final android.view.View.OnClickListener m = new cju(this);
    private cjf n;
    private final cjh o = new cjv(this);

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
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new cji(s, rationaleactivity.n.a(s))))
        {
            s = (String)((Iterator) (obj)).next();
        }

        intent.putExtra("permission_results", new ArrayList(arraylist));
        return intent;
    }

    private void b(int i)
    {
        Button button = (Button)findViewById(i);
        button.setAllCaps(true);
        button.setOnClickListener(m);
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        n = (cjf)k.a(cjf);
        j = (cjg)k.a(cjg);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.nR);
        bundle = (ViewStub)findViewById(g.nP);
        Intent intent = getIntent();
        bundle.setBackgroundColor(intent.getIntExtra("background_color_res", 0));
        bundle.setLayoutResource(intent.getIntExtra("layout_res", 0));
        bundle.inflate();
        b(g.nQ);
        b(g.nM);
        j.a(g.nN, o);
    }
}
