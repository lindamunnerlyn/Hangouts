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

public final class cep extends cqw
{

    public static final List a = new ArrayList(Arrays.asList(new String[] {
        "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"
    }));
    private int b;

    public cep()
    {
        super(g.ng, new int[] {
            o.c, o.d
        });
    }

    static int a(cep cep1)
    {
        return cep1.b;
    }

    static void a(cep cep1, int i)
    {
        cep1.cqw.a(i);
    }

    protected String a()
    {
        return getString(g.nj);
    }

    protected void a(int i)
    {
        b = i;
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("contacts_rationale_shown", true).apply();
        if (i == o.d)
        {
            ((cia)binder.a(cia)).a(o.a, a, 2654, null);
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
        ((cia)binder.a(cia)).a(o.a, new ceq(this));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        ((Button)layoutinflater.findViewById(o.c)).setText(g.nk);
        viewgroup = (Button)layoutinflater.findViewById(o.d);
        viewgroup.setTextColor(layoutinflater.getResources().getColor(g.nf));
        viewgroup.setText(g.ni);
        g.a((ImageView)layoutinflater.findViewById(o.b), context.getResources(), g.nh);
        return layoutinflater;
    }

}
