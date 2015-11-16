// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v7.internal.widget.ActivityChooserView;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import g;
import hz;
import ue;
import vi;
import zu;

public class ShareActionProvider extends hz
{

    private int a;
    private final zu b = new zu(this);
    private final Context c;
    private String d;

    public ShareActionProvider(Context context)
    {
        super(context);
        a = 4;
        d = "share_history.xml";
        c = context;
    }

    public static Context a(ShareActionProvider shareactionprovider)
    {
        return shareactionprovider.c;
    }

    public static void a(Intent intent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            intent.addFlags(0x8080000);
            return;
        } else
        {
            intent.addFlags(0x80000);
            return;
        }
    }

    public static String b(ShareActionProvider shareactionprovider)
    {
        return shareactionprovider.d;
    }

    public View a()
    {
        ActivityChooserView activitychooserview = new ActivityChooserView(c);
        if (!activitychooserview.isInEditMode())
        {
            activitychooserview.a(ue.a(c, d));
        }
        TypedValue typedvalue = new TypedValue();
        c.getTheme().resolveAttribute(g.n, typedvalue, true);
        activitychooserview.a(vi.a(c, typedvalue.resourceId));
        activitychooserview.a(this);
        activitychooserview.b(g.bI);
        activitychooserview.a(g.bH);
        return activitychooserview;
    }

    public void a(SubMenu submenu)
    {
        submenu.clear();
        ue ue1 = ue.a(c, d);
        android.content.pm.PackageManager packagemanager = c.getPackageManager();
        int k = ue1.a();
        int l = Math.min(k, a);
        for (int i = 0; i < l; i++)
        {
            ResolveInfo resolveinfo = ue1.a(i);
            submenu.add(0, i, i, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setOnMenuItemClickListener(b);
        }

        if (l < k)
        {
            submenu = submenu.addSubMenu(0, l, l, c.getString(g.bF));
            for (int j = 0; j < k; j++)
            {
                ResolveInfo resolveinfo1 = ue1.a(j);
                submenu.add(0, j, j, resolveinfo1.loadLabel(packagemanager)).setIcon(resolveinfo1.loadIcon(packagemanager)).setOnMenuItemClickListener(b);
            }

        }
    }

    public boolean e()
    {
        return true;
    }
}
