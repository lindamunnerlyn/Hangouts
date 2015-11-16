// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class gve extends he
{

    final gvc a;

    gve(gvc gvc, int i)
    {
        a = gvc;
        super(i);
    }

    protected void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
        obj2 = (hcx)obj;
        obj = (guu)obj1;
        if (flag)
        {
            if (((guu) (obj)).z())
            {
                obj1 = String.valueOf(obj2);
                (new StringBuilder(String.valueOf(obj1).length() + 26)).append("Evicted image from cache: ").append(((String) (obj1)));
                if (Log.isLoggable("ImageResourceManager", 2))
                {
                    obj1 = g();
                    String s;
                    int i;
                    for (obj2 = ((Map) (obj1)).keySet().iterator(); ((Iterator) (obj2)).hasNext(); (new StringBuilder(String.valueOf(s).length() + 26)).append("   id: ").append(s).append("; size: ").append(i))
                    {
                        hcx hcx1 = (hcx)((Iterator) (obj2)).next();
                        s = String.valueOf(hcx1);
                        i = ((guu)((Map) (obj1)).get(hcx1)).q();
                    }

                }
            }
            ((guu) (obj)).n();
        }
    }

    protected int c(Object obj)
    {
        return ((guu)obj).q();
    }
}
