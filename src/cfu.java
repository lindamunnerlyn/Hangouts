// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class cfu extends ctg
{

    public static final List a = new ArrayList(Arrays.asList(new String[] {
        "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"
    }));
    private int b;

    public cfu()
    {
        super(g.nh, new int[] {
            o.c, o.d
        });
    }

    static int a(cfu cfu1)
    {
        return cfu1.b;
    }

    static void a(cfu cfu1, int i)
    {
        cfu1.ctg.a(i);
    }

    protected String a()
    {
        return getString(g.nk);
    }

    protected void a(int i)
    {
        b = i;
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("contacts_rationale_shown", true).apply();
        if (i == o.d)
        {
            ((cjg)binder.a(cjg)).a(o.a, a, 2654, null);
            return;
        } else
        {
            super.a(i);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ((cjg)binder.a(cjg)).a(o.a, new cfv(this));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        ((Button)layoutinflater.findViewById(o.c)).setText(g.nl);
        viewgroup = (Button)layoutinflater.findViewById(o.d);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(g.ng));
        viewgroup.setText(g.nj);
        g.a((ImageView)layoutinflater.findViewById(o.b), context.getResources(), g.ni);
        return layoutinflater;
    }

}
