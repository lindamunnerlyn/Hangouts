// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class fwn extends epl
    implements fvf
{

    private final int c;

    public fwn(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        c = j;
    }

    public Uri a()
    {
        return Uri.parse(b("path"));
    }

    public byte[] b()
    {
        return c("data");
    }

    public Map c()
    {
        HashMap hashmap = new HashMap(c);
        for (int i = 0; i < c; i++)
        {
            fwk fwk1 = new fwk(a, b + i);
            if (fwk1.b() != null)
            {
                hashmap.put(fwk1.b(), fwk1);
            }
        }

        return hashmap;
    }

    public Object f()
    {
        return new fwl(this);
    }

    public String toString()
    {
        boolean flag = Log.isLoggable("DataItem", 3);
        Object obj = b();
        Object obj1 = c();
        StringBuilder stringbuilder = new StringBuilder("DataItemInternal{ ");
        stringbuilder.append((new StringBuilder("uri=")).append(a()).toString());
        StringBuilder stringbuilder1 = new StringBuilder(", dataSz=");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(obj.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder(", numAssets=")).append(((Map) (obj1)).size()).toString());
        if (flag && !((Map) (obj1)).isEmpty())
        {
            stringbuilder.append(", assets=[");
            obj1 = ((Map) (obj1)).entrySet().iterator();
            for (obj = ""; ((Iterator) (obj1)).hasNext(); obj = ", ")
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                stringbuilder.append((new StringBuilder()).append(((String) (obj))).append((String)entry.getKey()).append(": ").append(((fvg)entry.getValue()).a()).toString());
            }

            stringbuilder.append("]");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
