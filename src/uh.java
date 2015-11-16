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

final class uh
    implements ug
{

    final ue a;
    private final Map b = new HashMap();

    uh(ue ue)
    {
        a = ue;
        super();
    }

    public void a(List list, List list1)
    {
        Map map = b;
        map.clear();
        int k = list.size();
        for (int i = 0; i < k; i++)
        {
            uf uf1 = (uf)list.get(i);
            uf1.b = 0.0F;
            map.put(new ComponentName(uf1.a.activityInfo.packageName, uf1.a.activityInfo.name), uf1);
        }

        int j = list1.size();
        float f = 1.0F;
        for (j--; j >= 0; j--)
        {
            ui ui1 = (ui)list1.get(j);
            uf uf2 = (uf)map.get(ui1.a);
            if (uf2 != null)
            {
                float f1 = uf2.b;
                uf2.b = ui1.c * f + f1;
                f = 0.95F * f;
            }
        }

        Collections.sort(list);
    }
}
