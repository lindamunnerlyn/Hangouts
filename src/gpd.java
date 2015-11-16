// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gpd
    implements fsn, hjs, hjt, hkb
{

    private final Activity a;
    private final Set b = new HashSet();
    private gpm c;

    public gpd(Activity activity, hjm hjm1)
    {
        a = activity;
        hjm1.a(this);
    }

    public List a(int i)
    {
        List list1 = c.a(Integer.valueOf(i));
        List list = list1;
        if (list1 == null)
        {
            list = Collections.emptyList();
        }
        return list;
    }

    public void a(int i, int j, Intent intent)
    {
        intent = new got(i, j, intent);
        Iterator iterator = b.iterator();
        j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((gpe)iterator.next()).a(intent))
            {
                j = 1;
            }
        } while (true);
        if (j == 0)
        {
            c.a(Integer.valueOf(i), intent);
        }
    }

    void a(int i, Intent intent)
    {
        a.startActivityForResult(intent, i);
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            c = (gpm)bundle.getParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results");
            return;
        } else
        {
            c = new gpm(got);
            return;
        }
    }

    void a(gpe gpe1)
    {
        b.add(gpe1);
    }

    public void b(Bundle bundle)
    {
        bundle.putParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results", c);
    }

    void b(gpe gpe1)
    {
        b.remove(gpe1);
    }
}
