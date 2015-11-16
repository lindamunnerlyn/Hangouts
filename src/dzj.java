// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.Set;

public final class dzj
{

    public static final boolean a = false;

    public static void a(Activity activity)
    {
        gbh.a(c());
        Resources resources = activity.getResources();
        int i;
        int j;
        if (resources.getConfiguration().orientation == 2)
        {
            Display display = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            display.getSize(point);
            i = resources.getInteger(g.fa);
            i = point.x / i;
            j = resources.getDimensionPixelOffset(g.ey);
        } else
        {
            i = resources.getDimensionPixelOffset(g.ez);
            j = resources.getDimensionPixelOffset(g.eA);
        }
        activity = activity.findViewById(h.fA);
        gbh.a(Integer.valueOf(((ColorDrawable)activity.getBackground()).getColor()), Integer.valueOf(resources.getColor(g.de)));
        activity.setPadding(i, j, i, j);
    }

    public static void a(Activity activity, Window window, int i)
    {
        activity = activity.getApplicationContext().getResources().getDisplayMetrics();
        float f = (float)((DisplayMetrics) (activity)).widthPixels / ((DisplayMetrics) (activity)).density;
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
        layoutparams.copyFrom(window.getAttributes());
        if (f > (float)i)
        {
            float f1 = i;
            layoutparams.width = (int)(((DisplayMetrics) (activity)).density * f1);
            layoutparams.height = -2;
            window.setAttributes(layoutparams);
        }
    }

    public static void a(String s, Intent intent)
    {
        if (a)
        {
            if (intent == null)
            {
                ebw.a("Babel", (new StringBuilder(String.valueOf(s).length() + 25)).append("dumpIntent from: ").append(s).append(" is null").toString());
            } else
            {
                Object obj1 = intent.getExtras();
                String s1 = String.valueOf(obj1);
                ebw.a("Babel", (new StringBuilder(String.valueOf(s).length() + 26 + String.valueOf(s1).length())).append("dumpIntent from: ").append(s).append(" extras: ").append(s1).toString());
                if (obj1 != null)
                {
                    s = intent.getType();
                    String s2 = intent.getAction();
                    Object obj = (Uri)((Bundle) (obj1)).getParcelable("android.intent.extra.STREAM");
                    intent = intent.getDataString();
                    String s3 = ((Bundle) (obj1)).getString("android.intent.extra.TEXT");
                    String s4 = ((Bundle) (obj1)).getString("conversation_id");
                    Object obj2 = ((Bundle) (obj1)).keySet();
                    obj1 = new StringBuilder();
                    for (obj2 = ((Set) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((StringBuilder) (obj1)).append((String)((Iterator) (obj2)).next()).append(',')) { }
                    obj = String.valueOf(obj);
                    obj1 = String.valueOf(obj1);
                    ebw.a("Babel", (new StringBuilder(String.valueOf(s).length() + 79 + String.valueOf(s2).length() + String.valueOf(obj).length() + String.valueOf(intent).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(obj1).length())).append("dumpIntent mimeType: ").append(s).append(" action: ").append(s2).append(" uri: ").append(((String) (obj))).append(" data: ").append(intent).append(" extraText: ").append(s3).append(" convId: ").append(s4).append(" extras keySet:").append(((String) (obj1))).toString());
                    return;
                }
            }
        }
    }

    public static boolean a()
    {
        return g.nS.getResources().getConfiguration().touchscreen != 1;
    }

    public static boolean b()
    {
        if (!a())
        {
            return true;
        } else
        {
            return ((AccessibilityManager)g.nS.getSystemService("accessibility")).isTouchExplorationEnabled();
        }
    }

    public static boolean c()
    {
label0:
        {
            boolean flag1 = false;
            Object obj = g.nS.getResources();
            boolean flag;
            if ((((Resources) (obj)).getConfiguration().screenLayout & 0xf) >= 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                obj = ((Resources) (obj)).getConfiguration();
                if ((((Configuration) (obj)).screenLayout & 0xf) <= 3 && ((Configuration) (obj)).smallestScreenWidthDp >= 600)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    public static boolean d()
    {
        return g.nS.getPackageManager().hasSystemFeature("android.hardware.nfc");
    }

    static 
    {
        hik hik = ebw.u;
    }
}
