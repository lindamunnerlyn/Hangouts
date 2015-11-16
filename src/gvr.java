// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.SparseArray;
import java.util.List;

final class gvr
    implements Runnable
{

    final guy a;
    final gvv b;
    final gvq c;

    gvr(gvq gvq1, guy guy1, gvv gvv1)
    {
        c = gvq1;
        a = guy1;
        b = gvv1;
        super();
    }

    public void run()
    {
        String s;
        Object obj;
        Object obj1;
        guy guy1;
        int i;
        obj1 = c;
        guy1 = a;
        obj = b;
        ((gvq) (obj1)).b.remove(guy1);
        guy1.g_();
        i = guy1.i();
        s = guy1.h();
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("BackgroundTask", 2))
        {
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(obj).length())).append("No manager, dropping task result: ").append(s).append(", ").append(((String) (obj)));
        }
_L4:
        return;
_L2:
        gvc gvc1 = (gvc)((gvq) (obj1)).a.get(i);
        if (gvc1 != null)
        {
            if (guy1.g())
            {
                if (Log.isLoggable("BackgroundTask", 3))
                {
                    obj = String.valueOf(obj);
                    (new StringBuilder(String.valueOf(s).length() + 50 + String.valueOf(obj).length())).append("Task is canceled, dropping result from manager: ").append(s).append(", ").append(((String) (obj)));
                }
                gvc1.c(s);
                return;
            }
            if (Log.isLoggable("BackgroundTask", 3))
            {
                obj1 = String.valueOf(obj);
                (new StringBuilder(String.valueOf(s).length() + 34 + String.valueOf(obj1).length())).append("Deliver background task result: ").append(s).append(", ").append(((String) (obj1)));
            }
            gvc1.a(s, ((gvv) (obj)));
            return;
        }
        if (!guy1.g())
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("BackgroundTask", 3))
        {
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(s).length() + 42 + String.valueOf(obj).length())).append("Task is canceled, dropping task result: ").append(s).append(", ").append(((String) (obj)));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (((gvv) (obj)).j() == gvw.a)
        {
            if (Log.isLoggable("BackgroundTask", 3))
            {
                obj = String.valueOf(obj);
                (new StringBuilder(String.valueOf(s).length() + 24 + String.valueOf(obj).length())).append("Dropping task result: ").append(s).append(", ").append(((String) (obj)));
                return;
            }
        } else
        {
            if (Log.isLoggable("BackgroundTask", 3))
            {
                String s1 = String.valueOf(obj);
                (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s1).length())).append("Store background task result: ").append(s).append(", ").append(s1);
            }
            ((gvv) (obj)).i();
            ((gvq) (obj1)).c.a(i, s, ((gvv) (obj)));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
