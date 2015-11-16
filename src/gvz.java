// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.Iterator;
import java.util.List;

public final class gvz extends gvs
{

    private ad d;

    public gvz(Context context, ap ap1)
    {
        super(context, ap1);
    }

    public void a(String s)
    {
        ac ac1 = (ac)b.a("bg_task_progress_dialog");
        if (ac1 != null && TextUtils.equals(s, ac1.getArguments().getString("arg_task_tag")))
        {
            ac1.a();
        }
    }

    public void a(String s, String s1, String s2, boolean flag)
    {
        if ((ac)b.a("bg_task_progress_dialog") == null)
        {
            s = hlc.a(s, null, d);
            s.getArguments().putString("arg_task_tag", s2);
            s.b(false);
            s.a(b, "bg_task_progress_dialog");
        }
    }

    public boolean a(gvv gvv1)
    {
        if (!gvv.a(gvv1)) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        gvv1.b();
        iterator = hlp.c(a, gxy).iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((gxy)iterator.next()).a()) goto _L6; else goto _L5
_L5:
        boolean flag;
        c = false;
        flag = true;
_L7:
        if (flag)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L7; else goto _L2
_L2:
        Context context = a;
        if (gvv1 != null && !TextUtils.isEmpty(gvv1.c()))
        {
            c = false;
            Toast.makeText(context, gvv1.c(), 0).show();
            return true;
        } else
        {
            return false;
        }
    }
}
