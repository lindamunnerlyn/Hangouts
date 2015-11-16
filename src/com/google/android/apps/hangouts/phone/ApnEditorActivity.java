// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import anh;
import cjz;
import cka;
import ckb;
import eey;
import g;
import l;

public class ApnEditorActivity extends PreferenceActivity
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener, android.preference.Preference.OnPreferenceChangeListener
{

    private static String a;
    private static final String o[] = {
        "_id", "name", "mmsc", "mcc", "mnc", "numeric", "mmsproxy", "mmsport", "type"
    };
    private EditTextPreference b;
    private EditTextPreference c;
    private EditTextPreference d;
    private EditTextPreference e;
    private EditTextPreference f;
    private EditTextPreference g;
    private String h;
    private String i;
    private Cursor j;
    private boolean k;
    private boolean l;
    private Resources m;
    private String n;
    private SQLiteDatabase p;

    public ApnEditorActivity()
    {
    }

    public static Cursor a(ApnEditorActivity apneditoractivity, Cursor cursor)
    {
        apneditoractivity.j = cursor;
        return cursor;
    }

    public static String a(ApnEditorActivity apneditoractivity)
    {
        return apneditoractivity.n;
    }

    public static String a(String s)
    {
        return c(s);
    }

    private boolean a(boolean flag)
    {
        String s = c(b.getText());
        String s1 = c(d.getText());
        String s2 = c(e.getText());
        if (c() != null && !flag)
        {
            showDialog(0);
            return false;
        } else
        {
            (new cka(this, s, s1, s2)).execute(new Void[] {
                null
            });
            return true;
        }
    }

    public static String[] a()
    {
        return o;
    }

    public static SQLiteDatabase b(ApnEditorActivity apneditoractivity)
    {
        return apneditoractivity.p;
    }

    private static String b(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (s.length() != 0)
                {
                    break label0;
                }
            }
            s1 = a;
        }
        return s1;
    }

    private void b()
    {
        if (!k) goto _L2; else goto _L1
_L1:
        d.setText(null);
        e.setText(null);
        String s1 = eey.l();
        if (s1 != null && s1.length() > 4)
        {
            String s = s1.substring(0, 3);
            s1 = s1.substring(3);
            d.setText(s);
            e.setText(s1);
            h = s1;
            i = s;
        }
        b.setText(null);
        f.setText(null);
        g.setText(null);
        c.setText(null);
_L4:
        b.setSummary(b(b.getText()));
        f.setSummary(b(f.getText()));
        g.setSummary(b(g.getText()));
        c.setSummary(b(c.getText()));
        d.setSummary(b(d.getText()));
        e.setSummary(b(e.getText()));
        return;
_L2:
        if (l)
        {
            l = false;
            b.setText(j.getString(1));
            f.setText(j.getString(6));
            g.setText(j.getString(7));
            c.setText(j.getString(2));
            d.setText(j.getString(3));
            e.setText(j.getString(4));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Cursor c(ApnEditorActivity apneditoractivity)
    {
        return apneditoractivity.j;
    }

    private String c()
    {
        String s = null;
        String s2 = c(b.getText());
        String s3 = c(d.getText());
        String s1 = c(e.getText());
        if (s2.length() <= 0)
        {
            s = m.getString(l.bT);
        } else
        {
            if (s3.length() != 3)
            {
                return m.getString(l.bV);
            }
            if ((s1.length() & 0xfffe) != 2)
            {
                return m.getString(l.bW);
            }
        }
        return s;
    }

    private static String c(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (!s.equals(a))
                {
                    break label0;
                }
            }
            s1 = "";
        }
        return s1;
    }

    public static void d(ApnEditorActivity apneditoractivity)
    {
        apneditoractivity.b();
    }

    public static EditTextPreference e(ApnEditorActivity apneditoractivity)
    {
        return apneditoractivity.f;
    }

    public static EditTextPreference f(ApnEditorActivity apneditoractivity)
    {
        return apneditoractivity.g;
    }

    public static EditTextPreference g(ApnEditorActivity apneditoractivity)
    {
        return apneditoractivity.c;
    }

    public static String h(ApnEditorActivity apneditoractivity)
    {
        return apneditoractivity.h;
    }

    public static String i(ApnEditorActivity apneditoractivity)
    {
        return apneditoractivity.i;
    }

    public static boolean j(ApnEditorActivity apneditoractivity)
    {
        return apneditoractivity.k;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(g.ig);
        a = getResources().getString(l.m);
        b = (EditTextPreference)findPreference("apn_name");
        f = (EditTextPreference)findPreference("apn_mms_proxy");
        g = (EditTextPreference)findPreference("apn_mms_port");
        c = (EditTextPreference)findPreference("apn_mmsc");
        d = (EditTextPreference)findPreference("apn_mcc");
        e = (EditTextPreference)findPreference("apn_mnc");
        m = getResources();
        Intent intent = getIntent();
        boolean flag;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        n = intent.getStringExtra("apn_row_id");
        if (n == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        p = anh.a(getApplicationContext());
        if (k)
        {
            b();
        } else
        {
            (new cjz(this)).execute(new Void[] {
                null
            });
        }
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayHomeAsUpEnabled(true);
        }
    }

    protected Dialog onCreateDialog(int i1)
    {
        if (i1 == 0)
        {
            String s = c();
            return (new android.app.AlertDialog.Builder(this)).setPositiveButton(0x104000a, null).setMessage(s).create();
        } else
        {
            return super.onCreateDialog(i1);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        if (!k)
        {
            menu.add(0, 1, 0, l.fn).setIcon(com.google.android.apps.hangouts.R.drawable.bv);
        }
        menu.add(0, 2, 0, l.fB).setIcon(0x108004e);
        menu.add(0, 3, 0, l.fp).setIcon(0x1080038);
        return true;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (j != null)
        {
            j.close();
            j = null;
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        switch (i1)
        {
        default:
            return super.onKeyDown(i1, keyevent);

        case 4: // '\004'
            break;
        }
        if (a(false))
        {
            finish();
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        menuitem.getItemId();
        JVM INSTR lookupswitch 4: default 52
    //                   1: 60
    //                   2: 86
    //                   3: 100
    //                   16908332: 106;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        flag = super.onOptionsItemSelected(menuitem);
_L7:
        return flag;
_L2:
        (new ckb(this)).execute(new Void[] {
            null
        });
        finish();
        return true;
_L3:
        if (!a(false)) goto _L7; else goto _L6
_L6:
        finish();
        return true;
_L4:
        finish();
        return true;
_L5:
        onBackPressed();
        return true;
    }

    public void onPause()
    {
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        preference.getKey();
        return true;
    }

    protected void onPrepareDialog(int i1, Dialog dialog)
    {
        super.onPrepareDialog(i1, dialog);
        if (i1 == 0)
        {
            String s = c();
            if (s != null)
            {
                ((AlertDialog)dialog).setMessage(s);
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (a(true) && j != null)
        {
            bundle.putInt("pos", j.getInt(0));
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        Preference preference = findPreference(s);
        if (preference != null)
        {
            preference.setSummary(b(sharedpreferences.getString(s, "")));
        }
    }

}
