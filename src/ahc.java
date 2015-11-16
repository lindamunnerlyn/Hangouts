// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public final class ahc
{

    String a;
    String b;

    public ahc()
    {
    }

    public ahc(String s, String s1)
    {
        a(s, s1);
    }

    private void a(String s, String s1)
    {
        Object obj = null;
        if (ahh.a(s))
        {
            s = null;
        } else
        {
            s = s.trim();
        }
        a = s;
        if (ahh.a(s1))
        {
            s = obj;
        } else
        {
            s = s1.trim();
        }
        b = s;
    }

    public void a(String s, Map map)
    {
        Object obj;
        String s1;
        s1 = ahh.a(s, map);
        map = ahh.a();
        if (!ahh.a(a) && !ahh.a(b))
        {
            map = String.format("%s %s/%s", new Object[] {
                map, a, b
            });
        }
        s = String.valueOf(map);
        if (s.length() != 0)
        {
            "User Agent: ".concat(s);
        } else
        {
            new String("User Agent: ");
        }
        obj = null;
        s = (HttpURLConnection)(new URL(s1)).openConnection();
        s.setRequestProperty("User-Agent", map);
        map = String.valueOf(s1);
        if (map.length() == 0)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        "to send ".concat(map);
_L1:
        s.getResponseCode();
        if (s != null)
        {
            s.disconnect();
        }
        return;
        new String("to send ");
          goto _L1
        obj;
        map = s;
        s = ((String) (obj));
_L8:
        obj = String.valueOf(s1);
        if (((String) (obj)).length() == 0) goto _L3; else goto _L2
_L2:
        obj = "wrong url format: ".concat(((String) (obj)));
_L4:
        ahh.a("SenderHttpURLConnection", ((String) (obj)));
        throw new ahd(s.getMessage());
        s;
_L5:
        if (map != null)
        {
            map.disconnect();
        }
        throw s;
_L3:
        obj = new String("wrong url format: ");
          goto _L4
        map;
        s = ((String) (obj));
_L6:
        ahh.a("SenderHttpURLConnection", "IO error");
        throw new ahd(map.getMessage());
        Exception exception;
        exception;
        map = s;
        s = exception;
          goto _L5
        s;
        map = null;
          goto _L5
        exception;
        map = s;
        s = exception;
          goto _L5
        map;
          goto _L6
        s;
        map = null;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
