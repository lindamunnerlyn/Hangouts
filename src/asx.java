// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;

public final class asx extends aso
{

    final int a;
    private final int b;
    private final aid c;
    private final aot d;
    private final atu g;
    private final int h;
    private final boolean i;
    private final String j;

    public asx(String s, int k, aid aid, aot aot, atu atu, int l, boolean flag, 
            String s1, int i1)
    {
        super(s);
        b = k;
        c = aid;
        d = aot;
        g = atu;
        h = l;
        i = flag;
        j = s1;
        a = i1;
    }

    protected gvv a(Context context)
    {
        ConditionVariable conditionvariable = new ConditionVariable();
        context = new asy(this, context, conditionvariable);
        context.a(b, c, d, g, h, i, j);
        conditionvariable.block();
        if (((asy) (context)).a != null)
        {
            context = new gvv(0, ((asy) (context)).a, "");
            eev.g("Babel_ConvCreator", "Exception returned by response to RTCS request to create a conversation");
            return context;
        }
        if (TextUtils.isEmpty(((asy) (context)).b))
        {
            context = new gvv(false);
            eev.g("Babel_ConvCreator", "No conversationId returned from RTCS request to create a conversation");
            return context;
        } else
        {
            gvv gvv1 = new gvv(true);
            gvv1.d().putSerializable("conversation_id", ((asy) (context)).b);
            return gvv1;
        }
    }

    public String b(Context context)
    {
        return context.getString(g.jE);
    }
}
