// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import abg;
import abk;
import ai;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import aoa;
import aqn;
import aqs;
import cjf;
import dcn;
import dpn;
import edf;
import edq;
import eef;
import ehk;
import em;
import g;
import gdv;
import h;
import hlp;
import l;

public final class BabelPhotoViewFragment extends abg
    implements aqs
{

    private Drawable au;
    private aoa av;

    public BabelPhotoViewFragment()
    {
    }

    public static BabelPhotoViewFragment b(Intent intent, int i, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", intent);
        bundle.putInt("arg-position", i);
        bundle.putBoolean("arg-show-spinner", flag);
        intent = new BabelPhotoViewFragment();
        intent.setArguments(bundle);
        return intent;
    }

    private void v()
    {
        Object obj = new edq(a, av.a());
        ((edq) (obj)).c();
        obj = new aqn(((edq) (obj)), this, c.getStringExtra("content_type"), true, null);
        ((dpn)hlp.a(getActivity().getApplicationContext(), dpn)).c(((dor) (obj)));
    }

    public void a(eef eef, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        gdv.a("Expected null", edf);
        gdv.a("Expected null", eef);
        eef = getActivity();
        if (eef != null)
        {
            int i;
            if (flag)
            {
                i = l.rP;
            } else
            {
                i = l.rO;
            }
            Toast.makeText(eef, i, 0).show();
        }
    }

    public void a(em em1, abk abk1)
    {
        if (abk1.c == 0)
        {
            super.a(em1, abk1);
            if (em1.o() == 3)
            {
                au = abk1.a(getResources());
                if (au instanceof ehk)
                {
                    ((ehk)au).a();
                }
                em1 = getActivity();
                if (em1 != null)
                {
                    em1.q_();
                }
            }
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            if (i == 1)
            {
                if (j != -1)
                {
                    break label0;
                }
                v();
            }
            return;
        }
        Toast.makeText(getActivity(), l.rO, 0).show();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        bundle = getActivity();
        av = dcn.e(bundle.getIntent().getIntExtra("account_id", -1));
        if (av == null)
        {
            bundle.finish();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(g.hr, menu);
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a(em1, (abk)obj);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == h.fl && au != null)
        {
            if (((cjf)hlp.a(getActivity().getApplicationContext(), cjf)).a("android.permission.WRITE_EXTERNAL_STORAGE"))
            {
                v();
            } else
            {
                menuitem = new Intent(getContext(), com/google/android/apps/hangouts/fragments/BabelPhotoViewFragment$StoragePermissionHelperActivity);
                menuitem.putExtra("account_id", av.h());
                startActivityForResult(menuitem, 1);
            }
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        super.onPause();
        if (au != null && (au instanceof ehk))
        {
            ((ehk)au).b();
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu = menu.findItem(h.fl);
        boolean flag;
        if (au != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu.setVisible(flag);
    }

    public void onResume()
    {
        super.onResume();
        if (au != null && (au instanceof ehk))
        {
            ((ehk)au).a();
        }
    }
}
