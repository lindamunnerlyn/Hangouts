// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

final class bta
    implements bwk
{

    final bsz a;

    bta(bsz bsz1)
    {
        a = bsz1;
        super();
    }

    public boolean a(Context context, int i)
    {
        if (bsz.a(i))
        {
            dra dra1 = (dra)hlp.a(context, dra);
            long l = System.currentTimeMillis();
            long l1 = dra1.f(i);
            long l2 = g.a(context, "babel_include_last_call_in_feedback_timeout_ms", dlb.u);
            boolean flag;
            if (l1 != -1L && l1 < l && l < l1 + l2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && !TextUtils.isEmpty(dra1.d(i)) && !TextUtils.isEmpty(dra1.e(i)))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                return true;
            }
        }
        return false;
    }

    public bwj[] b(Context context, int i)
    {
        g.w();
        if (!bsz.a(i))
        {
            eev.f("Babel_call_logs", "Diagnostics are not enabled.");
            return new bwj[0];
        }
        gcz gcz1 = ((gdd)hlp.a(context, gdd)).a(i);
        Object obj = new File(((dra)hlp.a(context, dra)).e(i));
        if (!((File) (obj)).exists())
        {
            eev.f("Babel_call_logs", "Log file not found.");
            gcz1.a(2840).d();
            return new bwj[0];
        }
        int j;
        if (((File) (obj)).length() < 0x100000L)
        {
            i = (int)((File) (obj)).length();
        } else
        {
            i = 0x100000;
        }
        context = new byte[i];
        obj = new FileInputStream(((File) (obj)));
        j = ((FileInputStream) (obj)).read(context, 0, i);
        if (j == i)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        eev.f("Babel_call_logs", String.format("Read len (%d) != file len (%d).", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
        ((FileInputStream) (obj)).close();
        gcz1.a(2839).d();
        context = new bwj("call_log.txt", "text/plain", context);
        return (new bwj[] {
            context
        });
        context;
        eev.f("Babel_call_logs", "Log file not found when reading.");
_L2:
        gcz1.a(2840).d();
        return new bwj[0];
        context;
        eev.f("Babel_call_logs", "IOException when reading log file.");
        if (true) goto _L2; else goto _L1
_L1:
    }
}
