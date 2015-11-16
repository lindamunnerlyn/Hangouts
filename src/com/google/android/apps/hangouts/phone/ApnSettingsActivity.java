// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import amp;
import android.app.ActionBar;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.HandlerThread;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import ciy;
import ciz;
import cja;
import cjb;
import dsj;
import ebz;
import g;
import l;

public class ApnSettingsActivity extends PreferenceActivity
    implements android.preference.Preference.OnPreferenceChangeListener
{

    private static final String a[] = {
        "_id", "name", "apn", "type"
    };
    private static boolean b;
    private static final ContentValues g;
    private static final ContentValues h;
    private static final String j[] = {
        "2"
    };
    private cjb c;
    private cja d;
    private HandlerThread e;
    private String f;
    private SQLiteDatabase i;

    public ApnSettingsActivity()
    {
    }

    public static SQLiteDatabase a(ApnSettingsActivity apnsettingsactivity)
    {
        return apnsettingsactivity.i;
    }

    public static String a(ApnSettingsActivity apnsettingsactivity, String s)
    {
        apnsettingsactivity.f = s;
        return s;
    }

    public static String[] a()
    {
        return a;
    }

    public static ContentValues b()
    {
        return g;
    }

    public static String b(ApnSettingsActivity apnsettingsactivity)
    {
        return apnsettingsactivity.f;
    }

    public static void c(ApnSettingsActivity apnsettingsactivity)
    {
        apnsettingsactivity.f();
    }

    public static String[] c()
    {
        return j;
    }

    public static ContentValues d()
    {
        return h;
    }

    public static boolean e()
    {
        b = false;
        return false;
    }

    private void f()
    {
        (new ciy(this, dsj.a(ebz.l()))).execute(new Void[] {
            null
        });
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i = amp.a(getApplicationContext());
        addPreferencesFromResource(g.ip);
        getListView().setItemsCanFocus(true);
    }

    protected Dialog onCreateDialog(int k)
    {
        if (k == 1001)
        {
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getResources().getString(l.jI));
            progressdialog.setCancelable(false);
            return progressdialog;
        } else
        {
            return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, getResources().getString(l.fP)).setIcon(com.google.android.apps.hangouts.R.drawable.bT).setShowAsAction(1);
        menu.add(0, 2, 0, getResources().getString(l.fR)).setIcon(0x1080055);
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (e != null)
        {
            e.quit();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 1: // '\001'
            startActivity(g.p(null));
            return true;

        case 2: // '\002'
            showDialog(1001);
            b = true;
            if (c == null)
            {
                c = new cjb(this);
            }
            if (d == null || e == null)
            {
                e = new HandlerThread("Restore default APN Handler: Process Thread");
                e.start();
                d = new cja(i, e.getLooper(), c);
            }
            d.sendEmptyMessage(1);
            return true;

        case 16908332: 
            onBackPressed();
            return true;
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        if (obj instanceof String)
        {
            preference = (String)obj;
            f = preference;
            (new ciz(this, preference)).execute(new Void[] {
                null
            });
        }
        return true;
    }

    public boolean onPreferenceTreeClick(PreferenceScreen preferencescreen, Preference preference)
    {
        startActivity(g.p(preference.getKey()));
        return true;
    }

    protected void onPrepareDialog(int k, Dialog dialog)
    {
        if (k == 1001)
        {
            getPreferenceScreen().setEnabled(false);
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (!b)
        {
            f();
            return;
        } else
        {
            showDialog(1001);
            return;
        }
    }

    static 
    {
        ContentValues contentvalues = new ContentValues(1);
        g = contentvalues;
        contentvalues.putNull("current");
        contentvalues = new ContentValues(1);
        h = contentvalues;
        contentvalues.put("current", "2");
    }
}
