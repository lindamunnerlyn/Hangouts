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
import apw;
import aqb;
import atg;
import azo;
import azp;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import eab;
import ebh;
import ebw;
import eei;
import g;
import gmo;
import gng;
import hgx;
import hhj;
import po;

public class PreviewImageActivity extends hhj
    implements aqb
{

    public Boolean j;
    private View k;
    private ImageView l;
    private atg m;
    private final gmo n;

    public PreviewImageActivity()
    {
        n = (new gng(this, q)).a(p);
    }

    public static atg a(PreviewImageActivity previewimageactivity, atg atg1)
    {
        previewimageactivity.m = atg1;
        return atg1;
    }

    public static hgx a(PreviewImageActivity previewimageactivity)
    {
        return previewimageactivity.p;
    }

    public static atg b(PreviewImageActivity previewimageactivity)
    {
        return previewimageactivity.m;
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw, boolean flag1)
    {
        if (flag)
        {
            l.setVisibility(0);
            if (eab != null)
            {
                m.d = "image/gif";
                eab = new eei(eab);
                l.setImageDrawable(eab);
                eab.a();
            } else
            {
                l.setImageBitmap(ebh1.e());
            }
            if (ebh1 != null)
            {
                ebh1.b();
            }
            k.setVisibility(0);
            return;
        } else
        {
            Toast.makeText(this, getString(g.kE), 1).show();
            setResult(0, getIntent());
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.kC);
        bundle = (Toolbar)findViewById(g.kw);
        a(bundle);
        Object obj;
        try
        {
            g().a(true);
        }
        catch (NullPointerException nullpointerexception)
        {
            ebw.d("PreviewImage", "Experienced NPE while setting up action bar. ", nullpointerexception);
        }
        g().a();
        setTitle("");
        bundle.bringToFront();
        bundle = getIntent();
        obj = bundle.getStringExtra("photo_url");
        j = Boolean.valueOf(bundle.getBooleanExtra("is_video", false));
        obj = Uri.parse(((String) (obj)));
        bundle = String.valueOf(((Uri) (obj)).toString());
        if (bundle.length() != 0)
        {
            bundle = "Starting preview for: ".concat(bundle);
        } else
        {
            bundle = new String("Starting preview for: ");
        }
        ebw.e("PreviewImage", bundle);
        k = findViewById(g.kz);
        k.bringToFront();
        k.setVisibility(8);
        (new azp(this, this, n.a(), ((Uri) (obj)))).execute(new Void[0]);
        l = (ImageView)findViewById(g.kx);
        l.setVisibility(8);
        ((FloatingActionButton)findViewById(g.ky)).setOnClickListener(new azo(this));
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
