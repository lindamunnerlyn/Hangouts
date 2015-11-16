// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;

public class dmh extends hia
{

    private hm a;

    public dmh(Context context)
    {
        int i = 0;
        super();
        context = context.getSharedPreferences("rpc", 0);
        a = new hm();
        dmi admi[] = dmi.values();
        for (int j = admi.length; i < j; i++)
        {
            dmi dmi1 = admi[i];
            a.put(dmi1, context.getString(dmi1.f, dmi1.g.a()));
        }

    }

    public String a(dmi dmi1)
    {
        String s = (String)a.get(dmi1);
        dmi1 = String.valueOf(dmi1);
        gdv.b((new StringBuilder(String.valueOf(dmi1).length() + 11)).append("Unkown API ").append(dmi1).toString(), s);
        return s;
    }

    public String a(String s)
    {
        Object obj = dmi.valueOf(s.toUpperCase(Locale.US));
        s = (String)a.get(obj);
        obj = String.valueOf(obj);
        gdv.b((new StringBuilder(String.valueOf(obj).length() + 11)).append("Unkown API ").append(((String) (obj))).toString(), s);
        return s;
    }
}
