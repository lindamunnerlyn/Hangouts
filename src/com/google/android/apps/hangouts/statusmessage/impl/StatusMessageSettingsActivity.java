// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.statusmessage.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import dvx;
import dwb;
import hpe;
import irm;
import irn;
import iro;
import irp;
import irs;
import isb;
import isj;
import isv;

public final class StatusMessageSettingsActivity extends hpe
    implements irm
{

    private dvx j;
    private volatile irn k;
    private volatile dwb m;
    private final Object n = new Object();
    private final isv o = new isv(this);
    private boolean p;

    public StatusMessageSettingsActivity()
    {
    }

    private void g()
    {
        if (m != null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        Object obj = n;
        obj;
        JVM INSTR monitorenter ;
        irn irn1;
        if (m != null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        irn1 = k;
        if (irn1 != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        k = (irn)((iro)((irm)getApplication()).a()).a(new irs(this));
        ((isb)k).a().a();
        m = (dwb)((irn)k).c();
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ((Throwable) (obj1)));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private dwb h()
    {
        g();
        return m;
    }

    public Object a()
    {
        return h();
    }

    protected boolean a(View view, Menu menu)
    {
        return super.a(view, menu);
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
    }

    protected void b_()
    {
        super.b_();
    }

    public LayoutInflater getLayoutInflater()
    {
        LayoutInflater layoutinflater = super.getLayoutInflater();
        if (m == null)
        {
            return layoutinflater;
        } else
        {
            return layoutinflater.cloneInContext(new irp(layoutinflater.getContext(), k));
        }
    }

    protected void onActivityResult(int i, int l, Intent intent)
    {
        super.onActivityResult(i, l, intent);
    }

    protected void onApplyThemeResource(android.content.res.Resources.Theme theme, int i, boolean flag)
    {
        super.onApplyThemeResource(theme, i, flag);
    }

    protected void onChildTitleChanged(Activity activity, CharSequence charsequence)
    {
        super.onChildTitleChanged(activity, charsequence);
    }

    protected void onCreate(Bundle bundle)
    {
        p = true;
        o.a();
        g();
        super.onCreate(bundle);
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (!p)
        {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        break MISSING_BLOCK_LABEL_55;
        bundle;
        o.b();
        throw bundle;
        g();
        j = k.b();
        j.a();
        o.b();
        p = false;
        return;
    }

    protected Dialog onCreateDialog(int i)
    {
        return super.onCreateDialog(i);
    }

    protected Dialog onCreateDialog(int i, Bundle bundle)
    {
        return super.onCreateDialog(i, bundle);
    }

    protected void onDestroy()
    {
        o.m();
        super.onDestroy();
        o.n();
        return;
        Exception exception;
        exception;
        o.n();
        throw exception;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
    }

    protected void onPause()
    {
        o.i();
        super.onPause();
        o.j();
        return;
        Exception exception;
        exception;
        o.j();
        throw exception;
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        o.g();
        super.onPostResume();
        o.h();
        return;
        Exception exception;
        exception;
        o.h();
        throw exception;
    }

    protected void onPrepareDialog(int i, Dialog dialog)
    {
        super.onPrepareDialog(i, dialog);
    }

    protected void onPrepareDialog(int i, Dialog dialog, Bundle bundle)
    {
        super.onPrepareDialog(i, dialog, bundle);
    }

    protected void onRestart()
    {
        super.onRestart();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
    }

    protected void onResume()
    {
        o.e();
        super.onResume();
        o.f();
        return;
        Exception exception;
        exception;
        o.f();
        throw exception;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        o.c();
        super.onStart();
        o.d();
        return;
        Exception exception;
        exception;
        o.d();
        throw exception;
    }

    protected void onStop()
    {
        o.k();
        super.onStop();
        o.l();
        return;
        Exception exception;
        exception;
        o.l();
        throw exception;
    }

    protected void onTitleChanged(CharSequence charsequence, int i)
    {
        super.onTitleChanged(charsequence, i);
    }

    protected void onUserLeaveHint()
    {
        super.onUserLeaveHint();
    }
}
