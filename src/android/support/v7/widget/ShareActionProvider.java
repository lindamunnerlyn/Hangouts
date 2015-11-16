// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.support.v7.internal.widget.ActivityChooserView;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import g;
import hz;
import ug;
import vk;
import zw;

public class ShareActionProvider extends hz
{

    public final Context a;
    public String b;
    private int c;
    private final zw d = new zw(this);

    public ShareActionProvider(Context context)
    {
        super(context);
        c = 4;
        b = "share_history.xml";
        a = context;
    }

    public View a()
    {
        ActivityChooserView activitychooserview = new ActivityChooserView(a);
        if (!activitychooserview.isInEditMode())
        {
            activitychooserview.a(ug.a(a, b));
        }
        TypedValue typedvalue = new TypedValue();
        a.getTheme().resolveAttribute(g.n, typedvalue, true);
        activitychooserview.a(vk.a(a, typedvalue.resourceId));
        activitychooserview.a(this);
        activitychooserview.c(g.bI);
        activitychooserview.a(g.bH);
        return activitychooserview;
    }

    public void a(SubMenu submenu)
    {
        submenu.clear();
        ug ug1 = ug.a(a, b);
        android.content.pm.PackageManager packagemanager = a.getPackageManager();
        int k = ug1.a();
        int l = Math.min(k, c);
        for (int i = 0; i < l; i++)
        {
            ResolveInfo resolveinfo = ug1.a(i);
            submenu.add(0, i, i, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setOnMenuItemClickListener(d);
        }

        if (l < k)
        {
            submenu = submenu.addSubMenu(0, l, l, a.getString(g.bF));
            for (int j = 0; j < k; j++)
            {
                ResolveInfo resolveinfo1 = ug1.a(j);
                submenu.add(0, j, j, resolveinfo1.loadLabel(packagemanager)).setIcon(resolveinfo1.loadIcon(packagemanager)).setOnMenuItemClickListener(d);
            }

        }
    }

    public boolean e()
    {
        return true;
    }
}
