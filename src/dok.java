// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Map;

public abstract class dok extends dlc
{

    private final Map a = new gz();

    public dok(String s)
    {
        super(s);
        s = a();
        for (int i = 0; i < 7; i++)
        {
            Object obj = s[i];
            a.put(obj.getClass().getName(), obj);
        }

    }

    public void a(Intent intent, jnv jnv)
    {
        jnv = intent.getStringExtra("ds_processor");
        dol dol1 = (dol)a.get(jnv);
        if (dol1 != null)
        {
            dol1.a(this, intent);
            return;
        } else
        {
            intent = String.valueOf(getClass().getSimpleName());
            eev.g("Babel", (new StringBuilder(String.valueOf(jnv).length() + 104 + String.valueOf(intent).length())).append(jnv).append(" was not present in ").append(intent).append("'s processorMap.  This could happen if the app was upgraded while an intent was out.").toString());
            return;
        }
    }

    public abstract dol[] a();
}
