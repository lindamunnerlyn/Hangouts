// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class asj extends dhh
{

    Exception a;
    String b;
    final asi c;
    private final Context d;
    private final ConditionVariable e;
    private int f;

    asj(asi asi1, Context context, ConditionVariable conditionvariable)
    {
        c = asi1;
        super(context);
        d = context;
        e = conditionvariable;
    }

    void a(int i, aik aik, aob aob, atd atd1, int j, boolean flag, String s)
    {
        boolean flag1;
        if (atd1 == atd.d || atd1 == atd.c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        atd1 = dhi.b();
        f = atd1.a();
        a(f);
        RealTimeChatService.a(atd1, (new dce(d)).a(i).a(aik).a(aob).a(flag1).b(flag).a(s).c(c.a).b(j).a());
    }

    public void a(int i, ani ani, dcg dcg1, dgu dgu1)
    {
        if (i != f)
        {
            return;
        }
        if (dgu1.b() != 1)
        {
            i = dgu1.b();
            ebw.g("Babel_ConvCreator", (new StringBuilder(89)).append("Error in RealTimeChatServiceResult returned by conversation creation request: ").append(i).toString());
            ani = d;
            if (dgu1.b() == 4)
            {
                i = l.aE;
            } else
            {
                i = l.ca;
            }
            Toast.makeText(ani, i, 0).show();
        } else
        {
            b = dcg1.a;
        }
        e.open();
    }

    protected void a(dgu dgu1)
    {
    }

    protected void a(Exception exception)
    {
        a = exception;
        e.open();
    }
}
