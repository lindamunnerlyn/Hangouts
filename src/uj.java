// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class uj
    implements ui
{

    final ug a;
    private final Map b = new HashMap();

    uj(ug ug)
    {
        a = ug;
        super();
    }

    public void a(List list, List list1)
    {
        Map map = b;
        map.clear();
        int k = list.size();
        for (int i = 0; i < k; i++)
        {
            uh uh1 = (uh)list.get(i);
            uh1.b = 0.0F;
            map.put(new ComponentName(uh1.a.activityInfo.packageName, uh1.a.activityInfo.name), uh1);
        }

        int j = list1.size();
        float f = 1.0F;
        for (j--; j >= 0; j--)
        {
            uk uk1 = (uk)list1.get(j);
            uh uh2 = (uh)map.get(uk1.a);
            if (uh2 != null)
            {
                float f1 = uh2.b;
                uh2.b = uk1.c * f + f1;
                f = 0.95F * f;
            }
        }

        Collections.sort(list);
    }
}
