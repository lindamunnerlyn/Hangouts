// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import g;
import hfa;
import hfm;
import hfn;
import hfq;
import hfw;

public final class PreferenceScreen extends hfm
    implements android.content.DialogInterface.OnDismissListener, android.widget.AdapterView.OnItemClickListener
{

    private ListAdapter b;
    private Dialog c;

    public PreferenceScreen(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, g.tk);
    }

    private void a(Bundle bundle)
    {
        Object obj = x();
        ListView listview = new ListView(((Context) (obj)));
        a(listview);
        CharSequence charsequence = o();
        int j;
        if (TextUtils.isEmpty(charsequence))
        {
            j = 0x1030006;
        } else
        {
            j = 0x1030005;
        }
        obj = new Dialog(((Context) (obj)), j);
        c = ((Dialog) (obj));
        ((Dialog) (obj)).setContentView(listview);
        if (!TextUtils.isEmpty(charsequence))
        {
            ((Dialog) (obj)).setTitle(charsequence);
        }
        ((Dialog) (obj)).setOnDismissListener(this);
        if (bundle != null)
        {
            ((Dialog) (obj)).onRestoreInstanceState(bundle);
        }
        B().a(((DialogInterface) (obj)));
        ((Dialog) (obj)).show();
    }

    private ListAdapter i()
    {
        if (b == null)
        {
            b = new hfn(this);
        }
        return b;
    }

    protected void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(hfw))
        {
            super.a(parcelable);
        } else
        {
            parcelable = (hfw)parcelable;
            super.a(parcelable.getSuperState());
            if (((hfw) (parcelable)).a)
            {
                a(((hfw) (parcelable)).b);
                return;
            }
        }
    }

    public void a(ListView listview)
    {
        listview.setOnItemClickListener(this);
        listview.setAdapter(i());
        C();
    }

    protected void b()
    {
        if (j() != null || c() == 0)
        {
            return;
        } else
        {
            a(((Bundle) (null)));
            return;
        }
    }

    protected Parcelable e()
    {
        Object obj = super.e();
        Dialog dialog = c;
        if (dialog == null || !dialog.isShowing())
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new hfw(((Parcelable) (obj)));
            obj.a = true;
            obj.b = dialog.onSaveInstanceState();
            return ((Parcelable) (obj));
        }
    }

    protected boolean f()
    {
        return false;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        c = null;
        B().b(dialoginterface);
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        adapterview = ((AdapterView) (i().getItem(j)));
        if (!(adapterview instanceof hfa))
        {
            return;
        } else
        {
            ((hfa)adapterview).a(this);
            return;
        }
    }
}
