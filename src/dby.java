// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dby
    implements dbt
{

    public dby()
    {
    }

    public boolean a(Context context)
    {
        return b(context);
    }

    public boolean a(Context context, aoa aoa1)
    {
        return aoa1 != null && g.a(aoa1, aqc.b) && a(context) && b(aoa1);
    }

    public boolean a(Context context, String s)
    {
        Intent intent = g.a(context, s);
        s = new ArrayList();
        Iterator iterator = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)iterator.next();
            if (resolveinfo.activityInfo == null || "com.google.android.apps.hangoutsdialer".equals(resolveinfo.activityInfo.packageName))
            {
                continue;
            }
            s.add(((Intent)intent.clone()).setPackage(resolveinfo.activityInfo.packageName).setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name));
            if (!resolveinfo.activityInfo.packageName.contains("com.android"))
            {
                continue;
            }
            s = h.a(new Intent[] {
                (Intent)s.get(s.size() - 1)
            });
            break;
        } while (true);
        switch (s.size())
        {
        default:
            context.startActivity(Intent.createChooser((Intent)s.remove(s.size() - 1), context.getString(g.oE)).putExtra("android.intent.extra.INITIAL_INTENTS", ((java.io.Serializable) (s.toArray()))));
            return true;

        case 0: // '\0'
            return false;

        case 1: // '\001'
            context.startActivity((Intent)s.get(0));
            break;
        }
        return true;
    }

    public boolean a(aoa aoa1)
    {
        return aoa1 != null && g.a(aoa1, aqc.b) && !aoa1.D() && !aoa1.o() && aoa1.U() != 3;
    }

    public boolean b(Context context)
    {
        return eei.a(context, "com.google.android.apps.hangoutsdialer");
    }

    public boolean b(Context context, aoa aoa1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (aoa1.y())
        {
            flag = flag1;
            if (a(context, aoa1))
            {
                String s = context.getResources().getString(l.ci);
                context = ((gqz)hlp.a(context, gqz)).a(aoa1.h());
                if (!eey.e())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag = context.a(s, flag);
            }
        }
        return flag;
    }

    public boolean b(aoa aoa1)
    {
        return aoa1 != null && !aoa1.D() && !aoa1.o() && aoa1.V();
    }

    public boolean c(Context context, aoa aoa1)
    {
        return ((gqz)hlp.a(context, gqz)).a(aoa1.h()).d("registered_for_incoming_pstn_calls");
    }
}
