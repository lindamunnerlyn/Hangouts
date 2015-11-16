// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class asy extends diq
{

    Exception a;
    String b;
    final asx c;
    private final Context d;
    private final ConditionVariable e;
    private int f;

    asy(asx asx1, Context context, ConditionVariable conditionvariable)
    {
        c = asx1;
        super(context);
        d = context;
        e = conditionvariable;
    }

    void a(int i, aid aid, aot aot, atu atu1, int j, boolean flag, String s)
    {
        boolean flag1;
        if (atu1 == atu.d || atu1 == atu.c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        atu1 = dir.b();
        f = atu1.a();
        a(f);
        RealTimeChatService.a(atu1, (new ddm(d)).a(i).a(aid).a(aot).a(flag1).b(flag).a(s).c(c.a).b(j).a());
    }

    public void a(int i, aoa aoa, ddo ddo1, did did1)
    {
        if (i != f)
        {
            return;
        }
        if (did1.b() != 1)
        {
            i = did1.b();
            eev.g("Babel_ConvCreator", (new StringBuilder(89)).append("Error in RealTimeChatServiceResult returned by conversation creation request: ").append(i).toString());
            aoa = d;
            if (did1.b() == 4)
            {
                i = l.az;
            } else
            {
                i = l.bU;
            }
            Toast.makeText(aoa, i, 0).show();
        } else
        {
            b = ddo1.a;
        }
        e.open();
    }

    protected void a(did did1)
    {
    }

    protected void a(Exception exception)
    {
        a = exception;
        e.open();
    }
}
