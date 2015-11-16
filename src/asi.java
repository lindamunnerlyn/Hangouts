// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;

public final class asi extends arz
{

    final int a;
    private final int b;
    private final aik e;
    private final aob f;
    private final atd g;
    private final int h;
    private final boolean i;
    private final String j;

    public asi(String s, int k, aik aik, aob aob, atd atd, int l, boolean flag, 
            String s1, int i1)
    {
        super(s);
        b = k;
        e = aik;
        f = aob;
        g = atd;
        h = l;
        i = flag;
        j = s1;
        a = i1;
    }

    protected grk a(Context context)
    {
        ConditionVariable conditionvariable = new ConditionVariable();
        context = new asj(this, context, conditionvariable);
        context.a(b, e, f, g, h, i, j);
        conditionvariable.block();
        if (((asj) (context)).a != null)
        {
            context = new grk(0, ((asj) (context)).a, "");
            ebw.g("Babel_ConvCreator", "Exception returned by response to RTCS request to create a conversation");
            return context;
        }
        if (TextUtils.isEmpty(((asj) (context)).b))
        {
            context = new grk(false);
            ebw.g("Babel_ConvCreator", "No conversationId returned from RTCS request to create a conversation");
            return context;
        } else
        {
            grk grk1 = new grk(true);
            grk1.d().putSerializable("conversation_id", ((asj) (context)).b);
            return grk1;
        }
    }

    public String b(Context context)
    {
        return context.getString(g.jM);
    }
}
