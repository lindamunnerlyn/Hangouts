// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class cjj
    implements cjf
{

    private final Context a;

    cjj(Context context)
    {
        a = context;
    }

    public boolean a(String s)
    {
        return android.os.Build.VERSION.SDK_INT < 23 || a.checkSelfPermission(s) == 0;
    }

    public boolean a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (!a((String)list.next()))
            {
                return false;
            }
        }

        return true;
    }
}
