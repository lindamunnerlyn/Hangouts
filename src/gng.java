// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.Set;

public final class gng
{

    private static final boolean a;

    public static String a(Set set, String s)
    {
        if (set != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            set = set.iterator();
            boolean flag = true;
            while (set.hasNext()) 
            {
                String s1 = (String)set.next();
                if (flag)
                {
                    flag = false;
                } else
                {
                    stringbuilder.append(s);
                }
                stringbuilder.append(s1);
            }
            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }

    public static void a(View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
label0:
        {
            if (view != null)
            {
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    break label0;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(ongloballayoutlistener);
            }
            return;
        }
        view.getViewTreeObserver().removeGlobalOnLayoutListener(ongloballayoutlistener);
    }

    public static boolean a()
    {
        return a;
    }

    static 
    {
        int i;
        boolean flag;
        flag = true;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        i = 0;
_L3:
        if (i >= 2) goto _L2; else goto _L1
_L1:
        java.lang.reflect.Method method = (new Class[] {
            android/app/Activity, android/view/View
        })[i].getDeclaredMethod((new String[] {
            "isVoiceInteraction", "getZ"
        })[i], (new Class[][] {
            new Class[0], new Class[0]
        })[i]);
        if (method == null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        a = flag;
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        i++;
          goto _L3
_L2:
        flag = false;
          goto _L4
    }
}
