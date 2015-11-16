// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class eew extends eez
{

    String a;
    String b;
    private efa g;
    private MessageListItemView h;

    public eew(Context context)
    {
        this(context, (byte)0);
    }

    private eew(Context context, byte byte0)
    {
        super(context, null);
    }

    static MessageListItemView a(eew eew1)
    {
        return eew1.h;
    }

    static efa b(eew eew1)
    {
        return eew1.g;
    }

    static String c(eew eew1)
    {
        return eew1.a;
    }

    public void a(ani ani, boolean flag, String s, int i, int j, int k, efa efa, 
            MessageListItemView messagelistitemview, String s1, String s2)
    {
        a(s);
        b = s2;
        g = efa;
        h = messagelistitemview;
        if (!"image/gif".equals(s1) || ean.a(getContext()))
        {
            setOnClickListener(new eex(this));
        }
        a(l.fc);
        super.a(ani, flag, s, i, j, k);
    }

    public void a(String s)
    {
        a = s;
    }

    protected boolean a()
    {
        return false;
    }
}
