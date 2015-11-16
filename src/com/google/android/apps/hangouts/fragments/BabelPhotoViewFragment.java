// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments;

import abe;
import abi;
import ai;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import ani;
import apw;
import aqb;
import chz;
import dbf;
import dmt;
import eab;
import eam;
import ebh;
import eei;
import em;
import g;
import gbh;
import h;
import hgx;
import l;

public final class BabelPhotoViewFragment extends abe
    implements aqb
{

    private Drawable au;
    private ani av;

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
        Object obj = new eam(a, av.a());
        ((eam) (obj)).c();
        obj = new apw(((eam) (obj)), this, c.getStringExtra("content_type"), true, null);
        ((dmt)hgx.a(getActivity().getApplicationContext(), dmt)).c(((dlt) (obj)));
    }

    public void a(ebh ebh, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        gbh.a(eab);
        gbh.a(ebh);
        ebh = getActivity();
        if (ebh != null)
        {
            int i;
            if (flag)
            {
                i = l.sw;
            } else
            {
                i = l.sv;
            }
            Toast.makeText(ebh, i, 0).show();
        }
    }

    public void a(em em1, abi abi1)
    {
        if (abi1.c == 0)
        {
            super.a(em1, abi1);
            if (em1.o() == 3)
            {
                au = abi1.a(getResources());
                if (au instanceof eei)
                {
                    ((eei)au).a();
                }
                em1 = getActivity();
                if (em1 != null)
                {
                    em1.p_();
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
        Toast.makeText(getActivity(), l.sv, 0).show();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        bundle = getActivity();
        av = dbf.e(bundle.getIntent().getIntExtra("account_id", -1));
        if (av == null)
        {
            bundle.finish();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(g.hz, menu);
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a(em1, (abi)obj);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == h.fD && au != null)
        {
            if (((chz)hgx.a(getActivity().getApplicationContext(), chz)).a("android.permission.WRITE_EXTERNAL_STORAGE"))
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
        if (au != null && (au instanceof eei))
        {
            ((eei)au).b();
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu = menu.findItem(h.fD);
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
        if (au != null && (au instanceof eei))
        {
            ((eei)au).a();
        }
    }
}
