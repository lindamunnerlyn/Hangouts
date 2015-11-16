// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

final class dlk extends LinkedHashMap
{

    final Intent a;
    final dlj b;

    dlk(dlj dlj, Intent intent)
    {
        b = dlj;
        a = intent;
        super();
        put("action", a.getAction());
        put("data", a.getDataString());
        put("type", a.getType());
        put("package", a.getPackage());
        dlj = a.getExtras();
        String s;
        for (intent = dlj.keySet().iterator(); intent.hasNext(); put(s, dlj.getString(s)))
        {
            s = (String)intent.next();
        }

    }
}
