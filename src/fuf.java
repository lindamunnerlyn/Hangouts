// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class fuf
    implements fsz
{

    private Uri a;
    private byte b[];
    private Map c;

    public fuf(fsz fsz1)
    {
        a = fsz1.a();
        b = fsz1.b();
        HashMap hashmap = new HashMap();
        fsz1 = fsz1.c().entrySet().iterator();
        do
        {
            if (!fsz1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)fsz1.next();
            if (entry.getKey() != null)
            {
                hashmap.put(entry.getKey(), ((fta)entry.getValue()).e());
            }
        } while (true);
        c = Collections.unmodifiableMap(hashmap);
    }

    public Uri a()
    {
        return a;
    }

    public byte[] b()
    {
        return b;
    }

    public Map c()
    {
        return c;
    }

    public Object e()
    {
        return this;
    }

    public String toString()
    {
        boolean flag = Log.isLoggable("DataItem", 3);
        StringBuilder stringbuilder = new StringBuilder("DataItemEntity{ ");
        stringbuilder.append((new StringBuilder("uri=")).append(a).toString());
        StringBuilder stringbuilder1 = new StringBuilder(", dataSz=");
        Object obj;
        if (b == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(b.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder(", numAssets=")).append(c.size()).toString());
        if (flag && !c.isEmpty())
        {
            stringbuilder.append(", assets=[");
            Iterator iterator = c.entrySet().iterator();
            for (obj = ""; iterator.hasNext(); obj = ", ")
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                stringbuilder.append((new StringBuilder()).append(((String) (obj))).append((String)entry.getKey()).append(": ").append(((fta)entry.getValue()).a()).toString());
            }

            stringbuilder.append("]");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
