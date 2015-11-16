// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class aai extends ai
    implements aav
{

    private aam j;
    private aaf k;

    public aai()
    {
    }

    public aam g()
    {
        return new aam(this);
    }

    public aam h()
    {
        return j;
    }

    public Context i()
    {
        return this;
    }

    public aaf j()
    {
        if (k == null)
        {
            k = new aaf(getActionBar());
        }
        return k;
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
    }

    public void onBackPressed()
    {
        if (!j.i())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = g();
        j.a(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    protected void onDestroy()
    {
        j.h();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return j.a(menuitem) || super.onOptionsItemSelected(menuitem);
    }

    protected void onPause()
    {
        j.f();
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        j.e();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        j.b(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        j.d();
    }

    protected void onStop()
    {
        j.g();
        super.onStop();
    }
}
