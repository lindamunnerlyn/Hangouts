// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.conversation.v2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import aqn;
import aqs;
import atx;
import bad;
import bae;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import edf;
import eef;
import eev;
import ehk;
import g;
import gqu;
import grn;
import hmb;
import pq;

public class PreviewImageActivity extends hmb
    implements aqs
{

    public atx j;
    public Boolean k;
    private View l;
    private ImageView m;
    private final gqu n;

    public PreviewImageActivity()
    {
        n = (new grn(this, r)).a(q);
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn, boolean flag1)
    {
        if (flag)
        {
            m.setVisibility(0);
            if (edf != null)
            {
                j.d = "image/gif";
                edf = new ehk(edf);
                m.setImageDrawable(edf);
                edf.a();
            } else
            {
                m.setImageBitmap(eef1.e());
            }
            if (eef1 != null)
            {
                eef1.b();
            }
            l.setVisibility(0);
            return;
        } else
        {
            Toast.makeText(this, getString(g.kx), 0).show();
            setResult(0, getIntent());
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.kv);
        bundle = (Toolbar)findViewById(g.kp);
        a(bundle);
        g().a(true);
        g().a();
        setTitle("");
        bundle.bringToFront();
        bundle = getIntent();
        Object obj = bundle.getStringExtra("photo_url");
        k = Boolean.valueOf(bundle.getBooleanExtra("is_video", false));
        obj = Uri.parse(((String) (obj)));
        bundle = String.valueOf(((Uri) (obj)).toString());
        if (bundle.length() != 0)
        {
            bundle = "Starting preview for: ".concat(bundle);
        } else
        {
            bundle = new String("Starting preview for: ");
        }
        eev.e("PreviewImage", bundle);
        l = findViewById(g.ks);
        l.bringToFront();
        l.setVisibility(8);
        (new bae(this, this, n.a(), ((Uri) (obj)))).execute(new Void[0]);
        m = (ImageView)findViewById(g.kq);
        m.setVisibility(8);
        ((FloatingActionButton)findViewById(g.kr)).setOnClickListener(new bad(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            super.onBackPressed();
            break;
        }
        return true;
    }
}
