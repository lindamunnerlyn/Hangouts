// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class ehy extends eib
{

    String a;
    String b;
    private eic g;
    private MessageListItemView h;

    public ehy(Context context)
    {
        this(context, (byte)0);
    }

    private ehy(Context context, byte byte0)
    {
        super(context, null);
    }

    static MessageListItemView a(ehy ehy1)
    {
        return ehy1.h;
    }

    static eic b(ehy ehy1)
    {
        return ehy1.g;
    }

    static String c(ehy ehy1)
    {
        return ehy1.a;
    }

    public void a(aoa aoa, boolean flag, String s, int i, int j, int k, eic eic, 
            MessageListItemView messagelistitemview, String s1, String s2)
    {
        a(s);
        b = s2;
        g = eic;
        h = messagelistitemview;
        if (!"image/gif".equals(s1) || edr.a(getContext()))
        {
            setOnClickListener(new ehz(this));
        }
        a(l.eL);
        super.a(aoa, flag, s, i, j, k);
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
