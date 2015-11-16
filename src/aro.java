// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class aro
{

    private Map a;

    aro()
    {
        a = new HashMap();
        RealTimeChatService.a(new arp(this));
    }

    static Map a(aro aro1)
    {
        return aro1.a;
    }

    public boolean a(int i, String s)
    {
        Set set = (Set)a.get(Integer.valueOf(i));
        return set != null && set.contains(s);
    }
}
