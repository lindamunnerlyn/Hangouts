// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Map;

public abstract class dln extends djl
{

    private final Map a = new gz();

    public dln(String s)
    {
        super(s);
        s = a();
        for (int i = 0; i < 7; i++)
        {
            Object obj = s[i];
            a.put(obj.getClass().getName(), obj);
        }

    }

    public void a(Intent intent, jhb jhb)
    {
        jhb = intent.getStringExtra("ds_processor");
        dlo dlo1 = (dlo)a.get(jhb);
        if (dlo1 != null)
        {
            dlo1.a(this, intent);
            return;
        } else
        {
            intent = String.valueOf(getClass().getSimpleName());
            ebw.g("Babel", (new StringBuilder(String.valueOf(jhb).length() + 104 + String.valueOf(intent).length())).append(jhb).append(" was not present in ").append(intent).append("'s processorMap.  This could happen if the app was upgraded while an intent was out.").toString());
            return;
        }
    }

    public abstract dlo[] a();
}
